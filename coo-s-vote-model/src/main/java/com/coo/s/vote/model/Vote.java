package com.coo.s.vote.model;

/**
 * 投票对象，一个Topic对一个Account进行了一次投票
 * 
 * @description
 * @author boqing.shen
 * @date 2014-6-19 上午10:02:02
 * @since 0.1.2.0
 */

public class Vote extends BasicObject {

	public static String C_NAME = "vote_vote";

	private static final long serialVersionUID = -2410079737542400586L;

	@Column(name = "topic_id")
	private String topicId = "";

	@Column(name = "leg_seq", label = "Leg序号:0,1……")
	private String legSeq = "";

	@Column(name = "voter", label = "投票人账号")
	private String voter = "";

	public final static int STATUS_VALID = 0;//new Status(0, "有效");

	public final static int STATUS_COUNTED = 5;//new Status(5, "已统计");

	public final static int STATUS_INVALID = 9;//new Status(9, "无效");

//	protected Status[] getStatusArray() {
//		return new Status[] { STATUS_VALID, STATUS_INVALID, STATUS_INVALID };
//	}

	public String getLegSeq() {
		return legSeq;
	}

	public void setLegSeq(String legSeq) {
		this.legSeq = legSeq;
	}

	public String getVoter() {
		return voter;
	}

	public void setVoter(String voter) {
		this.voter = voter;
	}

	/**
	 * @return the topicId
	 */
	public String getTopicId() {
		return topicId;
	}

	/**
	 * @param topicId
	 *            the topicId to set
	 */
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

}
