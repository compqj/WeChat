package com.example.demo.dao;

import com.example.demo.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(Order record);

    int insertSelective(String id, String registerBill, Double caseInfoId, String symptom, String diagnosis, String treat,
                        Double treatPric, String doctor, String createUser, Date createTime, String updateUser, Date updateTime,
                        String statusbar, String patientsName, String contact, String domainid, String applicationid,
                        String formid, String formname, String author, Date created, String authorDeptIndex, String lastmodifier,
                        Date lastmodified, Integer versions, Long istmp, String state, Integer stateint, String statelabel,
                        String statelabelinfo, String auditornames, String auditorlist, String audituser, Date auditdate, String lastflowoperation,
                        String prevauditnode, String prevaudituser, String optionitem, String sign, String coauditorlist, String parent,
                        String effectiveness, String caseName, String caseType, String chiefComplaint, String physicalExamination,
                        String psatMedical, String nowMedical, String remarks, String stateDan, String xh);

    Order selectByPrimaryKey(String id);

    List<Order> selectByStatus(String statusbar,String xh);

    int selectByCreated(Date created);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}