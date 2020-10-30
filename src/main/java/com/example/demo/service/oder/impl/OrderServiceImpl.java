package com.example.demo.service.oder.impl;

import com.example.demo.dao.OrderMapper;
import com.example.demo.model.Order;
import com.example.demo.service.oder.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public int insertSelectiveString(String id, String registerBill, Double caseInfoId, String symptom, String diagnosis,
                                     String treat, Double treatPric, String doctor, String createUser, Date createTime,
                                     String updateUser, Date updateTime, String statusbar, String patientsName,
                                     String contact, String domainid, String applicationid, String formid, String formname,
                                     String author, Date created, String authorDeptIndex, String lastmodifier,
                                     Date lastmodified, Integer versions, Long istmp, String state, Integer stateint,
                                     String statelabel, String statelabelinfo, String auditornames, String auditorlist,
                                     String audituser, Date auditdate, String lastflowoperation, String prevauditnode,
                                     String prevaudituser, String optionitem, String sign, String coauditorlist,
                                     String parent, String effectiveness, String caseName, String caseType,
                                     String chiefComplaint, String physicalExamination, String psatMedical, String nowMedical,
                                     String remarks, String stateDan, String xh) {
        return orderMapper.insertSelective( id,  registerBill,  caseInfoId,  symptom,  diagnosis,  treat,
                 treatPric,  doctor,  createUser,  createTime,  updateUser,  updateTime,
                 statusbar,  patientsName,  contact,  domainid,  applicationid,
                 formid,  formname,  author,  created,  authorDeptIndex,  lastmodifier,
                 lastmodified,  versions,  istmp,  state,  stateint,  statelabel,
                 statelabelinfo,  auditornames,  auditorlist,  audituser,  auditdate,  lastflowoperation,
                 prevauditnode,  prevaudituser,  optionitem,  sign,  coauditorlist,  parent,
                 effectiveness,  caseName,  caseType,  chiefComplaint,  physicalExamination,
                 psatMedical,  nowMedical,  remarks,  stateDan,xh);
    }

    @Override
    public int selectByCreated(Date created) {
        return orderMapper.selectByCreated(created);
    }

    @Override
    public List<Order> selectByStatus(String statusbar,String xh) {
        return orderMapper.selectByStatus(statusbar,xh);
    }


}
