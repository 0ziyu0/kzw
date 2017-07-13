package com.kzw.search.pojo;

public class SearchItem {

	private String id;
	private String title;
	private String store_id;
	private String sell_point;
	private Long price;
	private int num;
	private String image;
	private Long buy_price;
	private String category_name;
	private String item_desc;
	private String store_name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getSell_point() {
		return sell_point;
	}
	public void setSell_point(String sell_point) {
		this.sell_point = sell_point;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getBuy_price() {
		return buy_price;
	}
	public void setBuy_price(Long buy_price) {
		this.buy_price = buy_price;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getItem_desc() {
		return item_desc;
	}
	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public SearchItem() {
		super();
	}
	public SearchItem(String id, String title, String store_id,
			String sell_point, Long price, int num, String image,
			Long buy_price, String category_name, String item_desc,
			String store_name) {
		super();
		this.id = id;
		this.title = title;
		this.store_id = store_id;
		this.sell_point = sell_point;
		this.price = price;
		this.num = num;
		this.image = image;
		this.buy_price = buy_price;
		this.category_name = category_name;
		this.item_desc = item_desc;
		this.store_name = store_name;
	}
	
}













