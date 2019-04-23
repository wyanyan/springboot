package com.wyy.controller;

import com.wyy.entity.Wyyentiy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class HelloWorldController {

    @Resource
    private Wyyentiy wyyentity;

    @RequestMapping("/hello")
    @ResponseBody
    public Object hello(){
        return  wyyentity;
    }
    @RequestMapping("/toindex")
    public String toIndex(){
      return "index";
    }
    @RequestMapping("/toentitytest")
    public String index(ModelMap map){
        map.put("entity",wyyentity);
        return "pages/entitytest";
    }
}
