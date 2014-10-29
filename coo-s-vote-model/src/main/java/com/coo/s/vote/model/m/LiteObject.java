package com.coo.s.vote.model.m;

import com.coo.s.vote.model.BasicObject;
import com.coo.s.vote.model.Column;

/**
 * M端的基础Object,需要子类继承,M端数据都需要在服务器端进行备份
 * @author boqing.shen
 *
 */
public class LiteObject extends BasicObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5353981343589689144L;
	
	@Column(name = "id", label = "M端数据库ID")
	protected long id = 0;
	
	
}
