package week3.day1;

public class StudentDetails extends Department{

	public void studentName() {
		System.out.println("Bala Vignesh");
	}
	
	public void studentId() {
		System.out.println("Id-3924");
	}
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		sd.collegeCode();
		sd.collegeName();
		sd.collegeRank();
		sd.deptName();
		sd.studentId();
		sd.studentName();
	}
	}