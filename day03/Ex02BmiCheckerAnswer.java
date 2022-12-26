package day03;
import java.util.Scanner;
public class Ex02BmiCheckerAnswer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("키를 M단위로 입력해주세요");
        System.out.println("> ");
        double height = scanner.nextDouble();

        System.out.println("몸무게를 kg단위로 입력해주세요.");
        System.out.println("> ");
        double weight = scanner.nextDouble();

        System.out.println("이름을 입력해주세요.");
        System.out.println("> ");
        scanner.nextLine();
        String name = scanner.nextLine();

        double bmi = weight / height / height;
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



