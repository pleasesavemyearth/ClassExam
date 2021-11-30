
public class Ex1130_4 {

	public static void main(String[] args) {
		//int[][] arr = new int [2][3]; // 2행 3열
		int[][] arr = {{1,2,3}, {4,5,6}}; // 2행 3열 및 초기화
		
		for( int i = 0 ; i < arr.length ; i++) { // 행 , arr.length = 행 길이
			for ( int j = 0 ; j < arr[i].length ; j++) { // 열, arr[i].length = 열 길이
					System.out.print(arr[i][j] + " "); // 원소의 값 출력
				}
				System.out.println();
			}
		
		}
	}

