package methodex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class MethodEx8 {
	  public static void view1() {
	      System.out.println("static method");  
	   }
	
	public void view2(){//�ν��Ͻ� �޼��� ���鶧�� static����.
			System.out.println("non-statci method");
		}
	
	public static void main(String[] args) {
		//Ŭ���� �޼���(static) :��ü ���� ȣ�� ����
		Math.random();//�ڱ� �ڽ��� �������޼��尡 �ƴ� ��� Ŭ���� �̸� ���� �Ұ�.
		MethodEx8.view1();
		view1();// �ڱ� �ڽ��� ���� �޼��忡 �����Ҷ��� Ŭ���� �̸� ���� ����.
		
		//�ν��Ͻ� �޼���(instance method) : �ݵ�� ��ü�� ���� �Լ� ȣ��-- �ַλ����.
//		Random rd=new Random(); // Random()�� ������.
//		rd.nextInt();
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
		MethodEx8 ob=new MethodEx8(); 	//������ �ν��Ͻ� �޼���� �ַ� �̷� ������� ����.
		ob.view2();						//������ �ν��Ͻ� �޼���� �ַ� �̷� ������� ����.

	}

}
