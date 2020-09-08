package com.hans.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>2020/8/31 11:05</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class DynamicInvocation implements InvocationHandler {
	private Object real;

	public DynamicInvocation(Object real) {
		this.real = real;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(proxy.getClass());
		System.out.println(this.getClass());
		System.out.println("被中介宰了");
		Object invoke = method.invoke(real, args);
		return invoke;
	}
}
