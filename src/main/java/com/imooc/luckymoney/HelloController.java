package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello")
    public String sayHi(){
        return limitConfig.getDescription();
    }


}
