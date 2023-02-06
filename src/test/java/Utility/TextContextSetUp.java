package Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjectModel.PageObjectManager;

public class TextContextSetUp {
WebDriver driver;
Base base;
public PageObjectManager pageObject;
	public TextContextSetUp() throws IOException {
		 base = new Base();
		 pageObject = new PageObjectManager(base.webDriverManager());
	}




}

