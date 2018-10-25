package com.zlf.springboot.learning.chap6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @GetMapping("/path/{id}")
    public String pathVariable(@PathVariable("id") String id){
        return "id: "+id;
    }

    @GetMapping("/parm")
    public String param(@RequestParam("id") String id){
        return "id:"+id;
    }
}
