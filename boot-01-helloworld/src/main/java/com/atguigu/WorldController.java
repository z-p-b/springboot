package com.atguigu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    @author : 鹏博
    @date : 2022/6/1223:03
    @description : some description
*/
@RestController
public class WorldController {
    @RequestMapping("/M")
    public String World66(){
        return "World";
    }
}
