
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception { //이부분 주의~ 
		
		System.setIn(new FileInputStream("src/inputTest.txt")); //파일 불러오기 
		Scanner sc = new Scanner(System.in); //스캐너 호출
		
		int T; 
		T = sc.nextInt(); //nextInt 이용해 첫번째 숫자(테스트케이스)를 읽어옵니다. 
		sc.nextLine(); //nextLine을 이용해 첫번째 줄 공백을 읽어들여준다!

		 int sum;
		 for(int i=0; i < T; i++) { //문자열을 불러오기 위한 for문
			 sum = 0; // 갯수를 누적시킬 변수를 설정.
			 char[] c = sc.nextLine().toCharArray(); //이제 문자열을 한줄씩 불러옵니다.
//			 System.out.println(Arrays.toString(c));
			 //질문 문자열에도 인덱스가 존재할까요?
			 
			 for(int j=0; j < c.length ; j++) { //배열의 길이만큼 새로운 포문을 생성
				 if(c[j] == 'A') sum++;//그배열의 인덱스로 접근해 만약 그 글자가 A라면 sum을 1 키워줍니다.
			 }
			 System.out.println(sum); 

		 }
//			char a = "A";
//			char a = 'A';
//			System.out.println(a+1);
			
//			String c = 'A';
//		    String b = "A";
//		    System.out.println(b+1);
		
		
	}
}
