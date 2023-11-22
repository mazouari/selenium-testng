package com.todo.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.todo.pages.TodoPage;
import com.todo.utils.Setup;

public class AddTodoTest extends Setup{

	public AddTodoTest() throws IOException {
		super();
	}
	
	TodoPage todoPage;
	
	@Test(priority = 1)
	public void iCanAddTodo() throws IOException {
		
		todoPage = new TodoPage();
		todoPage.fillTodo(prop.getProperty("todo1"));
	}

}
