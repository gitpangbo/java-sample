package org.kirito.javaImprove.serializable;

import java.io.Serializable;

/**
 * @author pangbo
 * @version 创建时间：2016年4月19日 下午3:31:04 类说明
 */
public class Email implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1557510297124382445L;
	private String object;
	private String Content;

	public Email(String object, String content) {
		super();
		this.object = object;
		Content = content;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
