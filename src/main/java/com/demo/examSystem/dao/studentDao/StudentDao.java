package com.demo.examSystem.dao.studentDao;

import com.demo.examSystem.entity.Student;
import com.demo.examSystem.entity.StudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(String sno);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(String sno);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
