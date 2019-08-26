package com.vip.items.utils;

import lombok.Data;


@Data
public class Result<T> {
    private int status;
    private String msg;
    private T data;
    public static Result success(Object obj){
        Result result = new Result();
        result.setStatus(Constants.SUCCESS_STATUS_200);
        result.setMsg(Constants.SUCCESS_MSG);
        result.setData(obj);
        return result;
    }
    public static Result error(){
        Result result = new Result();
        result.setStatus(Constants.ERROR_STATUS_404);
        result.setMsg(Constants.ERROR_MSG);
        return result;
    }
}
