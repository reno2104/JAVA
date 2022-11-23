package 자바0927;

public class Home3 {
	
	public static void main(String[] args) {
		
		영화관 a영화관 = new 영화관();
		a영화관.set직원수(20);
		int 직원수 = a영화관.get직원수();
		System.out.println("직원 수 : "+직원수);
	}
}