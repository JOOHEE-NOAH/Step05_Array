package array;
//�����迭 : �迭���� ������ ���� �������� ������, ���� �������� ���� ���� ���Ѵ�.

// \t:�ٹٲ� ó�� tab���ִ°�
public class ArrayEx7 {

	public static void main(String[] args) {
//		int [][] num=new int[][]; �̷��� ǥ��(��, ��) �Ǵ�
			int [][] num=new int[][] { //[��][��]--> �� �켱 ǥ����
				{10,20},
				{50,60,70,80}, //----------->ǥ�� ���¸� ������ ��. 
				{90,100,110,}
			};
			
			//��,���� �����Ƿ� for���� �ι� ��� ���ش�.
			
			//System.out.println(num.length);//���� ����:3,
			for (int i=0; i<num.length;i++) {
				for(int j=0;j<num[i].length;j++) { //num�� i��°�� j��° ��
					System.out.print(num[i][j]+"\t");  //
				}
				System.out.println();
	}

}
}
