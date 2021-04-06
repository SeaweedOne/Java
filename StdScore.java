
public class StdScore {
	public String name;
	public int midScore;
	public int finalScore;
	public int stdTotla;
	public double stdlAvg;
	//생성자를 통한 점수 정보 input
	StdScore(String name, int midScore, int finalScore) {
		this.name = name;
		this.midScore = midScore;
		this.finalScore = finalScore;
		this.stdTotla = this.midScore + this.finalScore;
		this.stdlAvg = this.stdTotla / (double) 2;

	}
	//점수 출력 메소드 
	public void printScore() {
		System.out.println("성명 : " + this.name + "\n중간/기말 점수 : " + this.midScore + "/" + this.finalScore + " 총점 :"
				+ this.stdTotla + " 평균 : " + this.stdlAvg);
	}

	@Override
	public String toString() {
		return this.name + " : " + this.stdlAvg;
	}

}
