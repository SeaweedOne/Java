import java.util.Scanner;

public class Customer {

	String name;
	String phone;

	Customer() {
		Scanner s = new Scanner(System.in);
		System.out.println("고객의 이름을 입력해주세요.");
		this.name = s.nextLine();
		System.out.println("고객의 전화번호를 입력해주세요.");
		this.phone = s.nextLine();
	}
	public String toString() {
		return "성명: " + this.name + " 휴대폰 번호 : " + this.phone;
	}

}
