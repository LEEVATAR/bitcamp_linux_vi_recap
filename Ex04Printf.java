public class Ex04Printf {

	public static void main(String[] args) {
		System.out.println("1. 10진법 정수('d'ecimal)");
		
		int number = 473;
		//1-A. 10진법 정수를 그대로 출력해라 
		System.out.printf("1-A. [%d]\n", number);
		//1-B. 10진법 정수를 오른쪽 정렬 5자리로 맞추어 출력해라
		System.out.printf("1-B [%5d]\n", number);
		//1-C. 10진법 정수를 오른쪽정렬 2자리로 맞추어 출력해라
		//만약 출력할 내용이 지정된 자릿수보다 많으면 자릿수 지정은 무시가된다.
		System.out.printf("1-C [%1d]\n", number);
//		//1-D. 10진법 정수를 왼쪽정렬 5자리로맞추어 출력 오른쪽 %5d, 왼쪽 %-5d
		System.out.printf("1-D [%-5d]\n", number);
		//1-E. 10진법 정수를 오른쪽정렬 5자리로 ㅏㅈ추되 왼쪽에 빈공간이 있을시 0으로 채워출력 
		System.out.printf("1-D [%05d]\n", number);
		System.out.println("2. tlftn('f'loat)");
		double d = 12.345;
//		2-A 실수를 그대로 출력해라
		System.out.printf("2-A [%f]\n", d);
//		2-B 실수를 오른쪽 정렬 10자리로 맞추어 출력해라
		System.out.printf("2-B [%10f]\n", d); //[%010f]으로하면 앞뒤에 0을채움
//		2-C 실수를 오른쪽 정렬 10자리로 맞추고 소숫점은 두번째자리까지 출력해라
		System.out.printf("2-C [%10.2f]\n", d); //[%010f]으로하면 앞뒤에 0을채움		
		System.out.println("\n---------------\n");
		System.out.println("3. 스트링('s'tring)");
		String str = "abcdEFGH";
// 		3-A String 을 그대로 출력해라		
		System.out.printf("3-A. [%s]\n", str);
		System.out.printf("3-B. [%S]\n", str);
//		3-B String을 모두 대문자로 출력해라
		System.out.printf("3-C. [%10S]\n", str);
//		3-C String을 모두 대문자로 오른쪽 정렬 10자리로 맞추어 출력해라
//		주의사항 1. 존재하지않는 %문자를 사용하면 에러가 뜸. ex. ("%v\n", 12); 
//		2. %문자와 출력할 값의 데이터타입이 다르면 에러가 발생된다. 
//		3. 우리가 필요에 따라서는 다양한 여러개의 %문자를 조합해서 쓸 수 있다. 이하 예시
		System.out.printf("%d %f %s\n", 1, 1.1, "1.2");
//		4. 만약 %문자의 갯수보다 출력할 값의 갯수가 더 많으면? > 그냥 가능한 %문자만 조합해줌 밑의경우 4, 5탈락
		System.out.printf("%d %f %s\n", 1, 1.1, "1.2", 4, 5);
//		5. 만약 %문자의 갯수보다 출력할 값의 갯수가 더 적으면?에러남
//		System.out.printf("%d %d %d %f %s\n", 1, 2); 
//		6. 만약 %문자를 뜻하는 %가 아닌 백분율의 %가 필요하다면?
		System.out.printf("성공률: %d%%\n", 99);
		
		System.out.println("\n---------------\n");
	}

}
