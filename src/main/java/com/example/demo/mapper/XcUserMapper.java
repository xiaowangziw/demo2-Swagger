package com.example.demo.mapper;

import com.example.demo.model.XcUser;
import com.example.demo.model.XcUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XcUserMapper {
    long countByExample(XcUserExample example);

    int deleteByExample(XcUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(XcUser record);

    int insertSelective(XcUser record);

    List<XcUser> selectByExampleWithRowbounds(XcUserExample example, RowBounds rowBounds);

    List<XcUser> selectByExample(XcUserExample example);

    XcUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XcUser record, @Param("example") XcUserExample example);

    int updateByExample(@Param("record") XcUser record, @Param("example") XcUserExample example);

    int updateByPrimaryKeySelective(XcUser record);

    int updateByPrimaryKey(XcUser record);
}