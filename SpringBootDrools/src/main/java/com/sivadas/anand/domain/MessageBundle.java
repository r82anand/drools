package com.sivadas.anand.domain;

import java.util.Date;
import java.util.List;

public class MessageBundle extends BaseDTO {

	private static final long serialVersionUID = -2368617325084485371L;

	private String category;
	
	private List<Message> messages;
	
	private Date publishTime;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

}
