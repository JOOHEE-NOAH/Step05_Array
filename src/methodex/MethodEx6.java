package methodex;
//------
//�Ի� ���� : 815��
//�Ի� ��� : �հ�   <---------������800�̻��̶�� �հ� �ƴϸ� ���հ�

public class MethodEx6 {
	public static int tota(int toeic, int it) {
		return toeic+it;
		
	}
	
	public static String rs(int tota) {
		String result=null;
		if ((int)tota>=800) {
			result="�հ�";
			}
			else result="���հ�";	
					
		return result;
	}
	public static void main(String[] args) {
		int toeic=750, it=65;
		
		System.out.println("�Ի� ����: "+tota(toeic, it)+"��");
		System.out.println("�Ի� ���: "+rs(tota(toeic, it)));
		
	}

	
	
	}


