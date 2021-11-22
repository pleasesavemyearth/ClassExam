
public class Person {
	String name; //멤버변수
	int height;
	int weight;
	
	//생성자가 1개도 없을 경우 default 생성자가 존재한다
	
	/*생성자 작성 규칙
	  클래스명과 동일, 변환타입이 없음(문법자체가 없음), 명시적으로 default생성자 필요 */
	public Person() {
		
	}//이런 빈 껍데기를 만들어줌
	
	//오버로딩된 생성자
	public Person(String pName) { //생성자 이름이 동일, 매개변수 다름(갯수, 타입, 순서)
		name = pName; //사람 이름을 매개변수로 입력받아서 person클래스를 생성하는 생성자------이거 hu2
	}
	
	//오버로딩된 생성자
	public Person(String pName, int pHeight, int pWeight) { //이름, 키, 몸무게를 매개변수로 입력받는 생성자---hu3
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
	//생성자니까 타입이 없는거지 여기서부터 일반적인 메소드이다
	public String getName() {
		return name;
	}
	
	
	//키와 몸무게를 각각 추출할 수 있는 메소드 추가
	public int getHeight() { //추출은 get 읽기
		return height;
	}
	public int getWeight() {
		return weight;
	}
	
	
	//성명, 키, 몸무게를 변경할 수 있는 메소드 추가 
	public void setPerson(String pName, int pHeight, int pWeight) { //변경은 set 쓰기
		name = pName;
		height = pHeight;
		weight = pWeight;
		return; // 제어 반환 그러나 값은 없다
	}
	
	
	/*Car class 정의 및 사용
	 차 이름, 속도를 멤버변수로 / 차 이름으로 생성가능 / 차 이름, 속도로 생성가능 / 인수(내용) 없이 생성 가능 / 차 이름, 속도 각각 읽기/ 차 이름, 속도 각각 저장 / 차이름, 속도 동시 변경 / 
	 주어진 값으로 속도 증가 / 주어진 값으로 속도 감소 / 인수없이 생성했을 경우 기본값 저장(차이름과 속도에 대해 '자동차', 150 이렇게) / 별도의 클래스에서 객체생성하고 테스트(5개)*/
	
	
	
}
