import java.util.Arrays;

public class StdScoreExec {
	public static void main(String[] args) {
		StdScore[] std = { new StdScore("two", 20, 20), new StdScore("three", 30, 30), new StdScore("four", 40, 40),
				new StdScore("six", 60, 60), new StdScore("seven", 70, 70), new StdScore("five", 50, 50),
				new StdScore("eight", 80, 80), new StdScore("nine", 90, 90), new StdScore("ten", 100, 100),
				new StdScore("one", 10, 10) };

		// 학생의 평균 출력
		for (int i = 0; i < std.length; i++) {
			std[i].printScore();
		}

		// 성적순으로 출력하는 코드
		for (int j = 0; j < std.length; j++) {
			for (int k = j + 1; k < std.length; k++) {
				if (std[j].stdlAvg > std[k].stdlAvg) {
					StdScore temp = std[j];
					std[j] = std[k];
					std[k] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(std));

	}

}
