package com.hfut.caimengqi;

public class Demo01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person("jim",20,"USA");
		person.introduce();

	}

}

class Person{
	String name;
	int age;
	String address;
	
	public Person(){}
	public Person(String name,int age){
		this.name=name;//this指当前实例对象，“我”  点语法相当于“的”
		this.age=age;
	}
	public Person(String name ,int age,String address){
		this(name,age);//调用当前类的带两个参数的构造方法
		this.address=address;
	}
	
	void hello(){
		System.out.println("hello.....");
	}
	
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
	    this.hello();//this可以省略
	}
}
/*this指当前对象

1.this可以用在构造方法内部，用来区分同名的成员变量和局部变量
2.this可以用于调用构造方法，减少代码荣誉（在构造方法中通过this调用其他构造方法的语句必须是第一句）*/