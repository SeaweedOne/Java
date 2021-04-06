
public class ScoreData {
	public String name;
	public int midterm;
	public int finalExam;
	public int total;
	public double avg;

	ScoreData(String name, int midterm, int finalExam) {
		this.name = name;
		this.midterm = midterm;
		this.finalExam = finalExam;
		this.total = this.midterm + this.finalExam;
		this.avg = (this.midterm + this.finalExam) / (double) 2;
	}

	public void printInfo() {

		System.out.println(this.name + " 학생의 총점은 " + this.total + "점. 평균 점수는 " + this.avg + "점 입니다.");
	}

	public String toString() {
		return this.name + " : " + this.avg;
	}
}