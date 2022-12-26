package day03;
import java.util.Scanner;
/*검증이란 데이터가 올바른 값인지를 확인하는 과정이다.
검증을 하는 방법은 매우 다양하지만,
우리는 그중에서 "정확한 범위 사용하기와 중첩 if문 사용하기를 통한 값 검증을 알아볼것
 */
public class Ex05Validation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해주세요.");
        System.out.println("> ");
        int score = scanner.nextInt();
        System.out.println("---------------------");
        System.out.println("검증이 안된 경우");
        System.out.println("---------------------");
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
//검증 1번 정확한 범위사용 각각결과가 나오는 조건식을 상세 정확히 적는다
//이방법은 올바른 값의 범위가 연속적이지 않을경우 사용하면 좋다!
        System.out.println("---------------------");
        System.out.println("정확한 조건식 쓰기");
        System.out.println("---------------------");
        if(score>= 90 && score <= 100){
            System.out.println("A");
        } else if (score >=80 && score < 90) {
            System.out.println("B");
        } else if (score >=70 && score < 80) {
            System.out.println("C");
        } else if (score >=60 && score < 70) {
            System.out.println("D");
        } else if (score >=0 && score < 60) {
            System.out.println("F");
        } else {
            System.out.println("잘못된 점수입니다.");
        }
//  중첩 if문을 사용하여 올바른 결과일때에만 추가적인 코드진행을 하고 그외는
//  경고메시지를 출력함, 이 방법은 올바른값의범위가 연속적일때 주로 사용이 된다.
        scanner.close();
    }
}
