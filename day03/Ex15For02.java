package day03;
/*사용자로부터 숫자를 2개 입력받아
두 숫자사이의 합을 구하는 프로그램
*/

import java.util.Scanner;
public class Ex15For02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요");
        System.out.printf("> ");
        int firstNum = scanner.nextInt();

        System.out.println("두번째 숫자를 입력해주세요");
        System.out.printf("> ");
        int secondNum = scanner.nextInt();

        int startNum;
        int endNum;
        if (firstNum<secondNum){ //사고를 방지하기위한 조건문 코드
            startNum = firstNum;
            endNum = secondNum;
        } else {
            startNum = secondNum;
            endNum = firstNum;
        }
        int result = 0;

        for (int i = startNum; i<=endNum; i++) {
            result += i; //result = result + i
        }
        System.out.printf("%d부터 %d까지의 합: %d\n", firstNum, secondNum, result);
        scanner.close();
    }
}
