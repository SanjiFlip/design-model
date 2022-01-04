package com.xmaven.facotry.staticfactory;


/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 6:06 PM
 * @Version 1.0
 */
public class SendFactory {
    
    // 静态工厂方法，就是把多个工厂的方法加上static关键字
    public static Sender produceSms() {
        return new SmsSender();
    }
    
    public static Sender produceMails() {
        return new MailSender();
    }
}
