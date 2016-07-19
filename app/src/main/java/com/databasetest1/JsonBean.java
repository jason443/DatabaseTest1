package com.databasetest1;

import java.util.List;

/**
 * Created by ASUS on 2016/7/19.
 */
public class JsonBean {

    private String resultcode;
    private String reason;
    private List<Future1> future;
    private String error_code;
    private Result result;

    public List<Future1> getFuture() {
        return future;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }

    public String getReason() {
        return reason;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setFuture1(List<Future1> future) {
        this.future = future;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }
}
