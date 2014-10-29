package com.coo.s.vote.model;

/**
 * 每次Job运行,都要进行记录,记录时间戳，开始执行时间,执行结果等,便于统计Job的相关信息获取
 * @description 
 * @author boqing.shen
 * @date 2014-9-23 上午11:20:00
 * @since 0.6.2.0
 */

public class JobLog extends BasicItem{

	public static String C_NAME = "vote_job";
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6785637087835797157L;
	
	/**
	 * Job名称,类全名,用于查找上一次的执行时间
	 */
	@Column(name = "name", label = "名称")
	private String name ="";
	
	/**
	 * 开始(执行)时间戳：很多后续的数据是以此信息作为分割的
	 */
	@Column(name = "start_ts", label = "开始(执行)时间戳")
	private Long startTs = 0l;
	
	/**
	 * 结束时间戳
	 */
	@Column(name = "end_ts", label = "结束时间戳")
	private Long endTs = 0l;
	
	public static Status STATUS_SUCCESS = new Status(0,"成功");
	public static Status STATUS_FAIL = new Status(1,"失败");;

	protected Status[] getStatusArray() {
		return new Status[] { STATUS_SUCCESS, STATUS_FAIL };
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the startTs
	 */
	public long getStartTs() {
		return startTs;
	}

	/**
	 * @param startTs the startTs to set
	 */
	public void setStartTs(long startTs) {
		this.startTs = startTs;
	}

	/**
	 * @return the endTs
	 */
	public long getEndTs() {
		return endTs;
	}

	/**
	 * @param endTs the endTs to set
	 */
	public void setEndTs(long endTs) {
		this.endTs = endTs;
	}
}
