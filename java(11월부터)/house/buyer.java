package house;

import java.util.ArrayList;
import java.util.List;

public class buyer {
 private int money = 100000;
 private String name = "임성민"; // 명시적 초기화
 private String special_note = "가장";
 private List<house_item> buy_list = null; // 구매한 제품 목록으로 저장.

 { // 인트턴스 초기화 블럭
	 special_note = "잠이 필요";
	 
 }
 
 public buyer() {
	 buy_list = new ArrayList<>();
	 special_note = "곧 잠이 쏟아질 것임";
 }
 
 public void buy(house_item item) { //매개뱐수 다형성
	 if(money < item.price) {
		 System.out.println("돈이 부족합니다. 잠일 더 줄이고 돈을 벌어오세요.");
		 return;
	 }
	 buy_list.add(item);
	 money -= item.price;
	 DecimalFormat df = new DecimalFormat('###,###'); //원단위 콤마방식 설정.
	 System.out.println("현재 잔액 : "+money+"원");

	 // 천원 안뒤 콤마, DecimalFormat, 정규식 사용.
	 // Integer.ToString(money).replaceAll()"//B(?=>//d{3})+(?!//d))",",");

 }
 public void buylist() {
	 for(house_item item : buy_list) {
		 System.out.println(item.toString( ));
	 }
 }
 

 
	/*
	 * // 다형성으로 클래스 구성을 만들지 않았다면 public void buy(tv t) {
	 * 
	 * } public void buy(aircon air) {
	 * 
	 * } public void buy(computer com) {
	 * 
	 * }
	 */
}
