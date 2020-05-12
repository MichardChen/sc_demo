package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        return "test api,access successful";
    }
}
