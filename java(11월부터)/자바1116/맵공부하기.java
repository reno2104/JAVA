package 자바1116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 맵공부하기 {

	public static void main(String[] args) {
		
		// 1.
		//Map : key와 value의 쌍으로 값을 저장하는 컬렉션즈 중에 하나
		Map<String, Integer> x = new HashMap<String, Integer>();
//		Integer : int의 클래스형태.
		
		// Map 데이터 추가. "" : key, 1 : value.
		x.put("one",1);
		x.put("two",2);
		x.put("three",3);
		
		// 데이터 가져오기. key를 이용해서 가져옴.
		System.out.println(x.get("one"));
		
		
		//2.
		//자바의 모든 클래스는 default로 Object를 상속받고 있다.
		// Object : 최상위 클래스. 모든 상수를 품을 수 있다.
		Map<String, Object> map = new HashMap<String, Object>();

		//Object는 int, String, boolean 모든 데이터를 품을 수 있다.
		map.put("empno", 7844);
		map.put("empno", "TURNER");
		map.put("job", "SALESMAN");
		map.put("sal", 1500);
		// key는 중복될 수 없다. 제일 아래에 있는 키가 실행되고 처음에 썼던 것은 지워진다.


		// 문제 1. empno, sal 출력해보기.
		
		System.out.println("사원번호:"+map.get("empno"));
		System.out.println("급여 : "+map.get("sal"));
		
		
		//list 안에 Map을 담을 수 있다.
		// Map도 class 이므로.
		List <Map<String, Object>>list = new ArrayList<Map<String, Object>>();
		list.add(map);
	}

}
