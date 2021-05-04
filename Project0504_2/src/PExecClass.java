import java.util.HashMap;
import java.util.Scanner;

public class PExecClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Part[] part = { new Part("인사팀"), new Part("개발팀"), new Part("영업팀") };
		HashMap<String, Part> part = new HashMap<String, Part>();
		part.put("인사팀", new Part("인사팀"));
		part.put("개발팀", new Part("개발팀"));
		part.put("영업팀", new Part("영업팀"));
		for (int i = 0; i < 999999; i++) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1 : 인사 정보 등록");
			System.out.println("2 : 인사 정보 출력");
			System.out.println("3 : 인사 정보 수정");
			System.out.println("exit : 종료");

			String inputText = scanner.nextLine();

			if (inputText.equals("1")) {
				System.out.println("이름을 입력해주세요.");
				People tempPeople = new People();
				tempPeople.name = scanner.nextLine();
				System.out.println("직위를 입력해주세요.");
				tempPeople.position = scanner.nextLine();
				System.out.println("담당업무를 입력해주세요.");
				tempPeople.work = scanner.nextLine();
				System.out.println("담당 부서를 선택해주세요.");
				System.out.println("1: 인사팀");
				System.out.println("2: 개발팀");
				System.out.println("3: 영업팀");
				String selectNumber = scanner.nextLine();
				if (selectNumber.equals("1")) {
//					part[0].member.add(tempPeople);
					part.get("인사팀").member.add(tempPeople);
				} else if (selectNumber.equals("2")) {
//					part[1].member.add(tempPeople);
					part.get("개발팀").member.add(tempPeople);
				} else if (selectNumber.equals("3")) {
//					part[2].member.add(tempPeople);
					part.get("영업팀").member.add(tempPeople);
				}
			} else if (inputText.equals("2")) {
//				for (int j = 0; j < part.length; j++) {
//					System.out.println("" + part[j].name + "정보 출력");
//					for (int k = 0; k < part[j].member.size(); k++) {
//						System.out.println(part[j].member.get(k));
//					}
//				}
				for (int j = 0; j < part.get("인사팀").member.size(); j++) {
					System.out.println(part.get("인사팀").member.get(j));
				}
				for (int j = 0; j < part.get("개발팀").member.size(); j++) {
					System.out.println(part.get("개발팀").member.get(j));
				}
				for (int j = 0; j < part.get("영업팀").member.size(); j++) {
					System.out.println(part.get("영업팀").member.get(j));
				}
				
			} else if (inputText.equals("3")) {
				System.out.println("수정할 이름을 입력하세요");
				String targetName = scanner.nextLine();
				System.out.println("수정할 인원이 속한 부서를 선택해주세요.");
				System.out.println("1: 인사팀");
				System.out.println("2: 개발팀");
				System.out.println("3: 영업팀");
				String selectNumber = scanner.nextLine();
				Part selectPart = null;
				if (selectNumber.equals("1")) {
					selectPart = part.get("인사팀");
				} else if (selectNumber.equals("2")) {
					selectPart = part.get("개발팀");
				} else if (selectNumber.equals("3")) {
					selectPart = part.get("영업팀");
				}
				People selectPeople = null;
				for (int j = 0; j < selectPart.member.size(); j++) {
					if (selectPart.member.get(j).name.equals(targetName)) {
						selectPeople = selectPart.member.get(j);
					}
				}
				if (selectPeople != null) {
					System.out.println("수정할 직위를 입력해주세요.");
					selectPeople.position = scanner.nextLine();
					System.out.println("수정할 담당 업무를 입력해주세요");
					selectPeople.work = scanner.nextLine();
				}
			} else if (inputText.equals("exit")) {
				break;
			}
		}
	}
}
