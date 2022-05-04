package com.nkx.myinterface;

public interface MyInterface {
	/**
	 * java8 接口可以声明静态方法和默认方法
	 * @return
	 */
	default String getName(){
		return "呵呵呵";
	}
	
	public static void show(){
		System.out.println("接口中的静态方法");
	}

}
