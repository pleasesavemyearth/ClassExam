
public class CarTest {
	
	public static void main(String[] args) {
	Car c1 = new Car(); //default ������, �Ű����� ���� ��������?
	
	Car c2 = new Car("�ҳ�Ÿ"); //�� �̸����� ���� , �ΰ�¥�� �����س��� ��� �׽�Ʈ ���̿���..���赵�� �´� ������ ����� ����Ǵ� ���� ����
	System.out.println("�� �̸� : " + c2.getCarname());
	
	Car c3 = new Car(100); // �ӵ��� ����
	System.out.println("�ӵ� : " + c3.getSpeed());
	
	Car c4 = new Car("�ƹ���", 40); //�� �̸�, �ӵ��� ����
	System.out.println("���� - �� �̸� : " + c4.getCarname() + " , �ӵ� : " + c4.getSpeed());
	
	c4.setCar("���", 10); //�� �̸�, �ӵ� ����
	System.out.println("���� - �� �̸� : " + c4.getCarname() + " , �ӵ� : " + c4.getSpeed());
	
	c1.setCar("�ڵ���", 150); //�μ� ���� ���� ������� �⺻�� ���� ('�ڵ���', 150)
	System.out.println("�⺻�� - �� �̸� : " + c1.getCarname() + " , �ӵ� : " + c1.getSpeed());
	
	/* c4.setCar(12); //�ӵ�������Ű��
	System.out.println("������ �ӵ� : " + c4.getSpeed()+c5.getSpeedup()); //���� �ӵ�+������ų �ӵ� */
	
	
	
	
	c3.speedup(10);
	System.out.println(c3.getSpeed()); //�ӵ�����!!!!!!!!!!!!! ���� ����Ȱ��� 100 �ű⿡ 10�� �ִϱ� 110�� �ȴ�
	
	
	
	}
}
