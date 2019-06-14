package ch08;

// 생성자의 활용 방법, 어떤 경우에 생성자가 유용하게 쓰이는가?
public class Exam {
	int mathScore;
	int engScore;
	
	// 일반적으로 생성자는
	// 전역변수의 값을 초기화시키기 위해서 사용
	public Exam(int math, int eng) {
		mathScore = math;
		engScore = eng;
	}
}
