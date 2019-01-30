package com.zwq.demo.aop;

import java.lang.reflect.Proxy;

/**
 * 基于 JDK 动态代理实现
 * 1.定义一个包含切面逻辑的对象，这里假设叫 MethodInvocation
 * 2.定义一个 Advice 对象（实现了 InvocationHandler 接口），并将上面的 MethodInvocation 和 目标对象传入
 * 3.将上面的 Advice 对象和目标对象传给 JDK 动态代理方法，为目标对象生成代理
 * @author zwq
 * @date 2019/1/30 15:06
 */
public class RealizeAOP {
    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(RealizeAOP.class.getClassLoader(),
                bean.getClass().getInterfaces(), advice);
    }
}
