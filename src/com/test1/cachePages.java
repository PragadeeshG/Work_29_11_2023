package com.test1;

public class cachePages {
	private Integer cacheId;
	private String screenId;
	private long cacheCount;
	private String cacheContent;
	private String cacheKey;
	private String userAction;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public cachePages() {

	}

	public cachePages(Integer cacheId, String screenId, long cacheCount, String cacheContent, String cacheKey,
			String userAction, String creationDate, String modifiedDate, String entityState) {
		super();
		this.cacheId = cacheId;
		this.screenId = screenId;
		this.cacheCount = cacheCount;
		this.cacheContent = cacheContent;
		this.cacheKey = cacheKey;
		this.userAction = userAction;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCacheId() {
		return cacheId;
	}

	public void setCacheId(Integer cacheId) {
		this.cacheId = cacheId;
	}

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public long getCacheCount() {
		return cacheCount;
	}

	public void setCacheCount(long cacheCount) {
		this.cacheCount = cacheCount;
	}

	public String getCacheContent() {
		return cacheContent;
	}

	public void setCacheContent(String cacheContent) {
		this.cacheContent = cacheContent;
	}

	public String getCacheKey() {
		return cacheKey;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

	public String getUserAction() {
		return userAction;
	}

	public void setUserAction(String userAction) {
		this.userAction = userAction;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
