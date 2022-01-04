package com.xmaven.facotry.commonfactory;

/**
 * @Author: Ambition
 * @Description TODO
 * @Date: 2022/1/4 6:08 PM
 * @Version 1.0
 */
public class SendFactoryTest {
    
    public static void main(String[] args) {
        // 缺点：代码复杂，可读性略差 如果传递的字符串错误，就不能正确创建对象，并可能出现空指针异常
        // 优点：扩展性和可维护性更强！尤其在创建大量的对象的前提下
        // 1.声明工厂类类型的引用指向工厂类型的对象
        SendFactory sf = new SendFactory();
        // 2.调用生产方法来实现对象的创建
        Sender mail = sf.produce("mail");
        // 3.使用对象调用方法模拟发送的行为
        mail.send();
        
        System.out.println("------------------------------");
        // 另外一种方式创建对象
        // 优点：代码简单，可读性强 在创建单个对象的情况下有优势
        // 缺点：拓展性和可维护性略差
        Sender sender1 = new SmsSender();
        sender1.send();
    }
}
