package 코딩테스트_준비;

public class 문제1 {
	
//	1. 민정이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 
//	민정이가 가지고 있는 돈 money가 변수로 주어질 때, 
//	민정이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 출력하는 로직을 구현하시오.
	
	
	public static void main(String[] args) {
		

	int money = 15000;
	int 잔수 = 0;
	int 남은돈 = 0;
	
	final int AMERICANO = 5500;
	
	잔수 = money / AMERICANO;
	System.out.println("잔수 : "+잔수);
	남은돈 = money % AMERICANO;
	System.out.println("남은 돈 : "+남은돈);
	}
}
