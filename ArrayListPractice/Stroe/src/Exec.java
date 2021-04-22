import java.util.Scanner;

public class Exec {
	public static void main(String[] args) {
		Customer customer1 = new Customer("김자바");
		Customer customer2 = new Customer("박노드");
		Store store = new Store(); // for문 안에서 메소드 안의 프로퍼티들이 리셋되지 않도록 포문 밖에 정의

		Scanner s = new Scanner(System.in);
		try { // 예외처리를 위해 try catch문 사용
			for (int i = 0; i < 99; i++) {
				System.out.println("구매자를 선택해주세요.\n1. 김자바 \n2. 박노드\n3. 종료");
				String user = s.nextLine(); // 구매자 선태택 값을 String으로 받아옴.
				if (user.equals("1") || user.equals("김자바")) { // 해당 구매자의 번호/이름 을 입력하면 if문으로 들어올 수 있도록 선택의 폭을 넓혀줌
					store.menu(); // 메뉴출력
					String userInput = s.nextLine(); // 구매자 메뉴선택
					System.out.print(customer1.name + "님이 "); // 후에 구매자 이름이 바뀌더라도 처리가능하게 설정
					store.buy(userInput);// store.buy 메소드에 사용자가 선택한 값을 넣어줌.
					customer1.input(store.returnInt()); // store메소드에서 선택한 싱픔의 가격을 리턴값으로 받아옴. 그 값을 customer.input의 값으로넣어줌.
					System.out.println();
				} else if (user.equals("2") || user.equals("박노드")) { // 위의 과정과 같음.
					store.menu();
					String userInput = s.nextLine();
					System.out.print(customer2.name + "님이 ");
					store.buy(userInput);
					customer2.input(store.returnInt());
					System.out.println();
				} else if (user.equals("3") || user.equals("종료")) { // 종료문 선택시 store의 구매 현황 출력 후 break
					System.out.println(store);
					break;
				} else { // 보기에 없는 항목 선택시 다시 선택하도록 안내
					System.out.println("다시 선택해주세요.");
				}
			}
		} catch (Exception e) { // 잘못된 input 값으로 발생되는 에러를 막기 위해 예외처리
			System.out.println("다시 입력해주세요.");
			// TODO: handle exception
		}
	}

}
