package day03;
/*
중첩 if문[nested if]이란 하나의 if코드 블럭안에
새로운 if-else 구조가 나오는 것을 말한다.
만약 우리가 어떤 특정결과의 값을 먼저 확인하고
그후에 추가적인 코드 작업이 필요하면 중첩 if문을 사용하게 된다.
또한 if문 뿐만이 아니라, 우리가 나중에 배우게 될 다른 제어문들도
종류와 상관 없이 중첩이 가능하다.

 */
public class Ex03NestedIf {
    public static void main(String[] args){
        int number = -16;
        if(number > 0){
            System.out.println("양의 정수입니다.");

            if(number < 10){
                System.out.println("한자리 숫자입니다.");
            } else if (number < 100) {
                System.out.println("두자리 숫자입니다.");
            } else {
                System.out.println("세자리 이상입니다.");
            }

        } else{
            System.out.println("양의 정수가 아닙니다.");

            if(number == 0){
                System.out.println("제로.");
            } else {
                System.out.println("음의 정수 입니다.");
            }
        }
    }
}
