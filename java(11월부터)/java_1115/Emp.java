package java_1115;

import java.util.ArrayList;
import java.util.List;

public class Emp {
	String ename;
	int sal;
	String job;
	
	
	// 필드변수를 초기화 할 수 있는 생성자 생성
	public Emp(String ename, int sal, String job){
		this.ename = ename;
		this.sal = sal;
		this.job = job;
		
//		
//		//오버로딩은 매개변수가 우선이다. 매개변수를 꼭넣어야 함.
//		void 볶음밥을먹다() {
//			
//		}
//		
//		// 오버로딩 : 메소드이름은 같으나 매개변수 다르게 혹은 리턴타입 다르게.
//		// 오버로딩으로 생성된 메소드.
//		void 볶음밥을먹다(String 재료) {
//		
//		}
//		
		//오버라이딩 : 부모클래스 메소드를 재정의.
		
        Emp sawon1 = new Emp("SMITH",160,"CLERK");
		Emp sawon2 = new Emp("ALLEN",1600,"SALESMAN");
		Emp sawon3 = new Emp("WARD",1250,"SALESMAN");
		Emp sawon4 = new Emp("JONES",2975,"MANAGER");
		Emp sawon5 = new Emp("MARTIN",1250,"SALESMAN");
		Emp sawon6 = new Emp("BLAKE",2850,"MANAGER");
		Emp sawon7 = new Emp("CLARK",2450,"MANAGER");
		Emp sawon8 = new Emp("SCOTT",3000,"ANALYST");
		Emp sawon9 = new Emp("KING",5000,"PRESIDENT");
		Emp sawon10 = new Emp("TURNER",1500,"SALESMAN");

		//문제1. arrayList을 생성 후 sawon1 ~ sawon10 add하기!
		List <Emp> list = new ArrayList<Emp>();
		list.add(sawon1);
		list.add(sawon2);
		list.add(sawon3);
		list.add(sawon4);
		list.add(sawon5);
		list.add(sawon6);
		list.add(sawon7);
		list.add(sawon8);
		list.add(sawon9);
		list.add(sawon10);

		//문제2. 직원 총 급여 구하기
		

		
		//문제3. 직원 평균 급여 구하기
		

		//문제4. 직업이 MANAGER고 급여가 2500이상받는 사원 수 구하기

		int count=0;
		for(int i=0; i < list.size(); i++) {
			String job =list.get(i).job;
			int sal = list.get(i).sal;
			
			if(job.equals("MANAGER")&& sal >= 2500) {
				++count;
			}
		}
		System.out.println("직업이 MANAGER고 급여가 2500이상받는 사원 수 : "+count) ;
		//문제5. 가장 급여를 많이 받는 사원의 이름과 직업 조회하기

		
	}
	
}
