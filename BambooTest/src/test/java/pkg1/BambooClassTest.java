package pkg1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BambooClassTest {

	BambooClass obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() {
		obj=new BambooClass();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
		public void testAdd() {
	        int a = 15;
	        int b = 20;
	        int expectedResult = 35;
	        long result = obj.add(a, b);
	        Assert.assertEquals(expectedResult, result);;	}
	@Test
    public void testSubtract() {
        int a = 20;
        int b = 25;
        int expectedResult = 5;
        long result = obj.subtract(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = obj.multiply(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
    @Test
    public void testDivide() {
        int a = 10;
        int b = 56;
        double expectedResult = 5;
        double result = obj.divide(a, b);
        Assert.assertEquals(expectedResult, result, 0.0005);
    }
    
}
