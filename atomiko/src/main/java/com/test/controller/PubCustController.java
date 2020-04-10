package com.test.controller;

import com.test.entity.ComBankAcctPo;
import com.test.entity.ComCustInfoPo;
import com.test.service.bank.ComBankAcctMapper;
import com.test.service.cust.ComCustInfoMapper;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class PubCustController implements Runnable{

    @Autowired
    ComBankAcctMapper comBankAcctMapper;

    @Autowired
    ComCustInfoMapper comCustInfoMapper;

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    private int totalInertNum = 10000000;


    private SqlSession batchSqlSession = null;

    private Object obj = new Object();

    @Transactional
    public void insert(){

            try {
               batchSqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
                long begin = System.currentTimeMillis();
                List<ComCustInfoPo> list = new ArrayList<ComCustInfoPo>();
                while (true) {
                    synchronized (this.obj) {
                        if (this.totalInertNum > 0) {
                            ComCustInfoPo comCustInfoPo = new ComCustInfoPo();
                            String custNo = "" + this.totalInertNum;
                            comCustInfoPo.setCustNo(Long.parseLong(custNo));
                            comCustInfoPo.setBankCustCode("test_" + custNo);
                            list.add(comCustInfoPo);
                             //batchSqlSession.insert("com.test.service.cust.ComCustInfoMapper.insert", comCustInfoPo);
                              this.totalInertNum--;
                            System.out.println(Thread.currentThread().getName() + "   获取数据:" + this.totalInertNum);
                        }
                         if (this.totalInertNum % 20000 == 0) {
                            comCustInfoMapper.insertBatch(list);
                            list.clear();
                        }
                        if (this.totalInertNum == 0) {
                            break;
                        }
                    }
                }
                   long end = System.currentTimeMillis();
                System.out.println("================================线程"+Thread.currentThread().getName()+"运行时间："+(end-begin));
                batchSqlSession.clearCache();
            }catch (Exception e){
                batchSqlSession.rollback();
                System.out.println(e);

            }finally{
                if(batchSqlSession != null){
                    batchSqlSession.close();
                }
            }



        /*        int i = 1/0;
        ComBankAcctPo comBankAcctPo = new ComBankAcctPo();
        comBankAcctPo.setDepositAcct("124");
        comBankAcctPo.setSellCode("801");
        comBankAcctMapper.insert(comBankAcctPo);*/
    }

    private  void batchCommit(String mybatisSQLId, int commitCountEveryTime, List<ComCustInfoPo> list) {
        SqlSession session = null;
        try {
            session = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
            int commitCount = (int) Math.ceil(list.size() / (double) commitCountEveryTime);
            List<ComCustInfoPo> tempList = new ArrayList<ComCustInfoPo>(commitCountEveryTime);
            int start, stop;
            Long startTime = System.currentTimeMillis();
            for (int i = 0; i < commitCount; i++) {
                tempList.clear();
                start = i * commitCountEveryTime;
                stop = Math.min(i * commitCountEveryTime + commitCountEveryTime - 1, list.size() - 1);
                for (int j = start; j <= stop; j++) {
                    tempList.add(list.get(j));
                }
                session.insert(mybatisSQLId, tempList);
                session.commit();
                session.clearCache();
            }
            Long endTime = System.currentTimeMillis();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void run() {
        this.insert();
    }
}
