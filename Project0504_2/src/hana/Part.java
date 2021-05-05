import java.util.ArrayList;

public class Part {
	String name;
	ArrayList<People> member;
	
	Part(String name){
		this.name = name;
		this.member =  new ArrayList<People>();
	}

}