import java.util.ArrayList;
import java.util.Scanner;

public class Exec {
	public static void main(String[] args) {
		ArrayList<Company> com = new ArrayList<Company>();
		Scanner s = new Scanner(System.in);

		for (int j = 0; j < 999; j++) {
			try {

				System.out.println("수행하실 업무를 입력해주세요.");
				System.out.println("1. 사원정보 입력");
				System.out.println("2. 사원정보 출력");
				System.out.println("3. 부서별 사원 조회");
				System.out.println("4. 직위별 사원 조회");
				System.out.println("5. 사원정보 수정");
				String user = s.nextLine();
				if (user.equals("1")) { // 사원정보 입력
					System.out.println("사원정보 입력");
					com.add(new Company());
				} else if (user.equals("2")) { // 사원정보 출력
					for (int i = 0; i < com.size(); i++) {
						System.out.println(com.get(i));
					}
				} else if (user.equals("3")) { // 모든 부서 조회 가능
					System.out.println("조회하실 부서를 입력하세요.");
					String userInput = s.nextLine();
					ArrayList<Company> temp = new ArrayList<Company>();
					for (int i = 0; i < com.size(); i++) { // 부서별 조회 후 일치하면 템프 리스트에 넣어주기
						if (userInput.equals(com.get(i).department)) {
							String name = com.get(i).name;
							String department = com.get(i).department;
							String position = com.get(i).position;
							String workPart = com.get(i).workPart;
							temp.add(new Company(name, department, position, workPart));
						}
					}
					System.out.println(temp.size() + "명의 직원이 조회되었습니다.");
					System.out.println(userInput + " 직원 목록");
					for (int k = 0; k < temp.size(); k++) { // 템프리스트 출력
						System.out.println((k + 1) + "." + temp.get(k));
					}
					System.out.println();

				} else if (user.equals("4")) { // 모든 직위 조회 가능
					System.out.println("조회하실 직위를 입력하세요.");
					String userInput = s.nextLine();
					ArrayList<Company> temp = new ArrayList<Company>();
					for (int i = 0; i < com.size(); i++) { // 직위 조회 후 일치하면 템프 리스트에 넣어주기
						if (userInput.equals(com.get(i).position)) {
							String name = com.get(i).name;
							String department = com.get(i).department;
							String position = com.get(i).position;
							String workPart = com.get(i).workPart;
							temp.add(new Company(name, department, position, workPart));
						}
					}
					System.out.println(temp.size() + "명의 직원이 조회되었습니다.");
					System.out.println(userInput + " 직위 사원 목록");
					for (int k = 0; k < temp.size(); k++) { // 템프리스트 출력
						System.out.println((k + 1) + "." + temp.get(k));
					}
					System.out.println();
				} else if (user.equals("5")) {
					System.out.println("수정하실 사원의 이름을 입력하세요");
					String fixName = s.nextLine();
					System.out.println("수정하실 사원의 직위을 입력하세요");
					String fixPosition = s.nextLine();
					for (int i = 0; i < com.size(); i++) {
						if ((fixName.equals(com.get(i).name)) && (fixPosition.equals(com.get(i).position))) {
							System.out.println(com.get(i).name + " 사원의 정보를 수정합니다.");
							System.out.println("수정하실 항목을 입력하세요");
							System.out.println("1.부서 \n2.직위\n3.담당업무");
							String fixMenu = s.nextLine();
							if (fixMenu.equals("1")) {
								System.out.println(com.get(i).name + " 사원의 부서를 입력하세요.");
								com.get(i).department = s.nextLine();
							} else if (fixMenu.equals("2")) {
								System.out.println(com.get(i).name + " 사원의 직위를 입력하세요.");
								com.get(i).position = s.nextLine();
							} else if (fixMenu.equals("3")) {
								System.out.println(com.get(i).name + " 사원의 담당 업무를 입력하세요.");
								com.get(i).workPart = s.nextLine();
							} else {
								System.out.println("다시 입력하세요.");
							}

						}else {
							System.out.println("일치하는 직원이 존재하지 않습니다.");
						}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("다시 입력해주세요.");
			}

		}
	}

}
