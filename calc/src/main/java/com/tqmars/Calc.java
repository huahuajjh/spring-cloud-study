package com.tqmars;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jjh on 17-4-29.
 */
@RestController
public class Calc {
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(@RequestParam Integer num1, @RequestParam Integer num2){
        System.out.println("calc");
        return num1 + num2;
    }
}
