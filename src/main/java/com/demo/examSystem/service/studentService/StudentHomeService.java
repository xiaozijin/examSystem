package com.demo.examSystem.service.studentService;

import com.demo.examSystem.entity.Paper;
import com.demo.examSystem.entity.ProgramingLanguage;
import com.demo.examSystem.entity.StudentPaperScore;

import java.util.List;
import java.util.Map;

public interface StudentHomeService {
    public List<ProgramingLanguage> getLanguagesInfo();
    public ProgramingLanguage getLanguageInfoById(Integer langId);
    public List<Paper> getPapersInfo(Integer langId);
    public Paper getPapersInfoByPaperId(Integer paperId);
    public Map<String, Integer> getPaperQueNumByPaperId(Integer paperId);
    public int insertStudentPaperScore(StudentPaperScore studentPaperScore);
    public List<Map<String, Object>> getSingleQueListByPaperId(Integer paperId);
    public List<Map<String, Object>> getMultipleQueListByPaperId(Integer paperId);
    public List<Map<String, Object>> getJudgeQueListByPaperId(Integer paperId);
    public List<Map<String, Object>> getFillQueListByPaperId(Integer paperId);
    public int insertPaperAnswerAndPaperScore(String sno, Integer paperId, List<String> singleAnswers,
                                              List<List<String>> multipleAnswers, List<String> judgeAnswers,
                                              List<String> fillAnswers, int timeUsed);
    public List<StudentPaperScore> getCurrentPaperStatus(String sno, Integer paperId);
    public Map<String, Object> getScoreReport(String sno, Integer paperId);
}
