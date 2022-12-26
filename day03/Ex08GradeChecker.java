package day03;
//사용자로부터 점수를 입력받아서
//a~f를 출력하는 프로그램
//사용자가 잘못된 점수를 입력하면 올바른 점수가 입력될때까지
//다시 입력을 받는다
import java.util.Scanner;
public class Ex08GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해주세요!");
        System.out.println("> ");
        int score = scanner.nextInt();

        while(score > 100 || score < 0){
            //"score" 가 올바르지않을경우 올바른경우가 나올떄까지 계속 반복함
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("올바른 점수를 입력해주세요.");
            System.out.println("> ");
            score = scanner.nextInt();
            // 이처럼 다시 int로 선언하지말고 바로 변수를 불러오면 된다.
        }

        if (score >=90){
            System.out.println("Awesome");
        } else if (score >=80 ) {
            System.out.println("Better");
        } else if (score >= 70) {
            System.out.println("Concentrate");
        } else if (score >= 60) {
            System.out.println("Danger");
        } else {
            System.out.println("Fall");
        }

        scanner.close();
    }
}

//for 문 무한반복문 switch 예제
