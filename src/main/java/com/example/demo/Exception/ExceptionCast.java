package com.example.demo.Exception;

import com.example.demo.pojo.response.ResultCode;

public class ExceptionCast {
    public static void cast(ResultCode resultCode){
        throw new CustomException(resultCode);
    }
}

