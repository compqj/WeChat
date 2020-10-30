package com.example.demo.model;

import java.util.Date;

public class Repairs {
    private String id;

    private String code;

    private String studid;

    private String status;

    private String patientsName;

    private String contact;

    private String symptom;

    private String dormitroy;

    private String createUser;

    private Date createTime;

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

    private Short istmp;

    private String parent;

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

    public Repairs(String id, String code, String studid, String status, String patientsName, String contact, String symptom,
                   String dormitroy, String createUser, Date createTime, String domainid, String applicationid,
                   String formid, String formname, String author, Date created, String authorDeptIndex, String lastmodifier,
                   Date lastmodified, Integer versions, Short istmp, String parent, String state, Integer stateint,
                   String statelabel, String statelabelinfo, String auditornames, String auditorlist, String audituser,
                   Date auditdate, String lastflowoperation, String prevauditnode, String prevaudituser, String optionitem,
                   String sign, String coauditorlist) {
        this.id = id;
        this.code = code;
        this.studid = studid;
        this.status = status;
        this.patientsName = patientsName;
        this.contact = contact;
        this.symptom = symptom;
        this.dormitroy = dormitroy;
        this.createUser = createUser;
        this.createTime = createTime;
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
        this.parent = parent;
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
    }

    public Repairs() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getStudid() {
        return studid;
    }

    public void setStudid(String studid) {
        this.studid = studid == null ? null : studid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom == null ? null : symptom.trim();
    }

    public String getDormitroy() {
        return dormitroy;
    }

    public void setDormitroy(String dormitroy) {
        this.dormitroy = dormitroy == null ? null : dormitroy.trim();
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

    public Short getIstmp() {
        return istmp;
    }

    public void setIstmp(Short istmp) {
        this.istmp = istmp;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
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
}