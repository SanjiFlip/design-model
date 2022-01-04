package com.xmaven.singleton;

/**
 * @Author: Ambition
 * @Description TODO 单例模式--懒汉式
 * @Date: 2022/1/4 5:50 PM
 * @Version 1.0
 */
public class SingletonTwo {
    
    //1. 创建私有构造方法
    private SingletonTwo() {
    
    }
    
    //2. 创建静态的该类实例对象
    private static SingletonTwo instance = null;
    
    //3. 创建开放的静态方法提供实例对象
    public static SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }
    
    // 以下三种方法式优化版本
    // 同步方法
    public static synchronized SingletonTwo getInstance2() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }
    
    // 同步代码块
    public static SingletonTwo getInstance3() {
        synchronized (SingletonTwo.class) {
            if (instance == null) {
                instance = new SingletonTwo();
            }
            return instance;
        }
    }
    
    // 优化，除第一次进入此方法外，其他的不需要进入同步代码块
    public static SingletonTwo getInstance4() {
        if (instance == null) {
            synchronized (SingletonTwo.class) {
                if (instance == null) {
                    instance = new SingletonTwo();
                }
            }
        }
        return instance;
    }
}
