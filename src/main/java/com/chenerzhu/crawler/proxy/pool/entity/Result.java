package com.chenerzhu.crawler.proxy.pool.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author chenerzhu
 * @create 2018-09-05 22:09
 **/
@ToString
@Data
public class Result {
    private String message;
    private int code;
    private List data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
}