package day02;
/*SCANNER!
 스캐너는 자바에서 입력을 처리해주는 대표적인 클래스이다.
 하지만, 스캐너 클래스는 우리가 모든 클래스를 실행시킬때 필수는 아니기때문에
 기본적으로 수입을 우리가 해야한다(import?)
 자바에서 기본형 데이터타입 8가지를 클래스로 포장한 "포장"클래스(wrapper class)나
 모든 자바클래스의 조상클래스인  java.lang.Object 외의 클래스를 사용할 때에는
 같은 패키지 안에 있지 않으면 반드시 수입을 해야 한다.
 외부 클래스를 수입하는 방법은
 import패키지이름.클래스이름; 을
 public class ~~~~ 위에 적어주면 된다. 
 ex: 
*/
import java.util.Scanner;
public class Ex01Scanner {

	public static void main(String[] args) {
		Scanner scanner; //S대문자 클래스 s소문자 변수
		scanner = new Scanner(System.in);
//		키보드 정수입력 받기
//		이때에는 Scanner클래스 변수의 nextInt()
		System.out.println("정수를 입력해주세요.");
//		뭘입력할지 미리 적어놔줘야함
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 정수: "+number);
		
//		2. 실수 입력 받기
//		nextDouble()을 사용하면 된다.
		System.out.println("실수를 입력해주세요.");
		double userDouble = scanner.nextDouble();
		
		System.out.println("사용자가 입력한 실수: "+ userDouble);
		
//		3. String 입력받기 
//		nextLine()으로 입력받으면 된다. 
//		단.nextLine()을 사용할 떄에는 한가지 주의할 점이 있는데
//		만약 nextLine()을 사용하기 전에 nextInt(), nextDouble()등과 같이
//		숫자를 입력을 받았으면, 반드시 nextLine()을 한번 적어서
//		버퍼메모리를 비워주어야 한다. enter = \n으로 하나의 문자야 
		System.out.println("이름을 입력해주세요.");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.println("사용자가 입력한 이름: [" + name+ "]" );
		
		//		Scanner 클래스 변수를 초기화해보자! > 어디서 데이터를 읽어올지 지정해주어야 초기화가 가능하다
//		scanner 클래스변수와 같이 어디에선가 데이터를 읽어오는 클래스 변수들은 출처에서
//		넘어오는 데이터를 곧장 읽어오는 것이 아니라 출처에서 넘어온 데이터를 버퍼 메모리 공간에
//		일단 저장하고 그 저장된 데이터를 클래스 변수가 읽어오는 형태이다.
//		따라서 더이상 읽어올 필요가 없을 때에는 버퍼 메모리와의 연결을 닫아주는 것이 좋다.

		scanner.close();
	}

}
