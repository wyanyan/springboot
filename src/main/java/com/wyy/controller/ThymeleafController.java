package com.wyy.controller;

import com.wyy.entity.Wyyentiy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("th")
public class ThymeleafController {
    @Resource
    private Wyyentiy wyyentity;

    @RequestMapping("index")
    public String toindex(){
        return "pages/thpage/index";
    }

    @RequestMapping("center")
    public String centerValue(ModelMap map){
        map.addAttribute("name","just to try");
        map.addAttribute("entity",wyyentity);
        return "pages/thpage/center";
    }

    @RequestMapping("error")
    public String error() {
        int i = 1/0;
        return "pages/error";
    }

    @RequestMapping("ajaxjsp")
    public String ajaxjsp() {
        return "pages/ajaerror";
    }

    @RequestMapping("ajaxerror")
    @ResponseBody
    public String ajaxerror() {
        int i = 1/0;
        return "ok";
    }
}
