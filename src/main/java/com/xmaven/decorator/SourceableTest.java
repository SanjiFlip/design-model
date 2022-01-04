package com.xmaven.decorator;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 8:38 下午
 * @Version 1.0
 */
public class SourceableTest {
    
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        sourceable.method();
        
        System.out.println("---------------");
        
        // 接下来使用装饰类实现功能
        Sourceable sourceable1 = new Decorator(sourceable);
        sourceable1.method();
    }
    
}
