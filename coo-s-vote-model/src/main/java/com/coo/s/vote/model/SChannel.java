package com.coo.s.vote.model;

/**
 * M端对象在Server端的Clone版对象,用于M端数据到Server端的数据同步,作为载体
 * 以Map<String,Object>作为Json对象会因为Integer/Long都缺省变为了Double而出现问题 对应MContact
 * 
 * @author boqing.shen
 * 
 */
public class SChannel extends SModel {

	public static String C_NAME = "vote_mchannel";

	/**
	 * 
	 */
	private static final long serialVersionUID = 357415729743141505L;

	/**
	 * 頻道代码
	 */
	@Column
	private String code = null;
	/**
	 * 頻道名称
	 */
	@Column
	private String label = null;
	/**
	 * 是否删除:0 未删除,1 已删除
	 */
	@Column
	private String deleted = null;

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

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
}
