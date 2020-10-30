package com.example.demo.service.repairs;

import com.example.demo.model.Repairs;

import java.util.Date;
import java.util.List;

public interface RepairsService {

    int insertSelective(String id, String code, String studid, String status, String patientsName, String contact,
                        String symptom, String dormitroy, String createUser, Date createTime, String domainid,
                        String applicationid, String formid, String formname, String author, Date created,
                        String authorDeptIndex, String lastmodifier, Date lastmodified, Integer versions, Short istmp,
                        String parent, String state, Integer stateint, String statelabel, String statelabelinfo,
                        String auditornames, String auditorlist, String audituser, Date auditdate,
                        String lastflowoperation, String prevauditnode, String prevaudituser, String optionitem,
                        String sign, String coauditorlist);

    int selectByTime(Date createTime);

    List<Repairs> selectByBx(String studid, String status);
}
