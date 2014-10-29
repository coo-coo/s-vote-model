package com.coo.s.vote.model;

/**
 * 账号信息
 * 
 * @description
 * @author boqing.shen
 * @date 2014-6-16 下午4:51:39
 * @since 0.1.0.0
 */

public class Account extends BasicItem {

	public static String C_NAME = "vote_account";

	/**
	 * 
	 */
	private static final long serialVersionUID = 4421956633636541182L;
	/**
	 * 账号类型：一般账号
	 */
	public static final String TYPE_COMMON = "0";
	/**
	 * 账号类型：系统账号
	 */
	public static final String TYPE_SYSTEM = "1";
	/**
	 * 账号类型：管理员账号
	 */
	public static final String TYPE_ADMIN = "2";
	/**
	 * 账号类型：测试账号
	 */
	public static final String TYPE_TEST = "3";

	public static Status STATUS_VALID = new Status(0, "已注册");

	public static Status STATUS_LOCKED = new Status(5, "已锁定");

	public static Status STATUS_DELETED = new Status(9, "已删除");

	protected Status[] getStatusArray() {
		return new Status[] { STATUS_VALID, STATUS_LOCKED, STATUS_DELETED };
	}

	@Column(name = "mobile", label = "手机号")
	private String mobile = "";

	@Column(name = "password", label = "密码")
	private String password = "";

	// 0：一般账号；1：系统账号；2：管理员帐号；3：测试账号
	@Column(name = "type", label = "账号类型")
	private String type = "0";

	/**
	 * 构造函数
	 */
	public Account(String mobile, String type) {
		this.mobile = mobile;
		this.type = type;
	}

	/**
	 * 构造函数
	 */
	public Account(String mobile) {
		this(mobile, Account.TYPE_COMMON);
	}

	/**
	 * 构造函数
	 */
	public Account() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 用Mobile作为账号
	 */
	public String getAccount() {
		return this.mobile;
	}
}
