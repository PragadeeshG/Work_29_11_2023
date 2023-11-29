package com.test1;

public class cacheConfig {
	private Integer cacheProvider;
	private String cacheProiderName;
	private String version;
	private String javaVersion;
	private String springVersion;
	private String tempDir;
	private Integer tempDirSize;
	private Integer cacheLimit;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public cacheConfig() {

	}

	public cacheConfig(Integer cacheProvider, String cacheProiderName, String version, String javaVersion,
			String springVersion, String tempDir, Integer tempDirSize, Integer cacheLimit, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.cacheProvider = cacheProvider;
		this.cacheProiderName = cacheProiderName;
		this.version = version;
		this.javaVersion = javaVersion;
		this.springVersion = springVersion;
		this.tempDir = tempDir;
		this.tempDirSize = tempDirSize;
		this.cacheLimit = cacheLimit;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCacheProvider() {
		return cacheProvider;
	}

	public void setCacheProvider(Integer cacheProvider) {
		this.cacheProvider = cacheProvider;
	}

	public String getCacheProiderName() {
		return cacheProiderName;
	}

	public void setCacheProiderName(String cacheProiderName) {
		this.cacheProiderName = cacheProiderName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getJavaVersion() {
		return javaVersion;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public String getSpringVersion() {
		return springVersion;
	}

	public void setSpringVersion(String springVersion) {
		this.springVersion = springVersion;
	}

	public String getTempDir() {
		return tempDir;
	}

	public void setTempDir(String tempDir) {
		this.tempDir = tempDir;
	}

	public Integer getTempDirSize() {
		return tempDirSize;
	}

	public void setTempDirSize(Integer tempDirSize) {
		this.tempDirSize = tempDirSize;
	}

	public Integer getCacheLimit() {
		return cacheLimit;
	}

	public void setCacheLimit(Integer cacheLimit) {
		this.cacheLimit = cacheLimit;
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
