package com.xmaven.facotry.staticfactory;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 8:03 下午
 * @Version 1.0
 */
public class SendFactoryTest {
    
    public static void main(String[] args) {
        SendFactory.produceMails().send();
        SendFactory.produceSms().send();
    }
    
}
