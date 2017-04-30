package com.tqmars;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jjh on 17-4-29.
 */
@RestController
public class ConsumeCalc {
   @Autowired
   RestTemplate template;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        // return "consume service";
        return template.getForEntity("http://CALC/add?num1=1&num2=2",String.class).getBody();
    }
}
