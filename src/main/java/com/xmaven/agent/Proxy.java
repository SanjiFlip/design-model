package com.xmaven.agent;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 8:51 下午
 * @Version 1.0
 */
public class Proxy implements Sourceable {
    
    private Source source;
    
    public Proxy() {
        source = new Source();
    }
    
    @Override
    public void method() {
        source.method();
        System.out.println("我和装饰器模式其实式不一样的！");
    }
}
