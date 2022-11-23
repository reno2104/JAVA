package 자바0913;

public class 메소드공부4 {

	/*
	 * public static : 접근 제어자
	 * int : 리턴 타입
	 * getSum : 메소드(혹은 함수) 이름
	 * int x : 파라미터 타입(혹은 매개변수)
	*/
	public static int getSum(int x) {
		return x;
	}
	/*
	 * public static : 접근 제어자
	 * String : 리턴 타입
	 * getWord : 메소드(혹은 함수) 이름
	 * String x : 파라미터 타입(혹은 매개변수)
	*/
	public static String getWord(String x) {
		return x;
	}
	
	/*
	 * public static : 접근 제어자
	 * boolean : 리턴 타입
	 * isTrue: 메소드 이름
	 * 파라미터 값 없음
	 */
	public static boolean isTrue() {
		return true;
	}
	
	/*
	 * public static : 접근 제어자
	 * int : 리턴 타입
	 * getSum : 메소드 이름
	 * int x, int y : 파라미터 타입(매개 변수)
	 */
	public static int getSum(int x, int y) {
		return 10;
	}
	
	
	public static int getCount(int startNum, int endNum) {
		//문제 1. startNum이 endNum보다 크면 startNum을 리턴
		// endNum이 startNum보다 크면 endNum을 리턴하는 로직을 구현하시오.
		if(startNum > endNum) return startNum;
		if(startNum < endNum) return endNum;
		return 0;
	}
	
	public static int 일부터십까지합구하기() {
		//1 ~ 10 까지 합을 구하는 로직을 구현 후 합을 리턴하시오!
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int 짝수개수구하기() {
		//문제2. 1부터 20까지 짝수 개수를 구하고 개수를 리턴하시오.
		int count = 0;
		for(int i=1; i<=20; i++) {
			if(i%2 == 0) ++count;
		}
		return count;
	}
	
	/*
	 * 문제 3.
	 * 1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수(n)가 1이 될 때까지 다음 작업을 반복하면, 
	 * 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
	 * 1-1. 입력된 수가 짝수라면 2로 나눕니다. 
	   1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
	   2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
	   주어진 수(n)가 6이라면 
	   6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다. 
	   위 작업을 몇 번이나 반복해야 하는지 리턴하는 메소드 solution을 완성해 주세요. 
	   단, 주어진 수(n)가 1인 경우에는 0을, 
	   작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 리턴해주세요.
	   HINT) While문 사용 */
	public static int solution(int n) {
	    //1비트에 표한할 수 있는 수가 8자리
		int answer = 0; //int 4byte (1 byte == 8 bit)
		long x = n; //long 8byte
		if(x == 1) return answer;
		while(x != 1) {
			if(n%2 == 0) { //입력된 수가 짝수라면
				x = x / 2;
				++answer;
			}else { //입력된 수가 홀수라면
				x = (x * 3) + 1;
				++answer;
			}
			if(answer > 500) return -1;
		}
		return answer;
	}
	
	/*
	 * 메소드 사용하는 이유
	 * 1. 업무 분담
	 * 2. 유지보수 편리성
	 */	
	public static void main(String[] args) {
		//1. 1~10 까지 합
		//2. 10까지 짝수 구하시오
		getCount(10,1); //메소드 불러오다.(메소드 호출)
		int result = solution(6);
		System.out.println(result);
	}
	
}