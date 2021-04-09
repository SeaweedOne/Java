
public class Base {
	int hp;
	int power;
	String name;
	int defense;

	public boolean isLive() {
		if (this.hp < 1) {
			return false;
		}
		return true;
	}
}
