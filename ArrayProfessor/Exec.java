import java.util.ArrayList;
import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {

		ArrayList<Customer> cc = new ArrayList<Customer>();
		ArrayList<Stars> st = new ArrayList<Stars>();
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 999; i++) {
			System.out.println("작업을 선택하세요 (번호/작업명 입력)\n1. 고객정보 입력\n2. 고객 정보 출력\n3. 별점 입력\n4. 고객 별점 평균 출력");
			String userInputString = s.nextLine();
			try {
				if ((userInputString.equals("1")) || (userInputString.equals("고객정보 입력"))) { // 고객정보 입력
					// case1
//					System.out.println("고객의 이름을 입력하세요.");//고객이름받아오기 
//					String customerName = s.nextLine();
//					System.out.println("고객의 번호를 입력하세요.");//고객 연락처 받아오기 
//					String customerNum = s.nextLine();
//					cc.add(new Customer(customerName, customerNum));//생성자에 input
					// case2
					cc.add(new Customer());

				} else if ((userInputString.equals("2")) || (userInputString.equals("고객 정보 출력"))) { // 전체 고객정보 출력
					
					for (int j = 0; j < cc.size(); j++) {
						System.out.println((j + 1) + "번 고객 : " + cc.get(j)); // 고객 번호가 1번부터 출력될 수 있도록 j+1
						System.out.println();
					}
				} else if ((userInputString.equals("3")) || (userInputString.equals("별점 입력"))) {// 별점입력
					
					System.out.println("고객의 번호를 입력해주세요.");
					
					//별점 따로관리 
					System.out.println("별점을 입력할 연락처를 입력해주세요.");
					String phoneNum = s.nextLine();
					String userName = "";
					String userNum = "";
					for (int a = 0; a<cc.size(); a++) {
						if (cc.get(a).number.equals(phoneNum)) {
							userName = cc.get(a).name;
							userNum = cc.get(a).number;
						}
					}
					if (userName.equals("")) {
						System.out.println("입력한 번호의 고객이 없습니다.");
					}else {
						System.out.println("별점을 입력해주세요(1~5");
						String score = s.nextLine();
						try {
							int starScore = Integer.parseInt(score);
							st.add(new Stars(userName, userNum, starScore));
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
				} else if ((userInputString.equals("4")) || (userInputString.equals("고객 별점 평균 출력"))) {
					
					int starSumation = 0;
					int cnt = 0;
					for (int k = 0; k < cc.size(); k++) {
						if (cc.get(k).stars > -1) { // 별점이 0과 같거나 0보다 크다면!
							starSumation = starSumation + cc.get(k).stars; // 별점을 가지고와 누적
							cnt = cnt + 1; // 별점을 가지고있는 회원 수 누적
						}
					}
					double starAvg = (double) starSumation / cnt; // 별점 평균 구하기
					System.out.println("전체 고객 " + cc.size() + " 중 별점이 존재하는 고객의 수는 " + cnt + "명입니다.\n" + "고객 별점의 평균은 "
							+ starAvg + "입니다.");
					System.out.println();
				} else { //정의한 if문에 들어가지 않았을 경우 
					System.out.println("다시 입력해주세요.");
				}

			} catch (Exception e) { // 에러 처리 
				System.out.println("잘못 입력하셨습니다.");
				// TODO: handle exception
			}

		}

	}

}
