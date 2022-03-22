import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lambda.UserRegistration;

public class UserRegistrationTest {
	UserRegistration j = new UserRegistration();

	/*
	 * this Test case is used to check our first name passes given regex pattern
	 */
	@Test
	public void testFirstName() {
  
		boolean result = j.FirstName("Shital");
		                                                // assertTrue(result);
		assertEquals(true, result);
	}

	/* 
	 * this Test case is used to check our last name passes given regex pattern 
	 */
	@Test
	public void testLastName() {

		boolean result = j.LastName("pachpoR");
		                                                // assertTrue(result);
		assertEquals(true, result);
	}

	/* 
	 * this Test case is used to check our email passes given regex pattern 
	 */
	@Test
	public void testEmail() {

		boolean result = j.Email("xyz.abc@bl.co.in");
		// assertTrue(result);
		assertEquals(true, result);
	}

	/*
	 * this Test case is used to check our MobileNumber passes given regex pattern
	 */

	@Test
	public void testMobileNum() {

		boolean result = j.MobileNum("91 9989453701");
		                                               // assertTrue(result);
		assertEquals(true, result);
	}

	/*
	 * this Test case is used to check our minimum 8 character password passes given
	 * regex pattern /* Test case used to test atleast one Special char
	 */
	@Test
	public void testPassword() {

		boolean result = j.PasswordAtleastOneSpecialChar("xyx@123A");
		                                                // assertTrue(result);
		assertEquals(true, result);
	}
}
