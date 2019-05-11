package com.wyy.service;

public class TestC {
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer("A");
        StringBuffer sb2 = new StringBuffer("B");
        sb1.append("abc");
        operator(sb1, sb2);
        System.out.println(sb1+"$$$$$"+sb2);

    }
    public static void operator (StringBuffer a, StringBuffer b){
        a.append("B");
        b = a;
        System.out.println(b);
    }
}
