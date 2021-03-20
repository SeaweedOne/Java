import java.util.Random;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		
		System.out.println("가위는 0 바위는 1 보는 2!\n숫자를 입력해주세요.");
		Random r = new Random();
		int ranNum = r.nextInt(3);
		
		
		Scanner s = new Scanner(System.in);
		int inputNum = s.nextInt();
		
		//컴퓨터 숫자 출력문
		if(ranNum == 0) {
			System.out.println("컴퓨터 : 가위");
		} else if (ranNum == 1) {
			System.out.println("컴퓨터 : 바위");
		} else{
			System.out.println("컴퓨터 : 보");
		}
		
		//사용자 입력 숫자 출력문
		if(inputNum == 0) {
			System.out.println("사용자 : 가위");
		} else if (inputNum == 1) {
			System.out.println("사용자 : 바위");
		} else{
			System.out.println("사용자 : 보");
		}
		
		//동점일 때 출력문
		if (ranNum == inputNum) {
			System.out.println("same!");
		}else if (ranNum < inputNum|| ranNum ==2 && inputNum == 0) {
			System.out.println("You Win!!!!");
		}else{
			System.out.println("You LooseT.T");
		}

			
	
	}
}
