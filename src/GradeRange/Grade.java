package GradeRange;

import java.io.IOException;
import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import boundary.letterGradeByBoundaryTest;

import Partitioning.letterGradeByPartitioningTest;
import boundary.letterGradeByBoundaryTest;

public class Grade {
	public static void main(String[] args) {
		// 先跑全部的測試

		Result result = JUnitCore.runClasses(letterGradeByBoundaryTest.class,
				letterGradeByPartitioningTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

		// 給使用者輸入input
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a grade:");
			String input = sc.nextLine();
			if (input.equals("exit")) {
				break; 
			}
			int grade = Integer.parseInt(input);
			System.out.println("your letterGrade is : "
					+ LetterGrade.letterGrade(grade));
		}
		sc.close();

	}

}
