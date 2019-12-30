package com.example.demo.service.impl;

import com.example.demo.mapper.XcCompanyUserMapper;
import com.example.demo.mapper.XcUserMapper;
import com.example.demo.model.*;
import com.example.demo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private XcUserMapper xcUserRepository;
    @Autowired(required = false)
    private XcCompanyUserMapper xcCompanyUserRepository;

    @Override
    //根据用户账号查询用户信息
    public XcUser findXcUserByUsername(String username) {
        XcUserExample xcUserExample = new XcUserExample();
        XcUserExample.Criteria criteria = xcUserExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<XcUser> xcUsers = xcUserRepository.selectByExample(xcUserExample);
        return xcUsers.isEmpty() ? null : xcUsers.get(0);
    }

    @Override
    //根据账号查询用户的信息，返回用户扩展信息
    public XcUserExt getUserExt(String username) {
        XcUser xcUser = this.findXcUserByUsername(username);
        if (xcUser == null) {
            return null;
        }
        XcUserExt xcUserExt = new XcUserExt();
        BeanUtils.copyProperties(xcUser, xcUserExt);
        //用户id
        String userId = xcUserExt.getId();
        //查询用户所属公司
        XcCompanyUserExample xcCompanyUserExample = new XcCompanyUserExample();
        XcCompanyUserExample.Criteria criteria = xcCompanyUserExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<XcCompanyUser> xcCompanies = xcCompanyUserRepository.selectByExample(xcCompanyUserExample);
        XcCompanyUser xcCompanyUser = null;
        if(!xcCompanies.isEmpty()){
            xcCompanyUser = xcCompanies.get(0);
        }
        if (xcCompanyUser != null) {
            String companyId = xcCompanyUser.getCompanyId();
            xcUserExt.setCompanyId(companyId);
        }
        return xcUserExt;
    }

}
