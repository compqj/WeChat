package com.example.demo.model;

import java.util.Date;

public class Order {
    private String id;

    private String registerBill;

    private Double caseInfoId;

    private String symptom;

    private String diagnosis;

    private String treat;

    private Double treatPric;

    private String doctor;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String statusbar;

    private String patientsName;

    private String contact;

    private String domainid;

    private String applicationid;

    private String formid;

    private String formname;

    private String author;

    private Date created;

    private String authorDeptIndex;

    private String lastmodifier;

    private Date lastmodified;

    private Integer versions;

    private Long istmp;

    private String state;

    private Integer stateint;

    private String statelabel;

    private String statelabelinfo;

    private String auditornames;

    private String auditorlist;

    private String audituser;

    private Date auditdate;

    private String lastflowoperation;

    private String prevauditnode;

    private String prevaudituser;

    private String optionitem;

    private String sign;

    private String coauditorlist;

    private String parent;

    private String effectiveness;

    private String caseName;

    private String caseType;

    private String chiefComplaint;

    private String physicalExamination;

    private String psatMedical;

    private String nowMedical;

    private String remarks;

    private String stateDan;

    private String xh;

    public Order(String id, String registerBill, Double caseInfoId, String symptom, String diagnosis, String treat, Double treatPric, String doctor, String createUser, Date createTime, String updateUser, Date updateTime, String statusbar, String patientsName, String contact, String domainid, String applicationid, String formid, String formname, String author, Date created, String authorDeptIndex, String lastmodifier, Date lastmodified, Integer versions, Long istmp, String state, Integer stateint, String statelabel, String statelabelinfo, String auditornames, String auditorlist, String audituser, Date auditdate, String lastflowoperation, String prevauditnode, String prevaudituser, String optionitem, String sign, String coauditorlist, String parent, String effectiveness, String caseName, String caseType, String chiefComplaint, String physicalExamination, String psatMedical, String nowMedical, String remarks, String stateDan, String xh) {
        this.id = id;
        this.registerBill = registerBill;
        this.caseInfoId = caseInfoId;
        this.symptom = symptom;
        this.diagnosis = diagnosis;
        this.treat = treat;
        this.treatPric = treatPric;
        this.doctor = doctor;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.statusbar = statusbar;
        this.patientsName = patientsName;
        this.contact = contact;
        this.domainid = domainid;
        this.applicationid = applicationid;
        this.formid = formid;
        this.formname = formname;
        this.author = author;
        this.created = created;
        this.authorDeptIndex = authorDeptIndex;
        this.lastmodifier = lastmodifier;
        this.lastmodified = lastmodified;
        this.versions = versions;
        this.istmp = istmp;
        this.state = state;
        this.stateint = stateint;
        this.statelabel = statelabel;
        this.statelabelinfo = statelabelinfo;
        this.auditornames = auditornames;
        this.auditorlist = auditorlist;
        this.audituser = audituser;
        this.auditdate = auditdate;
        this.lastflowoperation = lastflowoperation;
        this.prevauditnode = prevauditnode;
        this.prevaudituser = prevaudituser;
        this.optionitem = optionitem;
        this.sign = sign;
        this.coauditorlist = coauditorlist;
        this.parent = parent;
        this.effectiveness = effectiveness;
        this.caseName = caseName;
        this.caseType = caseType;
        this.chiefComplaint = chiefComplaint;
        this.physicalExamination = physicalExamination;
        this.psatMedical = psatMedical;
        this.nowMedical = nowMedical;
        this.remarks = remarks;
        this.stateDan = stateDan;
        this.xh = xh;
    }

    public Order() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRegisterBill() {
        return registerBill;
    }

    public void setRegisterBill(String registerBill) {
        this.registerBill = registerBill == null ? null : registerBill.trim();
    }

    public Double getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(Double caseInfoId) {
        this.caseInfoId = caseInfoId;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom == null ? null : symptom.trim();
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis == null ? null : diagnosis.trim();
    }

    public String getTreat() {
        return treat;
    }

    public void setTreat(String treat) {
        this.treat = treat == null ? null : treat.trim();
    }

    public Double getTreatPric() {
        return treatPric;
    }

