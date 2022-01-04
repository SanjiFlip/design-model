package com.xmaven.facotry.abstractfactory;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 8:21 下午
 * @Version 1.0
 */
public interface Provider {
    
    //自定义抽象方法描述生产行为
    Sender producer();
    
}
