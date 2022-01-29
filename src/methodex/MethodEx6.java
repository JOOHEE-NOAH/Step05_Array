package methodex;
//------
//입사 총점 : 815점
//입사 결과 : 합격   <---------총점이800이상이라면 합격 아니면 불합격

public class MethodEx6 {
	public static int tota(int toeic, int it) {
		return toeic+it;
		
	}
	
	public static String rs(int tota) {
		String result=null;
		if ((int)tota>=800) {
			result="합격";
			}
			else result="불합격";	
					
		return result;
	}
	public static void main(String[] args) {
		int toeic=750, it=65;
		
		System.out.println("입사 총점: "+tota(toeic, it)+"점");
		System.out.println("입사 결과: "+rs(tota(toeic, it)));
		
	}

	
	
	}


