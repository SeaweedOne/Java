
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Quiz2 {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {//이부분 주의해주세요!
		//주어지는 n줄의 문자열을 읽어들여 각 행을 오름차순으로 출력하는 프로그램을 작성
		//입력의 첫 줄에는 테스트케이스의 갯수가 주어진다.
		
		System.setIn(new FileInputStream("src/inputTest2.txt"));//파일 불러오기 
		Scanner sc = new Scanner(System.in);//스캐너를 이용해 파일 읽을 준비 
		
		int T; 
		int N = 10;
		T = sc.nextInt(); //파일의 첫번째 숫자 불러오기 (테스트케이스)
		sc.nextLine();//첫줄에 있는 나머지 공백 읽어오기 

		 int sum;
		 for(int i=0; i < T; i++) {//테스트케이스만큼 포문 반복
			 sum = 0; 
			 String[] E = sc.nextLine().split(" ");  // 한 라인을 불러와 공백을 기준으로 나눠준다. 나눠준 것을 e라는 배열에 저장.
			 int[] intArray = Stream.of(E).mapToInt(Integer::parseInt).toArray();//스트림 - 람다함수를 활용할 수 있는 기술 mapToInt는 배열 안의 요소를 하나씩 꺼내오는 기능. 
			 Arrays.sort(intArray);	//정렬 
			 
//			 Arrays.stream(intArray).forEach(System.out::print);
			 Arrays.stream(intArray).forEach(x->{System.out.print(x+" ");}); //for each는 각요소를 돌면서 처리할 수 있다. 

//			 for(int k: intArray){
//			    System.out.print(k+" ");
//			 } //위의 식을 풀어서 쓰면 이렇게도 표현할 수 있어요~
			 System.out.println();
		 }

		
		
	}
}
