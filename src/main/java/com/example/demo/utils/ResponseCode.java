package com.example.demo.utils;

/**
 * @author wwx
 * @date 2019/4/3 15:53
 **/
public enum ResponseCode {
    SUCCESS(200, "成功"),
    ERROR(420, "失败"),
    NOT_FOUND(404, "请求不存在"),
    NEED_LOG(410,"请先登录"),
    SERVER_ERROR(500,"请求出错");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }


    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
