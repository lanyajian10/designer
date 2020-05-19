### 7 大设计原则
#### 1.principle                                  7大设计原则
    test1.singleResponsibityPrinciple            1.单一设计原则(SRP) 
    test2.interfaceSegregationPrinciple          2.接口隔离原则(ISP)
    tesr3.dependenceInversionPrinciple           3.依赖倒置原则(DIP)
    test4.liskovSubititutionPrinciple            4.里氏替换原则(LSP)
    test5.openClosedPrinciple                    5.开闭原则(OCP)
    test6.DemeterPrinciple                       6.迪米特原则(DP)
    test7.compositeReusePrinciple                7.合成复用原则(CRP)
### 2.designMode                  23种设计模式
####    2.1 create                创建型模式
#####    2.1.1 singleton          单例模式
            hungry1               1.饿汉：静态常量
            hungry2               2.饿汉：静态代码块
            lazy3                 3.懒汉：线程不安全
            lazy4                 4.懒汉：同步方法
            lazy5                 5.懒汉：双重锁
            lazy6                 6.懒汉：静态内部类
            lazy7                 7.懒汉：枚举类
#####    2.1.2 factory            简单工厂模式
            noFactory             1. 没有工厂的实现   
            simpleFactory         2. 简单工厂模式     如果产品单一，可以使用（口味看成具体实现）
            factoryMethod         2. 工厂方法模式     BJMango和ZZMango看成不同产品等级（口味看成具体实现）
#####    2.1.3 abstractFactory    抽象工厂模式        
           （每个工厂看成一个产品族）BJMango和ZZMango看成不同产品等级
#####    2.1.4 prototype          原型模式
         实现clone接口，深克隆浅克隆
#####    2.1.5 builder            建造者模式
         产品只负责属性，建造者负责每一步建造，工程师负责建造顺序
         
         
####    2.2 structural            结构型模式
#####    2.2.1 adapter                 适配器模式
            类适配器、对象适配器、接口适配器
#####    2.2.2 bridge                  桥接模式
         抽象 聚合 接口
#####    2.2.3 decorater               装饰者模式
         包装类 聚合+继承 被包装类（抽象类）
#####    2.2.4 composite               组合模式
         符合对象的运用，   
####   2.3 behavioral            行为型模式
        
