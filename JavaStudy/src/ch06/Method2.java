package ch06;

public class Method2 {
	static boolean signup(String id, String pw) {
		// ID �ڸ��� �˻�
		if(id.length() < 4) {
			return false;
		}
		// PW �ڸ��� �˻�
		if(pw.length() < 4) {
			return false;
		}
		return true; 
	}
	
	public static void main(String[] args) {
		boolean result = signup("abcd","1234");
		if(result) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}
}
