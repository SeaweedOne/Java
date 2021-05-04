import java.util.Scanner;

public class Company {
	String name;
	String department;
	String position;
	String workPart;

	Company() {
		Scanner s = new Scanner(System.in);
		System.out.println("해당 사원의 이름을 입력하세요.");
		this.name = s.nextLine();
		System.out.println("해당 사원의 부서를 입력하세요.");
		this.department = s.nextLine();
		System.out.println("해당 사원의 직위를 입력하세요.");
		this.position = s.nextLine();
		System.out.println("해당 사원의 담당업무를 입력하세요.");
		this.workPart = s.nextLine();
	}

	Company(String name, String department, String position, String workPart) {
		this.name = name;
		this.department = department;
		this.position = position;
		this.workPart = workPart;
	}

	public String toString() {
		return "이름 : " + this.name + " 부서 : " + this.department + " 직위 : " + this.position + " 담당업무 : " + this.workPart;
	}

}
