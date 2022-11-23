package 코딩테스트_준비;

public class 양꼬치 {
	
	public static void main(String[] args) {
		
			/*
			윤도네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
			
			
			양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 
			정수 n과 k가 변수로 주어졌을 때, 
			양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 출력되는 로직을 구현하시오.
			 */
		  int n = 64; //양꼬치
		  int k = 6; //음료수
		  int result = 0; //지불 금액
		  
		  final int 양꼬치 = 12000;
		  final int 음료수 = 2000;
		  final int 서비스음료 = 10;
		  
		  result = (양꼬치 * n) + (음료수 * k);
		  int 서비스음료수 = n / 서비스음료;
		  int 제외가격 = 서비스음료수 * 음료수;
		  result = result - 제외가격;
		  
		  System.out.println("지불 금액 : "+result);
	}
	
}
