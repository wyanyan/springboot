package com.wyy;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args){
        Class reflectClass = ReflectfTest.class;
        Method[] methods = reflectClass.getMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }
        int  modifiers = reflectClass.getModifiers();
        System.out.println(modifiers);
        System.out.println(reflectClass.getSuperclass());
}

}
