
public class Ex1119_1 {

	public static void main(String[] args) {
		// Student 클래스 테스트
		Student st1 = new Student();  //객체 생성
		st1.setStudentName("김삿갓");
		System.out.println(st1.getStudentName()); //get으로 바로 출력
		
		Student st2 = new Student();
		st2.setStudentName("이도령"); 
		System.out.println(st2.getStudentName());
		
		
	}

}
