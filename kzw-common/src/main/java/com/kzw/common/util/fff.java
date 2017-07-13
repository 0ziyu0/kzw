package com.kzw.common.util;

public class fff {
	private Long id;

    private Long userId;

    private String storeName;

    private String storeDesc;

    private String storeOther;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreDesc() {
		return storeDesc;
	}

	public void setStoreDesc(String storeDesc) {
		this.storeDesc = storeDesc;
	}

	public String getStoreOther() {
		return storeOther;
	}

	public void setStoreOther(String storeOther) {
		this.storeOther = storeOther;
	}

	public fff() {
		super();
	}

	public fff(Long id, Long userId, String storeName, String storeDesc,
			String storeOther) {
		super();
		this.id = id;
		this.userId = userId;
		this.storeName = storeName;
		this.storeDesc = storeDesc;
		this.storeOther = storeOther;
	}
	
}
