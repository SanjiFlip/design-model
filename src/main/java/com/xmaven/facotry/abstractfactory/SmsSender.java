package com.xmaven.facotry.abstractfactory;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 6:05 PM
 * @Version 1.0
 */
public class SmsSender implements Sender {
    
    @Override
    public void send() {
        System.out.println("正在发送短信...");
    }
}
