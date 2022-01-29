package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx5 {
	//ũ�Ⱑ 5���� ������ �迭�� �����ϰ� �迭�� �����͸� �Է� �޾Ƽ� ����ϰ� �ִ�, �ּҰ��� ����ϼ���
	// bufferedreader ���, for ���
	//
	//----
	//
	//ar[0]�� ���� �Է��ϼ��� : 25
	//ar[1]�� ���� �Է��ϼ��� : -25
	//ar[2]�� ���� �Է��ϼ��� : 15
	//ar[3]�� ���� �Է��ϼ��� : 23
	//ar[4]�� ���� �Է��ϼ��� : 33
	//
	//25 -25 15 23 33
	//
	//�ִ밪 : 33
	//�ּҰ� : -25
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int [] ar=new int[5];
		
		for(int i=0; i<ar.length;i++) {
		System.out.print("ar["+i+"]�� ���� �Է��ϼ��� : ");
		ar[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println();
		
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			
			}
		System.out.println();
		System.out.println();
		
		int max=ar[0];
		int min=ar[0];
		
		for(int i=1; i<ar.length; i++) { // �ڱ� �ڽŰ� ���� �ʿ�� ���⶧���� i=1�� �ʱⰪ���� �����ش�.
			if(ar[i]>max) max=ar[i];
			if(ar[i]<min) min=ar[i];
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		
		//------------------�� ���----------------------		
			/*	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				
				int [] num=new int[5];
				for(int i=0; i<num.length; i++) {
					System.out.print("ar["+i+"]�� ���� �Է��ϼ��� : ");
				num[i]=Integer.parseInt(br.readLine());
				
				}
				
				System.out.println();
				for(int i=0; i<num.length; i++) {
				System.out.print(num[i]+" ");
				
				}
				
				System.out.println();
				System.out.println();
				
				
				int max=num[0];
				int min=num[0];
				
				for(int i=1; i<num.length; i++) { // �ڱ� �ڽŰ� ���� �ʿ�� ���⶧���� i=1�� �ʱⰪ���� �����ش�.
					if(num[i]>max) max=num[i];
					if(num[i]<min) min=num[i];
				}
				System.out.println("�ִ밪 : "+max);
				System.out.println("�ּҰ� : "+min);
		*/
		
	}

}
