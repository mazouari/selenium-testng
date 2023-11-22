package com.todo.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todo.utils.BasePage;

public class TodoPage extends BasePage{

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	/*Locators*/
	final static String INPUT_TEXT = "//input[@ng-model= 'newTodo']";
	
	
	@FindBy(how = How.XPATH, using = INPUT_TEXT)
	public static WebElement inputText;
	
	
	/*Methods*/
	public void fillTodo(String todo) {
		inputText.sendKeys(todo);
		
	}

}
