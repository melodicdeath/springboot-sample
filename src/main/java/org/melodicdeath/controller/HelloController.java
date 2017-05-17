package org.melodicdeath.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.jvm.hotspot.debugger.MachineDescriptionPPC;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zt on 17/5/17.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping
    public String Hello(){
        return "Hello Spring Boot";
    }

    @RequestMapping("/info")
    public Map<String,String> Info(){
        Map<String,String> map= new HashMap<>();
        map.put("name","12321");
        return map;
    }
}
