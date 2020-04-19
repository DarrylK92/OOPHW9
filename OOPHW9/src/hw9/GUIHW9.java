/*
	This program gets an amount of many coins from the user and calculates their values.
	Author: Darryl Karney
	Course: CPSC24500
 */

package hw9;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GUIHW9 extends JFrame{
	static DecimalFormat mydf = new DecimalFormat("0.00");
	
	private JPanel contentPane;
	private JTextField txtQuarters, txtDimes, txtNickels, txtPennies, txtHalfDollars, txtDollars;
	private JButton btnCompute;
	private JLabel lblQuarterVal, lblDimesVal, lblNickelsVal, lblPenniesVal, lblTotalVal, lblHalfDollarVal, lblDollarVal;
	
	private ArrayList<JTextField> textFields = new ArrayList<>();
	
	double dollar = 100;
	double halfDollar = 50;
	double quarter = 25;
	double dime = 10;
	double nickel = 5;
	double penny = 1;
	
	public GUIHW9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Change Counter");
		
		//Values
		int column1X = 5;
		int column3X = 225;
		int column4X = 330;
		int textFieldX = 75;
		int totalLabelX = 200;
		int row1Y = 5;
		int row2Y = 50;
		int row3Y = 70;
		int row4Y = 90;
		int row5Y = 110;
		int row6Y = 130;
		int row7Y = 150;
		int row8Y = 170;
		int promptWidth = 300;
		int textFieldWidth = 75;
		int textFieldHeight = 17;
		int labelHeight = 14;
		int labelWidth = 150;
		int buttonWidth = 150;
		int buttonHeight = 15;
		
		//First column labels
		JLabel lblPrompt = new JLabel("Enter the number of each coin type and hit, Compute:");
		lblPrompt.setBounds(column1X, row1Y, promptWidth, labelHeight);
		contentPane.add(lblPrompt);
		
		JLabel lblDollar = new JLabel("Dollars:");
		lblDollar.setBounds(column1X, row2Y, labelWidth, labelHeight);
		contentPane.add(lblDollar);
		
		JLabel lblHalfDollar = new JLabel("Half dollars:");
		lblHalfDollar.setBounds(column1X, row3Y, labelWidth, labelHeight);
		contentPane.add(lblHalfDollar);
		
		JLabel lblQuarters = new JLabel("Quarters:");
		lblQuarters.setBounds(column1X, row4Y, labelWidth, labelHeight);
		contentPane.add(lblQuarters);
		
		JLabel lblDimes = new JLabel("Dimes:");
		lblDimes.setBounds(column1X, row5Y, labelWidth, labelHeight);
		contentPane.add(lblDimes);
		
		JLabel lblNickels = new JLabel("Nickels:");
		lblNickels.setBounds(column1X, row6Y, labelWidth, labelHeight);
		contentPane.add(lblNickels);
		
		JLabel lblPennies = new JLabel("Pennies:");
		lblPennies.setBounds(column1X, row7Y, labelWidth, labelHeight);
		contentPane.add(lblPennies);
		
		//Text fields
		txtDollars = new JTextField();
		txtDollars.setBounds(textFieldX, row2Y, textFieldWidth, textFieldHeight);
		contentPane.add(txtDollars);
		textFields.add(txtDollars);
		
		txtHalfDollars = new JTextField();
		txtHalfDollars.setBounds(textFieldX, row3Y, textFieldWidth, textFieldHeight);
		contentPane.add(txtHalfDollars);
		textFields.add(txtHalfDollars);
		
		txtQuarters = new JTextField();
		txtQuarters.setBounds(textFieldX, row4Y, textFieldWidth, textFieldHeight);
		contentPane.add(txtQuarters);
		textFields.add(txtQuarters);
		
		txtDimes = new JTextField();
		txtDimes.setBounds(textFieldX, row5Y, textFieldWidth, textFieldHeight);
		contentPane.add(txtDimes);
		textFields.add(txtDimes);
		
		txtNickels = new JTextField();
		txtNickels.setBounds(textFieldX, row6Y, textFieldWidth, textFieldHeight);
		contentPane.add(txtNickels);
		textFields.add(txtNickels);
		
		txtPennies = new JTextField();
		txtPennies.setBounds(textFieldX, row7Y, textFieldWidth, textFieldHeight);
		contentPane.add(txtPennies);
		textFields.add(txtPennies);
		
		//Compute button
		btnCompute = new JButton("Compute");
		SwingAction action = new SwingAction();
		btnCompute.setAction(action);
		btnCompute.setBounds(column1X, row8Y, buttonWidth, buttonHeight);
		contentPane.add(btnCompute);
		
		//Column 3 labels
		JLabel lblDollarValue = new JLabel("Dollar value: $");
		lblDollarValue.setBounds(column3X, row2Y, labelWidth, labelHeight);
		contentPane.add(lblDollarValue);
		
		JLabel lblHalfDollarValue = new JLabel("Half dollar value: $");
		lblHalfDollarValue.setBounds(column3X, row3Y, labelWidth, labelHeight);
		contentPane.add(lblHalfDollarValue);
		
		JLabel lblQuarterValue = new JLabel("Quarter value: $");
		lblQuarterValue.setBounds(column3X, row4Y, labelWidth, labelHeight);
		contentPane.add(lblQuarterValue);
		
		JLabel lblDimesValue = new JLabel("Dimes value: $");
		lblDimesValue.setBounds(column3X, row5Y, labelWidth, labelHeight);
		contentPane.add(lblDimesValue);
		
		JLabel lblNickelsValue = new JLabel("Nickels value: $");
		lblNickelsValue.setBounds(column3X, row6Y, labelWidth, labelHeight);
		contentPane.add(lblNickelsValue);
		
		JLabel lblPenniesValue = new JLabel("Pennies value: $");
		lblPenniesValue.setBounds(column3X, row7Y, labelWidth, labelHeight);
		contentPane.add(lblPenniesValue);
		
		JLabel lblTotalChangeValue = new JLabel("Total Change value: $");
		lblTotalChangeValue.setBounds(totalLabelX, row8Y, labelWidth, labelHeight);
		contentPane.add(lblTotalChangeValue);
		
		//Column 4 labels
		lblDollarVal = new JLabel("0.00");
		lblDollarVal.setBounds(column4X, row2Y, labelWidth, labelHeight);
		contentPane.add(lblDollarVal);
		
		lblHalfDollarVal = new JLabel("0.00");
		lblHalfDollarVal.setBounds(column4X, row3Y, labelWidth, labelHeight);
		contentPane.add(lblHalfDollarVal);
		
		lblQuarterVal = new JLabel("0.00");
		lblQuarterVal.setBounds(column4X, row4Y, labelWidth, labelHeight);
		contentPane.add(lblQuarterVal);
		
		lblDimesVal = new JLabel("0.00");
		lblDimesVal.setBounds(column4X, row5Y, labelWidth, labelHeight);
		contentPane.add(lblDimesVal);
		
		lblNickelsVal = new JLabel("0.00");
		lblNickelsVal.setBounds(column4X, row6Y, labelWidth, labelHeight);
		contentPane.add(lblNickelsVal);
		
		lblPenniesVal = new JLabel("0.00");
		lblPenniesVal.setBounds(column4X, row7Y, labelWidth, labelHeight);
		contentPane.add(lblPenniesVal);
		
		lblTotalVal = new JLabel("0.00");
		lblTotalVal.setBounds(column4X, row8Y, labelWidth, labelHeight);
		contentPane.add(lblTotalVal);
	}
	
	public static void main(String[] args) {
		GUIHW9 frame = new GUIHW9();
		frame.setVisible(true);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Compute");
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//Fix invalid inputs
			for(JTextField textField : textFields) {
				//Correct non number values
				double textFieldValueAsDouble = 0;
				try {
					textFieldValueAsDouble = Double.parseDouble(textField.getText());
				} catch(Exception e) {
					textField.setText("0");
				}
				
				//Correct negative values
				if (textFieldValueAsDouble < 0) {
					textField.setText("0");
				}
			}
			
			//Calculate dollar value
			lblDollarVal.setText(String.valueOf(mydf.format((Double.parseDouble(txtDollars.getText()) * dollar) / 100)));
			
			//Calculate half dollar value
			lblHalfDollarVal.setText(String.valueOf(mydf.format((Double.parseDouble(txtHalfDollars.getText()) * halfDollar) / 100)));
			
			//Calculate quarter value
			lblQuarterVal.setText(String.valueOf(mydf.format((Double.parseDouble(txtQuarters.getText()) * quarter) / 100)));
			
			//Calculate dime value
			lblDimesVal.setText(String.valueOf(mydf.format((Double.parseDouble(txtDimes.getText()) * dime) / 100)));
			
			//Calculate nickel value
			lblNickelsVal.setText(String.valueOf(mydf.format((Double.parseDouble(txtNickels.getText()) * nickel) / 100)));
			
			//Calculate penny value
			lblPenniesVal.setText(String.valueOf(mydf.format((Double.parseDouble(txtPennies.getText()) * penny) / 100)));
			
			//Calculate total value
			lblTotalVal.setText(String.valueOf(mydf.format(
					Double.parseDouble(lblDollarVal.getText()) + 
					Double.parseDouble(lblHalfDollarVal.getText()) +
					Double.parseDouble(lblQuarterVal.getText()) + 
					Double.parseDouble(lblDimesVal.getText()) + 
					Double.parseDouble(lblNickelsVal.getText()) + 
					Double.parseDouble(lblPenniesVal.getText())
					)));
		}
		
	}
	
}
