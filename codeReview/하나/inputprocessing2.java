
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class inputprocessing2 {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		//주어지는 n줄의 문자열을 읽어들여 각 행을 오름차순으로 출력하는 프로그램을 작성
		//입력의 첫 줄에는 테스트케이스의 갯수가 주어진다.
		
		System.setIn(new FileInputStream("src/inputTest2.txt")); //평소에느 스캐너를 사용자 입력을 받는데 사용하지만 이부분이 있어 파일을 읽어오는데 사용할 수 있게된다.
		Scanner sc = new Scanner(System.in);//스캐너를 이용해 파일 읽을 준비 
		
		int T; 
		int N = 10;
		T = sc.nextInt(); //파일의 첫번째 숫자 불러오기 (테스트케이스)
		sc.nextLine();//첫줄에 있는 나머지 공백 읽어오기 (이부분이 없으면 아래에셔 넥스트 라인을 쓰면 공백이 읽힐 것이다.)

		 int sum;
		 for(int i=0; i < T; i++) {//테스트케이스만큼 포문 반복
			 sum = 0; //스트림 - 데이터를 다루는데 자주 사용되는 메소드들 
			 String[] E = sc.nextLine().split(" ");  // 한 라인을 불러와 공백을 기준으로 나눠준다. 나눠준 것을 e라는 배열에 저장.
			 int[] intArray = Stream.of(E).mapToInt(Integer::parseInt).toArray();//스트림 - 람다함수를 활용할 수 있는 기술(이부분은 교수님도 문법이라고 사용할 때 검색해보고 사용하신다고 합니다~) 
			 Arrays.sort(intArray);	//정렬 //앱 투 포인트는 배열이 1차원이든 다차원이든 그 배열 안의 요소를 하나씩 꺼내오는 기능. 하나씩 꺼내온 요소를 파스인트로 변환. 변환 후 ToArray에 넣어줍니다.
			 
//			 Arrays.stream(intArray).forEach(System.out::print);
			 Arrays.stream(intArray).forEach(x->{System.out.print(x+" ");}); //for each는 각요소를 돌면서 처리할 수 있다. 각 항목을 돌며 프린트 + 공백을 찍어준다. 


//			 for(int k: intArray){
//			    System.out.print(k+" ");
//			 } //위의 식을 풀어서 쓰면 이렇게도 표현할 수 있어요~
			 System.out.println();
		 }

		
		
	}
}
