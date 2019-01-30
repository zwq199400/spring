package com.zwq.demo.aop;

import com.zwq.demo.aop.service.HelloService;
import com.zwq.demo.aop.service.HelloServiceImpl;
import org.junit.Test;

/**
 * @author zwq
 * @date 2019/1/30 15:09
 */
public class RealizeAOPTest {
    @Test
    public void getProxy() throws Exception {
        // 1. 创建一个 MethodInvocation 实现类
        MethodInvocation logTask = () -> System.out.println("log task start");
        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();

        // 2. 创建一个 Advice
        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl, logTask);

        // 3. 为目标对象生成代理
        HelloService helloServiceImplProxy = (HelloService) RealizeAOP.getProxy(helloServiceImpl,beforeAdvice);

        helloServiceImplProxy.sayHelloWorld();
    }
}
