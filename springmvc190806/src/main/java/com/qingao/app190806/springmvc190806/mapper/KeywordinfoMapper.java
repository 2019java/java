package com.qingao.app190806.springmvc190806.mapper;

import com.qingao.app190806.springmvc190806.pojo.Keywordinfo;
import com.qingao.app190806.springmvc190806.pojo.KeywordinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface KeywordinfoMapper {
    long countByExample(KeywordinfoExample example);

    int deleteByExample(KeywordinfoExample example);

    int deleteByPrimaryKey(Integer kwid);

    int insert(Keywordinfo record);

    int insertSelective(Keywordinfo record);

    List<Keywordinfo> selectByExampleWithRowbounds(KeywordinfoExample example, RowBounds rowBounds);

    List<Keywordinfo> selectByExample(KeywordinfoExample example);

    Keywordinfo selectByPrimaryKey(Integer kwid);

    int updateByExampleSelective(@Param("record") Keywordinfo record, @Param("example") KeywordinfoExample example);

    int updateByExample(@Param("record") Keywordinfo record, @Param("example") KeywordinfoExample example);

    int updateByPrimaryKeySelective(Keywordinfo record);

    int updateByPrimaryKey(Keywordinfo record);
}