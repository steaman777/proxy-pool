package com.chenerzhu.crawler.proxy.pool.entity;

import lombok.Data;
import lombok.ToString;
import org.jsoup.nodes.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @author chenerzhu
 * @create 2018-09-02 15:14
 **/
@Data
@ToString
public class WebPage implements Serializable {
    private static final long serialVersionUID = 23454787L;
    private Date crawlTime;
    private String page;
    private Document document;
    private String html;
	public Date getCrawlTime() {
		return crawlTime;
	}
	public void setCrawlTime(Date crawlTime) {
		this.crawlTime = crawlTime;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public String getHtml() {
		return html;
	}
	public void setHtml(String html) {
		this.html = html;
	}
}