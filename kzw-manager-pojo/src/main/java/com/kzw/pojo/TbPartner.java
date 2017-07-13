package com.kzw.pojo;

public class TbPartner {
    private Long id;

    private Long storeId;

    private Long userId;

    private String userStock;

    private String stockNote;

    private String stockOther;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserStock() {
        return userStock;
    }

    public void setUserStock(String userStock) {
        this.userStock = userStock == null ? null : userStock.trim();
    }

    public String getStockNote() {
        return stockNote;
    }

    public void setStockNote(String stockNote) {
        this.stockNote = stockNote == null ? null : stockNote.trim();
    }

    public String getStockOther() {
        return stockOther;
    }

    public void setStockOther(String stockOther) {
        this.stockOther = stockOther == null ? null : stockOther.trim();
    }
}