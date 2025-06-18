package week1.day3;

public class Browser {
	String launchBrowser(String browserName) {
		System.out.println("Browser Launchded Successfully");
		return browserName;
	}
	
	void loadURL(){
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		Browser browser_init = new Browser();
		
		browser_init.launchBrowser("FireFox");
		browser_init.loadURL();
		

	}

}
