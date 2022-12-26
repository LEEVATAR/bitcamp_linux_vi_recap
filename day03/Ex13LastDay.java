package day03;
//이처럼 직접 모든상황을 계산하고 입력해줘야하므로 잘안쓴다.

import java.util.Scanner;
public class Ex13LastDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("월을 입력해주세요.");
        System.out.print("> ");
        int month = scanner.nextInt();
        //만족시키는 케이스찾아서 브레이크까지간다.
        switch (month){
            case 2:
                System.out.println("28일까지입니다.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30일까지입니다.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31일까지입니다.");
                break;

        }
        scanner.close();
    }
}
