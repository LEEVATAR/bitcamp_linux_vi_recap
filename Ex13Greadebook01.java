public class Ex13Greadebook01 {

	public static void main(String[] args) {
		int studentNumber = 111 ;
		String studentName = "이현석";
		int koreanScore = 100;
		int englishScore = 95;
		int mathScore = 90;
		int totalScore = koreanScore + englishScore + mathScore;
		double averageScore = (koreanScore + englishScore + mathScore) / 3;
		System.out.println("학생 번호: " + studentNumber);
		System.out.println("학생 이름: " + studentName);
		System.out.println("국어 점수: " + koreanScore);
		System.out.println("영어 점수: " + englishScore);
		System.out.println("수학 점수: " + mathScore);
		System.out.println("총점: " + totalScore);
		System.out.println("평균: " + averageScore);
	}

}
