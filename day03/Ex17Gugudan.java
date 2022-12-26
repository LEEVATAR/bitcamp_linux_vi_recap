package day03;
//2단부터 9단까지 출력하기
public class Ex17Gugudan {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println(i+"단");
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d X %d = %d\n", i, j, i*j);
            }
            System.out.println("-=-=-=-=-=-=-=-=-=-\n");
        }
    }
}
