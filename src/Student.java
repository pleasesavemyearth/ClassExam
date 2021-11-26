
public class Student { //class이름
	//멤버변수
	private static int serialNum = 1000; // 인스턴스(객체)생성과 무관함, static변수는 초기화를 시켜야 함
	public int studentId; //밑줄,대소문자 가능, 멤버변수(class의 성격을 저장할 변수), 값을 초기화 할 필요x, 선언만 해줌
	public String studentName; //String s가 대문자, 문자는 ' ', String은" "
	public int grade; //대문자로 시작하는건 class이름밖에 없음
	public String address;
	
	// 생성자!!!
	public Student() {
		serialNum++; // 클래스 공통
		studentId = serialNum; // 증가되기 전 값 증가
 	}
	
	// 오버로딩된 생성자!!!
	public Student(String studentName, int grade) {
		this.studentName = studentName;
		this.grade = grade;
	}
	
	// 메서드 !!!
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName; //읽기 = 쓰기 , studentName = studentName쓰면 오류나니까 왼쪽거 this붙인다
		//set에 return안씀
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void showStudentInfo() {
		System.out.println("이름 : " + getStudentName() + " , " + getGrade() + "학년");
	}

	
	
	
	public static int getSerialNum() {
		int i = 10; // static이라도 지역변수 사용가능 / 이 안에서 사용한 지역변수, static으로 지정한 변수만 사용 가능
		//this.studentName = "김김찬";
		return serialNum;
	}
	
	//오버로딩된 메서드
	//진입점(main)
	/*
	public static void main(String[] argu) { //진입점, 운영체제에서 프로글매 호출할 목적으로 사용, Student class영역이 아님 
		//클래스명 변수명 = new 생성자()
		Student st1 = new Student(); //객체생성(=인스턴스 생성)
	}
	*/
	
	
	
	
	
	
}
