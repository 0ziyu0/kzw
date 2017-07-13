package com.kzw.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StoreOrder {
	
	private String order_id;
	private String title;
	private String num;
	private String price;
	private String total_fee;
	private String username;
	private String address;
	private String phone;
	private String email;
	private String status;
	private Date create_time;
	private String payment_type;
	private String  timeStr;

	public String getTimeStr() {
		//Tue May 02 17:02:17 WST 2017
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str = simpleDateFormat.format(create_time);
        return str;
	}
	public void setTimeStr(String  timeStr) {
		this.timeStr = timeStr;
	}
	
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public StoreOrder() {
		super();
	}
	public StoreOrder(String order_id, String title, String num, String price,
			String total_fee, String username, String address, String phone,
			String email, String status, Date create_time, String payment_type) {
		super();
		this.order_id = order_id;
		this.title = title;
		this.num = num;
		this.price = price;
		this.total_fee = total_fee;
		this.username = username;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.status = status;
		this.create_time = create_time;
		this.payment_type = payment_type;
	}
	
}
