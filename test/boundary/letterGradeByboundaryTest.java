package boundary;

import junit.framework.Assert;

import org.junit.Test;

import GradeRange.Grade;

public class letterGradeByBoundaryTest {
	@Test
	public void scoreIs101() {
		Assert.assertEquals('X', Grade.letterGrade(101));
	}
	@Test
	public void scoreIs100() {
		Assert.assertEquals('X', Grade.letterGrade(101));
	}
	@Test
	public void scoreIs99() {
		Assert.assertEquals('A', Grade.letterGrade(99));
	}
	@Test
	public void scoreIs91() { 
		Assert.assertEquals('A', Grade.letterGrade(91));
	}
	@Test
	public void scoreIs90() {
		Assert.assertEquals('A', Grade.letterGrade(90)); 
	}
	@Test
	public void scoreIs89() {
		Assert.assertEquals('B', Grade.letterGrade(89));
	}
	@Test
	public void scoreIs81() {
		Assert.assertEquals('B', Grade.letterGrade(81));
	}
	@Test
	public void scoreIs80() {
		Assert.assertEquals('B', Grade.letterGrade(80));
	}
	@Test
	public void scoreIs79() {
		Assert.assertEquals('C', Grade.letterGrade(79));
	}
	@Test
	public void scoreIs71() {
		Assert.assertEquals('C', Grade.letterGrade(71));
	}
	@Test
	public void scoreIs70() {
		Assert.assertEquals('C', Grade.letterGrade(70));
	}
	@Test
	public void scoreIs69() {
		Assert.assertEquals('D', Grade.letterGrade(69));
	}
	@Test
	public void scoreIs61() {
		Assert.assertEquals('D', Grade.letterGrade(61));
	}
	@Test
	public void scoreIs60() {
		Assert.assertEquals('D', Grade.letterGrade(60));
	}
	@Test
	public void scoreIs59() {
		Assert.assertEquals('F', Grade.letterGrade(59));
	}
	@Test
	public void scoreIs1() {
		Assert.assertEquals('F', Grade.letterGrade(1));
	}
	@Test
	public void scoreIs0() {
		Assert.assertEquals('F', Grade.letterGrade(0));
	}
	@Test
	public void scoreIsMinus1() {
		Assert.assertEquals('X', Grade.letterGrade(-1));
	}
}
