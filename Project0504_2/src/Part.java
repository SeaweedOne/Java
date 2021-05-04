import java.util.ArrayList;

public class Part {
	String name;
	ArrayList<People> member;
	
	Part(String name) {
		this.name = name;
		member = new ArrayList<People>();
	}
}
