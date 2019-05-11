package com.wyy;

public class ReflectfTest {
    private Integer num;
    private String str;
    private Long num1;

    private void testPrivateFun(){}
    public void testPubFun(){}
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Long getNum1() {
        return num1;
    }

    public void setNum1(Long num1) {
        this.num1 = num1;
    }
    public void test(){
        System.out.print("test");
    }
}
