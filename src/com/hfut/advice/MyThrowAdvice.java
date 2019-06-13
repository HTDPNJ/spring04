package com.hfut.advice;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowAdvice implements ThrowsAdvice {
    public void myexection(){
        System.out.println("执行异常通知");
    }
}
