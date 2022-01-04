package com.xmaven.facotry.morefactory;


/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 6:06 PM
 * @Version 1.0
 */
public class SendFactory {
    
    // 多个工厂方法调用
    public Sender produceSms() {
        return new SmsSender();
    }
    
    public Sender produceMails() {
        return new MailSender();
    }
}
