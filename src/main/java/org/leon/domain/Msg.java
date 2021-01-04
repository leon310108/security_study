package org.leon.domain;

import lombok.Data;

@Data
public class Msg {
	private String title;
	private String content;
	private String etraInfo;
	/**
	 * @param title
	 * @param content
	 * @param etraInfo
	 */
	public Msg(String title, String content, String etraInfo) {
		this.title = title;
		this.content = content;
		this.etraInfo = etraInfo;
	}
	
}
