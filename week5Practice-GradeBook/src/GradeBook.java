
public class GradeBook {
	private String courseName;
	public void setCourseName(String name)
	{
		courseName= name;
	}
	public String getCourseName()
	{
		return courseName;
	}
	public void displayMessage()
	{
		System.out.printf("Welcome to the gradebook %s!\n",getCourseName());
	}
	public GradeBook() {
		
	}
	
	public GradeBook(String name) {
		courseName = name;
	}
	
}
