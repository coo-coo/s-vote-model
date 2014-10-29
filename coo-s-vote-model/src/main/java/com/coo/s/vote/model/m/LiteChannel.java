package com.coo.s.vote.model.m;

import com.coo.s.vote.model.Column;

/**
 * 对应Mobile端的MChannel，但不全同，区别:增加MongoItem成分
 * @author boqing.shen
 * TODO 字段好像没用?
 */
public class LiteChannel extends LiteObject{

	public static String C_NAME = "vote_mchannel";
	/**
	 * 
	 */
	private static final long serialVersionUID = -3511152017588384691L;
	
	@Column(name = "code", label = "頻道代码")
	private String code = "";
	
	@Column(name = "label", label = "頻道名称")
	private String label = "";
	
	@Column(name = "status", label = "是否已关注:0 未关注,1 已关注")
	private int status = 0;
	
	@Column(name = "deleted", label = "是否删除:0 未删除,1 已删除")
	private int deleted = 0;
	
	@Column(name = "host", label = "本机账号，即account")
	private String host = "";

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
}
