package day03;
/*
사용자로부터 번호 이름 국어 영어 수학점수순으로 입력받아
예쁘게 출력하는 프로그램을 작성하시오
해당반은 학생이 총 20명입니다 잘못된 값을 입력받았을경우
올바른값을 입력할때까지 다시입력을 받도록 코드를 작성해주세요
 */
import java.util.Scanner;

public class Ex09GradeBookAnswer {
    public static void main(String[] args) {
        final int SUBJECT_SIZE = 3;
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        String message = "";

        message = "학생의 번호를 입력해주세요.";
        int min = 1;
        int max = 20;

        int id = nextInt(message, scanner, min, max);

        message = "학생의 이름을 입력해주세요.";
        System.out.println(message);
        System.out.print("> ");
        scanner.nextLine();
        String name = scanner.nextLine();

        //국어
        message = "학생의 국어 점수를 입력해주세요.";
        min = 0;
        max = 100;
        int korean = nextInt(message, scanner, min, max);

        message = "학생의 영어 점수를 입력해주세요.";
        min = 0;
        max = 100;
        int english = nextInt(message, scanner, min, max);

        message = "학생의 수학 점수를 입력해주세요.";
        min = 0;
        max = 100;
        int math =  nextInt(message, scanner, min, max);

        int sum = korean + english + math ;
        double average = (double)sum / SUBJECT_SIZE;

        System.out.printf("번호: %02d번 이름: %s\n", id, name); //반드시 d가 들가야함 이름은 자릿수 지정이 없으므로 걍 %s로
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

        scanner.close();
        }




    public static int nextInt(String message, Scanner scanner, int min, int max) {
        System.out.println(message);
        System.out.print("> ");
        int temp = scanner.nextInt();

        while (!(temp >= min && temp <= max)) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println(message);
            System.out.print("> ");
            temp = scanner.nextInt();
        }
        return temp;
    }
}
