package cafe.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import cafe.control.event;
import cafe.control.exit;
import cafe.control.login;
import cafe.control.menu_able;
import cafe.control.order;
import cafe.control.signin;

public class cafe_main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		menu_able[] menu = {new order(), new login(), 
				new event(), new signin(), new exit()};
		
		while(menu[main_menu() -1 ].menu_active());
	}

	public static int main_menu() { // 클래스 메서드 - 클래스 메서드에서만 사용
		int select=0;
			try {
				System.out.println("1. 주문");
				System.out.println("2. 로그인");
				System.out.println("3. 이벤트");
				System.out.println("4. 회원가입");
				System.out.println("5. 종료");
				System.out.print("선택 : ");
				select = sc.nextInt();
				if(select<1 || select>5)
					throw new InputMismatchException("잘못입력했습니다.");
			}catch(Exception e) {
				System.out.println(  e.getMessage()  );
				sc.nextLine();
				select = main_menu();
			}
			return select;
	}
}

/*
 	키보드 입력 과정
 	
 	키보드 입력
 */






