package methodex;
// �迭�� �����ڷ����� ����Ѵ�.
//call by reference ;������ ���� ȣ��, �Լ��� �Ű������� �����ּҷ� �����ϴ� ���
// call by vaule�� �ٸ���: main���� ���� ������ ���� �޼ҵ忡�� �ٲܼ� �ֳ� ������ ����. value�� �Ұ���.
//reference�� �޼ҵ忡�� �迭�� ���� �ٲٸ� main�� ������ ������ �ش�.
public class MethodEx7 {

	public static void view1(int[] num) {//�޴� �ʿ����� �Ȱ��� ���� �迭 ������. main���� ����ϴ� ���������� �����ؾ���.
		System.out.println("view1�� ������ : ");
		for(int n:num)
			System.out.print(n+" ");
		System.out.println();
		num[0]=100;
		System.out.println("view1�� ������ : ");
		for(int n:num)
			System.out.print(n+" ");
	}
	
	
	public static void main(String[] args) {
		int [] num= {10,20,30,40,50};
		System.out.println("view1 ȣ���� : ");
		for(int n:num)
			System.out.print(n+" ");
		System.out.println();
		view1(num); //call by value�� �޸� ()������ �̸��� ��
		System.out.println();
		System.out.println("view1 ȣ���� : ");
		for(int n:num)
			System.out.print(n+" ");
		System.out.println();
		
		String str="happy";
		System.out.println("view2 ȣ���� : "+str);
		view2(str);
		System.out.println("view2 ȣ���� : "+str);
		
	}


	public static void view2(String str) {
	 System.out.println("view2 ������ : "+str);
	 str="hello";
	 System.out.println("view2 ������ : "+str);
	}

	

}
