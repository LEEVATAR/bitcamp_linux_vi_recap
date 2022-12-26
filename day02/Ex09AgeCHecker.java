package day02;
//사용자로부터 나이를 입력받아서 5세미만 영유아, 13세이하 어린이 18세이하 청소년 19세이상 성인 이 출력되는 프로그램을 작성해보세용

import java.util.Scanner;
public class Ex09AgeCHecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("귀하의 나이를 입력해주세요.");
        System.out.print("> ");
        int age = scanner.nextInt();
        if (age < 5) {
            System.out.println("영유아입니다.");
        } else if (age <= 13 ) {
            System.out.println("어린이입니다.");
        } else if (age <= 18 ) {
            System.out.println("청소년입니다.");
        } else if (age >= 19 ) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("숫자를 써주세요.");
        }
        scanner.close();
    }
}
