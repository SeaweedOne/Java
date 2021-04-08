import java.util.Random;

public class EnemyType3 extends Enemy {
	public EnemyType3(String name) {
		Random r = new Random();
		this.hp = 10;
		this.power = r.nextInt(10)+1;
		this.name = name;
		this.defense = 3;
	}
	@Override
	public void attack(Base player) {
		int damage = this.power - player.defense;
		if (damage <= 0) {
			System.out.println(this.name + "가 공격에 실패했습니다.");
		} else {
			player.hp = player.hp - damage;
			System.out.println(this.name + "가 " + player.name + "에게 " + damage + "의 피해를 입혔다.\n"+
					"남은 체력 : " + this.hp);
			if (!player.isLive()) {
				System.out.println(this.name + "가 " + player.name + "을 파괴했다.");
			}
		}
	}
}
