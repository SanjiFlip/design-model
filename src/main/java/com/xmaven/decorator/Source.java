package com.xmaven.decorator;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 8:37 下午
 * @Version 1.0
 */
public class Source implements Sourceable {
    
    @Override
    public void method() {
        System.out.println("素颜可以如此之美！");
    }
}
