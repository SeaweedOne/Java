import java.util.Random;

public class PlayerType3 extends Player {
	public PlayerType3(String name) {
		Random r = new Random();
		this.hp = 10;
		this.power = r.nextInt(10)+1;
		this.name = name;
		this.defense = 10;
	}
	@Override
	public void attack(Base enemy) {
		int damage = this.power - enemy.defense;
		if (damage <= 0) {
			System.out.println(this.name + "가 공격에 실패했습니다.");
		} else {
			System.out.println("공격에 성공했습니다.");
			enemy.hp = enemy.hp - damage;
			System.out.println(this.name + "가 " + enemy.name + "에게 " + damage + "의 피해를 입혔다.\n"+
			"남은 체력 : " + this.hp);
			if (!enemy.isLive()) {
				System.out.println(this.name + "가 " + enemy.name + "을 파괴했다.");
			}
		}
	}
}
