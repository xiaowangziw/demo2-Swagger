package com.example.demo.mapper;

import com.example.demo.model.XcCompanyUser;
import com.example.demo.model.XcCompanyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XcCompanyUserMapper {
    long countByExample(XcCompanyUserExample example);

    int deleteByExample(XcCompanyUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(XcCompanyUser record);

    int insertSelective(XcCompanyUser record);

    List<XcCompanyUser> selectByExampleWithRowbounds(XcCompanyUserExample example, RowBounds rowBounds);

    List<XcCompanyUser> selectByExample(XcCompanyUserExample example);

    XcCompanyUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XcCompanyUser record, @Param("example") XcCompanyUserExample example);

    int updateByExample(@Param("record") XcCompanyUser record, @Param("example") XcCompanyUserExample example);

    int updateByPrimaryKeySelective(XcCompanyUser record);

    int updateByPrimaryKey(XcCompanyUser record);
}