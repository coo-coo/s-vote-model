package com.coo.s.vote.model;

/**
 * 企业账号,用于商业行为，类似于Channel,对应Topic为c.firm.xxx
 */
public class Firm extends BasicItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1382569918105452854L;

	public static String C_NAME = "vote_firm";

	/**
	 * 构造函数
	 * 
	 * @since 0.1.1.0
	 */
	public Firm() {

	}

	/**
	 * 构造函数
	 */
	public Firm(String code, String label) {
		this.code = code;
		this.label = label;
		this.icon = "icon_" + code + ".png";
	}

	@Column(name = "label", label = "标题")
	private String label = "";

	@Column(name = "code", label = "代码")
	private String code = "";

	@Column(name = "icon", label = "图标")
	private String icon = "";

	@Column(name = "status", label = "状态")
	private Integer status = 0;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
