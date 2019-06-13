package ch06;

public class Method2 {
	static boolean signup(String id, String pw) {
		// ID 자리수 검사
		if(id.length() < 4) {
			return false;
		}
		// PW 자리수 검사
		if(pw.length() < 4) {
			return false;
		}
		return true; 
	}
	
	public static void main(String[] args) {
		boolean result = signup("abcd","1234");
		if(result) {
			System.out.println("가입 성공");
		} else {
			System.out.println("가입 실패");
		}
	}
}
