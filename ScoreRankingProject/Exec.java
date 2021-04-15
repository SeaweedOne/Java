import java.util.Arrays;
import java.util.Random;

public class Exec {
	public static void main(String[] args) {

		Std[] std1 = { new Std("aa"), new Std("bb"), new Std("cc") };
		int stdLen = std1.length;

		System.out.println("-----학생정보출력-----");
		Random r = new Random(); // 랜덤 점수 넣기
		for (int i = 0; i < stdLen; i++) {
			std1[i].mid = r.nextInt(2);
			std1[i].fin = r.nextInt(2);
			System.out.println(std1[i]);
		}

		System.out.println("-----학생평균출력-----");
		for (int i = 0; i < stdLen; i++) {
			std1[i].printTotalAvg();
		}

		for (int j = 0; j < stdLen; j++) { // 성적순 정렬
			for (int k = (j + 1); k < stdLen; k++) {
				Std temp = std1[j];
				if (std1[j].stdTotal < std1[k].stdTotal) {
					std1[j] = std1[k];
					std1[k] = temp;
				}
			}
		}

		for (int i = 0; i < stdLen; i++) { // 순위세팅
			std1[i].rank = i + 1;

			if (i > 0) {
				if (std1[i - 1].stdTotal == std1[i].stdTotal) {
					std1[i].rank = std1[i - 1].rank;
				}
			}
			System.out.println(std1[i].rank + "등 " + std1[i].toString());

		}

	}
}
