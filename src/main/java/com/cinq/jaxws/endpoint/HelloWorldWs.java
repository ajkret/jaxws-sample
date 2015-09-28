package com.cinq.jaxws.endpoint;

import java.util.Random;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.cinq.jaxws.dto.HelloWorldDto;

/**
 * To test:<br/>
 * <pre>http://localhost:8080/jaxws/HelloWs</pre>
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class HelloWorldWs {

    public HelloWorldDto sayHello(String name) {

        HelloWorldDto dto = new HelloWorldDto();

        dto.setName(name);
        dto.setId(1);
        dto.setRandom(new Random(System.currentTimeMillis()).nextInt(10000));

        return dto;
    }
}
