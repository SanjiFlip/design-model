package com.xmaven.facotry.abstractfactory;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 8:30 下午
 * @Version 1.0
 */
public class SendFactoryTest {
    
    public static void main(String[] args) {
        Provider mail = new MailSendFactory();
        Sender producer = mail.producer();
        producer.send();
    }
    
}
