public class Ex03Print {

	public static void main(String[] args) {
//	1.print()
//	print()는 괄호 안의 내용을 출력한다.
//	만약 다음 출력할 내용이 있으면 출력된내용 오른쪽칸부터 출력이 시작된다. 이어서 나온다는 뜻이다
		System.out.print("abc");
		System.out.print("DEF"); //결과값은 abcDEF의 한줄이다
//	2.println()
//	println은 "print a line"의 줄임말로써 한줄을 출력하라는뜻이다.
//	괄호안의 내용을 출력하고 다음출력위치를 다음줄! 의 첫칸!으로 이동시킨다.	
//		
		
		System.out.println("Abc");
		System.out.println("dEF");
//		abcDEFAbc 현재까지의 결과값
//		dEF
//	3.printf()
//	printf는 "print in format"의 줄임말로써 괄호안의 내용을 
//	지정된 형식에 맞추어 출력하고 다음출력위치는 출력된 내용 오른쪽칸이 된다.
//	
		System.out.printf("%d", 3);
		System.out.printf("%s", "DEF");
//	4. 이스케이프 문자
//	이스케이프문자란 \와 조합되서 특수한문장기호나 문자를 나타내는 값이다.
//	비록 적을때는 \와 조합되서 두글자로 낭지만 실제론 한개의 문자로 취급이 된다.
//	4-A \n 은 개행문자도 하며 강제로 줄을 바꾸는 문자이다. "\n *** \n" 처럼 따옴표 안에 넣어야한다
		System.out.print("\nabc\n");
		System.out.print("DEF\n");
//	4-B \t
//	\t는 탭 공백으로써, 스페이스 1개보다 큰 공백을 뜻한다
		System.out.println("abc\tDEF");
//	4-C. \'
//	\'은 char값의 시작과 끝을 알리는 뜻의 따옴표가 아닌 문장부호로써의 따옴표문자 그자체를 뜻한다.
//	잘안쓴다.. "'" = '\''이므로 "\"는 많이쓴다. String값의 시작과 끝을 알리는 뜻의 쌍따옴표x
//	문장부호로써의 쌍따옴표문자 그자체를 뜻한다.
		System.out.println('\'');
		System.out.println("\"오늘 할일을 내일로 미루지마\"");
//  4-D. \\자체
		System.out.println("\\>ㅁ</");
	}

}
