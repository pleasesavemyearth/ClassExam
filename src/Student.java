
public class Student { //class�̸�
	//�������
	int studentID; //����,��ҹ��� ����, �������(class�� ������ ������ ����), ���� �ʱ�ȭ �� �ʿ�x, ���� ����
	String studentName; //String s�� �빮��, ���ڴ� ' ', String��" "
	int grade; //�빮�ڷ� �����ϴ°� class�̸��ۿ� ����
	String address;
	
	//������
	//�����ε��� ������
	//�޼���
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name; //�б� = ����
		return;
	}
	
	//�����ε��� �޼���
	//������(main)
	public static void main(String argu[]) { //������, �ü������ ���α۸� ȣ���� �������� ���, Student class������ �ƴ� 
		//Ŭ������ ������ = new ������()
		Student st1 = new Student(); //��ü����(=�ν��Ͻ� ����)
		st1.setStudentName("ȫ�浿");
		
		System.out.println(st1.studentName); //������� ���� ���, ���ۿ� ���� ������� ����
		System.out.println(st1.getStudentName()); //�޼��� Ȱ���ؼ� ���, �� ����� ��
	}
	
}
