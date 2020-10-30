package com.example.demo.dao;

import com.example.demo.model.Repairs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface RepairsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Repairs record);

    int insertSelective(String id, String code, String studid, String status, String patientsName, String contact, String symptom,
                        String dormitroy, String createUser, Date createTime, String domainid, String applicationid,
                        String formid, String formname, String author, Date created, String authorDeptIndex, String lastmodifier,
                        Date lastmodified, Integer versions, Short istmp, String parent, String state, Integer stateint,
                        String statelabel, String statelabelinfo, String auditornames, String auditorlist, String audituser,
                        Date auditdate, String lastflowoperation, String prevauditnode, String prevaudituser, String optionitem,
                        String sign, String coauditorlist);

    Repairs selectByPrimaryKey(String id);

    int selectByTime(Date createTime);

    List<Repairs> selectByBx(String studid, String status);

    int updateByPrimaryKeySelective(Repairs record);

    int updateByPrimaryKey(Repairs record);
}