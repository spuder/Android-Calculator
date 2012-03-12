package com.calculator;

import java.util.ArrayList;
import java.util.HashMap;

public class ApplicationController {
	
	
	private static HashMap<String, Handler> controlHash = new HashMap<String, Handler>();
	static{
	String numKey = "numKey";
//can we use reflection to set the types of these items in the hashmap so that we don't have to work so hard to get them
	AddHandler theAddHandler = new AddHandler();
	controlHash.put("+", theAddHandler);
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
