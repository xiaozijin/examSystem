package com.demo.examSystem.service.Impl;

import com.demo.examSystem.dao.UserDao;
import com.demo.examSystem.entity.User;
import com.demo.examSystem.service.MailService;
import com.demo.examSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
//    @Autowired
//    private UserDao userDao;
//
//    @Autowired
//    private MailService mailService;
//
//    @Autowired
//    private RedisTemplate redisTemplate;
//    //注册
//    @Override
//    public void register(User user) {
//        userDao.insert(user);
//        //获取激活码
//        String code = user.getActiveCode();
//        System.out.println("激活码是....."+code);
//        //主题subject
//        String subject = "这是一封激活邮件";
//        //激活码发送到用户邮箱
//        String context = "<a href=\"http://localhost:8080/user/checkCode?code="+code+"\">激活请点击:"+code+"</a>";
//        //发送激活邮件
//        mailService.sendMimeMail(user.getEmail(),subject,context);
//    }
//
//    //登录
//    @Override
//    public User login(User user) {
//        return userDao.select(user);
//    }
//
//    //激活码查找用户
//    @Override
//    public User getUserByActiveCode(String activeCode) {
//        return userDao.selectUserByActiveCode(activeCode);
//    }
//
//    //更新激活码
//    @Override
//    public void modify(User user) {
//        userDao.update(user);
//    }
//
//    //删除用户
//    @Override
//    public int deleteById(int id) {
//        int result = userDao.deleteById(id);
//        String key = "user_" + id;
//        if(result!=0){
//            boolean hashKey = redisTemplate.hasKey(key);
//            if(hashKey){
//                redisTemplate.delete(key);
//            }
//        }
//        return result;
//    }
//
//    //遍历用户
//    @Override
//    public List<User> queryAll() {
//        return userDao.queryAll();
//    }
}
