package com.calculator;

import java.util.ArrayList;

import android.widget.TextView;

public class AddHandler implements Handler{
	private double value1;
	private double value2;
	private double result;
	private String resultString;
	
	@Override
	public void handleIt(Object ... parameters) {
		//pull the CalculatorActivity from the Calculator class and assigns to activity
		CalculatorActivity activity = (CalculatorActivity) parameters[0];
		//declare Textviews from textViews pass from Calculator
		TextView txtInput = (TextView) parameters[1];
		TextView txtSolution = (TextView) parameters[2];	

		value1 = Double.parseDouble(txtInput.getText().toString());
		value2 = Double.parseDouble(txtSolution.getText().toString());
		
		result = value1 + value2;
		
		resultString = Double.toString(result);
		
		txtSolution.setText(resultString);			
	 
	    
		txtInput.setText("");
	}
}
