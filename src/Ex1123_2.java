
public class Ex1123_2 {

	public static void main(String[] args) {
		/*�ν��Ͻ� �����ؾ� Ŭ���� ��� ����
		//Ŭ������ ������ = new ������
		//�����ڸ� ������������� ����Ʈ������ �ڵ����� �������, ����Ʈ�����ڴ� Ŭ������� �����ϰ� �Ű������� ����
		ù��° ��ü*/
		Ex1123_1 cal1 = new Ex1123_1(); //�Ű������� ���ٴ°� �ٷ� ����ݰ�, Ŭ������ ������ = new ������(�ٵ� �� Ŭ�������� �� ����)
		System.out.println(cal1.num1); //�޼��� ���� �Ӽ����� ����
		System.out.println(cal1.num1);
		System.out.println(cal1.result);
		System.out.println(cal1.add(10, 20)); // ������.�޼����(�Ű�����)
		
		
		int test = cal1.add(1, 1); //����� test�� ��ȯ, 
		System.out.println(test);
		
		//���� ���
		/*int test1 = cal1.multiply(2,5); 
		System.out.println(test1); �ƴϴ�*/
		System.out.println(cal1.multiply(2, 5));
		
		System.out.println(cal1.num1); //num1 = n1 �� ������� ������ ���� ����?���� ����Ǿ����� 
		System.out.println(cal1.num2);
		System.out.println(cal1.result); //������ ������ ����μ� �����Ѵ�
		
		//�ι�° ��ü ���� �� �׽�Ʈ
		Ex1123_1 cal2 = new Ex1123_1(3, 5); //��ü ���� or �ν��Ͻ� ����
		System.out.println(cal2.add());	
		System.out.println(cal2.subtract());
		System.out.println(cal2.multiply());
		System.out.println(cal2.divide());
		System.out.println(cal2.add(6,7));	
		
		
		//����° ��ü ���� �� �׽�Ʈ
		Ex1123_1 cal3 = new Ex1123_1(10,5);
		/*System.out.println(cal3.num1 + " + " + cal3.num2 + " = " + cal3.add()); ���� �����δ� num1,,� ���� ���ϰ� �����ű� ������ get�� �Ἥ �ؾ���*/
		System.out.println(cal3.getNum1() + " + " + cal3.getNum2() + " = " + cal3.add());
		
		//�׹�° ��ü ���� �� �׽�Ʈ
		//����Ʈ �����ڷ� ���� �� �Ű�����(9,10) �߰��ϰ� ������� �׽�Ʈ
		//Ex1123_1 cal4 = new Ex1123_1(9,10); ����Ʈ�ϱ� �����ָ�ȴ�, ����
		Ex1123_1 cal4 = new Ex1123_1();
		cal4.setNum1(9); //1��Ʈ���� set���� �̰͵��� �� ��� ��, ����Ʈ �������ϰ�...�Ű����� �ȳְ� �̰� ���� 
		cal4.setNum2(10); //��, set�ѵڿ� get�Ѵ�
		System.out.println(cal4.getNum1() + " * " + cal4.getNum2() + " = " + cal4.multiply());
		
		
	}

}
