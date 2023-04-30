package JUnitTesting;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Java_learning.Demo;
import Java_learning.EmployeeUtil;
import Java_learning.Test2;
import Java_learning.key_Value;

public class Test1 {
	Demo demo;
	Test2 t2;
	EmployeeUtil empUtil;
	key_Value keyValue;
	
	@BeforeEach
	public void setUp(){
		demo = new Demo();
		t2 = new Test2();
		empUtil = new EmployeeUtil();
		keyValue = new key_Value();
	}
	
//	@Test
//	public void check(){
//		boolean result = false;
//		assertTrue(result);
//	}
	
	
//	//AssertEqual
//	@Test
//	public void testsumOfDigit(){
//		int num = 1234;
//		int expectedOutput = 10;
//		assertEquals(expectedOutput,demo.sumOfDigit(num));
//	}
	
	//assertTrue or assertFalse
//	@Test
//	public void testisEven(){
//		int num = 20;
//		assertTrue(demo.inEven(num));
//		
//	}
//	@Test
//	public void testsumOfElements(){
//		int[] arr ={1,3,4,5,6};
//		int expectedOutput = 19;
//		assertEquals(expectedOutput,t2.sumOfElements(arr));
//	}
	
	
	//AssertArrayEqual
//	@Test
//	public void testOrderByFirstName(){
//		List<Employee> emps = new ArrayList<>();
//		emps.add(new Employee(1,"Varun","Kumar"));
//		emps.add(new Employee(2,"Akash","Swaroop"));
//		emps.add(new Employee(3,"Manoj","Kumar"));
//		String[] expectedArray = {"Akash","Manoj","Varun"};
//		assertEquals(expectedArray,empUtil.OrderByFirstName(emps));
//		
//	}
	
	 //assertNull:looking null object
	//assertNotNull:some
	@Test
	 public void testshowMap(){
		String key = "key3";
		//assertNull(keyValue.showMap(key));
		assertNotNull(keyValue.showMap(key));
	 }
	
//	assertSame
	
	//@Test
//	public void testAssertSame(){
	//	String str = "Java";
		//String str2 = new String("Java");
//		assertSame(str2,str);
//		assertSame(str2,str);
		//assertNotSame(str2,str);
	}


