package com.hfut.caimengqi;

public class Demo02 {
	
	int age;
	
	void hello(){
		System.out.println("hello...");
	}
	
	static String name="����";
	
	//��̬������Ҳ��֮Ϊ�෽��
	static void hi(){
		System.out.println("hi...");
	}
	
	public static void main(String[] args){
		Demo02 d=new Demo02();
		
		System.out.println(Demo02.name);;
		Demo02.hi();
//		d.hi();
	}
}
