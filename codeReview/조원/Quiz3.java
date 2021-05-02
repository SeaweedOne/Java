
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) throws FileNotFoundException { //이부분 주의 
		
		System.setIn(new FileInputStream("src/inputArraySum.txt")); //파일 불러오기 

		int n, m, k, sum = 0; 
		int[][] map; //2차원 배열 생성 
		Scanner sc = new Scanner(System.in); //스캐너를 이용해 파일 읽어오기 
		
		n = sc.nextInt(); //배열의 크기 정의를 위해 넥스트 인트를 사용해 숫자 하나씩 읽어와 n과 m에 넣기. 
		m = sc.nextInt(); 

		//다차원배열 [세로(행)][가로(열)]
		//app
		//[1,2,3]    /app길이는?
		//[4,5,6]   /app[0]의 길이는?
		map  = new int[n+1][m+1]; //n,m의 값으로 이차원 배열의 크기를 설정. 
		
		
		//질문1 우리가 읽어온 파일의 숫자들을 배열에 넣기 위해서 어떻겧 해야할까?
		for(int i=1; i<=n; i++) { 
			for(int j=1; j<=m; j++) { 
				map[i][j] = sc.nextInt(); 
			}
		}
		//System.out.println(Arrays.deepToString(map));
		
		k = sc.nextInt(); //테스트 케이스 정의 
		for(int i=0; i < k;i++) {
			int rowsum = 0; //세로,가로 행 합을 구하기 위한 변수 정의
			int colsum = 0; //질문 합을 누적할 변수들이 for문 밖에 있어도 결과는 같을까요?
			
			int x1 = sc.nextInt(); //X좌표값 받아오기 
			int y1 = sc.nextInt(); //Y좌표값 받아오기
			
			
			//질문 첫번째 포문은 세로 합을 구하는 포문이다. 세로줄을 더하기 위해서는 그 숫자의 바로 밑/윗 칸을 더하면 된다.그러려면? 가로줄에서의 위치는 고정, 세로방향으로만 욺직여야한다. 
			//세로 방향으로 움직이기 위해서 2개의 인덱스 중 어떤 인덱스 값을 변경해주어야할까?
			for(int row = 0; row < map.length; row++) { 
				rowsum += map[row][y1]; //rowSum = rowSum + map[row][y1];
			}
			//질문 가로줄 합 구하기. 가로 합을 구하려면 두개의 인덱스 중 앞쪽(열에해당되는)은 고정한 채 두번째 인덱스만 바뀌어야 한다.
			//질문 왜 for문이 map.lenght가 아니가  map[x1].length만큼 실행되어야 할까??
			for(int col = 0; col < map[x1].length; col++) { 
				colsum += map[x1][col]; //결과물을 colsum에 누적시킨다.
			}
			System.out.println(rowsum+" "+colsum);
		}
		
		
	}

}
