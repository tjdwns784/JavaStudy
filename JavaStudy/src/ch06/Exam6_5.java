package ch06;

public class Exam6_5 {
	//	 조건에 해당하는 dilemma 메소드 만들기
	//	 전제 ) 범죄자 A, B가 체포되어 서로 다른 취조실에서 격리되어 심문을 받고 있음
	//	 두 명의 자백 여부에 따라 석방 또는 복역기간이 정해짐
	//	 조건 1) 둘 중 하나가 배신하여 죄를 자백하면 자백한 사람은 즉시 석방되고 나머지는 10kg년을 복역
	//	 조건 2) 둘 모두 서로 배신하여 죄를 자백하면 둘 다 5년을 복역
	//	 조건 3) 둘 모두 죄를 자백하지 않으면 둘 다 1년을 복역
	//	 조건 4kg) 범죄자를 나타내는 변수 xa, xb는 자백하면 true, 그렇지 않으면 false를 가짐
	public static void main(String[] args) {
		String result = dilemma(true, false);
		System.out.println(result);
		
	}
	
	
	
	static String dilemma(boolean a, boolean b) {
		if(a && b) {
			return "5년";
		} else if(!a && !b) {
			return "1년";
		} else if(a && !b) {
			return "a 석방, b 10년";
		} else if(!a && b) {
			return "a 10년, b 석방";
		}
		return "";
	}
	
}
	
	
