package day01;
// 주석(Comment)
//주석이란 코드의 설명을 적는 방법으로써,
//코드 파일을 실제 실행파일로 변환하는 컴파일 이라는 단계에서 
//무시가 되는 글자들이다.
//따라서, 주석의 경우 우리가 프로그래밍적 문법을 아예지키지 않더라도
//아무런 문제가 발생하지 않는다.

//주석에는 한줄 주석과 여러줄 주석이 있는데
//한줄 주석은 //로 시작하고, 그줄이 끝나기 전까지, 즉 엔터키가 나오기 전까지의
//모든 글자를 주석으로 처리한다

//여러줄 주석은
/*
* *
* 
*/ //가 나오기 전까지의 모든 줄을 주석으로 처리한다.
public class Ex02Comment {
	public static void main(String[] args) {
		System.out.println(1);
//		System.out.println(2);
/*		System.out.println(3);
		System.out.println(4);*/
		System.out.println(5);
		
	}

}
