package array;
//�迭 : ������ �ڷ����� ���ӵ� ������
public class ArrayEx1 {

	public static void main(String[] args) {
//		1���� �迭
		
//		int [] num= {10,20,30,40,50}; //int a=10;
		int [] num=new int[5];//--->�������� 5����� �� //int a; �̷��Ը� ������ ����
		num[0]=10;	          //0��° �濡 10�� �������ش�	
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		for(int i=0; i<num.length;i++) {
			System.out.println(num[i]+" ");
		}
		
		System.out.println();
		//���� for���� �̿��Ͽ� ������ּ���
		
		for(int n:num) {
			System.out.println(n+" ");
		}
		
		System.out.println();
		
		//�������� num�� ������ּ���.
		
		for(int i=num.length-1; i>=0;i--) {
			System.out.println(num[i]+" ");
		}
		
		
		
		
		
		
	}

}
