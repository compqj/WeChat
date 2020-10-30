package com.example.demo.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private Integer code;
    private String message;
    private Object data;

    public Result(ResultCode returnCode, Object data){
        this.code=returnCode.getCode();
        this.message=returnCode.getMessage();
        this.data=data;
    }

}
