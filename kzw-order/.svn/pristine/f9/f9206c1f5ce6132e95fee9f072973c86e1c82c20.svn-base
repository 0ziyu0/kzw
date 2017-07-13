package com.kzw.order.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.pojo.OrderRestule;
import com.kzw.common.util.ExceptionUtil;
import com.kzw.common.util.PageData;
import com.kzw.common.util.PageDataGenerator;
import com.kzw.common.util.RedisUtil;
import com.kzw.order.pojo.OrderInfo;
import com.kzw.order.service.OrderService;
import com.kzw.order.service.OrderStoreService;
import com.kzw.order.service.UserService;
import com.kzw.order.util.MailUtils;
import com.kzw.pojo.StoreOrder;
import com.kzw.pojo.TbOrderItem;
import com.kzw.pojo.TbOrderSecond;
import com.kzw.pojo.TbUser;

@Controller
public class OrderController {

	@Resource
	private OrderService orderService;
	@Resource
	private UserService userService;
	@Resource
	private OrderStoreService orderStoreService;


	@RequestMapping(value = "/order/create", method = RequestMethod.POST)
	@ResponseBody
	public KZWResult createOrder(@RequestBody OrderInfo orderInfo) {

		try {
			List<OrderInfo> orderInfoList = new ArrayList<>();// 按照本批次中商品所属的店铺来区分不同的订单
			List<String> orderIdList = new ArrayList<>();// 保存插入数据库后的所有订单id
			List<Long> storeList = new ArrayList<>(); // 保存当前所有的店铺(即最终生成的订单数量)
			boolean falge = true;
			int i = 0;
			Long titlePrice = 0L;
			for (TbOrderItem orderItem : orderInfo.getOrderItems()) {
				for (Long storeId : storeList) {
					if(storeId.equals(orderItem.getStoreId())) {
						falge = false;
					}
				}
				if(falge) { // 没有匹配到
					storeList.add(orderItem.getStoreId());
				}
				falge = true;
			}
			// 分店铺不同生成不同的订单
			for (Long sid : storeList) {
				List<TbOrderItem> orderItemList = new ArrayList<>();
				OrderInfo info = new OrderInfo();
				info = copyBeanProperty(orderInfo, info);
				for (TbOrderItem tbOrderItem : orderInfo.getOrderItems()) {
					if(tbOrderItem.getStoreId().equals(sid)) {
						orderItemList.add(tbOrderItem);
						titlePrice += tbOrderItem.getTotalFee();
					}
				}
				info.setOrderItems(orderItemList);
				info.setOrderShipping(orderInfo.getOrderShipping());
				info.setPayment(titlePrice.toString());
				orderInfoList.add(info);
				titlePrice = 0L;
			}
			// 分批次添加订单
			for (OrderInfo oInfo : orderInfoList) {
				// 设置总数
				String orderId = orderService.createOrder(oInfo);
				orderIdList.add(orderId);
				// 发送邮件
				try {
					Long store = storeList.get(i);
					// 通过店铺ID查询店铺注册人的邮件
					List<TbUser> userList = orderService.getStoreUser(store);
					if(userList != null && userList.size() > 0) {
						MailUtils.setEmailMessage(userList.get(0).getEmail(), orderId);
					}
					i++;
				} catch (Exception e) {
					// 要保证处理正常的逻辑
					e.printStackTrace();
				}
			}

			return KZWResult.ok(orderIdList);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	/**
	 * 拷贝继承的属性
	 * @param from
	 * @param to
	 * @return
	 */
	private OrderInfo copyBeanProperty(OrderInfo from, OrderInfo to) {
		to.setPayment(from.getPayment());
		to.setUserId(from.getUserId());
		to.setPaymentType(from.getPaymentType());
		to.setStatus(from.getStatus());
		to.setBuyerNick(from.getBuyerNick());

		return to;
	}


	//创建二手订单
	@RequestMapping("/order/createSeorder")
	@ResponseBody
	public KZWResult createSeorder(String userId,String sellerId,String itemId) {

		TbOrderSecond  orderInfo  = new TbOrderSecond();
		orderInfo.setUserid(Integer.parseInt(userId));
		orderInfo.setItemid(Long.parseLong(itemId));
		orderInfo.setSellerid(Integer.parseInt(sellerId));
		orderInfo.setOrderstate(1);
		int re	=orderService.createSeOrder(orderInfo);	
		TbUser user = userService.gettbuser(Long.parseLong(userId));		
		try {
			MailUtils.setEmailMessage(user.getEmail(), itemId);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return KZWResult.ok((re==1)?"成功":"失败");
	}

	//创建二手订单
	@RequestMapping("/order/SeorderInfo")
	@ResponseBody
	public KZWResult SeorderInfo(Integer userId) {				
		return KZWResult.ok(orderService.selectByUserIdforbuyer(userId));
	}


	//商品订单
	@RequestMapping("/order/itemOrder")
	@ResponseBody
	public KZWResult itemOrder(@RequestParam(defaultValue="1") Integer page, 
			@RequestParam(defaultValue="10") Integer rows,HttpServletRequest request,Long userId) {	
		try {
			PageData pageDate = PageDataGenerator.newInstall(request, StoreOrder.class, true);
			
			pageDate.getParams().put("userId", userId);

			PageData p = orderStoreService.selectPage(pageDate);
			
			List<StoreOrder> result2 = (List<StoreOrder>) p.getResult();
			
			OrderRestule result = new OrderRestule();

			Integer recordCount = p.getTotal();
			int pageCount = (recordCount / rows);
			if(recordCount % rows > 0) {
				pageCount++;
			}
			result.setPageCount(pageCount); // 总页数
			result.setCurPage(page); // 当前页
			result.setRecordCount(recordCount);
			result.setList(p.getResult());

			return KZWResult.ok(result);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	//确认收获
	@RequestMapping("/order/harvest")
	@ResponseBody
	public KZWResult harvest(String orderId) {	
		
		return orderStoreService.setHarvest(orderId);

	}
}



























