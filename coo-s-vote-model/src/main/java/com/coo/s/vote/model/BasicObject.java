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

	/**
	 * Mongo主键ID,如果是null，则表示该对象未被实例化，参加业务计算
	 * 
	 * @since 0.1.2.0
	 */
	protected String _id = null;

	/**
	 * 系统数据生成时间戳:参见MongoItem
	 * 
	 * @since 0.1.2.0
	 */
	public long _tsi = -1;
	/**
	 * 系统数据的更新时间戳:参见MongoItem
	 * 
	 * @since 0.1.2.0
	 */
	public long _tsu = -1;

	/**
	 * 一般的参数，不涉及业务计算的属性信息，存储于此
	 * 
	 * @since 0.1.2.0
	 */
	protected Map<String, Object> attrs = new HashMap<String, Object>();

	/**
	 * 支持是否选中...
	 * 
	 * @since 0.5.2.0
	 */
	protected boolean selected = Boolean.FALSE;

	/**
	 * 放置属性信息
	 * 
	 * @since 0.1.2.0
	 * @param key
	 * @param value
	 */
	public BasicObject put(String key, Object value) {
		attrs.put(key, value);
		return this;
	}

	/**
	 * 该对象是否已经落地,即(Mongo)数据库中有该对应对象
	 * 
	 * @since 0.1.2.0
	 * @return
	 */
	public boolean isPersisted() {
		if (_id == null) {
			return false;
		}
		return true;
	}

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

}
