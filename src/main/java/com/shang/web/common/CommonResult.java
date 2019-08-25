package com.shang.web.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResult<T> implements Serializable {

    private static final long serialVersionUID = -4505655308965878999L;

    //请求成功返回码为：0000
    private static final String successCode = "0000";
    //返回数据
    private T data;
    //返回码
    private String code;
    //返回描述
    private String msg;

    public CommonResult(){
        this.code = successCode;
        this.msg = "请求成功";
    }

    public CommonResult(String code,String msg){
        this();
        this.code = code;
        this.msg = msg;
    }
    public CommonResult(String code,String msg,T data){
        this();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public CommonResult(T data){
        this();
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

}
