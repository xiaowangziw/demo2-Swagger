package com.example.demo.mapper;

import com.example.demo.model.XcCompany;
import com.example.demo.model.XcCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XcCompanyMapper {
    long countByExample(XcCompanyExample example);

    int deleteByExample(XcCompanyExample example);

    int deleteByPrimaryKey(String id);

    int insert(XcCompany record);

    int insertSelective(XcCompany record);

    List<XcCompany> selectByExampleWithRowbounds(XcCompanyExample example, RowBounds rowBounds);

    List<XcCompany> selectByExample(XcCompanyExample example);

    XcCompany selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XcCompany record, @Param("example") XcCompanyExample example);

    int updateByExample(@Param("record") XcCompany record, @Param("example") XcCompanyExample example);

    int updateByPrimaryKeySelective(XcCompany record);

    int updateByPrimaryKey(XcCompany record);
}