    public void setTreatPric(Double treatPric) {
        this.treatPric = treatPric;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor == null ? null : doctor.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatusbar() {
        return statusbar;
    }

    public void setStatusbar(String statusbar) {
        this.statusbar = statusbar == null ? null : statusbar.trim();
    }

    public String getPatientsName() {
        return patientsName;
    }

    public void setPatientsName(String patientsName) {
        this.patientsName = patientsName == null ? null : patientsName.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid == null ? null : domainid.trim();
    }

    public String getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid == null ? null : applicationid.trim();
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid == null ? null : formid.trim();
    }

    public String getFormname() {
        return formname;
    }

    public void setFormname(String formname) {
        this.formname = formname == null ? null : formname.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthorDeptIndex() {
        return authorDeptIndex;
    }

    public void setAuthorDeptIndex(String authorDeptIndex) {
        this.authorDeptIndex = authorDeptIndex == null ? null : authorDeptIndex.trim();
    }

    public String getLastmodifier() {
        return lastmodifier;
    }

    public void setLastmodifier(String lastmodifier) {
        this.lastmodifier = lastmodifier == null ? null : lastmodifier.trim();
    }

    public Date getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Date lastmodified) {
        this.lastmodified = lastmodified;
    }

    public Integer getVersions() {
        return versions;
    }

    public void setVersions(Integer versions) {
        this.versions = versions;
    }

    public Long getIstmp() {
        return istmp;
    }

    public void setIstmp(Long istmp) {
        this.istmp = istmp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getStateint() {
        return stateint;
    }

    public void setStateint(Integer stateint) {
        this.stateint = stateint;
    }

    public String getStatelabel() {
        return statelabel;
    }

    public void setStatelabel(String statelabel) {
        this.statelabel = statelabel == null ? null : statelabel.trim();
    }

    public String getStatelabelinfo() {
        return statelabelinfo;
    }

    public void setStatelabelinfo(String statelabelinfo) {
        this.statelabelinfo = statelabelinfo == null ? null : statelabelinfo.trim();
    }

    public String getAuditornames() {
        return auditornames;
    }

    public void setAuditornames(String auditornames) {
        this.auditornames = auditornames == null ? null : auditornames.trim();
    }

    public String getAuditorlist() {
        return auditorlist;
    }

    public void setAuditorlist(String auditorlist) {
        this.auditorlist = auditorlist == null ? null : auditorlist.trim();
    }

    public String getAudituser() {
        return audituser;
    }

    public void setAudituser(String audituser) {
        this.audituser = audituser == null ? null : audituser.trim();
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public String getLastflowoperation() {
        return lastflowoperation;
    }

    public void setLastflowoperation(String lastflowoperation) {
        this.lastflowoperation = lastflowoperation == null ? null : lastflowoperation.trim();
    }

    public String getPrevauditnode() {
        return prevauditnode;
    }

    public void setPrevauditnode(String prevauditnode) {
        this.prevauditnode = prevauditnode == null ? null : prevauditnode.trim();
    }

    public String getPrevaudituser() {
        return prevaudituser;
    }

    public void setPrevaudituser(String prevaudituser) {
        this.prevaudituser = prevaudituser == null ? null : prevaudituser.trim();
    }

    public String getOptionitem() {
        return optionitem;
    }

    public void setOptionitem(String optionitem) {
        this.optionitem = optionitem == null ? null : optionitem.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getCoauditorlist() {
        return coauditorlist;
    }

    public void setCoauditorlist(String coauditorlist) {
        this.coauditorlist = coauditorlist == null ? null : coauditorlist.trim();
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public String getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(String effectiveness) {
        this.effectiveness = effectiveness == null ? null : effectiveness.trim();
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName == null ? null : caseName.trim();
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint == null ? null : chiefComplaint.trim();
    }

    public String getPhysicalExamination() {
        return physicalExamination;
    }

    public void setPhysicalExamination(String physicalExamination) {
        this.physicalExamination = physicalExamination == null ? null : physicalExamination.trim();
    }

    public String getPsatMedical() {
        return psatMedical;
    }

    public void setPsatMedical(String psatMedical) {
        this.psatMedical = psatMedical == null ? null : psatMedical.trim();
    }

    public String getNowMedical() {
        return nowMedical;
    }

    public void setNowMedical(String nowMedical) {
        this.nowMedical = nowMedical == null ? null : nowMedical.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getStateDan() {
        return stateDan;
    }

    public void setStateDan(String stateDan) {
        this.stateDan = stateDan == null ? null : stateDan.trim();
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }
}