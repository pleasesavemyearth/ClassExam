
public class ScoreTest {

	public static void main(String[] args) {
		Score s1 =  new Score();
		System.out.println(s1.getName() + "의 국어 : " + s1.getKorean() + " , 영어 : " + s1.getEnglish() + ", 수학 : " + s1.getMath());

		System.out.println("총점 : " + s1.getSum());
		System.out.println("평균 : " + s1.getAvg());
		
		
		
	}

}
