package com.example.demo.controller.Users;

import com.example.demo.model.User;
import com.example.demo.model.UserInfo;
import com.example.demo.response.Result;
import com.example.demo.response.ResultCode;
import com.example.demo.service.userInfo.UserInfoService;
import com.example.demo.service.users.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("User")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserInfoService userInfoService;

    //    登录
    @RequestMapping("dologin")
    @ResponseBody
    public Result User(Integer stuid, String password,
                       String phonenumber, String name,
                       String specialty, String grade, String dormitory, String role, String wdwx,
                       HttpSession session, HttpServletRequest request, String wxh) {
        Result result = null;

//        String wxh="123123";
        User user = userService.selectByWdwx(wxh);
        UserInfo userInfo = userInfoService.selectByWxh(wxh);
        if (user == null) {
            if (userInfo == null) {
                result = new Result(ResultCode.youno, null);
            } else if (userInfo.getStatus().equals("毕业")) {
                result = new Result(ResultCode.youby, null);
            } else {
                Integer stuids = userInfo.getStuid();
                String names = userInfo.getName();
                String passwords = userInfo.getPassword();
                String phones = userInfo.getPhonenumber();
                String spiciatys = userInfo.getSpecialty();
                String grades = userInfo.getGrade();
                String dormitorys = userInfo.getDormitory();
                String roles = userInfo.getRole();
                String wxhs = userInfo.getWxh();
                User user1 = new User();
                user1.setStuid(stuids);
                user1.setName(names);
                user1.setPassword(passwords);
                user1.setPhonenumber(phones);
                user1.setSpecialty(spiciatys);
                user1.setGrade(grades);
                user1.setDormitory(dormitorys);
                user1.setRole(roles);
                user1.setWdwx(wxhs);
                int nums = userService.insertSelective(user1);
                if (nums > 0) {
                    System.out.println("我的数据插入成功");
                    stuid = userInfo.getStuid();
                    User u = userService.user(stuid);
                    if (u != null) {

                        //查询到学生信息并成功加入学生表后，给学生信息关系表插入数据，绑定该学生的学号和微信号,验证登录成功


                        //HttpSession session1 = request.getSession();
                        session.setAttribute("user", u);
                        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
                        HttpServletRequest requests = ((ServletRequestAttributes) ra).getRequest();
                        requests.getSession(true).setAttribute("Users", u);
                        result = new Result(ResultCode.Success, u);

                    } else {
                        result = new Result(ResultCode.Fail, null);
                    }
                }
            }
        } else if (userInfo.getStatus().equals("毕业")) {
            result = new Result(ResultCode.youby, null);
        } else {
            String specialty1 = user.getSpecialty().toString().trim();
            System.out.println("specialty1::" + specialty1);
            String specialty2 = userInfo.getSpecialty().toString().trim();
            System.out.println("specialty2::" + specialty2);
            String grade1 = user.getGrade();
            String grade2 = userInfo.getGrade();
            String dormitory1 = user.getDormitory();
            String dormitory2 = userInfo.getDormitory();
            int ids = user.getStuid();
            if (specialty1.equals(specialty2) && grade1.equals(grade2) && dormitory1.equals(dormitory2)) {
                stuid = userInfo.getStuid();
                User u = userService.user(stuid);
                if (u != null) {

                    //HttpSession session1 = request.getSession();
                    session.setAttribute("user", u);
                    RequestAttributes ra = RequestContextHolder.getRequestAttributes();
                    HttpServletRequest requests = ((ServletRequestAttributes) ra).getRequest();
                    requests.getSession(true).setAttribute("Users", u);
                    result = new Result(ResultCode.Success, u);

                } else {
                    result = new Result(ResultCode.Fail, null);
                }
            }
            else {
                if (!specialty1.equals(specialty2)) {
                    specialty = specialty2;
                    stuid = ids;
                    Integer count = userService.updateByPrimaryKeySelective(stuid, name, password, phonenumber,
                            specialty, grade, dormitory, role, wdwx);
                    if (count > 0) {
                        System.out.println("所属专业已更新!");
                    }
                    stuid = userInfo.getStuid();
                    User u = userService.user(stuid);
                    if (u != null) {

                        //HttpSession session1 = request.getSession();
                        session.setAttribute("user", u);
                        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
                        HttpServletRequest requests = ((ServletRequestAttributes) ra).getRequest();
                        requests.getSession(true).setAttribute("Users", u);
                        result = new Result(ResultCode.Success, u);

                    } else {
                        result = new Result(ResultCode.Fail, null);
                    }
                }
                if (!grade1.equals(grade2)) {
                    grade = grade2;
                    stuid = ids;
                    Integer count = userService.updateByPrimaryKeySelective(stuid, name, password, phonenumber,
                            specialty, grade, dormitory, role, wdwx);
                    if (count > 0) {
                        System.out.println("所属班级已更新!");
                    }
                    stuid = userInfo.getStuid();
                    User u = userService.user(stuid);
                    if (u != null) {

                        //HttpSession session1 = request.getSession();
                        session.setAttribute("user", u);
                        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
                        HttpServletRequest requests = ((ServletRequestAttributes) ra).getRequest();
                        requests.getSession(true).setAttribute("Users", u);
                        result = new Result(ResultCode.Success, u);

                    } else {
                        result = new Result(ResultCode.Fail, null);
                    }
                }
                if (!dormitory1.equals(dormitory2)) {
                    dormitory = dormitory2;
                    stuid = ids;
                    Integer count = userService.updateByPrimaryKeySelective(stuid, name, password, phonenumber,
                            specialty, grade, dormitory, role, wdwx);
                    if (count > 0) {
                        System.out.println("所在宿舍已更新!");
                    }
                    stuid = userInfo.getStuid();
                    User u = userService.user(stuid);
                    if (u != null) {

                        //HttpSession session1 = request.getSession();
                        session.setAttribute("user", u);
                        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
                        HttpServletRequest requests = ((ServletRequestAttributes) ra).getRequest();
                        requests.getSession(true).setAttribute("Users", u);
                        result = new Result(ResultCode.Success, u);

                    } else {
                        result = new Result(ResultCode.Fail, null);
                    }
                }

            }

            //
        }

        return result;

    }


    //获取用户信息
    @RequestMapping("/t_personal_information")
    @ResponseBody
    public User getUser(HttpSession session) {


        User user = (User) session.getAttribute("user");

        User u = null;

        if (user != null) {

            u = userService.User(user.getStuid());
        }


        return u;
    }


}
