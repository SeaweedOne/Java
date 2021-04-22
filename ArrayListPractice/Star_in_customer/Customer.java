import java.util.Scanner;

public class Customer {
	String name;
	String number;
	int stars = 0; //웬만하면 따로관리!

	
	Customer(){
		Scanner s = new Scanner(System.in);
		System.out.println("고객의 이름을 입력하세요.");//고객이름받아오기 
		this.name = s.nextLine();
		System.out.println("고객의 번호를 입력하세요.");//고객 연락처 받아오기 
		this.number = s.nextLine();
	}
	
	Customer(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String toString() {
		return "고객명 " + this.name + " 전화번호 " + this.number + " 고객별점 " + this.stars;

	}

}
