package VarDemo;

public class VarDemo {

	static int number;
	
	public void varDefine()
	{
		//int 1a;//���������������ֿ�ͷ
		//int ;//
		int $123;
		int productPrice;
		//int if;//��ʶ������ʹ�ؼ���
		int i=5;
		int j;
		j=5;
		int i1,j1=5;
		int k=i+j;
		//����final����
		final float PI=3.14159f;
		//PI=3.14f;//final����ֵֻ�ܱ��޸�һ��
		
	}
	public static void main(String[] args){
		//TODO Auto-generated method stub
//���ʷ�ʽ��������������
		//System.out.println(VarDemo.number);
		//���ʷ�ʽ������������
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
