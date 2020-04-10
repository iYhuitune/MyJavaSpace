package com.test.service.cust;

 import com.test.entity.ComCustInfoPo;
 import org.apache.ibatis.annotations.Insert;
 import org.apache.ibatis.annotations.Options;

 import java.util.List;

/**
 * 表 [com_cust_info 公共客户资料表 [SPLIT]] 数据库访问类
 */
public interface ComCustInfoMapper {

	/**
     * @Title : insert
     * @Description : 插入数据
	 * @param comCustInfo: 要插入的数据对象
	 * @return: int 表变动条数
	 */

	//@Insert("insert into com_cust_info (cust_no, bank_cust_code, unioncode ,ID_TYPE_NAME) values(#{custNo},'test','801','1')")
	int insert(ComCustInfoPo comCustInfo);


	int insertBatch(List<ComCustInfoPo> list);
}
