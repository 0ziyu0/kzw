package com.kzw.portal.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.CookieUtils;
import com.kzw.common.util.RedisUtil;
import com.kzw.pojo.TbUser;
import com.kzw.portal.pojo.CartItem;
import com.kzw.portal.pojo.OrderInfo;
import com.kzw.portal.service.CartService;
import com.kzw.portal.service.OrderService;


@Controller
@RequestMapping("/order")
public class OrderController {

	@Resource
	private CartService cartService;
	@Resource
	private OrderService orderService;

	/**
	 * 购物车到订单
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/order-cart")
	public String showOrderCart(Model model, HttpServletRequest request) {

		// 得到当前登录人信息
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		if(format.getStatus() == 200) {
			// 取用户信息
			format = KZWResult.formatToPojo(userJson, TbUser.class);
			TbUser user = (TbUser) format.getData();
			model.addAttribute("user", user);
		}

		List<CartItem> list = cartService.getCartItems(request);
		model.addAttribute("cartList", list);

		return "order-cart";
	}

	/**
	 * 创建订单
	 * @param orderInfo
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createOrder(OrderInfo orderInfo, Model model, HttpServletRequest request, HttpServletResponse response) {

		// 得到当前登录人信息
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		if(format.getStatus() != 200) {
			// 取用户信息
			return null;
		}
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();

		orderInfo.setUserId(user.getId());
		orderInfo.setBuyerNick(user.getUsername());

		String order_id = orderService.createOrder(orderInfo);
		// 清除购物车cookie
		CookieUtils.deleteCookie(request, response, "KZW_CART");
		model.addAttribute("orderId", order_id);
		model.addAttribute("payment", orderInfo.getPayment());
		DateTime time = new DateTime();
		time = time.plusDays(3);
		model.addAttribute("date", time.toString("yyyy-MM-dd"));

		return "success";
	}

	@RequestMapping("/myOrder")
	public String myOrder(Model model, HttpServletRequest request) {
		return "my-order-comment";
	}
	
	@RequestMapping("/itemOrder")
	public String itemOrder(Model model, HttpServletRequest request,@RequestParam(defaultValue="1") String pageNum) {		
		// 得到当前登录人信息
				String userJson = RedisUtil.getUser(request);
				KZWResult format = KZWResult.format(userJson);
				if(format.getStatus() != 200) {
					// 取用户信息
					return null;
				}
				format = KZWResult.formatToPojo(userJson, TbUser.class);
				TbUser user = (TbUser) format.getData();
		KZWResult  result=orderService.itemOrder(pageNum,user.getId());
		model.addAttribute("result", result.getData());
		return "personalCenter/itemOrder";
	}
	
	@RequestMapping("/harvest")
	public String harvest(String orderId ) {
		KZWResult  result=orderService.harvest(orderId);
		return "redirect:/order/itemOrder.action";
	}
	
	
	@RequestMapping("/itemOrderJson")
	@ResponseBody
	public KZWResult harvest(Model model, HttpServletRequest request,@RequestParam(defaultValue="1") String pageNum ) {
		// 得到当前登录人信息
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		if(format.getStatus() != 200) {
			// 取用户信息
			return null;
		}
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();


		KZWResult  result=orderService.itemOrder(pageNum,user.getId());
		return result;
	}
	
	
	
}


























