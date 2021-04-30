
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class busallocation {
	public static void main(String[] args) throws IOException {
		
		//우리가 구할 수 있는 버스의 sms 25/45인승 최소한의 비용으로 학생들을 운반하자!
		//수업시간 때 배웠던 잔돈문제와 같은 맥락이다!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		final int bus45 = 45;
		final int bus25 = 25;
		int res45 = 0;
		int res25 = 0;
		
		if (number % bus25 == 0) { // 학생의 수가 25의 배수면 학생수/25 값을 출력 하고 끝!
			System.out.println(res45+" "+number/bus25);
			return;
		}
		
		while(true) { //25의배수가아닌경우에는 여기로!
			
			if(number >= bus45) { //버스가 45보다 크거나 같다면?
				number -= bus45; //학생수 -45
				res45++; //45인승 한대 추가
				if(number % bus25 == 0) { //학생수에서 45를 뺀 수가 25의 배수라면?
					System.out.println(res45+" "+number/bus25); //남은학생수 /25 
					break;
				}
			}else{  //학생수에서 45를 뺀 수가 25의 배수가 아니라면?
				
				int temp = (number <= bus25) ? res25++ : res45++; //학생수가 25보다 작거나 같아면 ? 25인승추가 : 아니라면 45인승 추가
				System.out.println(res45+" "+res25);
				break;
			}
		}
		
	}	
	
}
