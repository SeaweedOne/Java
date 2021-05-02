
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz5 {
	public static void main(String[] args) throws IOException {
		//어렵게 생각하지 않고 우리가 수업 때 배웠던 잔돈 문제를 생각하면 쉽게 풀 수 있어요~
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int number = Integer.parseInt(br.readLine()); 
		// 교수님은 버퍼드리더를 사용해 이번 문제를 푸셨어요~
		// 지난 번 수업 때 짧게 언급하셨는데 버퍼를 사용하면 입출력 효율이 엄청나게 좋아집니다.
		// 모았다가 보내는데 왜 입출력 효율이 좋아질까요?
		final int bus45 = 45;
		final int bus25 = 25;
		int res45 = 0; //카운트를 위한 변수 설정 
		int res25 = 0;

		if (number % bus25 == 0) { // 학생의 수가 25의 배수면 학생수/25 값을 출력 하고 끝!
			System.out.println(res45 + " " + number / bus25);
			return;
		}

		while (true) { // 25의배수가아닌경우에는 여기로!

			if (number >= bus45) { //학생의 수가 45보다 크거나 같다면?
				number -= bus45; // 학생수 -45
				res45++; // 45인승 한대 추가
				if (number % bus25 == 0) { // 학생수 - 45 가 25의 배수라면?
					System.out.println(res45 + " " + number / bus25); // 남은학생수 /25
					break;
				}
			} else { // 학생수가 45보다 작다면?

				int temp = (number <= bus25) ? res25++ : res45++; // 삼항연산자 학생수가 25보다 작거나 같다면 ? 25인승추가 : 아니라면 45인승 추가
				System.out.println(res45 + " " + res25);
				break;
				// if (number <= bus25){
				// res25++
				// }else{
				// res45++; } 
			}
		}

	}

}
