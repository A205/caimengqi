package com.hfut.caimengqi;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();//��������
		if(score<0||score>100)
		{
			System.out.println("�������");
		}
		if(score>=60)
		{
			System.out.println("�ɼ��ϸ�");
		}
		else{
			System.out.println("�ɼ����ϸ�");
		}
	}

}
