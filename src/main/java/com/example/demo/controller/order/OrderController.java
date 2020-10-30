package com.example.demo.controller.order;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.response.Result;
import com.example.demo.response.ResultCode;
import com.example.demo.service.oder.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

@RequestMapping("Order")
@Controller
public class OrderController {
@Autowired
private OrderService orderService;
    @RequestMapping("yy")
    @ResponseBody
    public Result yyorder(String id, String registerBill, Double caseInfoId, String symptom, String diagnosis, String treat,
                          Double treatPric, String doctor, String createUser, Date createTime, String updateUser, Date updateTime,
                          String statusbar, String patientsName, String contact, String domainid, String applicationid,
                          String formid, String formname, String author, Date created, String authorDeptIndex, String lastmodifier,
                          Date lastmodified, Integer versions, Long istmp, String state, Integer stateint, String statelabel,
                          String statelabelinfo, String auditornames, String auditorlist, String audituser, Date auditdate, String lastflowoperation,
                          String prevauditnode, String prevaudituser, String optionitem, String sign, String coauditorlist, String parent,
                          String effectiveness, String caseName, String caseType, String chiefComplaint, String physicalExamination,
                          String psatMedical, String nowMedical, String remarks, String stateDan, String xh){
        Date time = null;   //创建时间
        String status="预约中";      //状态
        Result results=null;
//        获取系统当前是时间
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        System.out.println("当前时间::" + df.format(new Date()));
        String cretime=df.format(new Date());
        try {
            time=df.parse(cretime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("创建时间::"+time);

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        Date ss= date;
        System.out.println("12312312时间::"+ss);

        //挂号单号码
        int count = orderService.selectByCreated(ss);
        System.out.println("count::"+count);
        String counts= String.valueOf(count+1);
        System.out.println("counts::"+counts);
        int countss=counts.length();
        System.out.println("countss::"+countss);
        if(countss==1){
            counts=cretime+"00"+(counts);
        }
        if(countss==2){
            counts=cretime+"0"+(counts);
        }
        if(countss==3){
            counts=cretime+(counts);
        }
        System.out.println("counts::"+counts);
        System.out.println("挂号单号码::"+counts);

        //创建人/学号
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest requests = ((ServletRequestAttributes)ra).getRequest();
        User user= (User) requests.getSession(true).getAttribute("Users");
        String createUsers=user.getName();
        String xhs= String.valueOf(user.getStuid());
        String shh=user.getDormitory();
        System.out.println("创建人::"+createUsers);



        //获取32位长不重复的字符串
        String result= UUID.randomUUID().toString().replace("-", "").toUpperCase();
        System.out.println("不重复的字符串::"+result);
        //获取12位长不重复的字符串
        String a= String.valueOf(new Date().getTime()-1300000000000L);
        System.out.println("不重复的字符串2::"+a);
        id=result;
        registerBill=counts;
         createUser=createUsers;
         createTime=ss;
         statusbar=status;
         xh=xhs;
        created=ss;
        effectiveness="有效";
        stateDan="否";
        domainid="MQ66QKQ521m44lGQnOc";
        applicationid="tJ1t7Dam8IvsI0Ltp8X";
        System.out.println("病人姓名::"+patientsName);
        System.out.println("联系号码::"+contact);
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        System.out.println( "判断::"+pattern.matcher(contact).matches());
        boolean aa=pattern.matcher(contact).matches();
        if (contact==null){
            results=new Result(ResultCode.yyno,null);
        }else if (aa==false){
            results=new Result(ResultCode.yyno6,null);
        }
        else if (contact.length()!=11){
            results=new Result(ResultCode.infono,null);
        }
        else if (patientsName==null){
            results=new Result(ResultCode.yyno3,null);
        }else {
            int sss=orderService.insertSelectiveString(  id,  registerBill,  caseInfoId,  symptom,  diagnosis,  treat,
                    treatPric,  doctor,  createUser,  createTime,  updateUser,  updateTime,
                    statusbar,  patientsName,  contact,  domainid,  applicationid,
                    formid,  formname,  author,  created,  authorDeptIndex,  lastmodifier,
                    lastmodified,  versions,  istmp,  state,  stateint,  statelabel,
                    statelabelinfo,  auditornames,  auditorlist,  audituser,  auditdate,  lastflowoperation,
                    prevauditnode,  prevaudituser,  optionitem,  sign,  coauditorlist,  parent,
                    effectiveness,  caseName,  caseType,  chiefComplaint,  physicalExamination,
                    psatMedical,  nowMedical,  remarks,  stateDan,xh);
            if (sss>0){
                results=new Result(ResultCode.yyok,sss);
            }else {
                results=new Result(ResultCode.yynos,null);
            }

        }



    return results;
}

//预约中信息
    @RequestMapping("selectyyz")
    @ResponseBody
    public List<Order> selectyyz(){

        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest requests = ((ServletRequestAttributes)ra).getRequest();
        User user= (User) requests.getSession(true).getAttribute("Users");

        String status="预约中";
        String xh= String.valueOf(user.getStuid());
        List<Order> order=orderService.selectByStatus(status,xh);

        return order;
    }

    //就诊中信息
    @RequestMapping("selectjzz")
    @ResponseBody
    public List<Order> selectjzz(){

        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest requests = ((ServletRequestAttributes)ra).getRequest();
        User user= (User) requests.getSession(true).getAttribute("Users");

        String status="就诊中";
        String xh= String.valueOf(user.getStuid());
        List<Order> order=orderService.selectByStatus(status,xh);

        return order;
    }

    //已就诊中信息
    @RequestMapping("selectyjz")
    @ResponseBody
    public List<Order> selectyjz(){

        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest requests = ((ServletRequestAttributes)ra).getRequest();
        User user= (User) requests.getSession(true).getAttribute("Users");

        String status="已就诊";
        String xh= String.valueOf(user.getStuid());
        List<Order> order=orderService.selectByStatus(status,xh);

        return order;
    }


    @RequestMapping("selecttime")
    @ResponseBody
    public int selecttimeS(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        Date ss= date;
        System.out.println("12312312时间::"+ss);

        int repairs=orderService.selectByCreated(ss);

        return repairs;
    }
}
