package com.calculator;

import java.util.ArrayList;
import java.util.HashMap;

public class ApplicationController {
	
	//Abstract Method, Notice how it doesn't have a body?
	private static HashMap<String, Handler> controlHash = new HashMap<String, Handler>();
	static{
	String numKey = "numKey";

	//When you want to run the code for addition, you call the hashmap with the key of '+',
	//To add a new operation to the program, create a new class, add that class to the handler hashmap and done!
	
		  //Create a New Instance of the AdditionHandler and add it to the hashmap with key = '+'
		  AddHandler theAddHandler = new AddHandler();
	controlHash.put("+", theAddHandler);
		//Create a New Instance of the SubHandler and add it to the hashmap with key = '-'
		  SubHandler theSubHandler = new SubHandler();
	controlHash.put("-", theSubHandler);
	
		MultiHandler theMultiHandler = new MultiHandler();
	controlHash.put("x", theMultiHandler);
	
	       DivideHandler theDivideHandler = new DivideHandler();
	controlHash.put("/", theDivideHandler);
	
		EqualHandler theEqualHandler = new EqualHandler();
	controlHash.put("=", theEqualHandler);
	
	     NumberValueHandler theNumValueHandler = new NumberValueHandler();
	controlHash.put(numKey, theNumValueHandler);
	
	}	

	public static void handleRequest(String command, Object ... parameters) {
		//instead of setting to handler can we use reflection to set the Type of anOperation
		//to the type of the result of controlHash.get(command); thereby giving us flexability
		Handler anOperation = controlHash.get(command);
			anOperation.handleIt(parameters);
	}

}
