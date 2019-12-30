package com.example.demo.mapper;

import com.example.demo.model.XcRole;
import com.example.demo.model.XcRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XcRoleMapper {
    long countByExample(XcRoleExample example);

    int deleteByExample(XcRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(XcRole record);

    int insertSelective(XcRole record);

    List<XcRole> selectByExampleWithRowbounds(XcRoleExample example, RowBounds rowBounds);

    List<XcRole> selectByExample(XcRoleExample example);

    XcRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XcRole record, @Param("example") XcRoleExample example);

    int updateByExample(@Param("record") XcRole record, @Param("example") XcRoleExample example);

    int updateByPrimaryKeySelective(XcRole record);

    int updateByPrimaryKey(XcRole record);
}