package com.test.entity;

import com.alibaba.fastjson.JSONObject;

/**
 * 表[com_bank_acct 交易账号信息表 [SPLIT]] 数据实体类
 */
public class ComBankAcctPo {

	/**
	 * @fieldName: splitkey
	 * @fieldType: Long
	 * @Description: SPLITKEY
	 */
	private Long splitkey;
	
	/**
	 * @fieldName: acctNo
	 * @fieldType: Long
	 * @Description: 账户编号（系统产生)
	 */
	private Long acctNo;
	
	/**
	 * @fieldName: custNo
	 * @fieldType: Long
	 * @Description: 客户号
	 */
	private Long custNo;
	
	/**
	 * @fieldName: depositAcct
	 * @fieldType: String
	 * @Description: 银行卡号/行外交易账号
	 */
	private String depositAcct;
	
	/**
	 * @fieldName: acctName
	 * @fieldType: String
	 * @Description: 账户名称
	 */
	private String acctName;
	
	/**
	 * @fieldName: subAcct
	 * @fieldType: String
	 * @Description: 款项
	 */
	private String subAcct;
	
	/**
	 * @fieldName: cardBrchCode
	 * @fieldType: String
	 * @Description: 开卡分行
	 */
	private String cardBrchCode;
	
	/**
	 * @fieldName: cardSubbrchCode
	 * @fieldType: String
	 * @Description: 开卡网点
	 */
	private String cardSubbrchCode;
	
	/**
	 * @fieldName: unioncode
	 * @fieldType: String
	 * @Description: 联行号
	 */
	private String unioncode;
	
	/**
	 * @fieldName: sellCode
	 * @fieldType: String
	 * @Description: 交易账号所属销售商代码
	 */
	private String sellCode;
	
	/**
	 * @fieldName: regBrchCode
	 * @fieldType: String
	 * @Description: 登记分行
	 */
	private String regBrchCode;
	
	/**
	 * @fieldName: regSubbrchCode
	 * @fieldType: String
	 * @Description: 登记网点
	 */
	private String regSubbrchCode;
	
	/**
	 * @fieldName: regSellcode
	 * @fieldType: String
	 * @Description: 登记销售商
	 */
	private String regSellcode;
	
	/**
	 * @fieldName: openBusin
	 * @fieldType: String
	 * @Description: 所属系统ID, 理财2, 基金3 余额宝5
	 */
	private String openBusin;
	
	/**
	 * @fieldName: service
	 * @fieldType: String
	 * @Description: 开通服务,初始值00000000, 第一位短信,第二位电邮,第三位邮寄
	 */
	private String service;
	
	/**
	 * @fieldName: custManager
	 * @fieldType: String
	 * @Description: 客户经理代码
	 */
	private String custManager;
	
	/**
	 * @fieldName: fmManager
	 * @fieldType: String
	 * @Description: 理财经理代码
	 */
	private String fmManager;
	
	/**
	 * @fieldName: acctStatus
	 * @fieldType: String
	 * @Description: 账户状态（0-正常，1-注销）
	 */
	private String acctStatus;
	
	/**
	 * @fieldName: insertDate
	 * @fieldType: String
	 * @Description: 新增日期
	 */
	private String insertDate;
	
	/**
	 * @fieldName: modiDate
	 * @fieldType: String
	 * @Description: 最后更新日期
	 */
	private String modiDate;
	
	/**
	 * @fieldName: summary
	 * @fieldType: String
	 * @Description: 【暂存‘开卡柜员’】备注
	 */
	private String summary;
	
	/**
	 * @fieldName: depositBook
	 * @fieldType: String
	 * @Description: 存折账号
	 */
	private String depositBook;
	
	/**
	 * @fieldName: deliverType
	 * @fieldType: String
	 * @Description: 【暂存‘卡级别’】对帐单寄送方式(1-不寄送,2-按月,3-按季,4-半年,5-年)
	 */
	private String deliverType;
	
