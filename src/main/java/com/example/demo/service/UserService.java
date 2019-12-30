package com.example.demo.service;

import com.example.demo.model.XcUser;
import com.example.demo.model.XcUserExt;

public interface UserService {
    XcUser findXcUserByUsername(String username);

    XcUserExt getUserExt(String username);
}
