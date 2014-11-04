package com.coo.s.vote.model;

public class SModel extends BasicObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1760344891659947129L;

	/**
	 * SQLite ID,在Server端改用字符串存储,避免Integer/Long等不必要的麻烦...
	 */
	@Column
	protected String id = null;
	/**
	 * 本机账号，即account
	 */
	@Column
	protected String host = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
}
