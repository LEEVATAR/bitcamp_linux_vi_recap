public class Ex12Operator04 {

	public static void main(String[] args) {
		//&& and
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && true: " + (false && true));
		System.out.println("false && false: " + (false && false));
		// || or
		System.out.println("true || true: " + (true || true));
		System.out.println("true || false: " + (true || false));
		System.out.println("false || true: " + (false || true));
		System.out.println("false || false: " + (false || false));
		// ! 
		// !는 해당 boolean값의 반대 값을 연산한다. 
		boolean isTrue = false;
		System.out.println("!isTrue: " + !isTrue);
//		!isTrue True가 아닌 False를 적용했으므로 True
		System.out.println("isTrue: " + isTrue);
//		isTrue자체는 왜 false지? 
//		int 변수에 저장된 값이 1부터 10사이의 숫자인지 확인하기
//		1 <= x <= 10
		int number = 4;
		System.out.println("1 <= number <= 10: " + (number >= 1 && number <= 10));
//		컴퓨터는 한줄에 이루어진 코드가 있다고 해서 동시에 계산하는 것이 아니라
//		우선순위에 따라서 한번에 한개씩 계산하므로 1 <= number <= 10은 1<=number부터 계산하여 트루펄스로 나온다
//		하지만 해당 결과값은 boolean처리이므로 10과 비교할수없기때문에 에러가발생함 그니까 위에 쓴것처럼 &&를 넣어서 해결
//		또한 프로그래밍에는 2개의 값을 비교해야하는 경우, 주로 왼쪽에 변수를 적어주게 된다.
	}

}
