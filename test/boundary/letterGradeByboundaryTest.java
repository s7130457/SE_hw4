package boundary;

import junit.framework.Assert;

import org.junit.Test;

import GradeRange.Grade;
import GradeRange.LetterGrade;

public class letterGradeByBoundaryTest {
	LetterGrade grade = new LetterGrade();
	
	@Test
	public void scoreIs101() {
		Assert.assertEquals('X', grade.letterGrade(101));
	}
	@Test
	public void scoreIs100() {
		Assert.assertEquals('X', grade.letterGrade(101));
	}
	@Test
	public void scoreIs99() {
		Assert.assertEquals('A', grade.letterGrade(99));
	}
	@Test
	public void scoreIs91() { 
		Assert.assertEquals('A', grade.letterGrade(91));
	}
	@Test
	public void scoreIs90() {
		Assert.assertEquals('A', grade.letterGrade(90)); 
	}
	@Test
	public void scoreIs89() {
		Assert.assertEquals('B', grade.letterGrade(89));
	}
	@Test
	public void scoreIs81() {
		Assert.assertEquals('B', grade.letterGrade(81));
	}
	@Test
	public void scoreIs80() {
		Assert.assertEquals('B', grade.letterGrade(80));
	}
	@Test
	public void scoreIs79() {
		Assert.assertEquals('C', grade.letterGrade(79));
	}
	@Test
	public void scoreIs71() {
		Assert.assertEquals('C', grade.letterGrade(71));
	}
	@Test
	public void scoreIs70() {
		Assert.assertEquals('C', grade.letterGrade(70));
	}
	@Test
	public void scoreIs69() {
		Assert.assertEquals('D', grade.letterGrade(69));
	}
	@Test
	public void scoreIs61() {
		Assert.assertEquals('D', grade.letterGrade(61));
	}
	@Test
	public void scoreIs60() {
		Assert.assertEquals('D', grade.letterGrade(60));
	}
	@Test
	public void scoreIs59() {
		Assert.assertEquals('F', grade.letterGrade(59));
	}
	@Test
	public void scoreIs1() {
		Assert.assertEquals('F', grade.letterGrade(1));
	}
	@Test
	public void scoreIs0() {
		Assert.assertEquals('F', grade.letterGrade(0));
	}
	@Test
	public void scoreIsMinus1() {
		Assert.assertEquals('X', grade.letterGrade(-1));
	}
}
