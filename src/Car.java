
public class Car {
	
	/*Car class ���� �� ���
	 �� �̸�, �ӵ��� ��������� / �� �̸����� �������� / �� �̸�, �ӵ��� �������� / �μ�(����,�Ű�����) ���� ���� ���� / �� �̸�, �ӵ� ���� �б�/ �� �̸�, �ӵ� ���� ���� / ���̸�, �ӵ� ���� ���� / 
	 �־��� ������ �ӵ� ���� / �־��� ������ �ӵ� ���� / �μ����� �������� ��� �⺻�� ����(���̸��� �ӵ��� ���� '�ڵ���', 150 �̷���) / ������ Ŭ�������� ��ü�����ϰ� �׽�Ʈ(5��)*/
	
	String carname; //�������
	int speed;
	int speedup;
	int speeddown;


	public Car(){ //�Ű����� ���� ��������? c1
		
	}
	
	public Car(String pCarname) { //�̸� ������ c2
		carname=pCarname;
	}
	
	public Car(int pSpeed) { //�ӵ� ������ c3
		speed=pSpeed;
	}
	
	
	public Car(String pCarname, int pSpeed) { //�̸�, �ӵ� ������ c4
		carname=pCarname;
		speed=pSpeed;
	}
	
	public String getCarname() { //�̸� ���� �޼ҵ�
		return carname;
	}
	
	public int getSpeed() { //�ӵ� ���� �޼ҵ�
		return speed;
	}
	
	public void setCar(String pCarname, int pSpeed) { //�̸�, �ӵ� ���� ���� c4
		carname=pCarname;
		speed=pSpeed;
	}
	
	
	
	public void speedup(int pSpeed) { //�ӵ����� !!!!!!!!!!!!!!!!!!!! speedup�Լ��� �����Ѵ�, ���� speed�Է�
		speed += pSpeed; //speed = speed + pSpeed
	}

	
	
	
	

}
	

