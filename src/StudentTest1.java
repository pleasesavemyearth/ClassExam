
public class StudentTest1 {

	public static void main(String[] args) {
		// Student class test
		System.out.println(Student.getSerialNum()); // ��ü������ ���� 
		
		
		Student st1 = new Student(); // default ������
		st1.setStudentName("ȫ�浿");
		//System.out.println(st1.studentName); // ���� ����, public ��������̹Ƿ� ����
		//System.out.println(st1.getStudentName()); // get���� ����, public �޼ҵ��̹Ƿ� ����
		//st1.serialNum++; //static�������� ���� �빮�� st1, st2 �Ѵ� +1������ �ݿ��ȴ�
		
		System.out.println(Student.getSerialNum()); // static ���� �б�
		System.out.println(st1.getStudentName() + " : " + st1.studentId);
		
		Student st2 = new Student();
		st2.setStudentName("���");
		System.out.println(Student.getSerialNum()); //st2 ������ ���������Ƿ� ������
		System.out.println(st2.getStudentName() + " : " + st2.studentId);
		
		
		
	}

}
