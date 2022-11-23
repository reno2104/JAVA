package 자바0913;

public class While문 {

	public static void main(String[] args) {
		//while문은 for문처럼 반복문 중 하나.
		//for문에 비하면 사용빈도는 낮으나 아주 가끔?! 사용함.
		//while문은 for문처럼 조건없이 계속 실행 됨.
		int count = 0;
		while(true) {
			++count;
			System.out.println("안녕?");
			if(count == 20) {
				break; //while문 멈추기
			}
		}
		//문제 while문을 이용해서 1~10까지 합을 구하시오. 정답) 55
		int sum = 0;
		int i = 0;
		while(true) {
			++i;
			sum = sum + i;
			System.out.println("sum => "+ sum);
			if(sum == 55) {
				System.out.println("그만 멈춰~~~!");
				break;
			}
		}
		
		
	}
}
