package com.zlf.springboot.learning.chap6;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Path Api")
public class PathVariableController {

    @GetMapping("/path/{id}")
    @ApiOperation(value = "pathvariable")
    public String pathVariable(@PathVariable("id") String id){
        return "id: "+id;
    }

    @GetMapping("/parm")
    @ApiOperation(value = "requestParam")
    public String param(@RequestParam("id") String id){
        return "id:"+id;
    }

    @GetMapping("/mock")
    public String demo(String msg){
        return msg;
    }
}
