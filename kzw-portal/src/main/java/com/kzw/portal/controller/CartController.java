package com.kzw.portal.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.portal.service.CartService;


@Controller
public class CartController {

	@Resource
	private CartService cartService;
	
	@RequestMapping("/cart/add/{itemId}")
	public String addCart(@PathVariable Long itemId, Integer num, 
			HttpServletRequest request, HttpServletResponse response) {
		
		@SuppressWarnings("unused")
		KZWResult result = cartService.addCart(itemId, num, request, response);
		
		return "cartSuccess";
	}
	
	@RequestMapping("/cart/cart")
	public String showCartList(HttpServletRequest request, Model model) {
		
		model.addAttribute("cartList", cartService.getCartItems(request));
		
		return "cart";
		
	}
	
	@RequestMapping("/cart/update/num/{itemId}/{num}")
	@ResponseBody
	public KZWResult updateCartItemNum(@PathVariable Long itemId, @PathVariable Integer num, 
			HttpServletRequest request, HttpServletResponse response) {
		
		return cartService.updataCartItem(itemId, num, request, response);
		
	}
	
	@RequestMapping("/cart/delete/{itemId}")
	public String deleteCartItemNum(@PathVariable Long itemId, HttpServletRequest request, HttpServletResponse response) {
		
		cartService.deleteCartItem(itemId, request, response);
		 
		return "redirect:/cart/cart.html";
		
	}
	
}





























