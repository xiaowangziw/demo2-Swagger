package com.example.demo;

import com.example.demo.contance.XcServiceList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClientTest {
    @Autowired
    private  LoadBalancerClient loadBalancerClient;

    @Test
    public void testClient() {
        //采用客户端负载均衡，从eureka获取认证服务的ip 和端口
         ServiceInstance serviceInstance =  loadBalancerClient.choose(XcServiceList.XC_SERVICE_UCENTER_AUTH);
         URI uri = serviceInstance.getUri();
        String authUrl = uri + "/auth/oauth/token";

    }
}
