package com.coo.s.vote.model;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @description
 * @author boqing.shen
 * @date 2014-6-16 下午4:54:56
 * @since 0.1.0.0
 */

public abstract class BasicObject implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6121507204868751924L;

	@Column(name = "_id", label = "Mongo主键ID,如果是null，则表示该对象未被实例化，参加业务计算")
	protected String _id = null;

	@Column(name = "_tsi", label = "系统数据生成时间戳:参见MongoItem")
	public long _tsi = -1;

	@Column(name = "_tsu", label = "系统数据的更新时间戳:参见MongoItem")
	public long _tsu = -1;

	@Column(name = "owner", label = "拥有者账号：对应M端的HOST")
	protected String owner = "";

	@Column(name = "owner_id", label = "拥有者账号ID,关联Account表中的_id")
	protected String ownerId = "";

	@Column(name = "updater", label = "数据更新者账号")
	protected String updater = "";

	@Column(name = "status", label = "状态=0，缺省值")
	protected Integer status = 0;

	/**
	 * StatusMap
	 * @deprecated
	 */
	protected static Map<Integer, Status> statusMap = new HashMap<Integer, Status>();

	/**
	 * 一般的参数，不涉及业务计算的属性信息，存储于此
	 */
	protected Map<String, Object> attrs = new HashMap<String, Object>();

	/**
	 * 支持是否选中...
	 */
	protected boolean selected = Boolean.FALSE;

	/**
	 * 放置属性信息
	 */
	public BasicObject put(String key, Object value) {
		attrs.put(key, value);
		return this;
	}

//	/**
//	 * 该对象是否已经落地,即(Mongo)数据库中有该对应对象
//	 * @deprecated
//	 * @since 0.1.2.0
//	 * @return
//	 */
//	public boolean isPersisted() {
//		if (_id == null) {
//			return false;
//		}
//		return true;
//	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public long get_tsi() {
		return _tsi;
	}

	public void set_tsi(Long _tsi) {
		this._tsi = _tsi;
	}

	public long get_tsu() {
		return _tsu;
	}

	public void set_tsu(Long _tsu) {
		this._tsu = _tsu;
	}

	public Map<String, Object> getAttrs() {
		return attrs;
	}

	public void setAttrs(Map<String, Object> attrs) {
		this.attrs = attrs;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 根据一个类对象,获得其Column注解,生成colName:fieldName的Map
	 * 
	 * @since 0.1.8.0
	 * @param clz
	 * @return
	 */
	protected Map<String, String> getFieldMapping() {
		Map<String, String> map = new HashMap<String, String>();
		// 获得所有的Field列表，遍历循环
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			Column col = field.getAnnotation(Column.class);
			if (col != null) {
				map.put(col.name(), field.getName());
			}
		}
		return map;
	}

	/**
	 * 返回Status的Label
	 * 直接转
	 */
//	public String getStatusLabel() {
//		String label = null;
//		for (Status s : getStatusArray()) {
//			if (s.code.intValue() == status.intValue()) {
//				label = s.label;
//				break;
//			}
//		}
//		return label;
//	}

//	/**
//	 * 重载状态数组
//	 * @deprecated
//	 */
//	protected Status[] getStatusArray() {
//		return new Status[0];
//	}

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
