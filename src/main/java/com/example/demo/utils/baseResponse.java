package com.example.demo.utils;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author wwx
 * @date 2019/4/3 15:54
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class baseResponse<T> {

    private int code;
    private T data;
    private String msg;

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return this.data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    //设置状态
    public void setStatus(ResponseCode response){
        this.code=response.getCode();
        this.msg=response.getMsg();
    }
    //默认返回失败代码
    public baseResponse(){
        this.code= ResponseCode.ERROR.getCode();
        this.msg=ResponseCode.ERROR.getMsg();
    }
}
