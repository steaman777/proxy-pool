package com.chenerzhu.crawler.proxy.pool.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author chenerzhu
 * @create 2018-08-29 21:00
 **/
@Data
@ToString
@Entity
@Table(name = "ProxyIp")
public class ProxyIp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JSONField(serialize = false)
    private long id;
    private String ip;
    private int port;
    private String country;//国家
    private String location;//位置
    private String type;//类型 https http
    private String anonymity;//匿名性
    @Column(name="available" ,nullable=false)
    private boolean available;
    /*@Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp*/
    @JsonIgnore
    @JSONField(serialize = false)
    private Date createTime;
    /*@UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)*/
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date lastValidateTime;
    @Column(name="validateCount" ,nullable=false,columnDefinition="INT default 0")
    @JsonIgnore
    @JSONField(serialize = false)
    private int validateCount;//校验次数
    @JsonIgnore
    @JSONField(serialize = false)
    private int availableCount;//校验可用次数
    @JsonIgnore
    @JSONField(serialize = false)
    private int unAvailableCount;//校验不可用次数
    private long responseTime;//响应时间
    private long requestTime;//请求时间
    private long useTime;//代理请求需要总时长
    @Column(scale=3,precision = 5)
    @JSONField(serialize = false)
    private double availableRate;//可用率
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAnonymity() {
		return anonymity;
	}
	public void setAnonymity(String anonymity) {
		this.anonymity = anonymity;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastValidateTime() {
		return lastValidateTime;
	}
	public void setLastValidateTime(Date lastValidateTime) {
		this.lastValidateTime = lastValidateTime;
	}
	public int getValidateCount() {
		return validateCount;
	}
	public void setValidateCount(int validateCount) {
		this.validateCount = validateCount;
	}
	public int getAvailableCount() {
		return availableCount;
	}
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}
	public int getUnAvailableCount() {
		return unAvailableCount;
	}
	public void setUnAvailableCount(int unAvailableCount) {
		this.unAvailableCount = unAvailableCount;
	}
	public long getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(long responseTime) {
		this.responseTime = responseTime;
	}
	public long getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(long requestTime) {
		this.requestTime = requestTime;
	}
	public long getUseTime() {
		return useTime;
	}
	public void setUseTime(long useTime) {
		this.useTime = useTime;
	}
	public double getAvailableRate() {
		return availableRate;
	}
	public void setAvailableRate(double availableRate) {
		this.availableRate = availableRate;
	}
}