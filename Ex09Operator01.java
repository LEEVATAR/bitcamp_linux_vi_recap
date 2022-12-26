public class Ex09Operator01 {

	public static void main(String[] args) {
		// 정수형 끼리의 산술연산
		int myNum1 = 5;
		int myNum2 = 7;
		System.out.println(myNum1 + myNum2);
		System.out.println(myNum1 - myNum2);
		System.out.println(myNum1 * myNum2);
		System.out.println(myNum1 / myNum2);
		System.out.println(myNum1 % myNum2);
		
//		정수형과 실수형의 연산
		double myDouble = 7.0;
		System.out.println(myNum1 + myDouble);
		System.out.println(myNum1 - myDouble);
		System.out.println(myNum1 * myDouble);
		System.out.println(myNum1 / myDouble);
		System.out.println(myNum1 % myDouble);
/*		string
		string은 한번에 여러개의 문자를 처리하는 데이터타입으로써,
		흔히 "문자열"이라고 부른다.
		string에 여러개의 문자를 저장할 때에는 문자들을 ""로 감싸서 저장한다.
		string타입의 변수 mySring에 abc라는 글자 3개를 저장해보자
*/
		String myString = "abc";
//		화면에 myString의 현재값을 출력해보자
		System.out.println(myString);
//		string의 경우 더하기 연산이 가능하다! 2+3 = 23처럼 연결해서만!
		System.out.println(myString+"123");
//		abc123으로 출력된다!
//		myString + 숫자 123?
		System.out.println(myString+123);
//		같은 결과값
//		다음중 결과가 다른것은?
		System.out.println(123+456);
		System.out.println((int)123.0+456);
		System.out.println((int)123.0+456.0);
		System.out.println("123"+456); 
	}
	
}
