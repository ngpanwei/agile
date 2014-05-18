package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	@Test
	public void triangleHasAllPositiveSides() {
		assertTrue(new Triangle(2,2,2).isValid()) ;
		assertFalse(new Triangle(-2,2,2).isValid()) ;
		assertFalse(new Triangle(2,-2,2).isValid()) ;
		assertFalse(new Triangle(2,2,-2).isValid()) ;
	}
	@Test
	public void twoSidesBiggerThanThird() {
		assertFalse(new Triangle(2,2,4).isValid()) ;
	}
	@Test
	public void isoscelesHasTwoEqualSides() {
		assertTrue(new Triangle(2,2,3).isIsosceles()) ;
	}	
	@Test
	public void equilateralHas3EqualSides() {
		assertTrue(new Triangle(2,2,2).isEquilateral()) ;
	}
	@Test
	public void scaleneHasNoEqualSides() {
		assertFalse(new Triangle(-4,-3,-5).isScalene()) ;
		assertFalse(new Triangle(2,2,2).isScalene()) ;
		assertFalse(new Triangle(2,2,3).isScalene()) ;
	}		
}
