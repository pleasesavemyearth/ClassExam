
public class Ex1130_4 {

	public static void main(String[] args) {
		//int[][] arr = new int [2][3]; // 2�� 3��
		int[][] arr = {{1,2,3}, {4,5,6}}; // 2�� 3�� �� �ʱ�ȭ
		
		for( int i = 0 ; i < arr.length ; i++) { // �� , arr.length = �� ����
			for ( int j = 0 ; j < arr[i].length ; j++) { // ��, arr[i].length = �� ����
					System.out.print(arr[i][j] + " "); // ������ �� ���
				}
				System.out.println();
			}
		
		}
	}

