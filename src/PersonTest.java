
public class PersonTest {

	public static void main(String[] args) {
		// Person class test
		Person hu1 = new Person(); /*default 생성자, 정의안했지만 에러가 없다 그러나 오버로딩된 생성자가 하나이상 존재하면 default생성자도 구현해줘야 함
								     빈 껍데기라도 하나 만들어야 에러가 없다*/
		Person hu2 = new Person("홍길동"); //매개변수 1개 생성자
		System.out.println(hu2.getName());
		
		//추가된 메소드 기능 테스트
		Person hu3 = new Person("김삿갓", 170, 70); //숫자는 그냥들어감, 설계가 3개되있으므로 3개를 넣어야 함
		System.out.println("성명 : " + hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight()); 
		
		hu3.setPerson("김삿갓", 160, 80); //성명, 키, 몸무게 변경 즉, set
		System.out.println("성명 : " + hu3.getName() + ", 키 : " + hu3.getHeight() + ", 몸무게 : " + hu3.getWeight()); 
		
		hu1.setPerson("이도령", 150, 50); //h1의 비어있는 상태에서 수정작업을 함, 즉 객체 수정
		System.out.println("성명 : " + hu1.getName() + ", 키 : " + hu1.getHeight() + ", 몸무게 : " + hu1.getWeight()); 
		
		
	}

}
