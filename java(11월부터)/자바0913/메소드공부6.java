package 자바0913;

public class 메소드공부6 {

	//메소드 == 기능
	/*
	 * public static : 접근 제어자
	 * int : 리턴 타입 (리턴 타입 종류 : 데이터타입 8개와 클래스타입 1개 + void)
	 * ***void는 리턴이 없는 메소드를 의미함
	 * getSum : 메소드 이름
	 * int x, int y : 파라미터 타입 (매개변수,인자값,인수값....)
	 */
	public static int getSum(int x, int y) {
		return 0;
	}
	
	public static void print(String word) {
		System.out.println(word);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getSum(70, 30);
		//result의 예상되는 값은? 
		print("도시락");
		/*
		 * 리턴타입이 void인 메소드는 변수에 결과를 대입할 수 없다.
		 * return이 없기 때문에!!
		 * (실무 : void 쓰긴 하나 자주 쓰진 X)
		 */
	}

}
