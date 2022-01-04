package com.xmaven.template;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 9:03 下午
 * @Version 1.0
 */
public class AbstructCalculatorTest {
    
    public static void main(String[] args) {
        AbstructCalculator ab = new Plus();
        // java 正则表达式中 + 号式特殊字符需要转义
        int res = ab.splitExpression("1+1", "\\+");
        System.out.println("最终的运算结果式:" + res);
    }
    
}
