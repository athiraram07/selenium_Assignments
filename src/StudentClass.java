
public class StudentClass {//blueprint of student as an object is ready

	//Attributes
	int StudentId;
	String studentName;
	int grade;
	char division;
	long mobileNo;
	String universityName;
	String address;
	
	//Behavior
	public void attendLectures()
	{
		System.out.println("Students are attending the lectures");
	}
	
	public void groupStudy()
	{
		System.out.println("Students together are doing group study");
	}
	
	public void giveExams()
	{
		System.out.println("Itss exam time!");
	}
	
	public void Assignments()
	{
		System.out.println("Students submitting assignment");
	}
	
	public static void main(String[] args) {
		
		StudentClass st5 = new StudentClass();
		st5.StudentId = 3;
		st5.studentName = "Athira";
	}
}