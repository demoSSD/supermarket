package com.example.supermarket_back.utils.constants;

/*
* 错误信息枚举类
* */
public enum ErrorEnum {
    /*
     * 错误信息
     * */
    E_400("400","请求处理异常，请稍后再试"),
    E_401("401","验证码错误"),
    E_402("402","验证码过期"),
    E_403("403", "请求方式有误,请检查 GET/POST"),
    E_404("404", "请求路径不存在"),
    E_405("405", "权限不足"),
    E_406("406", "账户已存在"),
    E_407("407", "账号/密码错误"),
    E_408("408", "登陆已过期,请重新登陆"),
    E_409("409", "缺少必填参数"),

    E_500("500","服务器内部错误"),
    E_501("501","更新失败,数据未进行变动"),
    E_502("502","删除失败,数据未进行变动"),
    E_503("503","查询失败"),;


    private final String errorCode;

    private final String errorMsg;

    ErrorEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
