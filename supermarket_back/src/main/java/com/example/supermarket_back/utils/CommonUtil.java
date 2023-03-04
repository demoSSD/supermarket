package com.example.supermarket_back.utils;

import com.alibaba.fastjson.JSONObject;
import com.example.supermarket_back.utils.constants.ErrorEnum;
import com.example.supermarket_back.utils.constants.SuccessConstants;

/**
 * @author: zyf
 * @description: 本后台接口系统常用的json返回数据工具类
 * @date: 2023/03/04 13:22
 */
public class CommonUtil {

    /**
     * 返回一个info为空对象的成功消息的json
     */
    public static JSONObject successJson() {
        return successJson(new JSONObject());
    }
    /**
     * 返回一个返回码为200的json
     */
    public static JSONObject successJson(Object info) {
        JSONObject resultJson = new JSONObject();
        resultJson.put("code", SuccessConstants.SUCCESS_CODE);
        resultJson.put("msg", SuccessConstants.SUCCESS_MSG);
        resultJson.put("info", info);
        return resultJson;
    }

    /**
     * 返回错误信息JSON
     */
    public static JSONObject errorJson(ErrorEnum errorEnum) {
        JSONObject resultJson = new JSONObject();
        resultJson.put("code", errorEnum.getErrorCode());
        resultJson.put("msg", errorEnum.getErrorMsg());
        resultJson.put("info", new JSONObject());
        return resultJson;
    }
    public static JSONObject errorJson(String error) {
        JSONObject resultJson = new JSONObject();
        resultJson.put("code", ErrorEnum.E_400.getErrorCode());
        resultJson.put("msg", error);
        resultJson.put("info", new JSONObject());
        return resultJson;
    }
}
