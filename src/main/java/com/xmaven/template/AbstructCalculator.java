package com.xmaven.template;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 8:58 下午
 * @Version 1.0
 */
public abstract class AbstructCalculator {
    
    //  自定义成员方法实现将参数指定的表达式按照参数指定的规则进行切割，并且返回运算结果
    public int splitExpression(String exp, String op) {
        String[] sArr = exp.split(op);
        return caculate(Integer.parseInt(sArr[0]), Integer.parseInt(sArr[1]));
    }
    
    // 自定义抽象方法实现运算
    public abstract int caculate(int a, int b);
}
