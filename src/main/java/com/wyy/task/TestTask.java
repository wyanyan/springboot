package com.wyy.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask {

    //每三秒執行一次
    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime(){
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }
}
