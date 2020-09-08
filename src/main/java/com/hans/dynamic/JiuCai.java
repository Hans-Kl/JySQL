package com.hans.dynamic;

/**
 * <p>2020/8/31 11:22</p>
 *
 * @author konglinghan
 * @version 1.0
 */
public class JiuCai implements Room{
	@Override
	public void rent(String str) {
		System.out.println("韭菜rent");
		this.sell("");
	}

	@Override
	public void sell(String str) {
		System.out.println("韭菜sell");
	}
}
