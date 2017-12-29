package Partitioning;

import junit.framework.Assert;
import org.junit.Test;

import GradeRange.Grade;

public class letterGradeByPartitioningTest {
	@Test
	public void scoreIs101() {
		Assert.assertEquals('X', Grade.letterGrade(101));
	}
	@Test
	public void scoreIs95() {
		Assert.assertEquals('A', Grade.letterGrade(95));
	}
	@Test
	public void scoreIs85() {
		Assert.assertEquals('B', Grade.letterGrade(85));
	}
	@Test
	public void scoreIs75() {
		Assert.assertEquals('C', Grade.letterGrade(75));
	}
	@Test
	public void scoreIs65() {  
		Assert.assertEquals('D', Grade.letterGrade(65));
	}
	@Test
	public void scoreIs55() {
		Assert.assertEquals('F', Grade.letterGrade(55));
	}
	@Test
	public void scoreIsMinus5() {
		Assert.assertEquals('X', Grade.letterGrade(-5));
	}
}
