package principle.test7.compositeReusePrinciple;

/**
 * 合成复用原则(CompositeReusePrinciple CRP)
 * 核心：尽量使用合成/聚合方式  而不是继承
 *
 *
 *
 *
 * 依赖：在类中用到了对方，那么依赖对方
 * 泛化：（依赖特例）继承
 * 实现：（依赖特例）
 * 关联：（依赖特例）类与类  一对一，多对一...
 * 聚合：在B类中，A a; set（A a）{};  B销毁，A依然存在，  就是可分离，聚合关系
 * 组合： 在A中new B出来，A销毁，B也销毁了  也就是不可分离，组合关系
 * 例如：person 里有个 head  和 idCard     head与person是不可分离，同生共死，Head与idCard是聚合
 * @author YJ Lan
 * @create 2020-05-13-21:58
 */
public class CompositeReuse1 {
}
