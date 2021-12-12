package week3.day1;
public class StudentInfo {
	public void getStudentInfo(int id) {
	System.out.println("student id:"+id);
	}
	public void getStudentInfo(String name) {
	System.out.println("student name:"+name);
	}
	public void getStudentInfo(String emailid,long phonenumber) 
	{
	System.out.println("student email:"+emailid);
	System.out.println("student phonenumber:"+phonenumber);
	}
	public static void main(String[] args) {
		StudentInfo std=new StudentInfo();
		std.getStudentInfo(543);
		std.getStudentInfo("Balavignesh");
		std.getStudentInfo("balavigneshpitchai@gmail.com",7010945081L);
	}
}