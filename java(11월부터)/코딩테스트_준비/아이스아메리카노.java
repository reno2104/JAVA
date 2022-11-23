package 코딩테스트_준비;

public class 아이스아메리카노 {
	
	public static void main(String[] args) {
		 
		 int money = 15000; //가지고 있는 돈
		 int 잔수 = 0;
		 int 남은돈 = 0;
		 final int AMERICANO = 5500;
		 
		 잔수 = money / AMERICANO;
		 System.out.println("잔수 : "+ 잔수);
		 남은돈 = money % AMERICANO;
		 System.out.println("남은돈 : "+ 남은돈);
		 
	}
}