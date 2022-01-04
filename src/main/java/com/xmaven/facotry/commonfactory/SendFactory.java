package com.xmaven.facotry.commonfactory;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 6:06 PM
 * @Version 1.0
 */
public class SendFactory {
    
    // 自定义成员方法实现对象的创建
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        }
        if ("sms".equals(type)) {
            return new SmsSender();
        }
        return null;
    }
}
