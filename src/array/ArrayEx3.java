package array;
// java ArrayEx3 abcd ������ 123 12345
public class ArrayEx3 {

	public static void main(String[] args) {
		System.out.println("args�� ���� : "+args.length);
	
		for(int i=0;i<args.length;i++) {
			System.out.println("args["+i+"] : "+args[i]);
			System.out.println("args["+i+"]�� ���� : "+args[i].length()+"\n");
		}
	
		System.out.println(args);//����ϸ� [Ljava.lang.String;@7de26db8 �̷��� �����µ�, ���� �ּҰ���. �׳� ���� �ٸ�.
		
	
	
	
	
	}

}
