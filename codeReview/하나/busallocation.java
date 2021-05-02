
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class busallocation {
	public static void main(String[] args) throws IOException {

		// 우리가 구할 수 있는 버스의 sms 25/45인승 최소한의 비용으로 학생들을 운반하자!
		// 수업시간 때 배웠던 잔돈문제와 같은 맥락이다!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 교수님은 버퍼드리더를 사용해 이번 문제를 푸셨어요~
		int number = Integer.parseInt(br.readLine()); // 버퍼는 키보드가 눌릴때마다 프로그램에 전다랗는 것이 아닌 버퍼에 저장해두었다가 버퍼가 가득 차거나
		// 개행문자(줄바꿈)가나타나면 한번에 전달합니다 지난 번 수업 때 짧게 언급하셨는데 버퍼를 사용하면 입출력 효율이 엄청나게 좋아집니다.
		// 모았다가 보내는데 왜 입출력 효율이 좋을까?흙을 옮기는데 한삽한삽 옮긴느 것과 수레에 담아 한번에 옮기는 것의 차이
		final int bus45 = 45;							
		final int bus25 = 25;
		int res45 = 0;
		int res25 = 0;

		if (number % bus25 == 0) { // 학생의 수가 25의 배수면 25인승 버스만 준비하는 것이 가장 합리적. 학생수/25 값을 출력 하고 끝!
			System.out.println(res45 + " " + number / bus25);
			return;
		}

		while (true) { // 25의배수가아닌경우에는 여기로!

			if (number >= bus45) { // 버스가 45보다 크거나 같다면?
				number -= bus45; // 학생수 -45
				res45++; // 45인승 한대 추가
				if (number % bus25 == 0) { // 학생수에서 45를 뺀 수가 25의 배수라면?
					System.out.println(res45 + " " + number / bus25); // 남은학생수 /25
					break;
				}
			} else { // 학생수에서 45보다 작다면?

				int temp = (number <= bus25) ? res25++ : res45++; // 삼항연산자 학생수가 25보다 작거나 같다면 ? 25인승추가 : 아니라면 45인승 추가
				System.out.println(res45 + " " + res25);
				break;
				// if (number <= bus25){
				// res25++
				// }else{
				// res45++; } 와 같은 식을 위와 같이 줄여서 사용할 수 있어요
			}
		}

	}

}
