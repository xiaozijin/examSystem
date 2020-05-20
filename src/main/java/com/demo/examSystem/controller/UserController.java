package com.demo.examSystem.controller;

import com.demo.examSystem.Utils.IDUtils;
import com.demo.examSystem.Utils.MD5Utils;
import com.demo.examSystem.entity.User;
import com.demo.examSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private VerifyController verifyController;
//
//    //注册
//    @RequestMapping(value = "/register")
//    public String register(User user){
//        user.setActiveStatus(0);
//        String activeCode = IDUtils.getUUID();
//        user.setActiveCode(activeCode);
//        String password = MD5Utils.stringMD5(user.getPassword());
//        user.setPassword(password);
//        userService.register(user);
//        return "register_success";
//    }
//
//    //注册
//    @RequestMapping(value = "/registerPage")
//    public String register(){
//        return "register";
//    }
//
//    //校验激活码
//    @RequestMapping(value = "/checkCode")
//    public String checkNode(String code){
//        User user = userService.getUserByActiveCode(code);
//        //用户存在，status调整为1
//        if(user!=null){
//            user.setActiveStatus(1);
//            //清空验证码
//            user.setActiveCode("");
//            userService.modify(user);
//            return "activeSuccess";
//        }
//        return "login";
//    }
//
//    //登录
//    @RequestMapping(value = "/loginPage")
//    public String login(){
//        return "login";
//    }
//
//    //登录
//    @ResponseBody
//    @RequestMapping(value = "/login")
//    public String login(User user,HttpServletRequest request, @RequestParam("validateCode")String validateCode){
//       String password = MD5Utils.convertMD5(MD5Utils.convertMD5(user.getPassword()));
//       user.setPassword(password);
//       User user1 = userService.login(user);
//        Boolean loginValidateCode = verifyController.checkLoginValidateCode(request, validateCode);
//        if(user1!=null&&loginValidateCode){
//            return "welcome";
//        }
//        return "error";
//    }
//
//    //删除
//    @RequestMapping(value = "/adminController/deleteById")
//    public String deleteById(@PathVariable("id") int id){
//        int result = userService.deleteById(id);
//        if(result!=0){
//            return "admin_index";
//        }
//        return "admin_error";
//    }
//
//    //遍历
//    @RequestMapping(value = "/adminController/queryAll")
//    public String queryAll(){
//        userService.queryAll();
//        return "admin_index";
//    }
//

}
