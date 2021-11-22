
public class Student { //class이름
	//멤버변수
	int studentID; //밑줄,대소문자 가능, 멤버변수(class의 성격을 저장할 변수), 값을 초기화 할 필요x, 선언만 해줌
	String studentName; //String s가 대문자, 문자는 ' ', String은" "
	int grade; //대문자로 시작하는건 class이름밖에 없음
	String address;
	
	//생성자
	//오버로딩된 생성자
	//메서드
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name; //읽기 = 쓰기
		return;
	}
	
	//오버로딩된 메서드
	//진입점(main)
	public static void main(String argu[]) { //진입점, 운영체제에서 프로글매 호출할 목적으로 사용, Student class영역이 아님 
		//클래스명 변수명 = new 생성자()
		Student st1 = new Student(); //객체생성(=인스턴스 생성)
		st1.setStudentName("홍길동");
		
		System.out.println(st1.studentName); //멤버변수 직접 출력, 부작용 많음 사용하지 않음
		System.out.println(st1.getStudentName()); //메서드 활용해서 출력, 이 방법을 씀
	}
	
}
