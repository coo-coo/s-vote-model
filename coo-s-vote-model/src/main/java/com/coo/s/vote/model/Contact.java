package com.coo.s.vote.model;

/**
 * 通讯录上的每一个通讯人信息，需和M端存储进行同步 Contact是某一个Host的Contact
 * @deprecated 参见LiteContact
 */
public class Contact extends BasicObject {

	public static String C_NAME = "vote_contact";

	/**
	 * 
	 */
	private static final long serialVersionUID = -3917751706275159861L;

	/**
	 * 构造函数
	 */
	public Contact() {

	}

	/**
	 * 构造函数
	 */
	public Contact(String mobile, String name) {
		this.mobile = mobile;
		this.name = name;
	}

	@Column(name = "host", label = "M端Host,即M段账号")
	private String host = "";

	@Column(name = "mobile", label = "手机信息")
	private String mobile = "";

	@Column(name = "name", label = "姓名")
	private String name = "";

	@Column(name = "alias", label = "别名,Job更新,來自Account")
	private String alias = "";

	@Column(name = "account", label = "Mobile，绑定账号,Job更新,來自Account")
	private String account = "";

	@Column(name = "area", label = "备用字段:手机所属地区,Job更新,來自Account")
	private String area = "";

	@Column(name = "icon", label = "备用字段:ICON,來自Account")
	private String icon = "";

	@Column(name = "weixin", label = "备用字段:微信ID,來自Account")
	private String weixin = "";

	@Column(name = "signature", label = "备用字段:个性化签名,Job更新,來自Account")
	private String signature = "";

	@Column(name = "binding_ts", label = "绑定时间戳")
	private Long bindingTs = 0l;

	@Column(name = "status", label = "状态:备用字段")
	private Integer status = 0;

	/**
	 * 判定是否已经绑定了账号
	 */
	public boolean isAccounted() {
		return account.equals("") ? false : true;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the bindingTs
	 */
	public long getBindingTs() {
		return bindingTs;
	}

	/**
	 * @param bindingTs
	 *            the bindingTs to set
	 */
	public void setBindingTs(long bindingTs) {
		this.bindingTs = bindingTs;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}


	/**
	 * @return the weixin
	 */
	public String getWeixin() {
		return weixin;
	}

	/**
	 * @param weixin the weixin to set
	 */
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	/**
	 * @return the signature
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * @param signature
	 *            the signature to set
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host
	 *            the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

}
