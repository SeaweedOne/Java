
public class Customer {
	String name;
	int total = 0; //소비자별 구매금액 총액 누적을 위한 변수.

	Customer(String name) {
		this.name = name;
		this.total = this.total;
	}

	public void input(int coin) { //상점 클래스에서 리턴값으로 넘겨준 상품 가격을 토탈에 누적시킴 
		this.total += coin; //소비자 구매현황 출력 
		System.out.println(this.name + "님의 누적구매 금액은 " + this.total + "원 입니다.");
	}

}
