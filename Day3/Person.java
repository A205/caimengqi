package com.hfut.caimengqi;

public class Person {
	
	String name;
	int age;
	String address;
	
	//�޲�Ĭ�Ϲ��췽��
	Person(){
		System.out.println("Person��Ĭ�Ϲ��췽�������á���");
	}
	
//�вι��췽��
//	Person(String n,dint a,String add){
//		name =n;
//		age=a;
//		address=add;	
//	}   �ᱨ��һ������£������������ʱ��Ӧ��Ϊ����ʾ������޲ι��췽��
	
	//���ҽ���
	void introduce(){
		System.out.println("��Һã��ҽ�"+name+",����"+age+"���ˣ�����"+address);
	}
	
	public static void main(String[] args){
		Person person =new Person();//ʵ����һ��person����
		person.name ="����";
		person.age =20;
		person.address ="USA";
		
		person.introduce();
	}

}
//��û�й��췽��ʱ��ϵͳ���Զ�����һ��Ĭ�Ϲ��췽��

//���췽����һ�ֱȽϷ�����ķ���
//û�з������ͣ�����������ͬ��