package com.hans.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>2020/8/31 11:17</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFile", "true");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        JiuCai jiuCai = new JiuCai();
//		jiuCai.rent("租房子");

        InvocationHandler invocationHandler = new DynamicInvocation(jiuCai);
        ClassLoader classLoader = jiuCai.getClass().getClassLoader();
        Room o = (Room) Proxy.newProxyInstance(classLoader, new Class[]{Room.class}, invocationHandler);
        o.rent("动态代理");
        Class<?> proxyClass = Proxy.getProxyClass(classLoader, Room.class);
        System.out.println(proxyClass);
    }
}
