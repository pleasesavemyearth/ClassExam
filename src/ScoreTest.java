
public class ScoreTest {

	public static void main(String[] args) {
		Score s1 =  new Score();
		System.out.println(s1.getName() + "�� ���� : " + s1.getKorean() + " , ���� : " + s1.getEnglish() + " , ���� : " + s1.getMath() + " , ���� : " + s1.getSum() + " , ��� : " + s1.getAvg());
		
		s1.setName("���"); //set������ ���� .,.����
		s1.setKorean(93);
		s1.setEnglish(78);
		s1.setMath(81);
		System.out.println(s1.getName() + "�� ���� : " + s1.getKorean() + " , ���� : " + s1.getEnglish() + " , ���� : " + s1.getMath() + " , ���� : " + s1.getSum() + " , ��� : " + s1.getAvg());
		
		Score s2 = new Score("�̵���", 84, 91, 79);
		System.out.println(s2.getName() + "�� ���� : " + s2.getKorean() + " , ���� : " + s2.getEnglish() + " , ���� : " + s2.getMath() + " , ���� : " + s2.getSum() + " , ��� : " + s2.getAvg());
		
		s2.setEnglish(99); //�̵����� �������� ������ �ؾ��� ��Ȳ�̴�. �׷��� set���� �������� ����� �׽�Ʈ�Ͽ���. �̷� ��� ������ ��������� ����, ����� �����ϴ� ���� ������, �ع����� ������� �̻��ϰԳ��ü�����
		System.out.println(s2.getName() + "�� ���� : " + s2.getKorean() + " , ���� : " + s2.getEnglish() + " , ���� : " + s2.getMath() + " , ���� : " + s2.getSum() + " , ��� : " + s2.getAvg());
	
	
	
	}

}
