
public class StudentTest1 {

	public static void main(String[] args) {
		// Student class test
		System.out.println(Student.getSerialNum()); // 객체생성과 무관 
		
		
		Student st1 = new Student(); // default 생성자
		st1.setStudentName("홍길동");
		//System.out.println(st1.studentName); // 직접 접근, public 멤버변수이므로 가능
		//System.out.println(st1.getStudentName()); // get으로 접근, public 메소드이므로 가능
		//st1.serialNum++; //static공통으로 쓰기 대문에 st1, st2 둘다 +1값으로 반영된다
		
		System.out.println(Student.getSerialNum()); // static 변수 읽기
		System.out.println(st1.getStudentName() + " : " + st1.studentId);
		
		Student st2 = new Student();
		st2.setStudentName("김삿갓");
		System.out.println(Student.getSerialNum()); //st2 생성시 증가했으므로 증가됨
		System.out.println(st2.getStudentName() + " : " + st2.studentId);
		
		
		
	}

}
