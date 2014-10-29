package com.coo.s.vote.model;

/**
 * 主题的每一个选项的投票信息
 * 
 * @author boqing.shen
 * @since 0.1.0.0
 */
public class TopicLeg extends BasicObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3127244727623617429L;

	@Column(name = "leg_title", label = "标题")
	private String title = "";

	@Column(name = "leg_seq", label = "选项序号,从0开始, 0:A;1:B;2:C.")
	private String seq = "";
	
	@Column(name = "leg_vote", label = "投票数")
	private Integer vote = 0;

	/**
	 * 构造函数
	 * 
	 * @since 0.1.0.0
	 */
	public TopicLeg() {

	}

	/**
	 * 构造函数
	 */
	public TopicLeg(String seq, String title) {
		this.seq = seq;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getVote() {
		return vote;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public void setVote(Integer vote) {
		this.vote = vote;
	}

}
