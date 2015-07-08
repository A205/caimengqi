package com.hfut.caimengqi;

import java.util.Scanner;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String dayString =scanner.nextLine();//输入字符串
		int day = 0;
		//根据month的取值，判断是几月份；
		switch (dayString.toLowerCase()) {//将输入内容全部转化为小写
		case "monday":day=1;break;
		case "tuesday":day=2;break;
		case "wednesday":day=3;break;
		case "thursday":day=4;break;
		case "friday":day=5;break;
		case "saturday":day=6;break;
		case "sunday":day=7;break;
		
		default:day=0;
		
		}
		//根据day的值，决定输入的是否是有效值
		if(day==0)
		{
			System.out.println("无效输入");
		}
		else
		{
			System.out.println(day);
		}

	}

}
