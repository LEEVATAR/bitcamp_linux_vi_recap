package day03;
/* 사용자로부터 성별, 나이, 신체등급을 입력받아서
신체등급 기준
1~3 현역
4 공익
그외 면제가 출력되는 프로그램
성별은 1남자 2여자판단
여자일 경우에는 "여성에게는 병역의 의무가 부여되지 않습니다."
로 별다른 입력없이 프로그램이 종료되어야 한다.
남자이지만 미성년자일 경우 "미성년자에게는 아직 신체등급이 존재하지 않습니다"가 출력
별다른 입력없이 프로그램이 종료되어야한다

 */
import java.util.Scanner;
public class Ex04ArmyChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해주세요. 남자면 1 여자는 2를 입력해주세요");
        System.out.println("> ");
        int gender = scanner.nextInt();
        if(gender == 1 ){
            System.out.println("남성이시군요");
            System.out.println("나이를 입력해주세요");
            int age = scanner.nextInt();
            if(age < 19){
                System.out.println("미성년자에게는 신체검사가 아직 진행되지 않았습니다.");
            } else if (age > 35) {
                System.out.println("thank you for your service");
            } else {
                System.out.println("신체등급을 작성해주세요");
                System.out.println("> ");
                int bodyGrade = scanner.nextInt();
                if (bodyGrade == 4){
                    System.out.println("공익입니다");
                } else if (bodyGrade < 4) {
                    System.out.println("국방의 의무 축하해");
                    System.out.println("국방부 https://www.mnd.go.kr 확인해주세요" );
                } else {
                    System.out.println("전시보충역 & 면제입니다");
                    System.out.println("국방부 https://www.mnd.go.kr 확인해주세요");
                }
                ;

            }

        }
        else{
            System.out.println("여성은 병역의 의무를 지지않습니다.");
        }
        scanner.close();
    }
}

