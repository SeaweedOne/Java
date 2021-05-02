
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class inputprocessing {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception { // 이부분 주의~ 없으면 에러나요
		// A의 갯수는?

		System.setIn(new FileInputStream("src/inputTest.txt")); // 파일 불러오기

		Scanner sc = new Scanner(System.in); // 스캐너 호출

		int T;

		T = sc.nextInt(); // 넥스트 인트를 이용해 첫번째 숫자(테스트케이스)를 읽어옵니다.
		sc.nextLine(); // 넥스트 라인을 이용해 첫번째 줄 공백을 읽어들여준다! 이 과정이 없으면 어떻게되는지 교수님이 수업시간에 말씀해주셨어요.

		int sum;
		for (int i = 0; i < T; i++) { // 테스트케이스만큼 포문을 돌립니다~
			sum = 0; // A를 카운트해서 갯수를 누적시킬 변수를 설정해줍니다.
			char[] c = sc.nextLine().toCharArray(); // 이제 단어들을 불러들여옵니다. 넥스트 라인을 이용해 한 줄씩 읽어옵니다. toCharArray는 읽어온 라인을
													// 한글자씩 분리해줍니다. 분리한 글자들을 배열에 담아줍니다.
			System.out.println(Arrays.toString(c));
			for (int j = 0; j < c.length; j++) { // 분리된 문자가 담긴 배열의 길이만큼 새로운 포문을 생성
				if (c[j] == 'A') //우리가 여기사 ==을 이용해 문자열을 비교할 수 있는 이유는 '' 안의 알파벳은 아스키 코드로 취급되기 때문이다 
					sum++;// 그배열의 인덱스로 접근해 만약 그 글자가 A라면 썸을 1 키워줍니다.
				System.out.println("인덱스 출력" + c[j]);
				System.out.println('A');

				System.out.println(sum); // sum 값 출력!

			}
			// 홑따옴표 안의 글자는 아스키 코드 값으로 변환된다.
			// 큰따옴표의 경우 문자열로 인식하여 두 문자가 합쳐져서 결과가 표시.
			// 작은 따옴표의 경우는 + 연살자를 사용하면 H와 a는 Integer형으로 형변환이 되어 169 출력.
			// 문자열을 합칠 경우 큰따옴표를 사용.
		}
//		char a = "A";
//		String b = "A";
//		String c = 'A';

	}
}
