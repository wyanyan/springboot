package com.wyy.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object exception(HttpServletResponse response, HttpServletRequest request
                            ,Exception ex){
        ex.printStackTrace();
        if(isAjax(request)){
            System.out.println("ajax 錯誤");
            System.out.println(ex.getMessage());
            return ex.getMessage();
        }else{
            ModelAndView mv = new ModelAndView();
            mv.addObject("exception",ex);
            mv.addObject("url",request.getRequestURI());
            mv.setViewName("pages/error");
            return mv;
        }

    }

   public boolean isAjax(HttpServletRequest request){
       return(request.getHeader("X-Requested-With")!=null
               &&"XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
   }
}
