public class Ex08TypeCasting {

	public static void main(String[] args) {
		// 암시적 형변환
		// byte 데이터타입의 변수 myByte 선언하고 5로 초기화해보자.
		byte myByte = 5; //0000 0101
		//int 데이터타입의 변수 myInt를 선언하고 myByte의 현재값으로 초기화해보자
		int myInt = myByte; //0000 0000 0000 0000 0000 0000 0000 0101
		// double 데이터타입의 변수 myDouble을 선언하고 myInt의 현재값으로 초기화해보자
		double myDouble = myInt;
		//myByte, myInt, myDouble 현재값을 출력해보자
		System.out.println(myByte); // 2진법기준으론 비트수가 다르므로 다른 숫자라고 인식한다 
		System.out.println(myInt);	// 5, 5 로 같아보인다.
		System.out.println(myDouble);
		
//		명시적 형변환
		// myByte에 myInt의 현재 값을 저장해보자
		myByte = (byte)myInt;
		//값이크므로 줄이는 절차를 밟아야 실행됨
		//myInt에 myDouble의 현재 값을 저장해보자 
		myInt = (int)myDouble; 
		//int 는 정수, float 는 실수
	}

}
