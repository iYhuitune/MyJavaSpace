package com.test.entity;


public class ComCustInfoPo {
    /**
     * @fieldName: custNo
     * @fieldType: Long
     * @Description: 客户号
     */
    private Long custNo;

    /**
     * @fieldName: bankCustCode
     * @fieldType: String
     * @Description: 银行客户号
     */
    private String bankCustCode;

    /**
     * @fieldName: unioncode
     * @fieldType: String
     * @Description: 联行号
     */
    private String unioncode;

    /**
     * @fieldName: sellCode
     * @fieldType: String
     * @Description: 所属销售商代码(行内为0)
     */
    private String sellCode;

    /**
     * @fieldName: custName
     * @fieldType: String
     * @Description: 客户名称
     */
    private String custName;

    /**
     * @fieldName: shortName
     * @fieldType: String
     * @Description: 简称
     */
    private String shortName;

    /**
     * @fieldName: custType
     * @fieldType: String
     * @Description: 客户类型(0 机构 1 个人)
     */
    private String custType;

    /**
     * @fieldName: custLevel
     * @fieldType: String
     * @Description: 客户级别
     */
    private String custLevel;

    /**
     * @fieldName: custStatus
     * @fieldType: String
     * @Description: 客户状态（0：正常，1：销户）
     */
    private String custStatus;

    /**
     * @fieldName: idType
     * @fieldType: String
     * @Description: 证件类型 0-身份证 1-护照 2-军官证 3-士兵证 4-回乡证 5-户口本 6-外国护照 7-其它 8-无
     */
    private String idType;

    /**
     * @fieldName: idCode
     * @fieldType: String
     * @Description: 证件号码
     */
    private String idCode;

    /**
     * @fieldName: investorBirthday
     * @fieldType: String
     * @Description: 投资人生日
     */
    private String investorBirthday;

    /**
     * @fieldName: education
     * @fieldType: String
     * @Description: 学历
     */
    private String education;

    /**
     * @fieldName: instreprIdType
     * @fieldType: String
     * @Description: 法人证件类型 0-身份证 1-护照 2-军官证 3-士兵证 4-回乡证 5-户口本 6-外国护照 7-其它 8-无
     */
    private String instreprIdType;

    /**
     * @fieldName: instreprIdCode
     * @fieldType: String
     * @Description: 法人证件号码
     */
    private String instreprIdCode;

    /**
     * @fieldName: instreprName
     * @fieldType: String
     * @Description: 法人姓名
     */
    private String instreprName;

    /**
     * @fieldName: sex
     * @fieldType: String
     * @Description: 性别
     */
    private String sex;

    /**
     * @fieldName: telno
     * @fieldType: String
     * @Description: 联系电话
     */
    private String telno;

    /**
     * @fieldName: mobileTelno
     * @fieldType: String
     * @Description: 手机号码
     */
    private String mobileTelno;

    /**
     * @fieldName: faxno
     * @fieldType: String
     * @Description: 传真号码
     */
    private String faxno;

    /**
     * @fieldName: postCode
     * @fieldType: String
     * @Description: 邮编
     */
    private String postCode;

    /**
     * @fieldName: address
     * @fieldType: String
     * @Description: 通信地址
     */
    private String address;

    /**
     * @fieldName: email
     * @fieldType: String
     * @Description: 电子邮箱
     */
    private String email;

    /**
     * @fieldName: riskEndDate
     * @fieldType: String
     * @Description: 客户风险评级有效日期
     */
    private String riskEndDate;

    /**
     * @fieldName: custRisk
     * @fieldType: String
     * @Description: 客户风险承受能力等级
     */
    private String custRisk;

    /**
     * @fieldName: regDate
     * @fieldType: String
     * @Description: 注册日期
     */
    private String regDate;

    /**
     * @fieldName: modiDate
     * @fieldType: String
     * @Description: 最后更新日期
     */
    private String modiDate;

    /**
     * @fieldName: summary
     * @fieldType: String
     * @Description: 备注
     */
    private String summary;

    /**
     * @fieldName: isriskface
     * @fieldType: String
     * @Description: 柜面风评标识位
     */
    private String isriskface;

    /**
     * @fieldName: lastRiskAcce
     * @fieldType: String
     * @Description: 当前风评渠道标识
     */
    private String lastRiskAcce;

    /**
     * @fieldName: iselectronsign
     * @fieldType: String
     * @Description: 是否发送短信 0-否 1-是
     */
    private String iselectronsign;

    /**
     * @fieldName: deliverType
     * @fieldType: String
     * @Description: 对帐单寄送方式(1-不寄送,2-按月,3-按季,4-半年,5-年)
     */
    private String deliverType;

    /**
     * @fieldName: deliverWay
     * @fieldType: String
     * @Description: 对帐单寄送方式(0-传真,1-邮寄,2-email,3-短消息,逗号分隔)
     */
    private String deliverWay;

    /**
     * @fieldName: hightAumCust
     * @fieldType: String
     * @Description: 是否为高净值客户（广州农商 0-否 1-是）
     */
    private String hightAumCust;

