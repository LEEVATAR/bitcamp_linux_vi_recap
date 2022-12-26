package day03;
/*반복문 제로투
for 반복문은 while과는 다르게
"비교적"명확하게 반복횟수가 정해진다.
for 반복문의 기본적인 구조는 다음과 같다.
for(제어 변수의 선언과 초기화; 조건식; 반복 후 제어변수의 변화식) {
    반복할 코드
}
단, 제어변수는 반드시 정수형 데이터타입의 변수여야 한다.


 */

public class Ex14For01 {
    public static void main(String[] args) {
        for (int number = 1; number <= 4; number++) {
            System.out.println(number);
        }

        //for문 팁!
//        1. 제어변수는 유효범위가 해당 for문의 변수이다.
//        System.out.println(number);
//        2. 전통적으로 for문의 제어변수이름은 중첩될때마다
//        i > j > k 순으로 지어진다.
//        3. 다른 제어문들처럼, 처음부터 조건식이 false가 나오면
//        해당 for문은 한번도 실행이 되지 않는다!! ! ! ! ! ! ! ! !  ! !  !
//        4. 제어변수의 변화식은 굳이 ++를 써야할 필요는 없이
//        다른 할당 연산자를 사용할 수 있다.
        for(int i = 1; i <=1219414; i *=100){
            System.out.println(i);
    }
//        5.제어변수의 초기화나 혹은 조건식에 다른 변수를 사용할 수 있따.
        int startNum = 1;
        int endNum = 20;
        for (int i = startNum; i<= endNum; i++){
            System.out.println(i);
        }
    }
}
