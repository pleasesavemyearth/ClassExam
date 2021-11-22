
public class Car {
	
	/*Car class 정의 및 사용
	 차 이름, 속도를 멤버변수로 / 차 이름으로 생성가능 / 차 이름, 속도로 생성가능 / 인수(내용,매개변수) 없이 생성 가능 / 차 이름, 속도 각각 읽기/ 차 이름, 속도 각각 저장 / 차이름, 속도 동시 변경 / 
	 주어진 값으로 속도 증가 / 주어진 값으로 속도 감소 / 인수없이 생성했을 경우 기본값 저장(차이름과 속도에 대해 '자동차', 150 이렇게) / 별도의 클래스에서 객체생성하고 테스트(5개)*/
	
	String carname; //멤버변수
	int speed;
	int speedup;
	int speeddown;


	public Car(){ //매개변수 없이 생성가능? c1
		
	}
	
	public Car(String pCarname) { //이름 생성자 c2
		carname=pCarname;
	}
	
	public Car(int pSpeed) { //속도 생성자 c3
		speed=pSpeed;
	}
	
	
	public Car(String pCarname, int pSpeed) { //이름, 속도 생성자 c4
		carname=pCarname;
		speed=pSpeed;
	}
	
	public String getCarname() { //이름 추출 메소드
		return carname;
	}
	
	public int getSpeed() { //속도 추출 메소드
		return speed;
	}
	
	public void setCar(String pCarname, int pSpeed) { //이름, 속도 동시 변경 c4
		carname=pCarname;
		speed=pSpeed;
	}
	
	
	
	public void speedup(int pSpeed) { //속드증가 !!!!!!!!!!!!!!!!!!!! speedup함수를 생성한다, 정수 speed입력
		speed += pSpeed; //speed = speed + pSpeed
	}

	
	
	
	

}
	

