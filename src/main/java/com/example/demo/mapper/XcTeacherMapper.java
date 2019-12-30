package com.example.demo.mapper;

import com.example.demo.model.XcTeacher;
import com.example.demo.model.XcTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XcTeacherMapper {
    long countByExample(XcTeacherExample example);

    int deleteByExample(XcTeacherExample example);

    int deleteByPrimaryKey(String id);

    int insert(XcTeacher record);

    int insertSelective(XcTeacher record);

    List<XcTeacher> selectByExampleWithRowbounds(XcTeacherExample example, RowBounds rowBounds);

    List<XcTeacher> selectByExample(XcTeacherExample example);

    XcTeacher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XcTeacher record, @Param("example") XcTeacherExample example);

    int updateByExample(@Param("record") XcTeacher record, @Param("example") XcTeacherExample example);

    int updateByPrimaryKeySelective(XcTeacher record);

    int updateByPrimaryKey(XcTeacher record);
}