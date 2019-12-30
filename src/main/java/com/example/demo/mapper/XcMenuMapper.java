package com.example.demo.mapper;

import com.example.demo.model.XcMenu;
import com.example.demo.model.XcMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XcMenuMapper {
    long countByExample(XcMenuExample example);

    int deleteByExample(XcMenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(XcMenu record);

    int insertSelective(XcMenu record);

    List<XcMenu> selectByExampleWithRowbounds(XcMenuExample example, RowBounds rowBounds);

    List<XcMenu> selectByExample(XcMenuExample example);

    XcMenu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XcMenu record, @Param("example") XcMenuExample example);

    int updateByExample(@Param("record") XcMenu record, @Param("example") XcMenuExample example);

    int updateByPrimaryKeySelective(XcMenu record);

    int updateByPrimaryKey(XcMenu record);
}