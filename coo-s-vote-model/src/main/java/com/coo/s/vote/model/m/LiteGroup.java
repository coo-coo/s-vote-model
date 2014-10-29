package com.coo.s.vote.model.m;

import com.coo.s.vote.model.Column;

/**
 * 对应Mobile端的MGroup
 * 
 * @author boqing.shen
 * TODO 字段好像没用?
 */
public class LiteGroup extends LiteObject {

	public static String C_NAME = "vote_mgroup";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6212007567766039872L;

	@Column(name = "host", label = "本机账号，即account")
	private String host = "";

	@Column(name = "name", label = "名称")
	private String name = "";

	@Column(name = "description", label = "描述")
	private String description = "";

	@Column(name = "accounts0", label = "账号组1,记录名称和手机号.... 参见 name|13512210211;name|13512210212;")
	private String accounts0 = "";

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAccounts0() {
		return accounts0;
	}

	public void setAccounts0(String accounts0) {
		this.accounts0 = accounts0;
	}

	// @Column(name = "name", label = "账号组2，备用字段，受SQLite长度限制?")
	// private String accounts1 = "";

}
