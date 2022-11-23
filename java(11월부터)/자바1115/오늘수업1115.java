package 자바1115;

//java.util 패키지 안에 들어있는 ArrayList라는 클래스를 사용하려면 import(불러오다) 해야 함. 
import java.util.ArrayList;
import java.util.List;

class Student{
	//필드변수(전역변수)
	String name;
	int height;
	
	//문제1. 필드변수에 값을 초기화할 수 있는 생성자 만들기
	
	//***생성자란? 리턴타입이없는 메소드, 메소드이름이 정해져 있음(클래스이름 같아야)
	Student(String name, int height){
		this.name = name;
		this.height = height;
	}
	
}

public class 오늘수업1115 {
	
	public static void main(String[] args) {
		
		//문제2. 학생 클래스 3개 만들어서 아래 값 출력하기
		//이름 : 홍길동, 키 : 179
		//이름 : 김길동, 키 : 185
		//이름 : 이길동, 키 : 172
		Student s = new Student("홍길동", 179);
		Student s2 = new Student("영주", 885);
		Student s3 = new Student("이길동", 172);
		
		//문제3. 학생클래스 ArrayList에 add하기
		List<Student> list = new ArrayList<Student>();
		list.add(s);
		list.add(s2);
		list.add(s3);
		
		//for문으로 학생 출력
		//일반 for문으로 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println("이름 : "+list.get(i).name + ", 키 : "+list.get(i).height);
		}
		System.out.println("==========================================================");
		//향상된 for문(for-each)으로 출력
		for(Student student : list) {
			System.out.println("이름 : "+student.name + ", 키 : "+student.height);
		}
		
		
	}
}
