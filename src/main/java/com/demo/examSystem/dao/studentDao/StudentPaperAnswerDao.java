package com.demo.examSystem.dao.studentDao;

import com.demo.examSystem.entity.StudentPaperAnswer;
import com.demo.examSystem.entity.StudentPaperAnswerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentPaperAnswerDao {
    int countByExample(StudentPaperAnswerExample example);

    int deleteByExample(StudentPaperAnswerExample example);

    int deleteByPrimaryKey(Integer answerId);

    int insert(StudentPaperAnswer record);

    int insertSelective(StudentPaperAnswer record);

    List<StudentPaperAnswer> selectByExample(StudentPaperAnswerExample example);

    StudentPaperAnswer selectByPrimaryKey(Integer answerId);

    int updateByExampleSelective(@Param("record") StudentPaperAnswer record, @Param("example") StudentPaperAnswerExample example);

    int updateByExample(@Param("record") StudentPaperAnswer record, @Param("example") StudentPaperAnswerExample example);

    int updateByPrimaryKeySelective(StudentPaperAnswer record);

    int updateByPrimaryKey(StudentPaperAnswer record);

    int selectSingleCorrectCount(StudentPaperAnswer record);

    int selectMultipleCorrectCount(StudentPaperAnswer record);

    int selectJudgeCorrectCount(StudentPaperAnswer record);

    int selectFillCorrectCount(StudentPaperAnswer record);
}
