package methodex;
//------
//�Ի� ���� : 815��
//�Ի� ��� : �հ�   <---------������800�̻��̶�� �հ� �ƴϸ� ���հ�

public class MethodEx6 {
	public static int total(int toeic, int it) { //���� ����
		return toeic+it;
		
	}
	
	public static String rs(int total) {
		if (total>=800) { //return (total>=800)? "�հ�":"���հ�"; ���� ǥ������
			return"�հ�";
			}
			else return"���հ�";	
					
	}
	public static void main(String[] args) {
		int toeic=750, it=65;
		
		System.out.println("�Ի� ����: "+total(toeic, it)+"��");
		System.out.println("�Ի� ���: "+rs(total(toeic, it)));
		
	}

	//call by value (�⺻�ڷ����� ���ؼ� ����) 
	//=byte,char, int ,float, double, long-->���ֻ� �۾��� public static class �̷��� ����
	//call by reference(�����ϴ� ���� ����.) -->�迭,��ü
	}


