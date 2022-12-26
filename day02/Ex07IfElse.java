package day02;
/*조건문 01
 * if문 if else구조에서는 if문의 조건식이 true이면 if문에 연결된 코드블락이 실행되고
 * if문의 조건식이 false이면 else에 연결된 코드 블락이 실행되는 구조이다.
 * 당연히 else만 단독으로 올 수 없고, 또한 두개의 코드블락을 모두 실행시킬수도없다!
 * if else구조는 다음과 같이 되어있다.
 * if (조건식){
 		조건식의 참일때 실행할 코드블락
 } else {
 	조건식이 거짓일때 실행할 코드블락
 } 
 */
public class Ex07IfElse {
	public static void main(String[] args) {
		int number = 3;
		if(number>0) {
			System.out.println("number는 양의 정수입니다.");
		} else {
			System.out.println("number는 0이하입니다.");
		}
		}
}
