package day03;

/*조건문 02
switch조건문 은 특이하게도 값이 명확하게 나뉠수있는 변수나 결과값을 선택하여
가능한 값에 대한 코드처리를 하게된다.
즉 **정수형 문자형** 데이터타입에 대한 결과처리를 하게 되는 것이다.

switch문의 기본구조
switch(검사할 대상) {
case 값1;
     값1 코드처리
     break;
case 값2:
     값2 코드처리
     break;
.....
default:
     그외에 대한 코드 처리
      break;
}
case간 순서가 뒤죽박죽이어도 괜찮다.
종착(만족케이스)까지 or break 전까지 모든코드를 실행한다.
if문보다 안쓰는(거의안쓰는)이유는
 */
public class Ex12Switch {
    public static void main(String[] args) {
        int number = 3;
        switch (number * 2) {
            case 2:
                System.out.println("1*2입니다.");
                break;
            case 4:
                System.out.println("2*2입니다.");
                break;
            case 6:
                System.out.println("3*2입니다.");
                break;
            default:
                System.out.println("그외입니다.");
                break;
        }
    }
}
