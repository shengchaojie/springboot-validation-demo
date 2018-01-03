package com.scj.springbootdemo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pengyuming
 *
 */
public class WebResult<T>  {

    public static final Integer SUCCESS = 1;
    public static final Integer FAILED = 0;

    /**
     * 状态码
     */
    @JsonProperty("flag")
    private Integer flag;
    /**
     * 信息
     */
    @JsonProperty("info")
    private String info;

    /**
     * 数据
     */
    @JsonProperty("data")
    private T data;

    public WebResult() {
    }

    public WebResult(Integer flag) {
        this.flag = flag;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}