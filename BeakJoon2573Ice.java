import java.util.Arrays;

public class BeakJoon2573Ice {
	public static void main(String[] args) {

		
		int[][] arr = { { 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 2, 4, 5, 3, 0, 0 },
				{ 0, 3, 0, 2, 5, 2, 0 }, 
				{ 0, 7, 6, 2, 4, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0 } };
		int num1 = arr.length;
		int num2 = arr[0].length;
		int lastIndexCol = num1-1;
		int lastIndexRow = num2-1;
		
		for (int i = 0; i < num1; i++) { // 1년차
			for (int j = 0; j < num2; j++) {
				if(arr[i][j] != 0) {
					int cnt = 0;
				if (i == 0) { // i가 이면 윗칸이없음.
					if ((j == 0)) { // j가 0이면 왼쪽 칸이 없음.
						if (arr[i][j + 1] == 0) { // 오른쪽
							cnt++;
						}
						if (arr[i + 1][j] == 0) {// 아래
							cnt++;
						}
						arr[i][j] -= cnt;
						if(arr[i][j]<0) {
							arr[i][j] = 0;
						}
						cnt = 0;
					} else if (j < lastIndexRow) { // J가 마지막 인텍스보다 작을경우
						if (arr[i][j + 1] == 0) { // 왼쪽
							cnt++;
						}
						if (arr[i][j - 1] == 0) { // 오른쪽
							cnt++;
						}
						if (arr[i + 1][j] == 0) { // 아래
							cnt++;
						}
					} else { // j가 마지막 인덱스와 같을 경우 오른쪽 칸이 없음
						if (arr[i][j - 1] == 0) { // 왼쪽
							cnt++;
						}
						if (arr[i + 1][j] == 0) {// 아래
							cnt++;
						}
					}
					arr[i][j] -= cnt;
					if(arr[i][j]<0) {
						arr[i][j] = 0;
					}
					cnt = 0;
				}else if (i < lastIndexCol) { // i 가 0보다 크고 마지막 인덱싀보다 작을경우 위아래칸이 모두 존재
					if ((j == 0)) { // 각 행의0번째 인덱스일 때 오른쪽 칸만 존재
						if (arr[i - 1][j] == 0) { // 윗칸
							cnt++;
						}
						if (arr[i][j + 1] == 0) { // 오른쪽칸
							cnt++;
						}
						if (arr[i + 1][j] == 0) { // 아래칸
							cnt++;
						}
					}else if (j < lastIndexRow) {//j가  0보다 크로 라스트 인덱스보다 작을 때 위아래 양 옆 모두 존재

					if (arr[i - 1][j] == 0) { // 윗칸
						cnt++;
					}
					if (arr[i][j + 1] == 0) { // 오른쪽칸
						cnt++;
					}
					if (arr[i][j - 1] == 0) {// 왼쪽칸
						cnt++;
					}
					if (arr[i + 1][j] == 0) {// 밑칸
						cnt++;
					}
				} else { // 라스트 인덱스와 같을 때 오른쪽 칸 존재하지 않음 왼쪽 칸만 존재
					if (arr[i - 1][j] == 0) { // 윗칸
						cnt++;
					}
					if (arr[i][j - 1] == 0) { // 왼쪽칸
						cnt++;
					}
					if (arr[i + 1][j] == 0) { // 밑칸
						cnt++;
					}
				}
					arr[i][j] -= cnt;
					if(arr[i][j]<0) {
						arr[i][j] = 0;
					}
					cnt = 0;
			} else{ //i가 라스트 인덱스이면  아랫칸이없음.
				if ((j == 0)) { //j가 0이면 왼쪽 칸이 없음.

					if (arr[i][j + 1] == 0) { //오른쪽
						cnt++;
					}
					if (arr[i -1 ][j] == 0) {//위
						cnt++;
					}
				} else if (j < lastIndexRow) { //J가 마지막 인텍스보다 작을경우 양옆 모두 존재

						if (arr[i][j + 1] == 0) { // 왼쪽
							cnt++;
						}
						if (arr[i][j - 1] == 0) { //오른쪽
							cnt++;
						}
						if (arr[i - 1][j] == 0) { //위
							cnt++;
					}
				}else { //j가 마지막 인덱스와 같을 경우 오른쪽 칸이 없음
					if (arr[i][j - 1] == 0) { //왼쪽
						cnt++;
					}
					if (arr[i - 1][j] == 0) {//위
						cnt++;
					}	
				}
				arr[i][j] -= cnt;
				if(arr[i][j]<0) {
					arr[i][j] = 0;
				}
				cnt = 0;
			}
		}
			}
			
	}
		for (int i =0; i<num1; i++) {
		System.out.println(Arrays.toString(arr[i]));

		}
	
}
}
