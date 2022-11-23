package 자바1116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 맵공부하기 {

	public static void main(String[] args) {
		
		//Map : key와 value의 쌍으로 값을 저장하는 컬렉션즈 중에 하나
		Map<String, Integer> x = new HashMap<String, Integer>();
		
		//Map 데이터 추가
		x.put("one", 1);
		x.put("two", 2);
		x.put("three", 3);
	
		//데이터 가져오기 key를 이용해서 가져옴
		System.out.println(x.get("one"));
		
		
		//자바의 모든 클래스는 디폴트로 Object를 상속 받고 있다.
		Map<String, Object> map = new HashMap<String, Object>();
		
		//Object는 int, String, boolean 모든 데이터 타입을 받을 수 있다.
		map.put("empno", 7844);
		map.put("ename", "TURNER");
		map.put("job", "SALESMAN");
		map.put("sal", 1500);
		map.put("empno", 7839); //key는 중복될 수 없다.
		
		//문제1. empno하고 sal을 출력해보기
		System.out.println("사원번호 : "+ map.get("empno"));
		System.out.println("급여 : "+map.get("sal"));
		
		
		//List안에 Map을 담을 수 있다.
		//Why? Map도 클래스니깐
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(map);
		
		
		
	}
	
	
}