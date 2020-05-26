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
         集合A 和 集合B元素一一对应匹配，适配器可以适配他们进行一一匹配
#####    2.2.2 bridge                  桥接模式
         抽象 聚合 接口
         笛卡尔积情况
#####    2.2.3 decorater               装饰者模式
         包装类 聚合+继承 被包装类（抽象类）
         包装类和被包装类任意组合
#####    2.2.4 composite               组合模式
         符合对象的运用，树形模式（子，叶方法属性大致相同）
         抽象，实现add和remove，客户端需要判断调用
         接口，子叶实现都一样，客户端不需要判断，但是叶需要包含无用的add和remove   
#####    2.2.5 facade                  外观模式
         隐藏细节，尽可能少的暴露细节给外部
#####    2.2.6 flyweight               享元模式
         一个Map维护多个对象，有就取出，没有就创建放入
#####    2.2.7 proxy                   代理模式
         主要实现是：功能增强
         接口代理：静态代理、动态代理   抽象代理：cglib
         
         
####   2.3 behavioral            行为型模式
#####    2.3.1  template               模板方法模式
            定义一个算法的骨架，将其实现延迟到子类实现
#####    2.3.2  command                命令模式   
            命令发布人，命令接收者，命令（聚合接收者） 
#####    2.3.3  visitor                访问者模式
            数据结构（Staff）和操作（Visitor）解耦
#####    2.3.4  iteration              迭代器模式
            针对不同数据容器，创建不同迭代器
            数据结构---遍历方式 的解耦
#####    2.3.5  observer               观察者模式
            变化通知观察者
            变化类聚合观察者，如有变换，调用update通知观察者
#####    2.3.6  mediator               中介者模式
            没有中间商，所有顾客和卖方都互不联系，交给中介
#####    2.3.7  memorandum             备忘录模式
            还原记录历史信息
#####    2.3.8  interpreter            解释器模式
#####    2.3.9  state                  状态模式
            多状态下状态转换，状态和行为一一对应
            抽象状态聚合到维护状态的类，
            根据抽象状态的方法动态改变维护状态类的状态值
#####    2.3.10 strategy               策略模式
            类似桥接，抽象聚合接口，使得接口的算法和抽象的调用者解耦
#####    2.3.11 chain                  责任链模式