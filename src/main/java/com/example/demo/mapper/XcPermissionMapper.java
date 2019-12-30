package com.example.demo.mapper;

import com.example.demo.model.XcPermission;
import com.example.demo.model.XcPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface XcPermissionMapper {
    long countByExample(XcPermissionExample example);

    int deleteByExample(XcPermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(XcPermission record);

    int insertSelective(XcPermission record);

    List<XcPermission> selectByExampleWithRowbounds(XcPermissionExample example, RowBounds rowBounds);

    List<XcPermission> selectByExample(XcPermissionExample example);

    XcPermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") XcPermission record, @Param("example") XcPermissionExample example);

    int updateByExample(@Param("record") XcPermission record, @Param("example") XcPermissionExample example);

    int updateByPrimaryKeySelective(XcPermission record);

    int updateByPrimaryKey(XcPermission record);
}