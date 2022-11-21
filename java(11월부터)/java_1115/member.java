package java_1115;

public class member {
	public String 아이디;
	public String 이름;
	public String 주소;
	public String 성별;
	
	public member() {} // 생성자 메소드 
	public member(String 아이디, String 이름, String 주소, String 성별) {
		this.성별 = 성별;
		this.아이디 = 아이디;
		this.이름 = 이름;
		this.주소 = 주소;

	}
	
	public void output() {
		System.out.println("아이디 :"+ 아이디+"이름 : "+이름+"주소 : "+주소+"성별 : "+성별);
	}
	
}
