package com.kzw.sso.controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 验证码
 * @author 子煜
 *
 */
@Controller
@RequestMapping("/verification")
public class VerificationCode {

	@RequestMapping("/checkcode")
	public void image(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		BufferedImage bufferedImage = new BufferedImage(68, 22,
				BufferedImage.TYPE_INT_BGR);

		Graphics graphics = bufferedImage.getGraphics();
		Color color = new Color(200, 150, 255);
		graphics.setColor(color);
		graphics.fillRect(0, 0, 68, 22);

		char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		Random random = new Random();
		int length = ch.length, index;

		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			index = random.nextInt(length);
			graphics.setColor(new Color(random.nextInt(88),
					random.nextInt(188), random.nextInt(255)));
			graphics.drawString(ch[index] + "", (i * 15) + 3, 18);
			stringBuffer.append(ch[index]);
		}
		request.getSession().setAttribute("piccode", stringBuffer.toString());
		ImageIO.write(bufferedImage, "JPG", response.getOutputStream());
	}
	
	@RequestMapping("/getCode")
	@ResponseBody
	public String getCode(HttpServletRequest request, HttpServletResponse response, String code)
			throws IOException {
		String picCode = (String) request.getSession().getAttribute("piccode");
		return picCode;
		
	}
}

















