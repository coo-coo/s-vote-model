package com.coo.s.vote.model.m;

import com.coo.s.vote.model.Column;

/**
 * 对应Mobile端的MContact
 * @author boqing.shen
 * TODO 字段好像没用?
 */
public class LiteContact extends LiteObject{
	
	public static String C_NAME = "vote_mcontact";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9123875192005756572L;
	
	@Column(name = "name", label = "通讯薄名称:(通讯薄获得)")
	private String name = "";
	
	@Column(name = "mobile", label = "通讯薄号码 TODO 属于手机号码才进数据库 (通讯薄获得)")
	private String mobile = "";
	
	@Column(name = "account", label = "绑定的应用账号, 目前和该手机号一致 和服务器端同步，如有表示已注册 (服务器端获得)")
	private String account = "";
	
	@Column(name = "area", label = "备用字段:手机所属地区 (服务器端获得)")
	private String area = "";
	
	@Column(name = "icon", label = "备用字段:ICON")
	private String icon = "";
	
	@Column(name = "wxId", label = "备用字段:微信ID")
	private String wxId = "";
	
	@Column(name = "signature", label = "备用字段:个性化签名 (服务器端获得,即Account的签名)")
	private String signature = "";
	
	@Column(name = "alias", label = "备用字段:昵称，别名 (服务器端获得,即Account的昵称)")
	private String alias = "";
	
	@Column(name = "host", label = "本机账号，即account")
	private String host = "";
	
	@Column(name = "focus", label = "是否已关注:0 未关注,1 已关注 (服务器端获得)")
	private int focus = 0;

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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getWxId() {
		return wxId;
	}

	public void setWxId(String wxId) {
		this.wxId = wxId;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getFocus() {
		return focus;
	}

	public void setFocus(int focus) {
		this.focus = focus;
	}
}
