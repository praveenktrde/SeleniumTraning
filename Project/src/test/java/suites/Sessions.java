package suites;

import org.testng.annotations.Test;

public class Sessions extends BaseTest {

	@Test
	public void login() {
		System.out.println("Do Login");
	app.click(null);

	}

	@Test
	public void logout() {
		System.out.println("Do logout");


	}
}
