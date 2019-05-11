package com.wyy.service;

public class TestB extends TestA {
    public TestB(){
        System.out.println("TestB construtor");
    }
    {
        System.out.println("this is TestB class");
    }
    static {
        System.out.println("TestB static");
    }
    public static void main(String[] args){
        new TestB();
    }
}
