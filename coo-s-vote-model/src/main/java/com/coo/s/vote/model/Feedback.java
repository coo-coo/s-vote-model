package com.coo.s.vote.model;

/**
 * 反馈信息
 * 
 * @description
 * @author boqing.shen
 * @date 2014-6-30 上午11:32:41
 * @since 0.1.7.0
 */

public class Feedback extends BasicObject {

	private static final long serialVersionUID = -3976410079555818395L;

	public static String C_NAME = "vote_feedback";
	
	@Column(name = "note", label = "反馈信息")
	private String note = "";

	@Column(name = "app_version", label = "版本信息")
	private String appVersion = "";

//	@Override
//	protected Status[] getStatusArray() {
//		return new Status[] { STATUS_UNSOLVED, STATUS_SOLVED };
//	}

	public static Status STATUS_UNSOLVED = new Status(0, "未处理");
	public static Status STATUS_SOLVED = new Status(1, "已处理");

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}
