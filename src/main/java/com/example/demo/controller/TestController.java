package com.example.demo.controller;

import com.alibaba.druid.util.HttpClientUtils;
import com.example.demo.pojo.MessageSendStatusPojo;
import com.example.demo.pojo.PricePojo;
import com.example.demo.untils.JsonUtils;
import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.api.SmsApi;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("callback")
public class TestController {

    @PostMapping("send")
    public String sendMsg(String content,String mobile){
        YunpianClient yunpianClient = new YunpianClient();
        yunpianClient.init();
        SmsApi smsApi = new SmsApi();
        smsApi.init(yunpianClient);
        String url = "https://sms.yunpian.com/v2/sms/single_send.json";
        Map<String, String> params = new HashMap<String, String>();
        params.put("apikey", "6b1ee824117c5a6c8a6e2b2d1160e526");
        params.put("text", content);
        params.put("mobile", mobile);
        //todo 協商測試回調接口的地址
        params.put("callback_url","210.13.80.220:9001/callback/test");
        Result<SmsSingleSend> smsSingleSendResult = smsApi.single_send(params);
        return smsSingleSendResult.toString();
    }

    @PostMapping("test")
    public String callback(String sms_status){
        try {
            String decode = URLDecoder.decode(sms_status, "UTF-8");
            List<MessageSendStatusPojo> list = JsonUtils.jsonStringToList(decode, MessageSendStatusPojo.class);
            if(!list.isEmpty()){
                for (MessageSendStatusPojo pojo:list){
                    System.out.println("云片返回签名："+pojo.get_sign());
                    String apikey = "6b1ee824117c5a6c8a6e2b2d1160e526";
                    String sign = pojo.getSid()+","+pojo.getUser_receive_time().replace("+"," ")+","+pojo.getMobile()+","+pojo.getReport_status()+","+apikey;
                    System.out.println("本地生成签名："+sign);
                    if(!DigestUtils.md5Hex(sign).toLowerCase().equals(pojo.get_sign())){
                        System.out.println("sign不一致！");
                        return "sign不一致！";
                    };
                    System.out.println("sign一致！");
                    return "sign一致！";

                }
            }
            return "解析數據失敗！";
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "異常！";
        }
    }


        @GetMapping("/product/{id}")
        public String getProduct(@PathVariable String id) {
            //for debug
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            return "product id : " + id;
        }

        @GetMapping("/order/{id}")
        public String getOrder(@PathVariable String id) {
            //for debug
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            return "order id : " + id;
        }




}
