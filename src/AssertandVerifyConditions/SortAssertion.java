package AssertandVerifyConditions;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class SortAssertion {

	@Test
	public void soft() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("soft assert started");
		assertion.assertEquals(12, 13);
		System.out.println("soft assert completed");
		assertion.assertAll();

	}

}
