package array;
//args�� �̿��Ͽ� �� ���� �Է¹޾Ƽ� �ִ�, �ּڰ� ���
//$ java ArrayEx4 10 15 23
//
//�ִ밪 : 23
//�ּҰ� : 10

public class ArrayEx4 {

	public static void main(String[] args) {
		int [] num=new int[3]; //�Ǵ� int [] num= {1,2,3} �̷������� Ȯ�����ִ���
		num[0]=Integer.parseInt(args[0]);
		num[1]=Integer.parseInt(args[1]);
		num[2]=Integer.parseInt(args[2]);
	
//		System.out.println(num);
		//�ִ밪 �ּҰ�
		int max=num[0];
		int min=num[0];
		
		for(int i=1; i<num.length; i++) { // �ڱ� �ڽŰ� ���� �ʿ�� ���⶧���� i=1�� �ʱⰪ���� �����ش�.
			if(num[i]>max) max=num[i];
			if(num[i]<min) min=num[i];
			
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		
	}

}
