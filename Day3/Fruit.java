package com.hfut.caimengqi;

public class Fruit {
	String name;
	int price;
	String addr;
	
	Fruit(){}
	Fruit(String n,int p,String a){
		name =n;
		price=p;
		addr=a;
	}
	
	public static void main(String[]args){
		Fruit f=new Fruit("Æ»¹û",5,"É½¶«");
		System.out.println(f.name);
	}
}
