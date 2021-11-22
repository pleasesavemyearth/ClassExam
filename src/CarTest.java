
public class CarTest {
	
	public static void main(String[] args) {
	Car c1 = new Car(); //default 생성자, 매개변수 없이 생성가능?
	
	Car c2 = new Car("소나타"); //차 이름으로 생성 , 두개짜리 설계해놓고 계속 테스트 중이였음..설계도에 맞는 갯수위 값대로 실행되는 것을 주의
	System.out.println("차 이름 : " + c2.getCarname());
	
	Car c3 = new Car(100); // 속도로 생성
	System.out.println("속도 : " + c3.getSpeed());
	
	Car c4 = new Car("아반테", 40); //차 이름, 속도로 생성
	System.out.println("생성 - 차 이름 : " + c4.getCarname() + " , 속도 : " + c4.getSpeed());
	
	c4.setCar("모닝", 10); //차 이름, 속도 변경
	System.out.println("변경 - 차 이름 : " + c4.getCarname() + " , 속도 : " + c4.getSpeed());
	
	c1.setCar("자동차", 150); //인수 없이 생성 했을경우 기본값 저장 ('자동차', 150)
	System.out.println("기본값 - 차 이름 : " + c1.getCarname() + " , 속도 : " + c1.getSpeed());
	
	/* c4.setCar(12); //속도증가시키기
	System.out.println("증가한 속도 : " + c4.getSpeed()+c5.getSpeedup()); //현재 속도+증가시킬 속도 */
	
	
	
	
	c3.speedup(10);
	System.out.println(c3.getSpeed()); //속도증가!!!!!!!!!!!!! 현재 저장된값이 100 거기에 10을 주니까 110이 된다
	
	
	
	}
}
