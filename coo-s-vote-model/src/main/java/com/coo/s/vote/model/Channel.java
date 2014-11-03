package com.coo.s.vote.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 仅仅是作为静态的频道,由系统Admin来定义,对应于c.type.xxx TODO 备用表
 */
public class Channel extends BasicObject {

	public static String C_NAME = "vote_channel";
	/**
	 * 已被关注
	 * 
	 * @since 0.6.0.0
	 */
	public static final int TYPE_FOCUSD = 1;
	/**
	 * 未被关注
	 * 
	 * @since 0.6.0.0
	 */
	public static final int TYPE_UNFOCUS = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = -9017110131064403458L;

	/**
	 * 构造函数
	 * 
	 * @since 0.1.1.0
	 */
	public Channel() {

	}

	/**
	 * 构造函数
	 * 
	 * @since 0.1.1.0
	 */
	public Channel(String code, String label) {
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
	
	/**
	 * 获得所属范围内的TopicShot列表
	 * 
	 * @since 0.1.2.0
	 */
	private List<Topic> items = new ArrayList<Topic>();

	/**
	 * 添加TS条目
	 * 
	 * @since 0.1.2.0
	 */
	public void add(Topic ts) {
		items.add(ts);
	}

	/**
	 * 获得所属范围内的TopicShot列表
	 * 
	 * @since 0.1.2.0
	 * @return
	 */
	public List<Topic> getItems() {
		return items;
	}

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
}
