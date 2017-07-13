package com.kzw.portal.pojo;

import com.kzw.pojo.TbItem;

public class PortalItem extends TbItem {

	public String[] getImages() {
		String images = this.getImage();
		if(images != null && !images.equals("")) {
			String[] imgs = images.split(",");
			return imgs;
		}
		return null;
	}
	
}
