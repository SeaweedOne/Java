
import java.util.Arrays;
import java.util.Scanner;

public class CT_BigN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//수열의 길이 N
		//수가 더해지는 횟수 M
		//특정 숫자가 더해지는 최대 횟수 K
		//(N,M,K)는 모두 1이상 100이하의 자연수
		//주어진 입력조건에서 가장 큰 수를 출력하시오.
		
		
		//입력조건에서 가장 큰 수를 구하기 위해서는 어떻게해야할까??
		//특정 숫자가 최대로 더해질 수 있는 값은 k다! 
		//주어진 수 중에 가장 큰 것부터 k번씩 더해보자!
		//가장 큰 수를 k번 더했다면 바로 밑의 수를 더해보자.
		//다른 수를 더했더니 특정 수를 더할 수 있는 값이 다시 생겨났다.
		//그렇다면 다시 가장 큰 수를 더하는게 좋겠다.
		//언제까지? 숫자가 더해지는 최대의 횟수인 m번까지!
		
		
		Scanner sc = new Scanner(System.in); //사용자의 입력을 받는 부분
		String[] E = sc.nextLine().split(" "); //사용자에게서 한 줄을 입력을 받아 " " 공백을 기준으로 나누어준다. 한줄의 입력을 받았지만 공백을 기준으로 나누어준 값은 3개가 존재한다. 그 값들은 배열에 E에 저장해준다.
		int n = Integer.parseInt(E[0]); //나뉜 수를 인덱스를 이용해 n,m,k 값에 넣어준다.
		int m = Integer.parseInt(E[1]);
		int k = Integer.parseInt(E[2]);
		
		int[] data = new int[n]; //받아온 n값을 이용해 배열의 크기 설정.
		
		for(int i=0; i < n; i++) { //for문을 이용해 배열의 인덱스마다 값을 넣어줌.
			data[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(data));
		
		Arrays.sort(data); //배열 정렬 (작은 수는 앞으로 큰 수는 뒤로 )
		int first = data[n-1]; //배열의 마지막 인덱스 (가장 큰 수 ) (n-1이 마지막 인덱스인 이유는 배열읜 0에서부터 시작된다. 따라서 마지막 인덱스는 배열의 크기 -1이 되는 것)
		int second = data[n-2]; // 배열의 뒤에서 두번째 인덱스 (두번째로 큰 수)
		
		int result = 0; //결과값 출력을 위한 변수 
		int tempK = k; //특정 횟수가 더해지는 최대 수 
		for(int i=0; i < m; i++) { //m은 수가 더해지는 횟수이다 따라서 for 문은 수가 m값 만큼 돌게됨.

		    if (tempK == 0) { //0이된다면 이곳으로 오세요~~  0이된다면 가장 큰 수를 더할 수 있는 횟수는 모두 소진되었다는 뜻이다.
		        result = result  + (second); //그렇다면 이제 두번째로 큰 수를 더해보자. 그런데 지금 tempk의 값은 0이다! tempk가 0이되어 이 문장 안에 들어왔기 때문이다.
		        tempK = k;//tempk를 다시 정의해주자. 새로운 수를 더할 예정이니 tempk에 다시 k값을 넣어주자. 그런데 k를 더하니 tempk값은 다시 0이 아니게 되었다! 밑의 else문으로 가자!
		    }
		    else { // 이곳을 먼저 보세요~~~ tempk안에는 k 값이 들어가있다(특정 숫자가 더해질 수 있는 최대의 수). tempK가 0이 아니라면? 누적을 위한 result 변수에 가장 큰 값 (first)를 더해준다!
		        result = result + (first);
		        tempK = tempK - 1; //더할 때 마다 k는 하나씩 줄어든다. 만약 k가 줄어들다가 0이된다면? 위로!!!!
		    }
		}
		System.out.println(result);
		
	}

}
