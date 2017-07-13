package com.kzw.common.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SeOrderInfo {
	private Float itemprice;
	private String itemname;
	private Integer userid;
	private Date dealtime;
	private String phone;
	private String username;
	private Long itemid;
	private String  typeId;
	private String  timeStr;

	public String getTimeStr() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str = simpleDateFormat.format(dealtime);
        return str;
	}

	public void setTimeStr(String timeStr) {
		this.timeStr = timeStr;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public Float getItemprice() {
		return itemprice;
	}

	public void setItemprice(Float itemprice) {
		this.itemprice = itemprice;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getDealtime() {
		return dealtime;
	}

	public void setDealtime(Date dealtime) {
		this.dealtime = dealtime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getItemid() {
		return itemid;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

}
