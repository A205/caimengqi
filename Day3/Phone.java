package com.hfut.caimengqi;

public class Phone {
	//���ԣ�������
	String name ;
	String brand;
	int price;
	
	//��Ϊ��������
	//void �����ķ�������
	//call ������
	void call(){
		System.out.println("��绰����");
	}
	void sendMsg(){
		System.out.println("�����š���");
	}
	public static void main(String[]args){
		//ʵ����һ���ֻ�
		Phone p = new Phone();
		
		p.name ="note";
		p.brand ="���׻�";
		p.price = 99;
		
		System.out.println(p.name);
		p.sendMsg();
	}

}
