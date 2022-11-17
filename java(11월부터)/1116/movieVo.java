package move;

import java.io.BufferedReader;

public class moveVo {
	String title;
	int year;
	int age;
	
	
	public moveVo() {}
	public moveVo(String title, int year, int age) { // 오버로딩으로 추가 된것
		// 초기화 시켜주는 작업
		this.title = title;
		this.year = year;
		this.age = age;
	}
	public void out() {
		System.out.println(title+year+age);
	}
}


/*
 * 영화제목, 개봉년도, 관람등급
 * 
 * 생성자 메서드를 통해 데이터 저장 가능하게 만들기
 * 출력 메서드 (제목,년도,등급 출력되어야함)
 */
