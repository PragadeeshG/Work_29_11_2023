package com.test1;

public class cacheMethods {
	private Integer cacheId;
	private String methodName;
	private String cacheName;
	private String templateUsed;
	private String expired;
	private String addedEvent;
	private String evictedEvent;
	private String cacheCondition;
	private String reloadTime;
	private String cacheLayer;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public cacheMethods() {

	}

	public cacheMethods(Integer cacheId, String methodName, String cacheName, String templateUsed, String expired,
			String addedEvent, String evictedEvent, String cacheCondition, String reloadTime, String cacheLayer,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.cacheId = cacheId;
		this.methodName = methodName;
		this.cacheName = cacheName;
		this.templateUsed = templateUsed;
		this.expired = expired;
		this.addedEvent = addedEvent;
		this.evictedEvent = evictedEvent;
		this.cacheCondition = cacheCondition;
		this.reloadTime = reloadTime;
		this.cacheLayer = cacheLayer;
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

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	public String getTemplateUsed() {
		return templateUsed;
	}

	public void setTemplateUsed(String templateUsed) {
		this.templateUsed = templateUsed;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	public String getAddedEvent() {
		return addedEvent;
	}

	public void setAddedEvent(String addedEvent) {
		this.addedEvent = addedEvent;
	}

	public String getEvictedEvent() {
		return evictedEvent;
	}

	public void setEvictedEvent(String evictedEvent) {
		this.evictedEvent = evictedEvent;
	}

	public String getCacheCondition() {
		return cacheCondition;
	}

	public void setCacheCondition(String cacheCondition) {
		this.cacheCondition = cacheCondition;
	}

	public String getReloadTime() {
		return reloadTime;
	}

	public void setReloadTime(String reloadTime) {
		this.reloadTime = reloadTime;
	}

	public String getCacheLayer() {
		return cacheLayer;
	}

	public void setCacheLayer(String cacheLayer) {
		this.cacheLayer = cacheLayer;
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
