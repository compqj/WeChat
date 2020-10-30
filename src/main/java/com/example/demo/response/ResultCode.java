package com.example.demo.response;

public enum ResultCode {


    Success(100,"登录成功!"),
    Fail(2000,"账号密码错误!"),

    infook(10,"信息提交成功!"),
    infnook(30,"信息提交失败!"),
    infono(20,"号码必须为十一位数!"),

    yyok(1,"预约成功!"),
    yynos(5,"预约失败!"),
    yyno(2,"联系方式不能为空!"),
    yyno2(3,"号码必须为十一位数!!"),
    yyno6(6,"号码必须为数字!!"),
    yyno3(4,"病人姓名不能为空!"),

    youno(1,"您不是该学校的师生,没有权限访问!"),
    youby(2,"你已毕业,没有权限访问该系统!"),

    yyz(1,"预约中信息"),

    bxcg(1,"报修成功"),
    bxsb(2,"报修失败"),

    ERROR_PARAMS_VALIDATOR(200,"参数为空");




    private Integer code;
    private String message;



    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }



    ResultCode(int code, String message) {
        this.code=code;
        this.message=message;
    }



}
