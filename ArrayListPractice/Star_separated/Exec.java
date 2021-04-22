import java.util.ArrayList;
import java.util.Scanner;

public class Exec {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ArrayList<Customer> arr = new ArrayList<Customer>();
		ArrayList<Stars> star = new ArrayList<Stars>();
		try {
			for (int i = 0; i < 99; i++) {
				System.out.println("수행하실 작업 번호를 선택하세요.");
				System.out.println("1. 회원 정보 입력");
				System.out.println("2. 회원 정보 출력");
				System.out.println("3. 회원 별점 입력");
				System.out.println("4. 별점 평균 출력");
				System.out.println("5. 중지");
				String userInput = s.nextLine();

				if (userInput.equals("1")) {
					arr.add(new Customer());
				} else if (userInput.equals("2")) {
					for (int j = 0; j < arr.size(); j++) {
						System.out.println((j + 1) + "번 고객 " + arr.get(j));
					}
				} else if (userInput.equals("3")) {
					System.out.println("별점을 입력하실 고객의 휴대폰 번호를 입력하세요.");
					String num = s.nextLine();
					String name = "";
					String phone = "";
					for (int k = 0; k < arr.size(); k++) {
						if (num.equals(arr.get(k).phone)) {
							name = arr.get(k).name;
							phone = arr.get(k).phone;
						}
					}
					if (name.equals("")) {
						continue;
					} else {
						System.out.println("선택된 회원은 " + name +" 입니다. 별점을 입력하세요.");
						String st = s.nextLine();
						int stars = Integer.parseInt(st);
						star.add(new Stars(name, phone, stars));
					}
				} else if (userInput.equals("4")) {
					int sum = 0;
					int maxNum = star.size();
					for (int h = 0; h < maxNum; h++) {
						sum += star.get(h).stars;
					}
					double avg = sum / (double) maxNum;
					System.out.println("고객 별점 평균은 " + avg + "점 입니다.");
				} else if (userInput.equals("5")) {
					break;
				} else {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				}
			}
		} catch (Exception e) {
			System.out.println("작업에 실패하였습니다. 다시 선택해주세요.");
			// TODO: handle exception
		}
	}
}
