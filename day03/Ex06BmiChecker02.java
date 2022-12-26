package day03;
//사용자로부터 키 몸무게 이름 순으로 입력받아서
//BMI와 비만도를 예쁘게 출력하는 프로그램을 작성하시오
//기네스북에 따른 가장 키큰사람은 2.72미터
//기네스에 가장 무거운사람 635kg
//만약 사용자가 잘못된 값을 입력하면 추가적 입력없이 잘못된값이 입력되어 프로그램을
//종료합니다. 만 출력되게 코드작성
import java.util.Scanner;
public class Ex06BmiChecker02 {
    public static void main(String[] args) {
        final int HEIGHTINMETER = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("귀하의 키를 입력해주세요.");
        System.out.print("> ");
        double height = scanner.nextDouble();

        while(height > 0 || height < 272){
            //"score" 가 올바르지않을경우 올바른경우가 나올떄까지 계속 반복함
            System.out.println("잘못된 값을 입력하셨습니다.");
            System.out.println("올바른 키를 입력해주세요.");
            System.out.println("> ");
            height = scanner.nextInt();
            // 이처럼 다시 int로 선언하지말고 바로 변수를 불러오면 된다.
        }
        if (height < 272 || height > 0){
            System.out.println("귀하의 몸무게를 입력해주세요.");
            System.out.print("> ");
            double weight = scanner.nextDouble();


        } else {
            System.out.println("귀하의 몸무게를 입력해주세요.");
            System.out.print("> ");
            double weight = scanner.nextDouble();
            if (weight>635) {
                System.out.println("잘못된 값이 입력되어 프로그램을 종료합니다");
            } else {
                System.out.println("성함을 입력해주세요.");
                System.out.print("> ");
                scanner.nextLine();
                String name = scanner.nextLine();

                double bmi = weight / (height/HEIGHTINMETER) / (height/HEIGHTINMETER);
                String obesity = "";
                if(bmi < 19.5){
                    obesity = "저체중";
                } else if (bmi < 23){
                    obesity = "정상체중";
                } else if (bmi < 25){
                    obesity = "과체중";
                }   else {
                    obesity = "비만";
                }
                System.out.printf("이름: [%s] 키: [%.2f]M 몸무게: [%.2f]kg\n", name, height, weight);
                System.out.printf("BMI: [%.2f] 비만도: [%s]\n", bmi, obesity);

                scanner.close();
            }
        }
            }
        }