	/**
	 * @fieldName: deliverWay
	 * @fieldType: String
	 * @Description: 对帐单寄送方式(0-传真,1-邮寄,2-email,3-短消息,逗号分隔)
	 */
	private String deliverWay;
	
	/**
	 * @fieldName: cardLevel
	 * @fieldType: String
	 * @Description: 卡级别
	 */
	private String cardLevel;
	
	/**
	 * @fieldName: signStatus
	 * @fieldType: String
	 * @Description: SIGN_STATUS
	 */
	private String signStatus;
	
	/**
	 * @fieldName: transMethod
	 * @fieldType: String
	 * @Description: TRANS_METHOD
	 */
	private String transMethod;
	
	/**
	 * @fieldName: bankCustCode
	 * @fieldType: String
	 * @Description: 核心客户号
	 */
	private String bankCustCode;
	
	/**
	 * @fieldName: relevantProd
	 * @fieldType: String
	 * @Description: 关联产品(余额宝系统)(暂不使用)
	 */
	private String relevantProd;
	
	/**
	 * @fieldName: protocolNo
	 * @fieldType: String
	 * @Description: (汇和银行)协议编号(暂不使用)
	 */
	private String protocolNo;
	
	/**
	 * @fieldName: ledgerFlag
	 * @fieldType: String
	 * @Description: (汇和银行)内部户标志 0-非内部户 1-内部户(暂不使用)
	 */
	private String ledgerFlag;
	
	/**
	 * @fieldName: elcFlag
	 * @fieldType: String
	 * @Description: 是否电子账户 0-否 -1是
	 */
	private String elcFlag;
	
	private String _name = "com_bank_acct";
	private String _sql;

	public Long getSplitkey() {
		return this.splitkey;
	}

	public void setSplitkey(Long splitkey) {
		this.splitkey = splitkey;
	}
    
	public Long getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(Long acctNo) {
		this.acctNo = acctNo;
	}
    
	public Long getCustNo() {
		return this.custNo;
	}

	public void setCustNo(Long custNo) {
		this.custNo = custNo;
	}
    
	public String getDepositAcct() {
		return this.depositAcct;
	}

	public void setDepositAcct(String depositAcct) {
		this.depositAcct = depositAcct;
	}
    
	public String getAcctName() {
		return this.acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
    
	public String getSubAcct() {
		return this.subAcct;
	}

	public void setSubAcct(String subAcct) {
		this.subAcct = subAcct;
	}
    
	public String getCardBrchCode() {
		return this.cardBrchCode;
	}

	public void setCardBrchCode(String cardBrchCode) {
		this.cardBrchCode = cardBrchCode;
	}
    
	public String getCardSubbrchCode() {
		return this.cardSubbrchCode;
	}

	public void setCardSubbrchCode(String cardSubbrchCode) {
		this.cardSubbrchCode = cardSubbrchCode;
	}
    
	public String getUnioncode() {
		return this.unioncode;
	}

	public void setUnioncode(String unioncode) {
		this.unioncode = unioncode;
	}
    
	public String getSellCode() {
		return this.sellCode;
	}

	public void setSellCode(String sellCode) {
		this.sellCode = sellCode;
	}
    
	public String getRegBrchCode() {
		return this.regBrchCode;
	}

	public void setRegBrchCode(String regBrchCode) {
		this.regBrchCode = regBrchCode;
	}
    
	public String getRegSubbrchCode() {
		return this.regSubbrchCode;
	}

	public void setRegSubbrchCode(String regSubbrchCode) {
		this.regSubbrchCode = regSubbrchCode;
	}
    
	public String getRegSellcode() {
		return this.regSellcode;
	}

	public void setRegSellcode(String regSellcode) {
		this.regSellcode = regSellcode;
	}
    
	public String getOpenBusin() {
		return this.openBusin;
	}

	public void setOpenBusin(String openBusin) {
		this.openBusin = openBusin;
	}
    
	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}
    
	public String getCustManager() {
		return this.custManager;
	}

