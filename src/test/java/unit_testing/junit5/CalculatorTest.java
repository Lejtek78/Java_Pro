package unit_testing.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math operation in Calculator class")
class CalculatorTest {

	// Arrange global
	Calculator calculator = new Calculator();
	
	@Test
	@DisplayName("Test 4/2=2")
	void testIntegerDivision_FourDividedByTwo_ShouldReturnTwo() {
		// Arrange
		int dividend = 4;
		int divisor = 2;
		int expectedResult = 2;
		
		// Act
		int actualResult = calculator.integerDivision(dividend, divisor);
		
		// Assert
		assertEquals(expectedResult, actualResult, ()->dividend + " / " + divisor + " did not produce " + expectedResult);
	}
	
	@Test
	@DisplayName("Test 5-2=3")
	void testIntegerSubtraction_FiveSubtractedByTwo_ShouldReturnThree() {
		// Arrange
		int minuend = 5;
		int subtrahend = 2;
		int expectedResult = 3;
		
		// Act
		int actualResult = calculator.integerSubtraction(minuend, subtrahend);
		
		// Assert
		assertEquals(expectedResult, actualResult, ()->minuend + " - " + subtrahend + " did not produce " + expectedResult);
	}
	
	@Test
	@DisplayName("Test 4+5=9")
	void testIntegerAddition_FiveAddedToFour_ShouldReturnNine() {
		// Arrange
		int summand1 = 4;
		int summand2 = 5;
		int expectedResult = 9;
		
		// Act
		int actualResult = calculator.integerAddition(summand1, summand2);
		
		// Assert
		assertEquals(expectedResult, actualResult, ()->summand1 + " + " + summand2 + " did not produce " + expectedResult);
	}

	@Test
	@DisplayName("Test 3*4=12")
	void testIntegerMultiplication_ThreeMultipliedByFour_ShouldReturnTwelve() {
		// Arrange
		int factor1 = 3;
		int factor2 = 4;
		int expectedResult = 12;
		
		// Act
		int actualResult = calculator.integerMultiplication(factor1, factor2);
		
		// Assert
		assertEquals(expectedResult, actualResult, ()->factor1 + " * " + factor2 + " did not produce " + expectedResult);
	}
}
