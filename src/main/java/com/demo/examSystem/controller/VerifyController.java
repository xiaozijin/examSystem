package com.demo.examSystem.controller;

import com.demo.examSystem.Utils.VerifyUtil;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

//验证码控制
@Controller
public class VerifyController {
//    @Resource
//    private DefaultKaptcha captchaProducer;
//
////    @RequestMapping(value = {"/loginPage"})
////    public String VerifyLogin(){
////        return "/login";
////    }
//
//    //登录验证码sessionKey
//    public static final String LOGIN_VALIDATE_CODE = "login_validate_code";
//
//    //登录验证图片
//    @RequestMapping(value = {"/loginValidateCode"})
//    public void loginValidateCode(HttpServletRequest request, HttpServletResponse response) throws Exception{
//        VerifyUtil.validateCode(request,response,captchaProducer,LOGIN_VALIDATE_CODE);
//    }
//
//    //检查验证码的正确性
//    @RequestMapping("/checkLoginValidateCode")
//    @ResponseBody
//    public Boolean checkLoginValidateCode(HttpServletRequest request, @RequestParam("validateCode")String validateCode){
//        boolean flag = true;
//        String loginValidateCode = request.getSession().getAttribute(LOGIN_VALIDATE_CODE).toString();
//        HashMap<String,Object> map = new HashMap<String, Object>();
//        if(loginValidateCode==null){
//            //验证码过期
//            map.put("status",null);
//           flag = false;
//        }
//        else if (loginValidateCode.equals(validateCode)){
//            //验证码正确
//            map.put("status",true);
//
//        }
//        else if(!loginValidateCode.equals(validateCode)){
//                //验证码错误
//                map.put("status",false);
//                flag = false;
//
//            }
//        map.put("code",200);
//        return flag;
//    }
}
