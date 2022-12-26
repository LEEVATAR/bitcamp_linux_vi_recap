package day02;

import java.util.Scanner;
public class Ex10GradeChecker {
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