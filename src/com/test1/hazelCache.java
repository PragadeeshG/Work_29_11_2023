package com.test1;

public class hazelCache {
	private Integer cacheId;
	private String name;
	private String resource;
	private String ttl;
	private long ttlUnit;
	private long expiryUnit;
	private Boolean hasListener;
	private String listenerEvent;
	private String eventName;
	private String eventFiringMode;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public hazelCache() {

	}

	public hazelCache(Integer cacheId, String name, String resource, String ttl, long ttlUnit, long expiryUnit,
			Boolean hasListener, String listenerEvent, String eventName, String eventFiringMode, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.cacheId = cacheId;
		this.name = name;
		this.resource = resource;
		this.ttl = ttl;
		this.ttlUnit = ttlUnit;
		this.expiryUnit = expiryUnit;
		this.hasListener = hasListener;
		this.listenerEvent = listenerEvent;
		this.eventName = eventName;
		this.eventFiringMode = eventFiringMode;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getTtl() {
		return ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	public long getTtlUnit() {
		return ttlUnit;
	}

	public void setTtlUnit(long ttlUnit) {
		this.ttlUnit = ttlUnit;
	}

	public long getExpiryUnit() {
		return expiryUnit;
	}

	public void setExpiryUnit(long expiryUnit) {
		this.expiryUnit = expiryUnit;
	}

	public Boolean getHasListener() {
		return hasListener;
	}

	public void setHasListener(Boolean hasListener) {
		this.hasListener = hasListener;
	}

	public String getListenerEvent() {
		return listenerEvent;
	}

	public void setListenerEvent(String listenerEvent) {
		this.listenerEvent = listenerEvent;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventFiringMode() {
		return eventFiringMode;
	}

	public void setEventFiringMode(String eventFiringMode) {
		this.eventFiringMode = eventFiringMode;
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
