
public class Ex1123_1 {
	//��Ģ�����
	int result; //����������, �������
	int num1; //��꿡 ���Ǵ� ���� �Ӽ�
	int num2; //������ �Ӽ�
	//����Ʈ �����ڸ� �ݵ�� ����(������ ��� ��)
	public Ex1123_1() { //����Ʈ ������
		
	}
	
	
	//�����ڰ� ���� ���¿��� �ڵ带 �ο��ϸ� ����Ʈ �����ڰ� ���� //�μ��� ����� �����ε��� ������
	//������(Ŭ������� ����, ��ȯŸ�� ����, �������� �޼��� ���� ����� ���� �� �ϱ�)->�� ��Ģ�� ������ ������ �� �޼���
	public Ex1123_1(int n1, int n2) { //�̰� ����Ʈ ��������, �ּ��� �� 3���� �ٷ���� ������ 
		//��ȯŸ�� ������ ���ϵ� ����
		//���⿡ �־��ĸ� �Ӽ����ٰ� ������ �ִ°��̴�
		num1 = n1;
		num2 = n2; //�� ������ �ʿ�
		//�� 2���޾Ƥä� ��������� �� ����
	}
	
	//set���� get�б�
	//������ ����, result�� ����θ� ������ϱ� set�� ����ȵȴ� ����������������) set�� void, get�� Ÿ���� �־����
	public void setNum1(int n1) {
		num1 = n1;
	}
	
	public void setNum2(int n2) {
		num2 = n2;
	}
	
	//������ �б� //Ÿ���� �� int�� �ϳ� //result�ص������� ������ ����� �����ϱ� ���ص� �ȴ�
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	
	//�޼��� ??????????���̷�������
	public int add() {
		result = num1+num2;
		return result;
	}
	
	public int subtract() {
		result = num1-num2;
		return result;
	}
	
	public int multiply() {
		result = num1 * num2;
		return result;
	}
	
	public int divide() {
		result = num1 / num2;
		return result;
	}
	
	
	//���� �޼��� (�����ε��� ��)
	public int add(int n1, int n2) { /*ȣ���ϱ����� ��Ī�� add��� ��, ��ȯŸ�� ������(int add), �����Ǿ� ȣ���Ҽ��ִ� (public)
	��, public ��ȯŸ�� �޼����(�Ű����� ����Ʈ)*/
		num1 = n1; //���� �Ӽ�, ������ �������� ���������� �ӽ����� �����̾
		num2 = n2;
		result = num1 + num2; //��������
		return result; //int�����ϰ��ִµ� �ƹ��͵� ���ִϱ� ���Ͼ��� ������ �ȳ���
	}
	
	
	//���� �޼���
	public int subtract(int n1, int n2) { //n1, n2�� ��������, �޼��� ���ο����� �ν��� �� �ִ� ����
		num1 = n1; 
		num2 = n2;
		result = n1 - n2;
		return result;
	}
	
	
	//���� �޼���
	public int multiply(int n1, int n2) {
		num1 = n1; 
		num2 = n2;
		result = n1 * n2;
		return result;
	}
	
	
	//������ �޼���
	public int divide(int n1, int n2) {
		num1 = n1; 
		num2 = n2;
		result = n1 / n2;
		return result;
	}
	
	
	
}
