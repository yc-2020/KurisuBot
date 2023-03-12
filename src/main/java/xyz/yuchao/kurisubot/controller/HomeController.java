package xyz.yuchao.kurisubot.controller;


import org.springframework.web.bind.annotation.*;
import xyz.yuchao.kurisubot.entity.dict.EcDict;
import xyz.yuchao.kurisubot.service.dict.EcDictService;

import javax.annotation.Resource;

@RestController
public class HomeController extends BaseAbstractController {

    @Resource
    private EcDictService ecDictService;

    @GetMapping("/")
    public String find(){

        return "hello";
    }


}
