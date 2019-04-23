package com.wyy;

import org.junit.After;

public class Thread2 implements Runnable {
    private String name;
    public Thread2(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(name+"运行："+i);
        }
    }
    public static void main(String[] args){
        new Thread(new Thread2("A")).start();
        new Thread(new Thread2("B")).start();
    }
}
