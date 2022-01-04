package com.xmaven.facotry.abstractfactory;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 8:23 下午
 * @Version 1.0
 */
public class SmsSendFactory implements Provider {
    
    @Override
    public Sender producer() {
        return new SmsSender();
    }
}
