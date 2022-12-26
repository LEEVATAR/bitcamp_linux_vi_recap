package day02;
/* 조건문 01
if문 03
if - elseIf구조
if else if 구조는 첫번째 조건식이 false가 나왓을때 다른 조건식을 체크하여 다음 코드블락실행여부를 결정하게됨
당연히 필요에 따라서는 우리가 필요한 갯수만큼의 else if 코드블락을 적어줄수있다.
그리고 최종적으로 if부터 else if까지의 모든 조건식이 false 가 나왔을 때를 대비하여
가장 마지막에 else 코드 블락도 만들어 줄 수 있다
단, else 코드 블락 이후에는 다른 else if 코드 블락이 들어올 수 없다. else 는 마지막이 되어야한다.
 */

public class Ex08IfElseIf {
    public static void main(String[] args){
        int number = 5;
        String message;
        if (number > 0 ){
            System.out.println("양의 정수입니다.");
        } else if(number == 0){
            System.out.println("0입니다.");
        } else {
            System.out.println("음의 정수입니다.");
        }

    }

}
