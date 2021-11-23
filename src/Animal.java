
public class Animal {
	
	String name;
	int size;
	int speed;

	
	public Animal() { //����Ʈ������ �߿��߿��߿��߿��߿�
		name = "����"; 
		size = 30; 
		speed = 0; 
	}
	
	public Animal(String pName) { //�����̸� ������, ũ��� �ӵ� ����Ʈ ���� ���? ����ó��
		name = pName;
		size = 30; //������� ũ�� �ִ´�
		speed = 0; 
	}
	
	public Animal(String pName, int pSize) { //�����̸�, ũ�� ������
		name = pName;
		size = pSize;
		speed = 0; //�̰͵� �ִ´�
	}
	

	
	//�޼ҵ�, set-void ���� / get-Ÿ�� �б�
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
	
	
	//�޸��� �ӵ� ����(�⺻����10, �־���������) : 0~100���̸� ����
	public void speedUp() { 
		if (speed + 10 > 100) { //���� �ӵ��� �߰��� �ӵ��� �����ؼ� 100�� �Ѵ��� Ȯ���ϴ� ����
			speed = 100;
		} else {
			speed += 10;
		}
	}
	
	public void speedUp(int pSpeed) {
		if (speed + pSpeed > 100) { //���� �ӵ��� �߰��� �ӵ��� �����ؼ� 100�� �Ѵ��� Ȯ���ϴ� ����
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
