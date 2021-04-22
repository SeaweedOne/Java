import java.util.Scanner;

public class Store {
	int sales = 0; //총매출액
	int bread = 100;
	int milk = 200;
	int choco = 300;
	int icecream = 400; 
	int breadCnt = 0, milkCnt = 0, chocoCnt = 0, icecreamCnt = 0; //판매수량체크 
	int price; //선택한상품가격 (소비자 개별 구매금액 누적을 위해 리턴값으로 돌려주기 위해 정의)

	Store() {
		this.sales = this.sales;
	}

	public void menu() { //메뉴출력
		System.out.println("구매하실 물건을 선택해주세요.");
		System.out.println("1. 빵 100원\n2. 우유 200원\n3. 초콜릿 300원\n4. 아이스크림 400원");
	}

	public void buy(String userInput) {
		this.price = 0; //상품가격 리셋 
		if (userInput.equals("1") || userInput.equals("빵")) { //상품번호 혹은 상품명을 입력하면 input메소드를 통해 if문으로 들어옴
			System.out.println("빵(" + this.bread + "원)을 구매하셨습니다.");
			this.price = this.bread;
			this.sales += this.bread;
			this.breadCnt++;
		} else if (userInput.equals("2") || userInput.equals("우유")) {
			System.out.println("우유(" + this.milk + "원)을 구매하셨습니다.");
			this.price = this.milk;
			this.sales += this.milk;
			this.milkCnt++;
		} else if (userInput.equals("3") || userInput.equals("초콜릿")) {
			System.out.println("초콜릿(" + this.choco + "원)을 구매하셨습니다.");
			this.price = this.choco;
			this.sales += this.choco;
			this.chocoCnt++;
		} else if (userInput.equals("4") || userInput.equals("아이스크림")) {
			System.out.println("빵(" + this.icecream + "원)을 구매하셨습니다.");
			this.price = this.icecream;
			this.sales += this.icecream;
			this.icecreamCnt++;
		}
	}

	public int returnInt() { //유저가 선택한 상품 가격 리턴
		return price;
	}

	public String toString() { //매출현황 출력
		return "매출 현황\n판매 물품 수량 \n빵 " + this.breadCnt + "개\n우유 " + this.milkCnt + "개\n초콜릿 " + this.chocoCnt
				+ "개 \n아이스크림 " + this.icecreamCnt + "개\n총 매출액은 " + this.sales + "원 입니다.";
	}
}
