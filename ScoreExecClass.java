import java.util.Arrays;

public class ScoreExecClass {
	public static void main(String[] args) {
		ScoreData[] score = { new ScoreData("a1", 100, 100), new ScoreData("a2", 100, 90), new ScoreData("a3", 100, 80),
				new ScoreData("a4", 100, 70), new ScoreData("a5", 100, 60), new ScoreData("a6", 100, 50),
				new ScoreData("a7", 100, 40), new ScoreData("a8", 100, 30), new ScoreData("a9", 100, 20),
				new ScoreData("a10", 100, 10), };

		for (int j = 0; j < 10; j++) {
			score[j].printInfo();
		}

		int totalMidScore = 0;
		int totalFinScore = 0;
		int totalScore = 0;
		for (int i = 0; i < score.length; i++) {
			totalMidScore = totalMidScore + score[i].midterm;
			totalFinScore = totalFinScore + score[i].finalExam;
			totalScore = totalScore + score[i].total;
		}
		double midAvg = totalMidScore / (double) score.length;
		double finAvg = totalFinScore / (double) score.length;
		double totalAvg = totalScore / (double) score.length;

		System.out.println("중간고사 총점 : " + totalMidScore + " 중간고사 평균 : " + midAvg);
		System.out.println("기말고사 총점 : " + totalFinScore + " 기말고사 평균 : " + finAvg);
		System.out.println("전체 총점 : " + totalScore + " 전체 평균 : " + totalAvg);

		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i].total < score[j].total) {
					ScoreData temp = score[i];
					score[i] = score[j];
					score[j] = temp;

				}
			}
		}System.out.println(Arrays.toString(score));

	}

}
