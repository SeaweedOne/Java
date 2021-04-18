
public class Hanoi {
	
	public static void hanoisTower(String first, String center, String last, int num){
		int count = 0;
		if (num ==1) {
			count++;
			System.out.println(num + " : " + first +" -> " + last);	
			return;
		}else {
			hanoisTower(first,center, last, num-1);
			count++;
			System.out.println(num + " : " + first +" -> " + last);
			hanoisTower(first, center, last, num-1);
		}
	}
	
	public static void main(String[] args) {
		hanoisTower("first","center","last",3);
//		System.out.println("result" + count );
		
		
	}

}
