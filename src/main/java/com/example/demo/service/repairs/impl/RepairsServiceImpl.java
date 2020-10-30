package com.example.demo.service.repairs.impl;

import com.example.demo.dao.RepairsMapper;
import com.example.demo.model.Repairs;
import com.example.demo.service.repairs.RepairsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RepairsServiceImpl implements RepairsService {
    @Autowired
    private RepairsMapper repairsMapper;

    @Override
    public int insertSelective(String id, String code, String studid, String status, String patientsName, String contact,
                               String symptom, String dormitroy, String createUser, Date createTime, String domainid,
                               String applicationid, String formid, String formname, String author, Date created,
                               String authorDeptIndex, String lastmodifier, Date lastmodified, Integer versions, Short istmp,
                               String parent, String state, Integer stateint, String statelabel, String statelabelinfo,
                               String auditornames, String auditorlist, String audituser, Date auditdate,
                               String lastflowoperation, String prevauditnode, String prevaudituser, String optionitem,
                               String sign, String coauditorlist) {
        return repairsMapper.insertSelective( id,  code,  studid,  status,  patientsName,  contact,
                 symptom,  dormitroy,  createUser,  createTime,  domainid,
                 applicationid,  formid,  formname,  author,  created,
                 authorDeptIndex,  lastmodifier,  lastmodified,  versions,  istmp,
                 parent,  state,  stateint,  statelabel,  statelabelinfo,
                 auditornames,  auditorlist,  audituser,  auditdate,
                 lastflowoperation,  prevauditnode,  prevaudituser,  optionitem,
                 sign,  coauditorlist);
    }

    @Override
    public int selectByTime(Date createTime) {
        return repairsMapper.selectByTime(createTime);
    }

    @Override
    public List<Repairs> selectByBx(String studid, String status) {
        return repairsMapper.selectByBx(studid,status);
    }
}
