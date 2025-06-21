package com.xing.exception;

public class BusinessException extends RuntimeException{
    private Integer errCode;
    private String errMsg;

    public BusinessException(Integer errCode, String errMsg) {
        super(errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
