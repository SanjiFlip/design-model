package com.xmaven.facotry.abstractfactory;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 6:04 PM
 * @Version 1.0
 */
public class MailSender implements Sender {
    
    @Override
    public void send() {
        System.out.println("正在发送邮件...");
    }
}
