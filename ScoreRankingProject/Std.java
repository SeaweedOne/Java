
public class Std {
	String name;
	int mid;
	int fin;
	int stdTotal;
	double stdAvg;
	int rank;
	
	public void clac() {
		this.stdTotal = this.fin + this.mid;
		this.stdAvg = this.stdTotal/(double)2;
	}
	
	Std(){
		this.name = this.name;
		this.clac();
	}
	Std(String name){
		this.name = name;
		this.mid = this.mid;
		this.fin = this.fin;
		this.clac();
	}
	Std(String name , int mid, int fin){
		this.name = name;
		this.mid = mid;
		this.fin = fin;
		this.clac();
	}
	
	
	public void printTotalAvg() {
		this.clac();
		System.out.println(this.name + "의 총점은 " + this.stdTotal +
				" 평균은 " + this.stdAvg + "입니다."); 
	}
	public String toString() {
		return this.name + " ( " + this.mid +" , " + this.fin +" )";
		
	}

}
