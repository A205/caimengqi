package com.hfut.caimengqi;

public class Person {
	
	String name;
	int age;
	String address;
	
	//无参默认构造方法
	Person(){
		System.out.println("Person的默认构造方法被调用……");
	}
	
//有参构造方法
//	Person(String n,dint a,String add){
//		name =n;
//		age=a;
//		address=add;	
//	}   会报错，一般情况下，当我们设计类时，应该为类显示的添加无参构造方法
	
	//自我介绍
	void introduce(){
		System.out.println("大家好，我叫"+name+",今年"+age+"岁了，我在"+address);
	}
	
	public static void main(String[] args){
		Person person =new Person();//实例化一个person对象
		person.name ="张三";
		person.age =20;
		person.address ="USA";
		
		person.introduce();
	}

}
//当没有构造方法时，系统会自动生成一个默认构造方法

//构造方法是一种比较烦特殊的方法
//没有发挥类型，方法名和类同名