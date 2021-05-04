import java.util.Scanner;
import com.kopo.Test;

public class Exec {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		java.util.Date d1 = new java.util.Date();
		//java.sql.Date d2 = new java.sql.Date();
		
		com.kopo.Test t1 = new Test();
		
		int a = 10;//기본데이터 
		double b = 20;
		Integer c = 20; //객체데이터 
		Double d = 10.0;
		Double d_2= new Double(10.0);
		//기본 ->객체 = 박싱
		//객채 ->기본 = 언박싱
		//포매터 = 문자열을 쓰기 위해 사용 
		//나는 꼭 4자리에 맞춰서 숫자를 표시하고싶어..
		for (int i =0; i <101; i++) {
			System.out.println("그냥 출력\n" + i); //네자리가 아니잖아 ㅠㅠ 
			String tmpString = String.format("네자리 맞추기\n"+"%4d",i);
			String tmpString2 = String.format("네자리앞에 0채우기\n"+"%04d",i);
			System.out.println(tmpString);
			System.out.println(tmpString2);
			
		} 
		
	}

}
