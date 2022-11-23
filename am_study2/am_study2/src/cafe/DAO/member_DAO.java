package cafe.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class member_DAO {
	private Connection conn=null; // 데이터베이스 연결정보를 저장
	private Statement st=null; //SQL 질이문을 데이터베이스에 전달. 보안에 취약.
	private PreparedStatement pr=null; // sQL 질이문을 데이터베이스에 전달. 정부의 권장방식.
	private ResultSet rs=null; // SQL 질의문 조회결과를 저장
	
	public member_DAO() { // 기본생정자 메소드
		DriverLoad();
		connect();
		table_check();
	}
	
	public boolean member_insert(String id, String name, String tel, String email) {
		String sql = "insert into member(id, name, tel, email) values(?,?,?,?)";
	}
	try {
		
		pt = conn.prepareStatement(sql);
		pt.setSring(1, sql);
		pt.setSring(2, name);
		pt.setSring(3, tel);
		pt.setSring(4, email);
		pt.executeUpdate(); // query - select, 조회   / update - 변경, 추가, 삭제
		return true;
		
		
	}catch(SQLException e) {
		
	}
	return false;
}
	
	private void tablemake() {
	
		String sql = "Create table member(member_seq int auto_increment primary key , "
				+"id vachar(50) now null, name vachar(20) not null, "
				+"tel vachar(20) noe null, email vachar(255) not null)";
	}
	
	try{
		st = conn.createStatement();
		int result = st.executeUpdate(sql);
		System.out.println("member 테이블 생성");
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	private void table_check() {
		String sql="select COUNT(*) as cnt from information_schema.tables"; 
		sql+="where table_schma='reno' and table_name ='member'"; // sql문 생성.
		
		
		try {
		st = conn.createStatement(); // 접속정보로 질의문 저장할 수 있는 객체 생성.
		rs = st.executeQuery(sql); // 만들어놓은 질의문을 저장해서 연결되 데이터베이스에 전달하고 결과받기.
		if(rs.next()) { // re.next() : rs에 결과값이 있는가? 없는가? 확인.
			int cnt = rs.getInt("cnt");
			if(cnt == 0) 
				tablemake();
			
		}
		rs.close();
		st.close();

		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void connect() {
		//DB주소 : jdbc:mysql://데이터베이스서버주소:mysql-port/DB명
		String url="jdbc:mysql://localhost:3306/reno";
		String user="reno"; // mysql 계정명
		String pass = "1234"; // mysql 계정 비번
		conn = DriverManager.GetConnection(url,user,pass);
	}catch(Excetion e) {
		e.printStackTrace();
		System.out.println("접속 실패");
	}
	private void DriverLoad() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");		// 문자열을 클래스화 해준다.
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		}
	
	//	Class.forName("cafe.control.order");
		
		 // 드라이버 로드라는 작업은 해당데이터베이스와 연결해주는 클래스를 컴퓨터 메모리에 로드(적재, 올린다.) 해주는 작업이다.

	}
}

/*
 * 자바 - 데이터베이스 연결
 * 
 * 1. 연결할 데이터베이스의 드라이버 로드 - 많이 사용되는 데이터베이스의 드라이버는 해당 데이터베이스 웹사이트에서 얻을 수 있다.
 * 
 * 2. 드라이버 로드를 하면 데이터베이스와 자바프로그램간의 연결이 이루어진다.
 * 
 * 3. 데이터베이스와 연결을 하였다면 데이터베이스에 로그인을 시도한다.
 * 
 * 4. 데이터베이스와 계정을 가지고 로그인을 해야한다.
 * 
 * 5. 데이터베이스 주소와 계정명, 비밀번호가 필요하다.
