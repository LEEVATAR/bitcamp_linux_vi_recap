package day03;
// 무한반복문을 사용한 메뉴만들기
import java.util.Scanner;
public class Ex11Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. 1번기능 \n2. 2번기능\n3. 3번기능\n4. 종료");
            int userChoice = scanner.nextInt();

            if(userChoice ==1){
                System.out.println("1번 기능 실행!");
            } else if (userChoice ==2){
                System.out.println("2번 기능 실행!");
            } else if (userChoice ==3){
                System.out.println("3번 기능 실행!");
            }else if (userChoice ==4){
                System.out.println("사용해주셔서 감사합니다!");
                break;
            }
        }

        scanner.close();
    }
}
