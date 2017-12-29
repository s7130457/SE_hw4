package GradeRange;

import java.io.IOException;
import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import boundary.letterGradeByboundaryTest;

import Partitioning.letterGradeByPartitioningTest;
import boundary.letterGradeByboundaryTest;

public class Grade {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.print("Enter a grade:"); 
			String input=  sc.nextLine(); 
			if(input.equals("exit")){
				System.exit(0);				
				sc.close();
			}
			int grade = Integer.parseInt(input);
			System.out.println("your letterGrade is : "+letterGrade(grade)); 
		}
	}

	public static char letterGrade(int score) {
		char grade;
		if (score < 0 || score > 100) 
			grade = 'X';
		else if (score >= 90 && score <= 100)
			grade = 'A';
		else if (score >= 80 && score < 90)
			grade = 'B';
		else if (score >= 70 && score < 80)
			grade = 'C';
		else if (score >= 60 && score < 70)
			grade = 'D';
		else
			grade = 'F';
		return grade;
	}
/*Result result = JUnitCore.runClasses(letterGradeByboundaryTest.class,
				letterGradeByPartitioningTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());*/
}
