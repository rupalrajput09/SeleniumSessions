package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();

		brUtil.initDriver("  Chrome");
//		brUtil.initDriver(null);

//		brUtil.initDriver("  opera");

		brUtil.launchURL("https://www.amazon.com");
//		brUtil.launchURL(null);

		String actTitle = brUtil.getPageTitle();
		System.out.println("Page title :- " + actTitle);

		Verify.equalValues(actTitle, "Amazon.com. Spend less. Smile more.");

//		if (actTitle.contains("Amazon.com")) {
//			System.out.println("PASS -- Title");
//		} else {
//			System.out.println("FAIL -- Title");
//		}

		String actUrl = brUtil.getPageURL();

//		System.out.println("Page url:- " + actUrl);
//		if (actUrl.contains("amazon")) {
//			System.out.println("PASS -- Title");
//		} else {
//			System.out.println("FAIL -- Title");
//		}

		Verify.containValues(actTitle, "amazon");

		brUtil.quitBrowser();

	}

}
