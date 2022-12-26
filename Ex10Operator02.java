public class Ex10Operator02 {

	public static void main(String[] args) {
		//1. = 오른쪽값을! 왼쪽int에 저장해라!
		int myInt = 4;
		System.out.println("myInt의 현재 값: " + myInt);
		//2. += 7; 4+7
		myInt += 7;
		System.out.println("myInt의 현재 값: " + myInt );
		//3. -= 2; 11-2
		myInt -= 2;
		System.out.println("myInt의 현재 값: " + myInt );
		//4. *= 9*4= 36
		myInt *= 4;
		System.out.println("myInt의 현재 값: " + myInt);
		//5. /= 36 / 6 = 6 
		myInt /= 6;
		System.out.println("myInt의 현재 값: " + myInt);
		//6. %= 6을 4로 나누고 나머지인 = 2
		myInt %= 4;
		System.out.println("myInt의 현재 값: " + myInt);
/*      
		증감 연산자는 해당 연산자가 달려있는 공간의 값을 1 '증'가시키거나 '감'소시키는 연산자이다
		단, 해당 공간의 앞, 뒤에 따라서 의미가 달라진다. 1
		앞에 붙어있는 경우 전위 증강연산자라고 하고 가장 먼저 실행되는 코드 그룹에 속한다.
		뒤에 붙어있는 경우 후위 증감연산자라고 하고, 가장 마지막에 실행되는 코드 그룹에 속한다.
		
		myInt의 현재값을 화면에 출력해보자 마지막값은 6을 4로나눈 나머지인 2이다
 */
		System.out.println("myInt: " + myInt);
		System.out.println("++myInt: " + ++myInt);
//		위 코드를 풀어쓰면 다음과 같다.
//		1. ++myInt가 실행되서 myInt의 값이 2에서 3으로 1 증가된다. ++, -- 1씩 증감
//		2. "++myInt: " 이라는 스트링값에 + 연산자가 실행되면서 - 오른쪽값을 왼쪽에 더하라 
//		myInt의 현재 값인 3이 연결되서 결과적으로 "++myInt: 3"이라는 스트링 값이 만들어진다.
//		3. System.out.println()이 위의 2번에서 만들어진 "++myInt: 3"이라는 스트링 값을 화면에 출력한다;
		System.out.println("myInt: " + myInt);
//		후위증감연산자는 그에 반해서 가장 마지막에 실행되는 그룹에 속하게 되므로,
		System.out.println("myInt--: " + myInt--);
//		1. 위의 한줄의 코드는 풀어쓰면, "myInt--: "뒤에 myInt의 현재 값인 3이 연결되서
//		"myInt--: 3" 이라는 string값이 만들어진다.
//		2. System.out.println()dl 1번에서 만들어진 "myInt--: 3"이라는 결과값을 화면에 출력한다
//		3. myInt--가 실행되서 myInt의 값이 1을뺀 3에서 2로 나온다.
		System.out.println("myInt: "+ myInt);
		
		//번외, 당연히 String도 +=가 가능하다.
		String myString = "";
		System.out.println("myString: " + myString);
		//빈공간으로 대체?
		
		myString += "*";
		System.out.println("myString: " + myString);
		myString += "*";
		System.out.println("myString: " + myString);
		
		
	}

}
