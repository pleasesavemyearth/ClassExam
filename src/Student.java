
public class Student { //class�̸�
	//�������
	private static int serialNum = 1000; // �ν��Ͻ�(��ü)������ ������, static������ �ʱ�ȭ�� ���Ѿ� ��
	public int studentId; //����,��ҹ��� ����, �������(class�� ������ ������ ����), ���� �ʱ�ȭ �� �ʿ�x, ���� ����
	public String studentName; //String s�� �빮��, ���ڴ� ' ', String��" "
	public int grade; //�빮�ڷ� �����ϴ°� class�̸��ۿ� ����
	public String address;
	
	// ������!!!
	public Student() {
		serialNum++; // Ŭ���� ����
		studentId = serialNum; // �����Ǳ� �� �� ����
 	}
	
	// �����ε��� ������!!!
	public Student(String studentName, int grade) {
		this.studentName = studentName;
		this.grade = grade;
	}
	
	// �޼��� !!!
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName; //�б� = ���� , studentName = studentName���� �������ϱ� ���ʰ� this���δ�
		//set�� return�Ⱦ�
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void showStudentInfo() {
		System.out.println("�̸� : " + getStudentName() + " , " + getGrade() + "�г�");
	}

	
	
	
	public static int getSerialNum() {
		int i = 10; // static�̶� �������� ��밡�� / �� �ȿ��� ����� ��������, static���� ������ ������ ��� ����
		//this.studentName = "�����";
		return serialNum;
	}
	
	//�����ε��� �޼���
	//������(main)
	/*
	public static void main(String[] argu) { //������, �ü������ ���α۸� ȣ���� �������� ���, Student class������ �ƴ� 
		//Ŭ������ ������ = new ������()
		Student st1 = new Student(); //��ü����(=�ν��Ͻ� ����)
	}
	*/
	
	
	
	
	
	
}
