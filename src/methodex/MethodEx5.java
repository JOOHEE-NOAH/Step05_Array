package methodex;

public class MethodEx5 {

	public static void show1() { //call by name ���
		System.out.println("�ȳ��ϼ���~");
		return;} //��������
	
	public static void show2(char a, int b) { //call by name ���
		System.out.println("�ڵ� : "+a);
		System.out.println("�� : "+b);
	}
	
	public static String show3() {
	 return "hello";
	}
	
	public static float show4(int k, int e, int m) {
	return (float)(k+e+m)/3;  //int���� ���� �Ҽ��� �̾Ƴ��°Ŷ� ����ȯ ���� 
	}
	
	public static void main(String[] args) {
		
		show1();
		show2('A', 25);
		System.out.println("���ϰ� : :" +show3()); 
		show4(95,85,73);
		System.out.printf("���ϰ� : %.2f", show4(95,85,73));

	}

	

}
