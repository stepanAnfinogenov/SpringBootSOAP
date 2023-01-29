package com.anf2.simplesoap;

import javax.jws.WebService;

@WebService(
        serviceName = "Hello",
        portName = "HelloPort",
        targetNamespace = "http://service.ws.sample/",
        endpointInterface = "com.anf2.simplesoap.HelloService"
)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {

        return "Hello " + name;
    }
}
