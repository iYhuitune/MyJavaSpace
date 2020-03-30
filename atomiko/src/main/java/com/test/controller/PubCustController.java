package com.test.controller;

import com.test.entity.ComBankAcctPo;
import com.test.entity.ComCustInfoPo;
import com.test.service.bank.ComBankAcctMapper;
import com.test.service.cust.ComCustInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
public class PubCustController {

    @Autowired
    ComBankAcctMapper comBankAcctMapper;

    @Autowired
    ComCustInfoMapper comCustInfoMapper;

    @Transactional
    public void insert(){
        ComCustInfoPo comCustInfoPo = new ComCustInfoPo();
        comCustInfoPo.setCustNo(110L);
        comCustInfoPo.setBankCustCode("test");
        comCustInfoMapper.insert(comCustInfoPo);

        int i = 1/0;

        ComBankAcctPo comBankAcctPo = new ComBankAcctPo();
        comBankAcctPo.setDepositAcct("124");
        comBankAcctPo.setSellCode("801");
        comBankAcctMapper.insert(comBankAcctPo);
    }
}
