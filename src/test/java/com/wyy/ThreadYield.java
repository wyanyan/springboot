package com.wyy;

import java.util.TreeMap;

public class ThreadYield extends Thread {

    private String name;

    public ThreadYield(String name){
       this.name = name;
    }
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(name+"线程运行"+i);
            if(i==30){
               // Thread.yield();
               this.yield();
            }
        }
    }
    public static void main(String[] args){
        ThreadYield yt1 = new ThreadYield("张三");
        ThreadYield yt2 = new ThreadYield("李四");
        yt1.start();
        yt2.start();
    }
}
