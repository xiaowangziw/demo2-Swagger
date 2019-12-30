package com.example.demo.untils;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.ObjectUtils.isEmpty;


public class JsonUtils {
    private final static SimpleDateFormat DEFAULT_FORMAT= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public static String getJsonString(Object bean) {
        return getJsonString(bean, DEFAULT_FORMAT);
    }

    public static String getJsonString(Object bean, DateFormat dateFormat) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setDateFormat(dateFormat);

        try {
            return mapper.writeValueAsString(bean);
        } catch (Exception var4) {
            return null;
        }
    }
    /**
     * 将json格式的字符串（数组形式）的转化为List对象
     * @param <T>
     * @param jsonArrStr
     * @param clazz	List中对象类型
     * @return
     */
    public static <T> List<T> jsonStringToList(String jsonArrStr, Class<T> clazz) {
        return jsonStringToList(jsonArrStr, clazz, DEFAULT_FORMAT);
    }

    /**
     * 将json格式的字符串（数组形式）的转化为List对象
     * @param <T>
     * @param jsonArrStr
     * @param clazz List中对象类型
     * @return
     */
    public static <T> List<T> jsonStringToList(String jsonArrStr, Class<T> clazz, DateFormat dateFormat) {
        if(isEmpty(jsonArrStr)) {
            return new ArrayList<T>();
        }
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.setDateFormat(dateFormat);
            JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, clazz);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return mapper.readValue(jsonArrStr, javaType);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<T>();
        }
    }



}
