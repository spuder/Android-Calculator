package com.calculator;

import java.util.ArrayList;

import com.calculator.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.text.style.*;

public class CalculatorActivity extends Activity {
	private Button btnZero;
	private Button btnOne;
	private Button btnTwo;
	private Button btnThree;
	private Button btnFour;
	private Button btnFive;
	private Button btnSix;
	private Button btnSeven;
	private Button btnEight;
	private Button btnNine;
	private Button btnAdd;
	private Button btnSubtract;
	private Button btnMultiply;
	private Button btnDivide;
	private Button btnDecimal;
	private Button btnEquals;

	private Button btnClear;
	private Button btnBack;

	private TextView txtInput;
	private TextView txtSolution;

	private CalculatorActivity activity;
	protected String command;
	protected String opperand;
	protected String numKey;
	protected String btnNumber;
	protected int counter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		activity = this;
		this.txtInput = (TextView) this.findViewById(R.id.txtInput);
		this.txtSolution = (TextView) this.findViewById(R.id.txtSolution);

		command = "=";
		opperand = "";
		numKey = "numKey";

		this.btnZero = (Button) this.findViewById(R.id.btnZero);
		this.btnZero.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				btnNumber = btnZero.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);
				
			}
		});

		this.btnOne = (Button) this.findViewById(R.id.btnOne);
		this.btnOne.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				btnNumber = btnOne.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);			
			}
		});

		this.btnTwo = (Button) this.findViewById(R.id.btnTwo);
		this.btnTwo.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				btnNumber = btnTwo.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);					
			}
		});

		this.btnThree = (Button) this.findViewById(R.id.btnThree);
		this.btnThree.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				btnNumber = btnThree.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);
			}
		});

		this.btnFour = (Button) this.findViewById(R.id.btnFour);
		this.btnFour.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				btnNumber = btnFour.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);	
			}
		});

		this.btnFive = (Button) this.findViewById(R.id.btnFive);
		this.btnFive.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				btnNumber = btnFive.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);	
			}
		});

		this.btnSix = (Button) this.findViewById(R.id.btnSix);
		this.btnSix.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				btnNumber = btnSix.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);
			}
		});

		this.btnSeven = (Button) this.findViewById(R.id.btnSeven);
		this.btnSeven.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				btnNumber = btnSeven.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);
			}
		});

		this.btnEight = (Button) this.findViewById(R.id.btnEight);
		this.btnEight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				btnNumber = btnEight.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);	
			}
		});

		this.btnNine = (Button) this.findViewById(R.id.btnNine);
		this.btnNine.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				btnNumber = btnNine.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);
			}
		});
		
		this.btnDecimal = (Button) this.findViewById(R.id.btnDecimal);
		this.btnDecimal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				
				String InputText = txtInput.getText().toString();
				counter = InputText.indexOf(".");
				
				if(counter == -1){
				
				btnNumber = btnDecimal.getText().toString();
				ApplicationController.handleRequest(numKey, btnNumber, txtInput);
				}
							
			}
		});			
		
		this.btnSubtract = (Button) this.findViewById(R.id.btnSubtract);
		this.btnSubtract.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				opperand = btnSubtract.getText().toString();
				ApplicationController.handleRequest(command, activity, txtInput, txtSolution);
				command = opperand;
			}
		});
		
		this.btnMultiply = (Button) this.findViewById(R.id.btnMultiply);
		this.btnMultiply.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				opperand = btnMultiply.getText().toString();
				ApplicationController.handleRequest(command, activity, txtInput, txtSolution);
				command = opperand;
			}
		});
		
		this.btnDivide = (Button) this.findViewById(R.id.btnDivide);
		this.btnDivide.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				opperand = btnDivide.getText().toString();
				ApplicationController.handleRequest(command, activity, txtInput, txtSolution);
				command = opperand;
			}
		});
		
		this.btnAdd = (Button) this.findViewById(R.id.btnAdd);
		this.btnAdd.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				opperand = btnAdd.getText().toString();
				ApplicationController.handleRequest(command, activity, txtInput, txtSolution);
				command = opperand;
			}
		});
		
		this.btnEquals = (Button) this.findViewById(R.id.btnEquals);
		this.btnEquals.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				opperand = btnEquals.getText().toString();
				ApplicationController.handleRequest(command, activity, txtInput, txtSolution);
				//pass command and a list of parameters(Object ... params)
				command = opperand;
			}
		});


		this.btnClear = (Button) this.findViewById(R.id.btnClear);
		this.btnClear.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {				
				txtInput.setText("");
				txtSolution.setText("");	
				command = "=";
				opperand = "=";
			}
		});


		this.btnBack = (Button) this.findViewById(R.id.btnBack);
		this.btnBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				try {
					String back = txtInput.getText().toString();
					int length = back.length() - 1;
					String back2 = back.substring(0, length);
					txtInput.setText(back2);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


//	public TextView getTxtInput() {
//		return txtInput;
//	}
//
//
//	public void setTxtInput(TextView txtInput) {
//		this.txtInput = txtInput;
//	}
//
//
//	public TextView getTxtSolution() {
//		return txtSolution;
//	}
//
//
//	public void setTxtSolution(TextView txtSolution) {
//		this.txtSolution = txtSolution;
//	}
//
//	public String getCommand() {
//		return command;
//	}
//
//
//	public void setCommand(String command) {
//		this.command = command;
//	}

}