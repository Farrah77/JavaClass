package com.class28;

public interface WebDriver {
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}

class ChromeBrowser implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Chrome can open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("X button closes broser in Chrome");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Press square button to maximize window in Chrome");
		
	}

	@Override
	public void findElement() {
		System.out.println("Use search button to find an element in Chrome");
		
	}
}
class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Firefox can open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("X button closes broser in Firefox");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Press square button to maximize window in Firefox");
		
	}

	@Override
	public void findElement() {
		System.out.println("Use search button to find an element in Firefox");
		
	}
	
}
