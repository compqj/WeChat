package com.example.demo.controller.repairs;

import com.example.demo.model.Repairs;
import com.example.demo.model.User;
import com.example.demo.response.Result;
import com.example.demo.response.ResultCode;
import com.example.demo.service.oder.OrderService;
import com.example.demo.service.repairs.RepairsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

@RequestMapping("repairs")
@Controller
public class RepairsController {
@Autowired
private RepairsService repairsService;
@Autowired
private OrderService orderService;

    @RequestMapping("insetpx")
    @ResponseBody
    public Result insertpx(String id, String code, String studid, String status, String patientsName, String contact,
                           String symptom, String dormitroy, String createUser, Date createTime, String domainid,
                           String applicationid, String formid, String formname, String author, Date created,
                           String authorDeptIndex, String lastmodifier, Date lastmodified, Integer versions, Short istmp,
                           String parent, String state, Integer stateint, String statelabel, String statelabelinfo,
                           String auditornames, String auditorlist, String audituser, Date auditdate,
                           String lastflowoperation, String prevauditnode, String prevaudituser, String optionitem,
                           String sign, String coauditorlist ){

        Result result=null;
        //获取32位长不重复的字符串
        String bb= UUID.randomUUID().toString().replace("-", "").toUpperCase();
        System.out.println("不重复的字符串::"+result);
        //获取12位长不重复的字符串
        String ee= String.valueOf(new Date().getTime()-1300000000000L);
        System.out.println("不重复的字符串2::"+ee);


        //创建人/学号
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest requests = ((ServletRequestAttributes)ra).getRequest();
        User user= (User) requests.getSession(true).getAttribute("Users");
        String createUsers=user.getName();
        String xhs= String.valueOf(user.getStuid());
        String shh=user.getDormitory();
        System.out.println("创建人::"+createUsers);

        //创建时间
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        System.out.println("当前时间::" + df.format(new Date()));
        String cretime=df.format(new Date());

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        Date ss= date;
        System.out.println("12312312时间::"+ss);

        //        单据号
        int count=repairsService.selectByTime(ss);
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
        System.out.println("报修counts::"+counts);

        studid=xhs;
        id=bb;
        createUser=createUsers;
        createTime=ss;
        dormitroy=shh;
        code=counts;

//       判断输入字符串是否为小数
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        System.out.println( "判断::"+pattern.matcher(contact).matches());
        boolean aa=pattern.matcher(contact).matches();

        if (contact==null){
            result=new Result(ResultCode.yyno,null);
        }else if (aa==false){
            result=new Result(ResultCode.yyno6,null);
        }
        else if (contact.length()!=11){
            result=new Result(ResultCode.infono,null);
        }
        else if (patientsName==null){
            result=new Result(ResultCode.yyno3,null);
        }else {
            int num=repairsService.insertSelective(id,  code,  studid,  status,  patientsName,  contact,
                    symptom,  dormitroy,  createUser,  createTime,  domainid,
                    applicationid,  formid,  formname,  author,  created,
                    authorDeptIndex,  lastmodifier,  lastmodified,  versions,  istmp,
                    parent,  state,  stateint,  statelabel,  statelabelinfo,
                    auditornames,  auditorlist,  audituser,  auditdate,
                    lastflowoperation,  prevauditnode,  prevaudituser,  optionitem,
                    sign, coauditorlist);

            if(num>0){
                result=new Result(ResultCode.bxcg,num);
            }else {
                result=new Result(ResultCode.bxsb,null);
            }
        }

        return result;

    }

//    未处理报修信息
    @ResponseBody
    @RequestMapping("wcl")
    public List<Repairs> wcl(String studid, String status){
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest requests = ((ServletRequestAttributes)ra).getRequest();
        User user= (User)requests.getSession(true).getAttribute("Users");
        String num= String.valueOf(user.getStuid());
        studid=num;
        status="未处理";
        List<Repairs> repairs=repairsService.selectByBx(studid,status);
return repairs;
    }

    //    处理中报修信息
    @ResponseBody
    @RequestMapping("clz")
    public List<Repairs> clz(String studid, String status){
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest requests = ((ServletRequestAttributes)ra).getRequest();
        User user= (User)requests.getSession(true).getAttribute("Users");
        String num= String.valueOf(user.getStuid());
        studid=num;
        status="处理中";
        List<Repairs> repairs=repairsService.selectByBx(studid,status);
        return repairs;
    }

    //    已完成报修信息
    @ResponseBody
    @RequestMapping("ywc")
    public List<Repairs> ywc(String studid, String status){
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest requests = ((ServletRequestAttributes)ra).getRequest();
        User user= (User)requests.getSession(true).getAttribute("Users");
        String num= String.valueOf(user.getStuid());
        studid=num;
        status="已完成";
        List<Repairs> repairs=repairsService.selectByBx(studid,status);
        return repairs;
    }

    @RequestMapping("selecttime")
    @ResponseBody
    public int selecttime(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        Date ss= date;
        System.out.println("12312312时间::"+ss);

        int repairs=repairsService.selectByTime(ss);

return repairs;
    }
}
