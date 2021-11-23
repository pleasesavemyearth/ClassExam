
public class Animal {
	
	String name;
	int size;
	int speed;

	
	public Animal() { //디폴트생성자 중요중요중요중요중요
		name = "동물"; 
		size = 30; 
		speed = 0; 
	}
	
	public Animal(String pName) { //동물이름 생성자, 크기와 속도 디폴트 설정 어떻게? 위에처럼
		name = pName;
		size = 30; //사이즈랑 크기 넣는다
		speed = 0; 
	}
	
	public Animal(String pName, int pSize) { //동물이름, 크기 생성자
		name = pName;
		size = pSize;
		speed = 0; //이것도 넣는다
	}
	

	
	//메소드, set-void 쓰기 / get-타입 읽기
	public void setName(String pName) {
		name = pName;
	}
	public void setSize(int pSize) {
		size = pSize;
	}
	public void setSpeed(int pSpeed) {
		speed = pSpeed;
	}
	
	
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	public int getSpeed() {
		return speed;
	}
	
	
	//달리는 속도 증가(기본증가10, 주어진값증가) : 0~100사이만 가능
	public void speedUp() { 
		if (speed + 10 > 100) { //현재 속도에 추가될 속도를 덧셈해서 100이 넘는지 확인하는 과정
			speed = 100;
		} else {
			speed += 10;
		}
	}
	
	public void speedUp(int pSpeed) {
		if (speed + pSpeed > 100) { //현재 속도에 추가될 속도를 덧셈해서 100이 넘는지 확인하는 과정
			speed = 100;
		} else {
			speed += pSpeed;
		}
	}
	
	public void speedDown() {
		if (speed - 10 < 0) {
			speed = 0;
		} else {
			speed -= 10;
		}
	}
	
	public void speedDown(int pSpeed) {
		if (speed - pSpeed < 0) {
			speed = 0;
		} else {
			speed -= pSpeed;
		}
	}
	

}
