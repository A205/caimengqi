package com.hfut.caimengqi;

public class Day104 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i=1,j=5;
		 float k=3.0f,h;
		 ++i;
		 j=j*i;
		 j++;
		 h=j%k;
		 k=i/k;
		System.out.println("������Ϊ��");
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		System.out.println("h="+h);
		 //���������������븡���ͻ����ļӼ��˳�����
		boolean flag=true;
		String flag1=((flag=true)&&((h--)>=0))?"true":"false";
		System.out.println("flag1="+flag);
		//�������߼����������ľ��������������
		

	}

}
