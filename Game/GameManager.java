import java.util.Random;
import java.util.Scanner;
public class GameManager {
	
	public void play() {
		Player[] player = { new PlayerType1("하나"), new PlayerType2("지효"), new PlayerType3("경율") };
		Enemy[] enemy = { new EnemyType1("김일성"), new EnemyType2("김정일"), new EnemyType3("김정은") };

		Random r = new Random();
		for (int i = 0; i < 999999; i++) {
			System.out.println();
			System.out.println((i + 1) + "Round");
			System.out.println("<Player Attack!>");
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				System.out.println("공격하실 상대의 번호를 입력하세요." + "\n1.김일성\n2.김정일\n3.김정은");
				Scanner s = new Scanner(System.in);
				int attackTarget = s.nextInt();
				if (player[playerIndex].isLive() && enemy[attackTarget - 1].isLive()) {
					player[playerIndex].attack(enemy[attackTarget - 1]);
				}
			}

			System.out.println();
			System.out.println("<Enemy Attack!>");
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				int attackTarget = r.nextInt(player.length);
				if (enemy[enemyIndex].isLive() && player[attackTarget].isLive()) {
					enemy[enemyIndex].attack(player[attackTarget]);
				}
			}
			boolean isPlayerLive = false;
			for (int playerIndex = 0; playerIndex < player.length; playerIndex++) {
				if (player[playerIndex].isLive()) {
					isPlayerLive = true;
				}
			}
			boolean isEnemyLive = false;
			for (int enemyIndex = 0; enemyIndex < enemy.length; enemyIndex++) {
				if (enemy[enemyIndex].isLive()) {
					isEnemyLive = true;
				}
			}
			if (isPlayerLive && !isEnemyLive) {
				System.out.println("플레이어 승리");
				break;
			} else if (!isPlayerLive && isEnemyLive) {
				System.out.println("적 승리");
				break;
			}
		}
	}
}

