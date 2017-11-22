import java.util.Scanner; 

	public class GradeBookTest
		{
	private String courseName;
		
		public void setCourseName( String name )
		{
			courseName = name; 
		} 
		
		public String getCourseName()
		{
		return courseName;
		} 
		
		public void displayMessage()
		{
			System.out.printf( "Welcome to the grade book for\n%s!\n",getCourseName() );
		}

			public static void main( String[] args )
				{
					Scanner input = new Scanner( System.in );
					GradeBookTest myGradeBook = new GradeBookTest();
					
					System.out.printf( "Initial course name is: %s\n\n",myGradeBook.getCourseName());
					System.out.println( "Please enter the course name:" );
					String theName = input.nextLine(); 
					myGradeBook.setCourseName( theName );
					System.out.println();
					myGradeBook.displayMessage();
				
				
				}
		}
