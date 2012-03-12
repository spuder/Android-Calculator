package com.calculator;

import android.widget.TextView;

public class NumberValueHandler implements Handler{


	public void handleIt(Object ... parameters){

		String numberString = (String) parameters[0];
		TextView inputText = (TextView) parameters[1];
		
		String number = inputText.getText().toString();
		
		number = number.concat(numberString);
		inputText.setText(number);
	}

}