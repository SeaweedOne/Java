//사용자에게 9개의 숫자를 입력받아서 3*3의이중 배열에 넣은 후 각행의 덧셈 합을출력하시오.조건1) 출력 시 4*4의 형식으로 출력 (4행째는 덧셈 합)조건2)데이터 출력시 정렬된 형식으로 출력비고. 
//이중배열 사용법 int[][] arr = new int[4][4];비고. 데이터를 정렬된 형식으로 출력하는 방법을 찾아보시오.

import java.util.Arrays;
import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {
		int[][] arr = new int[4][4]; 					// 배열생성
		int lenArr = arr.length; 						// 배열의 길이
		int lastIndex = lenArr - 1; 					// 합계를 위해 비워둔 자리를 가리키는 값
		int inputNum = (lastIndex * lastIndex); 		// 사용자에게 입력받을 숫자의 갯수
		System.out.println(inputNum + "개의 숫자를 입력하세요.");

		for (int i = 0; i < lenArr; i++) {
			int arrSum1 = 0; // 각 행의 합을 받아줄 값
			for (int j = 0; j < lenArr; j++) {

				if ((i < lastIndex) & (j < lastIndex)) { // 3번째 행까지 채우기 위한 조건문
					Scanner s = new Scanner(System.in);
					arr[i][j] = s.nextInt();// input값을 행에 넣어줌
					arrSum1 = arrSum1 + arr[i][j]; // 각 행의 합계를 구하기 위한 식
					arr[i][lastIndex] = arrSum1;
					
				} else if (i == lastIndex) { // 4번째 행을 채우기 위한 조건문
					int arrSum2 = 0; // 열의 합을 받아주기 위한 값
					for (int h = 0; h < lastIndex; h++) { // 1열씩 내려오기 위해 for문을 사용해 인덱스 값 증가
						arrSum2 = arrSum2 + arr[h][j];
						arr[i][j] = arrSum2;
					
					}
				}
			}

		}
		System.out.println(Arrays.deepToString(arr));
	}
}
