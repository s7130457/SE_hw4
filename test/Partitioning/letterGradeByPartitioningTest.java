package Partitioning;

import junit.framework.Assert;
import org.junit.Test;

import GradeRange.Grade;
import GradeRange.LetterGrade;

public class letterGradeByPartitioningTest {
	LetterGrade grade = new LetterGrade();
	
	@Test
	public void scoreIs101() {
		Assert.assertEquals('X', grade.letterGrade(101));
	}
	@Test
	public void scoreIs95() {
		Assert.assertEquals('A', grade.letterGrade(95));
	}
	@Test
	public void scoreIs85() {
		Assert.assertEquals('B', grade.letterGrade(85));
	}
	@Test
	public void scoreIs75() {
		Assert.assertEquals('C', grade.letterGrade(75));
	}
	@Test
	public void scoreIs65() {  
		Assert.assertEquals('D', grade.letterGrade(65));
	}
	@Test
	public void scoreIs55() {
		Assert.assertEquals('F', grade.letterGrade(55));
	}
	@Test
	public void scoreIsMinus5() {
		Assert.assertEquals('X', grade.letterGrade(-5));
	}
}
