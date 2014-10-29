package com.coo.s.vote.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 基础业务条目对象
 * 
 * @description
 * @author boqing.shen
 * @date 2014-9-10 上午11:36:10
 * @since 1.0.0.0
 */

public class BasicItem extends BasicObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1363379430671527143L;

	/**
	 * 数据拥有者账号,即Mobile
	 */
	@Column(name = "owner", label = "拥有者账号")
	protected String owner = "";
	/**
	 * 数据拥有者,即建立者的UUID，对应_tsi, 关联Account表中的_id
	 */
	@Column(name = "owner_id", label = "拥有者账号ID")
	protected String ownerId = "";
	/**
	 * 数据修改者账号，对应_tsu
	 */
	@Column(name = "updater", label = "数据更新者账号")
	protected String updater = "";

	@Column(name = "status", label = "状态=0，缺省值")
	protected Integer status = 0;
	
	/**
	 * StatusMap
	 */
	protected static Map<Integer, Status> statusMap = new HashMap<Integer, Status>();
	
	/**
	 * 返回Status的Label
	 */
	public String getStatusLabel() {
		String label = "";
		for (Status s : getStatusArray()) {
			if(s.code.intValue()==status.intValue()){
				label = s.label;
				break;
			}
		}
		return label;
	}
	
	/**
	 * 重载状态数组
	 */
	protected Status[] getStatusArray() {
		return new Status[0];
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the updater
	 */
	public String getUpdater() {
		return updater;
	}

	/**
	 * @param updater
	 *            the updater to set
	 */
	public void setUpdater(String updater) {
		this.updater = updater;
	}

	/**
	 * @return the ownerId
	 */
	public String getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId
	 *            the ownerId to set
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

}
