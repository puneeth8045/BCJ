
package com.bcjmay2017.cxfdemo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.bcjmay2017.cxfdemo.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

