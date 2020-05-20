package com.demo.examSystem.Utils;

import com.google.code.kaptcha.impl.DefaultKaptcha;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

public class VerifyUtil {
//    //生成验证码图片
//    public static void validateCode(HttpServletRequest request, HttpServletResponse response, DefaultKaptcha captchaProducer,String validateSessionKey) throws Exception{
//        response.setDateHeader("Expires",0);
//        response.setHeader("Cache-Control","no-store,no-cache,must-revalidate");
//        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
//        // 标准 HTTP/1.0 no-cache header.
//        response.setHeader("Pragma", "no-cache");
//
//        // 返回 jpeg
//        response.setContentType("image/jpeg");
//
//        // 文本框
//        String capText = captchaProducer.createText();
//
//        // 存储
//        request.getSession().setAttribute(validateSessionKey, capText);
//
//        // 图像
//        BufferedImage bi = captchaProducer.createImage(capText);
//
//        ServletOutputStream out = response.getOutputStream();
//
//        // 输出
//        ImageIO.write(bi, "jpg", out);
//        try {
//            out.flush();
//        } finally {
//            out.close();
//        }
//    }
}
