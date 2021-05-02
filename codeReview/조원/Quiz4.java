
import java.util.Arrays;
import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// 입력조건에서 가장 큰 수를 구하기 위해서는 어떻게해야할까요??
		// 가장 큰 수부터 차례대로 더하면 됩니다~
		// 가장 큰 수부터 차례대로 더하려면 어떻게 해야 간단하게 할 수 있을까요?

		Scanner sc = new Scanner(System.in); // 입력받기
		// 사용자에게서 한 줄을 입력을 받아 " " 공백을 기준으로 나누어준다.
		// 질문 "1 2 3"나눠진 값은 어떤 형태일까요?

		String[] E = sc.nextLine().split(" ");
		// System.out.println(Arrays.toString(sc.nextLine().split(" ")));
		int n = Integer.parseInt(E[0]); // 나뉜 수를 인덱스를 이용해 n,m,k 값에 넣어준다.
		int m = Integer.parseInt(E[1]);
		int k = Integer.parseInt(E[2]);

		int[] data = new int[n]; // 받아온 n값을 이용해 배열의 크기 설정.

		for (int i = 0; i < n; i++) { // for문을 이용해 배열의 인덱스마다 값을 넣어줌.
			data[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(data));

		Arrays.sort(data); // 배열 정렬
		int first = data[n - 1]; // 배열의 마지막 인덱스 (가장 큰 수 ) // 질문 왜 배열의 가장 마지막 인덱스는 n이아닌 n-1일까요?
		int second = data[n - 2]; // 배열의 뒤에서 두번째 인덱스 (두번째로 큰 수)

		int result = 0; // 결과값 출력을 위한 변수
		int tempK = k; // 특정 횟수가 더해지는 최대 수
		for (int i = 0; i < m; i++) { // m은 수가 더해지는 횟수이다 따라서 for 문은 수가 m값 만큼 돌게됨.

			if (tempK == 0) { // 0이된다면 이곳으로 오세요~~
				result = result + (second); // 이제 두번째로 큰 수를 더해보자. 그런데 지금 tempk의 값은 0!
				tempK = k;   // tempk에 다시 k값을 넣어주자. 그런데 k를 더하니 tempk값은 다시 0이 아니다! 밑의 else문으로!
			} else {        // 이곳을 먼저 보세요! tempK가 0이 아니라면?
				result = result + (first); // result + 가장 큰 값
				tempK = tempK - 1; // 더할 때 마다 k는 하나씩 줄어든다. 만약 k가 줄어들다가 0이된다면? 위로!!!!
			}
		}
		System.out.println(result);

	}

}
