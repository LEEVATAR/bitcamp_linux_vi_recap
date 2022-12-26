package day02;
//사용자로부터 번호 이름 국어 영어 수학점수순으로 입력을 받아서 ㅏ음과 같으 녛ㅇ시그오 출력되는 프로그램을 작성

//번호:0#번 이름:### 
//국어:0##점 영어:0##점 수학:0##점
//총점:0##점 평균:0##.##점
import java.util.Scanner;
public class Ex05Gradebook03 {
	public static void main(String[] args) {
		final int SUBJECT_SIZE = 3;
		Scanner scanner = new Scanner(System.in);//S대문자 클래스 s소문자 변수
				
		System.out.println("학생의 번호를 입력해주세요.");
		System.out.print("> ");
		int number = scanner.nextInt();
		
		System.out.println("학생의 이름을 입력해주세요.");
		System.out.print("> ");
		scanner.nextLine();
		String name = scanner.nextLine();		

		System.out.println("학생의 국어점수를 입력해주세요.");
		System.out.print("> ");
		int korean = scanner.nextInt();

		System.out.println("학생의 영어점수를 입력해주세요.");
		System.out.print("> ");
		int english = scanner.nextInt();
		
		System.out.println("학생의 수학점수를 입력해주세요.");
		System.out.print("> ");
		int math = scanner.nextInt();
		
		int sum = korean + english + math;
		
		double avg = (double)sum /SUBJECT_SIZE;
		
		System.out.printf("번호: %02d번 이름: %s\n", number, name); //반드시 d가 들가야함 이름은 자릿수 지정이 없으므로 걍 %s로 
		System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
		System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, avg);
		scanner.close();
	}

}
