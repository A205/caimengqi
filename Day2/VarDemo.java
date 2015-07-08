package VarDemo;

public class VarDemo {

	static int number;
	
	public void varDefine()
	{
		//int 1a;//变量名不能以数字开头
		//int ;//
		int $123;
		int productPrice;
		//int if;//标识符不能使关键字
		int i=5;
		int j;
		j=5;
		int i1,j1=5;
		int k=i+j;
		//定义final变量
		final float PI=3.14159f;
		//PI=3.14f;//final变量值只能被修改一次
		
	}
	public static void main(String[] args){
		//TODO Auto-generated method stub
//访问方式，雷鸣，属性吗
		//System.out.println(VarDemo.number);
		//访问方式，对象，属性名
		VarDemo demo1=new VarDemo();
		System.out.println(demo1.number);
		
		VarDemo demo2=new VarDemo();
		System.out.println(demo2.number);
	}
	
	public void show()
	{
		number++;
		System.out.println(number);
	}
}
