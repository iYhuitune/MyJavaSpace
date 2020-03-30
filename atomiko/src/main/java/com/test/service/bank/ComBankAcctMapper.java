package com.test.service.bank;

import com.test.entity.ComBankAcctPo;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * 表 [com_bank_acct 交易账号信息表 [SPLIT]] 数据库访问类
 */
public interface ComBankAcctMapper {

	/**
     * @Title : insert
     * @Description : 插入数据
	 * @param comBankAcct: 要插入的数据对象
	 * @return: int 表变动条数
	 */
	@Insert("insert into com_bank_acct(acct_no,cust_no,deposit_acct,sell_code) values('123','123',#{depositAcct},'801')")
    int insert(ComBankAcctPo comBankAcct);


}
