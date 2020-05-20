package com.demo.examSystem.dao.studentDao;

import com.demo.examSystem.entity.StudentPaperScore;
import com.demo.examSystem.entity.StudentPaperScoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentPaperScoreDao {
    int countByExample(StudentPaperScoreExample example);

    int deleteByExample(StudentPaperScoreExample example);

    int deleteByPrimaryKey(Integer scoreId);

    int insert(StudentPaperScore record);

    int insertSelective(StudentPaperScore record);

    List<StudentPaperScore> selectByExample(StudentPaperScoreExample example);

    StudentPaperScore selectByPrimaryKey(Integer scoreId);

    int updateByExampleSelective(@Param("record") StudentPaperScore record, @Param("example") StudentPaperScoreExample example);

    int updateByExample(@Param("record") StudentPaperScore record, @Param("example") StudentPaperScoreExample example);

    int updateByPrimaryKeySelective(StudentPaperScore record);

    int updateByPrimaryKey(StudentPaperScore record);
}
