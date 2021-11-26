
public class StudentArray {

	public static void main(String[] args) {
		// Student array test
		Student[] st = new Student[3];
		
		st[0] = new Student("박지현", 4);
		st[1] = new Student("송유빈", 4);
		st[2] = new Student("최선영", 4);

		
		for (int i=0; i < st.length; i++) {
			st[i].showStudentInfo();
		}

	}

}
