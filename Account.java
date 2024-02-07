package objectClass;
//은행 계좌 클라스
//클라스 설계시 : 멤버변수(개발자가 이름 줌), 생성자(클라스 이름과 동일하게 이름 부여), 메서드(개발자가 이름 줌) 필수적으로 필요
//변수는 소문자로 시작
//클라스면 대문자로 시작
//상수는 전부 대문자
//final : 수정 불가
//static : 정적 필드 => 원본 객체에서 사용 => 인스턴스 맴버 변수(인스턴스 필드) 아님
//new : 인스턴스 객체 생성
public class Account {
	//멤버 변수 (필드 = 속성) =>클라스 안에 저장된 것
	static final String BANKNAME = "신한은행";  //값을 변경하지 못하게함!!!!!!!!!!(상수 !=변수)
	String accountNo;  //계좌번호 
	String ownerName;  // 예금주 이름
	int balance;		//통장 잔액
	
	
	
	
	//생성자 : 일반 변수(인스턴스) 만들때 초기화 만드는것 => 이름을 따로 만들지 않는다
	//acc , own,, : 매개 변수
	// => 
	//빈생성자 만들기 crtl + space => account
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	
	//source -> Generate Constractor using field 
	public Account(String accountNo, String ownerName, int balance) {
		
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}



	//void : 리턴 값 없이 일만해줌
	//deposit : 메서드 이름=>개발자가 명명
	//(int amount) : ()안에 있는거 : 매개 변수 : 외부에서 값을 받을 수 있는 변수
	//예금한다 메서드 => 클라스 하는 일 = 기능
	void deposit (int amount) {
		balance+=amount;
	}
	//인출한다 매서드
	//타입있으면 리턴값 필수
	int withdraw (int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount;
		return amount;
	}
	
	
	
	
	

}
