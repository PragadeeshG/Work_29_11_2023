package com.test1;

public class ehCache {
	private Integer cacheId;
	private String name;
	private Integer expiry;
	private String heap;
	private String offHeap;
	private String resources;
	private boolean persistant;
	private String alias;
	private String template;
	private boolean hasListener;
	private String listenerName;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ehCache() {

	}

	public ehCache(Integer cacheId, String name, Integer expiry, String heap, String offHeap, String resources,
			boolean persistant, String alias, String template, boolean hasListener, String listenerName,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.cacheId = cacheId;
		this.name = name;
		this.expiry = expiry;
		this.heap = heap;
		this.offHeap = offHeap;
		this.resources = resources;
		this.persistant = persistant;
		this.alias = alias;
		this.template = template;
		this.hasListener = hasListener;
		this.listenerName = listenerName;
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

	public Integer getExpiry() {
		return expiry;
	}

	public void setExpiry(Integer expiry) {
		this.expiry = expiry;
	}

	public String getHeap() {
		return heap;
	}

	public void setHeap(String heap) {
		this.heap = heap;
	}

	public String getOffHeap() {
		return offHeap;
	}

	public void setOffHeap(String offHeap) {
		this.offHeap = offHeap;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}

	public boolean isPersistant() {
		return persistant;
	}

	public void setPersistant(boolean persistant) {
		this.persistant = persistant;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public boolean isHasListener() {
		return hasListener;
	}

	public void setHasListener(boolean hasListener) {
		this.hasListener = hasListener;
	}

	public String getListenerName() {
		return listenerName;
	}

	public void setListenerName(String listenerName) {
		this.listenerName = listenerName;
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
