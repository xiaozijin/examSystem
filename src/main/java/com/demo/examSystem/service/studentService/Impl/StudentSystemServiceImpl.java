package com.demo.examSystem.service.studentService.Impl;

import com.demo.examSystem.dao.studentDao.StudentDao;
import com.demo.examSystem.entity.Student;
import com.demo.examSystem.entity.StudentExample;
import com.demo.examSystem.service.studentService.StudentSystemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class StudentSystemServiceImpl implements StudentSystemService {
   @Autowired
   private StudentDao studentDao;

    /*
        根据学号查找学生信息
     */
    @Override
    public Student getStudentInfoBySno(String sno) {
        return studentDao.selectByPrimaryKey(sno);
    }

    /*
        校验学生登录
     */
    @Override
    public List<Student> checkStudentPsw(String sno, String stuPsw) {
        //从标准中匹配
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andSnoEqualTo(sno).andStuPswEqualTo(stuPsw);
        List<Student> result = studentDao.selectByExample(example);
        return result;
    }

    /*
        判断学号是否在数据库中
     */
    @Override
    public boolean snoIsExist(String sno) {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andSnoEqualTo(sno);
        List<Student> result = studentDao.selectByExample(example);
        if(result.size()>0)
            return true;
        else
        return false;
    }

    /*
        注册学生信息
     */
    @Override
    public int registerStudent(String sno, String stuPsw, String stuName, String stuSex, String stuEmail, String stuPhone, Date stuCreateTime, String stuSecurityCode) {
        Student student = new Student();
        student.setSno(sno);
        student.setStuPsw(stuPsw);
        student.setStuName(stuName);
        student.setStuSex(stuSex);
        student.setStuEmail(stuEmail);
        student.setStuPhone(stuPhone);
        student.setStuCreateTime(stuCreateTime);
        int result = studentDao.insertSelective(student);
        return result;
    }
    /*
        更新学生信息
     */
    @Override
    public boolean updateStudent(Student student) {
        int result = studentDao.updateByPrimaryKey(student);
        if(result>0)
            return true;
        else
        return false;
    }
}
