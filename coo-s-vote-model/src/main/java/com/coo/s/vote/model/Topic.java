package com.coo.s.vote.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Topic的快照模型，就是一个Topic Topic(0) + Vote(*) + Topic(1)
 * 
 * @author boqing.shen
 * @since 0.6.0.0
 */
public class Topic extends BasicObject {

	public static String C_NAME = "vote_topic";

	/**
	 * 
	 */
	private static final long serialVersionUID = 5649657538865975809L;

	@Column(name = "title", label = "主题标题")
	private String title = "";

	@Column(name = "icon", label = "主题图标,待定")
	private String icon = "";

	@Column(name = "vote", label = "投票总数")
	private Integer vote = 0;

	@Column(name = "snapshot", label = "快照时间戳")
	private Long snapshot = 0l;

	@Column(name = "channels", label = "所属频道tiyu,yinyue")
	private String channels = null;

	public static int STATUS_VALID = 0;// new Status(0, "有效");
	public static int STATUS_LOCKED = 5;// new Status(5, "锁定");
	public static int STATUS_INVALID = 9;// new Status(9, "无效");

	/**
	 * 判断Topic的一个实例，是否是和一个账号进行了绑定，即账号已经投过Topic了 采用Focus来描述投票关系式，类型是:VOTE
	 */
	private boolean voted = false;

	/**
	 * 定义选项集合
	 * 
	 * @since 0.1.2.0
	 */
	private List<TopicLeg> legs = new ArrayList<TopicLeg>();

	/**
	 * 添加Leg
	 * 
	 * @since 0.1.2.0
	 */
	public void add(TopicLeg leg) {
		legs.add(leg);
	}

	/**
	 * 获得所有Leg
	 * 
	 * @since 0.1.2.0
	 */
	public List<TopicLeg> getLegs() {
		return legs;
	}

	/**
	 * 构造函数
	 */
	public Topic() {

	}

	/**
	 * 构造函数
	 * 
	 * @since 0.1.3.0
	 */
	public Topic(String title, String owner) {
		this.title = title;
		this.owner = owner;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getVote() {
		return vote;
	}

	public void setVote(Integer vote) {
		this.vote = vote;
	}

	public String getChannels() {
		return channels;
	}

	public void setChannels(String channels) {
		this.channels = channels;
	}

	/**
	 * 当前LEG数
	 * 
	 * @return
	 */
	public int getLegSize() {
		return this.legs.size();
	}

	/**
	 * @return the snapshot
	 */
	public Long getSnapshot() {
		return snapshot;
	}

	/**
	 * @param snapshot
	 */
	public void setSnapshot(Long snapshot) {
		this.snapshot = snapshot;
	}

	/**
	 * @return the voted
	 */
	public boolean isVoted() {
		return voted;
	}

	/**
	 * @param voted
	 *            the voted to set
	 */
	public void setVoted(boolean voted) {
		this.voted = voted;
	}

}