    /**
     * @fieldName: regBrchCode
     * @fieldType: String
     * @Description: 签约分行
     */
    private String regBrchCode;

    /**
     * @fieldName: regSubbrchCode
     * @fieldType: String
     * @Description: 签约网点
     */
    private String regSubbrchCode;

    private String _name = "com_cust_info";
    private String _sql;

    public Long getCustNo() {
        return this.custNo;
    }

    public void setCustNo(Long custNo) {
        this.custNo = custNo;
    }

    public String getBankCustCode() {
        return this.bankCustCode;
    }

    public void setBankCustCode(String bankCustCode) {
        this.bankCustCode = bankCustCode;
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

    public String getCustName() {
        return this.custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCustType() {
        return this.custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getCustLevel() {
        return this.custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustStatus() {
        return this.custStatus;
    }

    public void setCustStatus(String custStatus) {
        this.custStatus = custStatus;
    }

    public String getIdType() {
        return this.idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdCode() {
        return this.idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getInvestorBirthday() {
        return this.investorBirthday;
    }

    public void setInvestorBirthday(String investorBirthday) {
        this.investorBirthday = investorBirthday;
    }

    public String getEducation() {
        return this.education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getInstreprIdType() {
        return this.instreprIdType;
    }

    public void setInstreprIdType(String instreprIdType) {
        this.instreprIdType = instreprIdType;
    }

    public String getInstreprIdCode() {
        return this.instreprIdCode;
    }

    public void setInstreprIdCode(String instreprIdCode) {
        this.instreprIdCode = instreprIdCode;
    }

    public String getInstreprName() {
        return this.instreprName;
    }

    public void setInstreprName(String instreprName) {
        this.instreprName = instreprName;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelno() {
        return this.telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getMobileTelno() {
        return this.mobileTelno;
    }

    public void setMobileTelno(String mobileTelno) {
        this.mobileTelno = mobileTelno;
    }

    public String getFaxno() {
        return this.faxno;
    }

    public void setFaxno(String faxno) {
        this.faxno = faxno;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRiskEndDate() {
        return this.riskEndDate;
    }

    public void setRiskEndDate(String riskEndDate) {
        this.riskEndDate = riskEndDate;
    }

    public String getCustRisk() {
        return this.custRisk;
    }

    public void setCustRisk(String custRisk) {
        this.custRisk = custRisk;
    }

    public String getRegDate() {
        return this.regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
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

    public String getIsriskface() {
        return this.isriskface;
    }

    public void setIsriskface(String isriskface) {
        this.isriskface = isriskface;
    }

    public String getLastRiskAcce() {
        return this.lastRiskAcce;
    }

    public void setLastRiskAcce(String lastRiskAcce) {
        this.lastRiskAcce = lastRiskAcce;
    }

    public String getIselectronsign() {
        return this.iselectronsign;
    }

    public void setIselectronsign(String iselectronsign) {
        this.iselectronsign = iselectronsign;
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

    public String getHightAumCust() {
        return this.hightAumCust;
    }

    public void setHightAumCust(String hightAumCust) {
        this.hightAumCust = hightAumCust;
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



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", _name=").append(this._name);
        sb.append(", custNo=").append(custNo);
        sb.append(", bankCustCode=").append(bankCustCode);
        sb.append(", unioncode=").append(unioncode);
        sb.append(", sellCode=").append(sellCode);
        sb.append(", custName=").append(custName);
        sb.append(", shortName=").append(shortName);
        sb.append(", custType=").append(custType);
        sb.append(", custLevel=").append(custLevel);
        sb.append(", custStatus=").append(custStatus);
        sb.append(", idType=").append(idType);
        sb.append(", idCode=").append(idCode);
        sb.append(", investorBirthday=").append(investorBirthday);
        sb.append(", education=").append(education);
        sb.append(", instreprIdType=").append(instreprIdType);
        sb.append(", instreprIdCode=").append(instreprIdCode);
        sb.append(", instreprName=").append(instreprName);
        sb.append(", sex=").append(sex);
        sb.append(", telno=").append(telno);
        sb.append(", mobileTelno=").append(mobileTelno);
        sb.append(", faxno=").append(faxno);
        sb.append(", postCode=").append(postCode);
        sb.append(", address=").append(address);
        sb.append(", email=").append(email);
        sb.append(", riskEndDate=").append(riskEndDate);
        sb.append(", custRisk=").append(custRisk);
        sb.append(", regDate=").append(regDate);
        sb.append(", modiDate=").append(modiDate);
        sb.append(", summary=").append(summary);
        sb.append(", isriskface=").append(isriskface);
        sb.append(", lastRiskAcce=").append(lastRiskAcce);
        sb.append(", iselectronsign=").append(iselectronsign);
        sb.append(", deliverType=").append(deliverType);
        sb.append(", deliverWay=").append(deliverWay);
        sb.append(", hightAumCust=").append(hightAumCust);
        sb.append(", regBrchCode=").append(regBrchCode);
        sb.append(", regSubbrchCode=").append(regSubbrchCode);
        sb.append("]");
        return sb.toString();
    }

}
