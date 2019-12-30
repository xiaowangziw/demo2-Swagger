package com.example.demo.mapper;

import com.example.demo.model.XcUserRole;
import com.example.demo.model.XcUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XcUserRoleMapper {
    long countByExample(XcUserRoleExample example);

    int deleteByExample(XcUserRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(XcUserRole record);

    int insertSelective(XcUserRole record);

    List<XcUserRole> selectByExampleWithRowbounds(XcUserRoleExample example, RowBounds rowBounds);

    List<XcUserRole> selectByExample(XcUserRoleExample example);

    XcUserRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XcUserRole record, @Param("example") XcUserRoleExample example);

    int updateByExample(@Param("record") XcUserRole record, @Param("example") XcUserRoleExample example);

    int updateByPrimaryKeySelective(XcUserRole record);

    int updateByPrimaryKey(XcUserRole record);
}