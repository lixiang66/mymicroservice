package com.hunter.mymicrouser.ctrl;

import org.apache.log4j.Logger;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    Logger logger = Logger.getLogger(getClass());

    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        ServiceInstance instance = client.getLocalServiceInstance();

        logger.info("/hello,host:"+instance.getHost()+", service_id:"+instance.getServiceId());

        return "Hello World";
    }
}
