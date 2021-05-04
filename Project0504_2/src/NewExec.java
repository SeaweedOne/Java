import java.util.Scanner;

public class NewExec {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Part[] part = {new Part("인사팀"), new Part("개발팀"), new Part("영업팀")};
		
		for (int j = 0; j < 999; j++) {
			System.out.println("1.인사정보 입력");
			System.out.println("2.인사정보 출력");
			System.out.println("3.인사정보 수정");
			String userInput = s.nextLine();
			
			if (userInput.equals("1")) {
				System.out.println("사원정보 입력");
				NewPeople temp = new NewPeople();
				System.out.println("이름을 입력하세요.");
				temp.name = s.nextLine();
				System.out.println("직위를 입력하세요.");
				temp.position = s.nextLine();
				System.out.println("담당업무를 입력하세요.");
				temp.work = s.nextLine();
				System.out.println("부서를 입력하세요.");
				System.out.println("1.영업팀 2.인사팀 3.");
				String inputPart = s.nextLine();
				if(inputPart.equals("1"))
				
				
			}
			
			
		}
		
	}

}
