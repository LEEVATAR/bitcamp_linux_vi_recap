package day02;

import java.util.Scanner;
public class Ex02Gradebook2 {

	public static void main(String[] args) {
		Scanner scanner; //S대문자 클래스 s소문자 변수
		scanner = new Scanner(System.in);
		System.out.println("학생번호를 입력해주세요.");
		
		int number = scanner.nextInt();
		System.out.println("학생번호: "+number);
		System.out.println("학생의 이름을 입력해주세요.");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("학생의 국어 점수를 입력해주세요.");
		int korean = scanner.nextInt();
		System.out.println("학생의 영어 점수를 입력해주세요.");
		int english = scanner.nextInt();
		System.out.println("학생의 수학 점수를 입력해주세요.");
		int math = scanner.nextInt();
		System.out.println("학생번호: " + number);
		System.out.println("학생이름: " + name);
		System.out.println("국어점수: " + korean);
		System.out.println("영어점수: " + english);
		System.out.println("수학점수: " + math);
		int sum = korean + english + math;
		double average = (double)sum/3;
		System.out.println("총점: " + (korean+english+math));
		System.out.println("평균점수: " + average);
		scanner.close();
		}

}
