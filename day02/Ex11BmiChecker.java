package day02;
/*사용자로부터 키, 몸무게, 이름을 입력받아서
BMI값과 비만도를 출력하는 프로그램을 작성하시오.
BMI 계산 공식: 몸무게 kg / 키 m단위 / 키m단위
비만도 기준치
~19.5: 저체중
23 미만: 정상체중
25 미만: 과체중
25이상 : 비만
출력 양식
이름: [###] 키: [#.##]M 몸무게: [##.##]kg
BMI: [##.##] 비만도: [###]
*/
import java.util.Scanner;
public class Ex11BmiChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("귀하의 키를 입력해주세요.");
        System.out.print("> ");
        double height = scanner.nextDouble();

        System.out.println("귀하의 몸무게를 입력해주세요.");
        System.out.print("> ");
        double weight = scanner.nextDouble();

        System.out.println("성함을 입력해주세요.");
        System.out.print("> ");
        scanner.nextLine();
        String name = scanner.nextLine();

        double bmi = weight / height / height;

        if (bmi < 19.5) {
            System.out.println("저체중");
        } else if (bmi < 23 ) {
            System.out.println("정상체중");
        } else if (bmi < 25 ) {
            System.out.println("과체중");
        } else if (bmi > 25 ) {
            System.out.println("비만");
        } else {
            System.out.println("숫자를 써주세요.");
        }
        System.out.printf("이름: [%s] 키: [%4.2f] 몸무게: [%5.2f]\n", name, height, weight);
        System.out.printf("BMI [%05f점] 비만도: [%s]\n", bmi);

        scanner.close();
    }
}