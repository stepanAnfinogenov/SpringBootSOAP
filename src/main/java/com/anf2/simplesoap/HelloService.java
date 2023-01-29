package com.anf2.simplesoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(targetNamespace = "", name = "HelloService")
public interface HelloService {
    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
            localName = "sayHello",
            targetNamespace = "http://service.ws.sample/",
            className = "com.anf2.simplesoap.HelloService")
    @WebMethod(action = "urn:SayHello")
    @ResponseWrapper(
            localName = "sayHelloResponse",
            targetNamespace = "http://service.ws.sample/",
            className = "com.anf2.simplesoap.SayHelloResponse")
    String sayHello(@WebParam(name = "name", targetNamespace = "") String name);
}
