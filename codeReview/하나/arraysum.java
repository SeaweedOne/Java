
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class arraysum {

	public static void main(String[] args) throws FileNotFoundException { //이부분 주의 
		
		//2차원 배열의 특정 좌표를 기준으로 해당 좌표의 동일 행의 합과 동일 열의 합을 차례로 출력하는 프로그램을 작성하시오.
		//배열의 i,j는 i행 j열을 나타냄 
		//입력의 첫 줄은 행과 열의 숫자를 의미, 아래줄은 행과 열만큼 2차원 배열의 값을 나타냄.
		//배열 다음에는 특정 좌효가 몇 개인지 나태내는 숫자 하나가 주어지고 
		//특정 좌표의 갯수만큼 해당 좌표를 읽어들여서 출력을 처리한다.
		
		//다차원배열 [세로(행)][가로(열)]
		System.setIn(new FileInputStream("src/inputArraySum.txt")); //파일 불러오기 
		//평소에 우리는 스캐너를 사용사 입력을 받는데 사용했지만 이부분이 있어 사용자 입력 대신 문서를 읽어올 수 있게 되었따.
		int n, m, k, sum = 0; //변수들 정의 sum은 합계를 누적시키기 위한 값으로 =0;으로 초기화를 해주어 정의함.
		// 우리는 보통 int a
		//int b 이렇게 사용했지만 같은 타입의 객체라면 한번만 선언을 해주고 여러 변수를 생성할 수 있다.
		int[][] map; //2차원 배열 생성 
		Scanner sc = new Scanner(System.in); //스캐너를 이용해 파일 읽어오기 
		
		n = sc.nextInt(); //넥스트 인트를 사용해 숫자 하나씩 읽어와 n과 m에 넣기. 
		m = sc.nextInt(); 
		//app
		//[1,2,3]    /app길이는?
		//[4,5,6]   /app[0]의 길이는?
		
		map  = new int[n+1][m+1]; //n,m의 값으로 이차원 배열의 크기를 설정. (교수님은 여기서 배열이 크기를 +1 해줌으로서 아래에서 사용할 좌표값을 그대로 사용할 수 있게 처리하심.
		//만약 이 부분이 없다면 우리는 아래에서 좌포를 불러올 때 마다 좌표값 -1을 해주어야 함.
		
		
		//질문1 우리가 읽어온 파일의 숫자들을 배열에 넣기 위해서 어떻겧 해야할까?
		for(int i=1; i<=n; i++) { // 행의 크기만큼 포문 사용. 위에서 배열의 크기 +1을 해주었기때문에 for문은 1에서부터 시작.
			for(int j=1; j<=m; j++) { // 열의 크기만큼 포문 사용. 위에서 배열의 크기 +1을 해주었기때문에 for문은 1에서부터 시작.
				map[i][j] = sc.nextInt(); //우리가 만들어 둔 배열에 인덱스를 이용해 값 채우기.
			}
		}
		//System.out.println(Arrays.deepToString(map));
		
		k = sc.nextInt(); //테스트 케이스 정의 
		for(int i=0; i < k;i++) {
			int rowsum = 0; //가로 행 합을 구하기 위한 변수 (변수는 for문 안에 있음으로 for문이 실행될 때마다 0으로 초기화 된다.)
			int colsum = 0; //세로 열 합을 구하기 위한 변수 
			int x1 = sc.nextInt(); //X좌표값 받아오기 
			int y1 = sc.nextInt(); //Y좌표값 받아오기
			
			
			//질문 세로합을 구하려면 가로줄에서의 위치는 고정, 세로방향으로만 욺직여야한다. 세로 방향으로 움직이기 위해서 2개의 인덱스 중 어떤 인덱스 값을 변경해주어야할까?
			//첫번째 포문은 세로 합을 구하는 포문이다. 우리는 좌표값을 받아왔기때문에 세로줄을 더하기 위해서는 그 숫자의 바로 밑/윗 칸을 더하면 된다. 그러기 위해서는 두번째 인덱스는 고정하고 첫번째 인덱스만 변화되어야한다!
			for(int row = 0; row < map.length; row++) { //포문이 전체 맵의길이만큼 돌게된다 (배열 안에는 3개의 배열이 들어있음으로 배열의 길이는 3이된다)-첫번째는 빈배열 
				rowsum += map[row][y1]; //그렇게 구한 요소들을 로우 썸 변수에 누적시켜준다 . 
			}
			//우리는 이곳에서 가로 합을 구하려고 한다. 가로 합을 구하려면 두개의 인덱스 중 앞쪽(행)은 고정한 채 두번째 인덱스만 바뀌어야 한다.
			for(int col = 0; col < map[x1].length; col++) { //map[x1]은 다중배열 속의 한 행을 가리킨다 그 행의 길이만큼 포문을 실행!
				colsum += map[x1][col]; //이곳에서 한 행 안의 숫자들을 가지고와 colsum에 누적시킨다.
			}
			System.out.println(rowsum+" "+colsum);
		}
		
		
	}

}
