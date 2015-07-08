package com.hfut.caimengqi;

public class Demo04 {
	public static void main(String[] args){
		new Person();
	}

}

calss Person{
	Person(){
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
}
