package com.demo.examSystem.dao.itemDao;

import com.demo.examSystem.entity.Paper;
import com.demo.examSystem.entity.PaperExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaperDao {
    int countByExample(PaperExample example);

    int deleteByExample(PaperExample example);

    int deleteByPrimaryKey(Integer paperId);

    int insert(Paper record);

    int insertSelective(Paper record);

    List<Paper> selectByExample(PaperExample example);

    Paper selectByPrimaryKey(Integer paperId);

    int updateByExampleSelective(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByExample(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);

    int selectMaxPaperId();
}
