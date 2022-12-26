package day03;
import java.util.Scanner;
public class Ex01GradeCheckerAnswer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해주세요.");
        System.out.println("> ");
        int score = scanner.nextInt();
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
