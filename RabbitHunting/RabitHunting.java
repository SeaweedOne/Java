import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class RabitHunting {
	   public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int maxNum = 20;
		int caseNum = sc.nextInt();
		sc.nextLine();
		for(int i =0; i<caseNum; i++) {
			int count = 0;
			int rabbitNumber = sc.nextInt();
			int fox_x = sc.nextInt();
			int fox_y = sc.nextInt();
			int fox[] = {fox_x,fox_y};
			
			for(int j = 0; j<rabbitNumber; j++) { //토끼의 숫자만큼 포문을 돌며 토끼의 좌표 바꿔주기 
				int rabbit_x = sc.nextInt();
				int rabbit_y = sc.nextInt();
				int rabbit[] = {rabbit_x,rabbit_y}; //여우를 기준으로 가로세로축 찾기
				if((fox[0]==rabbit[0])||(fox[1]==rabbit[1])) {
					count = count +1;
				}
				for(int k =0; k<maxNum; k++) { //여우가 한칸씩 움직이며 대각선 축 토끼 찾기 
					int newFox1[] = {fox[0]+k, fox[1]+k};
					int newFox2[] = {fox[0]-k, fox[1]-k};
					int newFox3[] = {fox[0]+k, fox[1]-k};
					int newFox4[] = {fox[0]-k, fox[1]+k};
					if((Arrays.equals(newFox1,rabbit))||(Arrays.equals(newFox2,rabbit))||(Arrays.equals(newFox3,rabbit))||(Arrays.equals(newFox4,rabbit))) {
						count = count +1;
					}
				}
			}
		System.out.println((i+1)+"번째 잡힌 토끼의 수는 " + count + "입니다.");
		}

	}
}
