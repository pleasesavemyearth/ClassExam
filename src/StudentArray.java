
public class StudentArray {

	public static void main(String[] args) {
		// Student array test
		Student[] st = new Student[3];
		
		st[0] = new Student("������", 4);
		st[1] = new Student("������", 4);
		st[2] = new Student("�ּ���", 4);

		
		for (int i=0; i < st.length; i++) {
			st[i].showStudentInfo();
		}

	}

}
