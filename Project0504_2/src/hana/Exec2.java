
import java.util.Scanner;

public class Exec2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Part[] part = { new Part("인사팀"), new Part("개발팀"), new Part("영업팀") };

		for (int j = 0; j < 999; j++) {
			try {
				System.out.println("1.인사정보 입력");
				System.out.println("2.인사정보 출력");
				System.out.println("3.인사정보 수정");
				System.out.println("4.종료");
				String userInput = s.nextLine();

				if (userInput.equals("1")) {
					System.out.println("사원정보 입력");
					People temp = new People();
					System.out.println("이름을 입력하세요.");
					temp.name = s.nextLine();
					System.out.println("직위를 입력하세요.");
					temp.position = s.nextLine();
					System.out.println("담당업무를 입력하세요.");
					temp.work = s.nextLine();
					System.out.println("부서를 입력하세요.");
					System.out.println("1.인사팀 2.개발팀 3.영업팀");
					try {
						String inputPart = s.nextLine();
						int selectPart = (Integer.parseInt(inputPart) - 1);
						part[selectPart].member.add(temp);
					} catch (Exception e) {
						System.out.println("잘못된 입력입니다.");
					}

				} else if (userInput.equals("2")) {
					for (int i = 0; i < part.length; i++) {
						System.out.println(part[i].name + " 사원 목록 출력");
						for (int k = 0; k < part[i].member.size(); k++) {
							System.out.println(part[i].member.get(k));
						}
					}
				} else if (userInput.equals("3")) {
					System.out.println("수정할 사원의 이름을 입력해주세요.");
					String targetName = s.nextLine();
					System.out.println("수정할 사원이 속한 부서를 선택해주세요");
					System.out.println("1.영업팀 2.인사팀 3.개발팀");
					try {
						String targetPart = s.nextLine();
						Part selectPart = part[Integer.parseInt(targetPart) - 1];
						People selectPeople = null;
						if (selectPart == null) {
							System.out.println("선택된 부서가 존재하지 않습니다.");
						} else {
							for (int k = 0; k < selectPart.member.size(); k++) {
								if (selectPart.member.get(k).name.equals(targetName)) {
									selectPeople = selectPart.member.get(k);
								}
							}
							if (selectPeople != null) {
								System.out.println(targetName + "사원의 직위를 입력해주세요.");
								selectPeople.position = s.nextLine();
								System.out.println(targetName + "사원의 담당업무를 입력해주세요.");
								selectPeople.work = s.nextLine();
							}
						}
					} catch (Exception e) {
						System.out.println("잘못된 선택입니다.");
					}

				} else if (userInput.equals("4")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {
					System.out.println("보기중에 선택해주세요.");
				}
			} catch (Exception e) {
				System.out.println("다시 시도해주세요.");
			}

		}

	}

}