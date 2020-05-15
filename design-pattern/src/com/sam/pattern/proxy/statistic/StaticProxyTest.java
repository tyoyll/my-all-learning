package com.sam.pattern.proxy.statistic;

/**
 * 代理模式作用：
 *      AOP实现、拦截器、中介、黄牛、媒婆、解耦
 *      专人做专事、自己不想做但是有不得不做的事
 *      增强
 * 代理分静态代理和动态代理
 *
 * 角色分为：代理角色和被代理角色（目标对象），由被代理角色来做最终的决定
 *          代理角色通常来说会持有被代理角色对象引用(以便代理角色完成工作之前或之后能找到被代理对象，能够通知被代理对象）
 *
 */

/**
 * 代理模式
 *      目的就是拿到目标类的引用，并且能够调用到目标类的业务方法
 *
 * 静态代理
 *      代理类中有目标类的引用
 *      目标类类型固定，不灵活
 *
 * 动态代理
 *      JDK
 *         代理类中可以不是具体的类，可以是一个接口，目标类实现这个接口
 *      CGLIB
 *          动态代理类预先不存在，运行的时候继承普通目标类
 *
 * 静态代理和动态代理的区别
 *      静态代理在代理之前，所有东西都是已知的（人工）
 *      动态代理在代理之前，所有东西都是未知的（自动化、智能化）
 */
public class StaticProxyTest {


    public static void main(String[] args) {
        Son son = new Son();

        //只能帮忙儿子找对象
        //不能给表妹或其他人找
        Father father = new Father(son);
        father.findLove();

    }


}
