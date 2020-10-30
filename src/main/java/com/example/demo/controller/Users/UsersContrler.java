package com.example.demo.controller.Users;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.response.Result;
import com.example.demo.response.ResultCode;
import com.example.demo.service.oder.OrderService;
import com.example.demo.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

@Controller
@RequestMapping("users")
public class UsersContrler {
@Autowired
private UserService userService;


//根据id查询数据
    @RequestMapping("selectInfo")
    @ResponseBody
    public User SelectInfo(Integer stuid , Model model){
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest requests = ((ServletRequestAttributes)ra).getRequest();
        User users= (User)requests.getSession(true).getAttribute("Users");
//        Integer nums=users.getStuid();
//        stuid=nums;
        stuid=184023030;
        User user=this.userService.selectByPrimaryKey(stuid);
        return user;

    }

//修改个人信息
    @RequestMapping("updateInfo")
    @ResponseBody
    public Result updateinfo(Integer stuid, String name, String password, String phonenumber,
                             String specialty, String grade, String dormitory, String role,String wdwx){
        Result result=null;
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest requests = ((ServletRequestAttributes)ra).getRequest();
        User user= (User)requests.getSession(true).getAttribute("Users");

        Integer num=184023030;
        System.out.println("学号::"+num);
         stuid=num;
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        System.out.println( "判断::"+pattern.matcher(phonenumber).matches());
        boolean aa=pattern.matcher(phonenumber).matches();
        System.out.println("电话号码::"+phonenumber.length());
        if (phonenumber.length()!=11) {
            result = new Result(ResultCode.infono, null);
        }else if (aa==false){
            result=new Result(ResultCode.yyno6,null);
        }else {
            System.out.println(name);
            System.out.println(phonenumber);
            System.out.println(specialty);
            System.out.println(grade);
            System.out.println(dormitory);
            Integer count = userService.updateByPrimaryKeySelective(stuid, name, password, phonenumber,
                    specialty, grade, dormitory, role,wdwx);
            if (count>0){
                result=new Result(ResultCode.infook,count);
            }else {
                result=new Result(ResultCode.infnook,count);
            }

        }

        return result;
    }
}
