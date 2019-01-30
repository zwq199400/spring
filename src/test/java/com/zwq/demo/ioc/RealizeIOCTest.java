package com.zwq.demo.ioc;

import com.zwq.demo.ioc.pojo.User;
import org.junit.Test;

/**
 * IOC测试
 * @author zwq
 * @date 2019/1/30 14:35
 */

public class RealizeIOCTest {
    @Test
    public void iocTest() throws Exception {
        String location = RealizeIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        RealizeIOC bf = new RealizeIOC(location);
        User user = (User) bf.getBean("user");
        System.out.println(user);
    }
}
