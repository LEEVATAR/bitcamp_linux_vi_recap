package day03;
/*중첩 for문
가장 큰 특징은 한번 실행될때마다 for문전체횟수가 반복이된다는 점이다.

*/
public class Ex16NestedFor {
    public static void main(String[] args) {
        for(int i = 1; i <=3; i++) {//i는 1인데 i가 3보다 작거나 같을때 i에 i를 더해준다가 인정되는동안
            System.out.print("i의 현재값: " + i);
            for(int j = 101; j<= 104; j++){ //이 식으로 와서 실행해줌 위식1->101, 102, 103, 104 다시 위식3까지 반복
                System.out.println(", j의 현재값: " + j);
            }
        }
    }
}
