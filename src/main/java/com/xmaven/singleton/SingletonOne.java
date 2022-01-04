package com.xmaven.singleton;

/**
 * @Author: Ambition
 * @Description TODO 单例模式 饿汉式
 * @Date: 2022/1/4 5:46 PM
 * @Version 1.0
 */
public class SingletonOne {
    
    /**
     * 实现过程 1. 只提供私有的构造方法 2. 含有一个该类的私有对象 3. 提供一个静态的公有引用与创建、获取静态私有对象
     */
    
    //1. 创建类中的私有构造
    private SingletonOne() {
    }
    
    //2. 创建该类型的私有静态实例
    private static SingletonOne singleton = new SingletonOne();
    
    //3. 创建公有静态方法返回静态实例对象
    public static SingletonOne getSingleton() {
        return singleton;
    }
}
