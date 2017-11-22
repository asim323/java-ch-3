import java.util.Scanner; 

public class GradeBookTest
 {
	public void displayMessage( String CourseName )
	{
		System.out.printf( "Welcome to the grade book for\n%s!\n",CourseName );
	}
	

		public static void main( String[] args )
		{

		Scanner input = new Scanner( System.in );
		
 		GradeBookTest myGradeBook = new GradeBookTest();

			System.out.println( "Please enter the course name:" );
			String nameOfCourse = input.nextLine();
 			System.out.println(); 
 
 		myGradeBook.displayMessage( nameOfCourse );
		} 
} 