	public void setCustManager(String custManager) {
		this.custManager = custManager;
	}
    
	public String getFmManager() {
		return this.fmManager;
	}

	public void setFmManager(String fmManager) {
		this.fmManager = fmManager;
	}
    
	public String getAcctStatus() {
		return this.acctStatus;
	}

	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}
    
	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}
    
	public String getModiDate() {
		return this.modiDate;
	}

	public void setModiDate(String modiDate) {
		this.modiDate = modiDate;
	}
    
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
    
	public String getDepositBook() {
		return this.depositBook;
	}

	public void setDepositBook(String depositBook) {
		this.depositBook = depositBook;
	}
    
	public String getDeliverType() {
		return this.deliverType;
	}

	public void setDeliverType(String deliverType) {
		this.deliverType = deliverType;
	}
    
	public String getDeliverWay() {
		return this.deliverWay;
	}

	public void setDeliverWay(String deliverWay) {
		this.deliverWay = deliverWay;
	}
    
	public String getCardLevel() {
		return this.cardLevel;
	}

	public void setCardLevel(String cardLevel) {
		this.cardLevel = cardLevel;
	}
    
	public String getSignStatus() {
		return this.signStatus;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
    
	public String getTransMethod() {
		return this.transMethod;
	}

	public void setTransMethod(String transMethod) {
		this.transMethod = transMethod;
	}
    
	public String getBankCustCode() {
		return this.bankCustCode;
	}

	public void setBankCustCode(String bankCustCode) {
		this.bankCustCode = bankCustCode;
	}
    
	public String getRelevantProd() {
		return this.relevantProd;
	}

	public void setRelevantProd(String relevantProd) {
		this.relevantProd = relevantProd;
	}
    
	public String getProtocolNo() {
		return this.protocolNo;
	}

	public void setProtocolNo(String protocolNo) {
		this.protocolNo = protocolNo;
	}
    
	public String getLedgerFlag() {
		return this.ledgerFlag;
	}

	public void setLedgerFlag(String ledgerFlag) {
		this.ledgerFlag = ledgerFlag;
	}
    
	public String getElcFlag() {
		return this.elcFlag;
	}

	public void setElcFlag(String elcFlag) {
		this.elcFlag = elcFlag;
	}
    
	public String get_name() {
        return this._name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
	
	public String get_sql(){
		return _sql;
	}

    public void set_sql(String _sql) {
        this._sql = _sql;
    }
	
	public void copy(ComBankAcctPo source){
		if(source == null){
			return;
		}
		this.setSplitkey(source.getSplitkey());
		this.setAcctNo(source.getAcctNo());
		this.setCustNo(source.getCustNo());
		this.setDepositAcct(source.getDepositAcct());
		this.setAcctName(source.getAcctName());
		this.setSubAcct(source.getSubAcct());
		this.setCardBrchCode(source.getCardBrchCode());
		this.setCardSubbrchCode(source.getCardSubbrchCode());
		this.setUnioncode(source.getUnioncode());
		this.setSellCode(source.getSellCode());
		this.setRegBrchCode(source.getRegBrchCode());
		this.setRegSubbrchCode(source.getRegSubbrchCode());
		this.setRegSellcode(source.getRegSellcode());
		this.setOpenBusin(source.getOpenBusin());
		this.setService(source.getService());
		this.setCustManager(source.getCustManager());
		this.setFmManager(source.getFmManager());
		this.setAcctStatus(source.getAcctStatus());
		this.setInsertDate(source.getInsertDate());
		this.setModiDate(source.getModiDate());
		this.setSummary(source.getSummary());
		this.setDepositBook(source.getDepositBook());
		this.setDeliverType(source.getDeliverType());
		this.setDeliverWay(source.getDeliverWay());
		this.setCardLevel(source.getCardLevel());
		this.setSignStatus(source.getSignStatus());
		this.setTransMethod(source.getTransMethod());
		this.setBankCustCode(source.getBankCustCode());
		this.setRelevantProd(source.getRelevantProd());
		this.setProtocolNo(source.getProtocolNo());
		this.setLedgerFlag(source.getLedgerFlag());
		this.setElcFlag(source.getElcFlag());
	}
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
		sb.append(", _name=").append(this._name);
		sb.append(", splitkey=").append(splitkey);
		sb.append(", acctNo=").append(acctNo);
		sb.append(", custNo=").append(custNo);
		sb.append(", depositAcct=").append(depositAcct);
		sb.append(", acctName=").append(acctName);
		sb.append(", subAcct=").append(subAcct);
		sb.append(", cardBrchCode=").append(cardBrchCode);
		sb.append(", cardSubbrchCode=").append(cardSubbrchCode);
		sb.append(", unioncode=").append(unioncode);
		sb.append(", sellCode=").append(sellCode);
		sb.append(", regBrchCode=").append(regBrchCode);
		sb.append(", regSubbrchCode=").append(regSubbrchCode);
		sb.append(", regSellcode=").append(regSellcode);
		sb.append(", openBusin=").append(openBusin);
		sb.append(", service=").append(service);
		sb.append(", custManager=").append(custManager);
		sb.append(", fmManager=").append(fmManager);
		sb.append(", acctStatus=").append(acctStatus);
		sb.append(", insertDate=").append(insertDate);
		sb.append(", modiDate=").append(modiDate);
		sb.append(", summary=").append(summary);
		sb.append(", depositBook=").append(depositBook);
		sb.append(", deliverType=").append(deliverType);
		sb.append(", deliverWay=").append(deliverWay);
		sb.append(", cardLevel=").append(cardLevel);
		sb.append(", signStatus=").append(signStatus);
		sb.append(", transMethod=").append(transMethod);
		sb.append(", bankCustCode=").append(bankCustCode);
		sb.append(", relevantProd=").append(relevantProd);
		sb.append(", protocolNo=").append(protocolNo);
		sb.append(", ledgerFlag=").append(ledgerFlag);
		sb.append(", elcFlag=").append(elcFlag);
        sb.append("]");
        return sb.toString();	
	}
	
    /**
     * @Title : toJSON
     * @Description : 对象转字符串
     * @return  String  json字符串
     */
	public String toJSON(){
		JSONObject json = new JSONObject();
		json.put("_name", this.get_name());
		json.put("splitkey", this.getSplitkey());
		json.put("acctNo", this.getAcctNo());
		json.put("custNo", this.getCustNo());
		json.put("depositAcct", this.getDepositAcct());
		json.put("acctName", this.getAcctName());
		json.put("subAcct", this.getSubAcct());
		json.put("cardBrchCode", this.getCardBrchCode());
		json.put("cardSubbrchCode", this.getCardSubbrchCode());
		json.put("unioncode", this.getUnioncode());
		json.put("sellCode", this.getSellCode());
		json.put("regBrchCode", this.getRegBrchCode());
		json.put("regSubbrchCode", this.getRegSubbrchCode());
		json.put("regSellcode", this.getRegSellcode());
		json.put("openBusin", this.getOpenBusin());
		json.put("service", this.getService());
		json.put("custManager", this.getCustManager());
		json.put("fmManager", this.getFmManager());
		json.put("acctStatus", this.getAcctStatus());
		json.put("insertDate", this.getInsertDate());
		json.put("modiDate", this.getModiDate());
		json.put("summary", this.getSummary());
		json.put("depositBook", this.getDepositBook());
		json.put("deliverType", this.getDeliverType());
		json.put("deliverWay", this.getDeliverWay());
		json.put("cardLevel", this.getCardLevel());
		json.put("signStatus", this.getSignStatus());
		json.put("transMethod", this.getTransMethod());
		json.put("bankCustCode", this.getBankCustCode());
		json.put("relevantProd", this.getRelevantProd());
		json.put("protocolNo", this.getProtocolNo());
		json.put("ledgerFlag", this.getLedgerFlag());
		json.put("elcFlag", this.getElcFlag());
		return json.toString();
	}

}
