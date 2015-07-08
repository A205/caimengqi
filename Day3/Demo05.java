package com.hfut.caimengqi;

public class Demo05 {
	public static void main(String[] args) {
		Person2 p = new Person2(20);
		System.out.println(p.age);
	}

}

class Person2{
	Person2(int age){
		this.age = age;
	}
	{
		age=18;
	}
	int age;
}
