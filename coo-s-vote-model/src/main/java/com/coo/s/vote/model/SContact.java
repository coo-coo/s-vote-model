package com.coo.s.vote.model;

public class SContact extends SModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4794341824964936905L;
	public static String C_NAME = "vote_mcontact";
	
	/**
	 * 通讯薄名称:(通讯薄获得)
	 */
	@Column
	private String name = "";
	/**
	 * 通讯薄号码 TODO 属于手机号码才进数据库 (通讯薄获得)
	 */
	@Column
	private String mobile = "";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
