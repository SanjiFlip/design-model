package com.xmaven.decorator;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 8:40 下午
 * @Version 1.0
 */
public class Decorator implements Sourceable {
    
    private Sourceable source;
    
    public Decorator(Sourceable sourceable) {
        this.source = sourceable;
    }
    
    @Override
    public void method() {
        source.method(); // 保证原有功能不变
        System.out.println("化妆后你会更加美！");
    }
}
