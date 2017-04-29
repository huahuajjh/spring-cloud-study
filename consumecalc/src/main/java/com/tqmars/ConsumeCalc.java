package com.tqmars;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jjh on 17-4-29.
 */
@RestController
public class ConsumeCalc {
//    @Autowired
//    RestTemplate template;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return new RestTemplate().getForEntity("http://CALC/add?num1=2&num2=12",String.class).getBody();
    }
}
