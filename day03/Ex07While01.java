package day03;
/*반복문
while반복문은 조건식을 실행시켜서 true가 나올때마다 코드블럭을 실행시키고
다시 조건식을 실행시키는 구조가 된다.

while문의 기본구조
while(조건식) {
조건식이 true일때 실행할 코드!
}
while 정해진기간동안내내
for 반복횟수가 드러나있음
 */
public class Ex07While01 {
    public static void main(String[] args) {
        int number = 4;
        while(number >=1){
            System.out.println(number);
            number--; //++, --는 단항연산자로 1씩감소
        }
    }
}
