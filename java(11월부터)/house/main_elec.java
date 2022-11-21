package house;

public static void main(String[] args) {
	Scanner sc = new Scanner(system.in);
	init();
	buyer_lsm =new;
}
public class main_elec {
	while(true) {
		System.out.println("1. tv 2. 에어컨 3. 컴퓨터 : ");
		int select = sc.nextInt();
		
		int i=1;
		for(house_item item: list) {
			switch(select) {
			case 1: 
				if ( item instanceof tv)
					System.out.println( i+ ". "+ item. toString() );
				break;
			case 2: 
				if ( item instanceof aircon)
					System.out.println( i+ ". "+ item. toString() );
				break;
			case 3: 
				if ( item instanceof computer)
					System.out.println( i+ ". "+ item. toString() );
				break;

			}
			i++;
		}
		boolean flag = flag;  //구매 제품이 선택한 제품 종류와 일치하는가?
		do {
	System.out.println("구매할 제품 선택(구매 X :0)  : ");
		int item_num = sc.nextIntt();
		if(item_num==0) continue;
		else {
			switch(select) {
			case 1:
				if(list.get(item_num-1) instanceof tv)
				flag=true;
				break;
			case 2:
				if(list.get(item_num-1) instanceof aircon)
					flag=true;
				break;
			case 3:
				if(list.get(item_num-1) instanceof computer)
					flag=true;
				break;

			}
			if(flag)continue;
			lsm.buy(list.get(item_num-1) );
			} 

		}while(flag);
		
		System.out.println("추가 구매? (0,1) : ");
		int end =sc.nextInt();
		if(end==0) break;
		// 제품구매 반복문//
	}
	
	}	
	// 1. TV 제품 구매하는데 제품번호가 TV가 아니면 다시선택하게 만들기.
	// 2. 제품 구매 후에 추가로 구매할 것인지 의사를 물어보고 계속 구매, 구매 중지 만들기.
	// 3. 구매를 더이상 하지 않는다면 지금까지 구매한 제품들 모두 출력하기.
	lsm.buylist();
}
