package com.hfut.caimengqi;

public abstract class Animal {
	public abstract void sleep();

}

//子类继承抽象父类，必须要实现父类中的所有抽象方法，否则子类也是抽象的
//class  class Tiger extends Animal{
class Tiger extends Animal{

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("趴着睡。。。");
	}
}

class Monkey extends Animal{
	public void sleep(){
		System.out.println("仰着睡。。。。");
	}
}
