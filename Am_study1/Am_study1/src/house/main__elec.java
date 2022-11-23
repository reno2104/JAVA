package house;

import java.util.List;
import java.util.Scanner;

public class main__elec {

	static List<house_item> list =null;
	
	public static void init(){
		file f= new file("c:/test/electronic.txt");
		
		list = f.load();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		init();
		buyer jyj = new buyer();
		
		//for( house_item item : list)
		//	System.out.println( item.toString()  );
		
		//  1.tv 2.에어컨 3.컴퓨터  라는 선택할수 있는 메뉴를 띄우고
		//    3개 중에서 하나 선택하면  해당 제품들만 출력되게 만들기
		
		while(true) {
			System.out.println("1.TV  2.에어컨  3.컴퓨터 : ");
			int select= sc.nextInt();
			
			int i=1;
			for( house_item item : list) {
				switch(select) {
				case 1:
					if( item instanceof tv)
						System.out.println(i+". "+ item.toString() );
					break;
				case 2:
					if( item instanceof aircon)
						System.out.println(i+". "+  item.toString() );
					break;
				case 3:
					if( item instanceof computer)
						System.out.println(i+". "+  item.toString() );
					break;
				}
				i++;
			}
			
			boolean flag = false;  // 구매 제품이 선택한 제품 종류 와 일치하는가? 
			do {
				flag=false;
				System.out.print("구매 할 제품 선택(구매X : 0) : ");
				int item_num = sc.nextInt();
				if(item_num==0) continue;
				else {
					switch(select) {// 구매 제품이 선택한 제품 종류 와 일치하는가? 
					case 1:
						if( !(list.get(item_num-1) instanceof tv))
							flag=true;
						break;
					case 2:
						if( !(list.get(item_num-1) instanceof aircon))
							flag=true;
						break;
					case 3:
						if( !(list.get(item_num-1) instanceof computer))
							flag=true;
						break;
					}
					if(flag)continue; // 구매제품이 선택한 제품종류와 맞지 않다면 다시 처음부터
					jyj.buy( list.get(item_num-1) );
				}
			}while(flag);
			
			System.out.println("추가 구매?(0,1)  : ");
			int end = sc.nextInt();
			if(end==0 ) break;
			// 1. TV 제품 구매하는데  제품번호가 TV가아니면 다시선택하게 만들기
			// 2. 제품 구매후에  추가로 구매할것인지 의사를 물어보고  계속 구매 ,구매 중지 하기 만들기
			// 3.  구매를 더이상 하지않는다면  지금까지 구매한 제품들 모두 출력 하기
		}// 제품구매 반복문
		
		jyj.buylist();
			
	}

}


//  static 메서드에서 사용가능 한것
//      -> static메서드, static 변수
//
//  instance(인스턴스) 메서드에서 사용가능 한것
//      -> 인스턴스메서드, 인스턴스변수, static변수, static 메서드

//  실체화 하여 실행 할 것인가,  실체화 하지않고 호출할것인가?
//  아파트를 건설 하기 위해 설계도를 작성한다.  - > 클래스 구현
//  아파트를 분양하기 위해 모델하우스를 짓는다.  -> static은 클래스 객체생성 하지않아도 사용가능
//  설계도를 보고  아파트를 짓는다.  ->  인스턴스는 클래스 객체생성 해야 사용가능

//  인스턴스 메서드는 인스턴스가 생성 되어야호출이 가능하다.
//  그렇게  호출되도록 코드로 구별을해주었고  그렇게 동작하도록 자바 머신에서 인식 하기 때문에
//  jvm - 자바가상머신




