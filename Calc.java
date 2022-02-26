import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class Calc {

	private JFrame frmScientificCalculator;
	private JTextField textField;
    boolean isDecimal=false;
	double first,second,res;
	String operation,answer;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frmScientificCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Calc() {
		initialize();
	}

	
	//___________________________________Components and Layout___________________________________________

	
	
	private void initialize() {
		//                                  (  GridBag LAYOUT  )
		
		
		                            //  ************  FRAME  ************
		frmScientificCalculator = new JFrame();
		frmScientificCalculator.setTitle("Scientific Calculator (by 20115076)");
		frmScientificCalculator.getContentPane().setForeground(Color.WHITE);
		frmScientificCalculator.getContentPane().setBackground(Color.BLACK);
		frmScientificCalculator.setBounds(100, 100, 419, 579);
		frmScientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{77, 77, 77, 77, 85, 0};
		gridBagLayout.rowHeights = new int[]{73, 25, 73, 73, 73, 73, 73, 73, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmScientificCalculator.getContentPane().setLayout(gridBagLayout);
	//  ****************************************************************************************************************************
		
		                   //  ************************  Text Field  ************************
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(10, 15, 5, 15);
		gbc_textField.gridwidth = 5;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		frmScientificCalculator.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
	//  ****************************************************************************************************************************
		
                             //  ************************  LABEL  ************************
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 15);
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		frmScientificCalculator.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
	//  ****************************************************************************************************************************
		
		
	//_____________________________________________________________________________________________________________________________________________
		
	                           //  ********************  BUTTONS  *************************
		
		
		                       // **********************  Sine   **********************
		JButton b_sin = new JButton("sin");
		b_sin.setForeground(Color.WHITE);
		b_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Math.toRadians(Double.parseDouble(textField.getText()));
				double x=Math.sin(first);
				textField.setText("");
				textField.setText("" +x);
				isDecimal=false;
			}
		});
		b_sin.setBackground(Color.GRAY);
		b_sin.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_sin = new GridBagConstraints();
		gbc_b_sin.fill = GridBagConstraints.BOTH;
		gbc_b_sin.insets = new Insets(0, 5, 5, 5);
		gbc_b_sin.gridx = 0;
		gbc_b_sin.gridy = 2;
		frmScientificCalculator.getContentPane().add(b_sin, gbc_b_sin);
	//  *******************************************************************************************************
		
	                             // **********************  cosine   **********************
		JButton b_cos = new JButton("cos");
		b_cos.setForeground(Color.WHITE);
		b_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Math.toRadians(Double.parseDouble(textField.getText()));
				double x=Math.cos(first);
				textField.setText("");
				textField.setText("" +x);
				isDecimal=false;
			}
		});
		b_cos.setBackground(Color.GRAY);
		b_cos.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_cos = new GridBagConstraints();
		gbc_b_cos.fill = GridBagConstraints.BOTH;
		gbc_b_cos.insets = new Insets(0, 0, 5, 5);
		gbc_b_cos.gridx = 1;
		gbc_b_cos.gridy = 2;
		frmScientificCalculator.getContentPane().add(b_cos, gbc_b_cos);
	//  *******************************************************************************************************
		
		                        // **********************  tangent   **********************
		JButton b_tan = new JButton("tan");
		b_tan.setForeground(Color.WHITE);
		b_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Math.toRadians(Double.parseDouble(textField.getText()));
				double x=Math.tan(first);
				textField.setText("");
				textField.setText("" +x);
				isDecimal=false;
			}
		});
		b_tan.setBackground(Color.GRAY);
		b_tan.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_tan = new GridBagConstraints();
		gbc_b_tan.fill = GridBagConstraints.BOTH;
		gbc_b_tan.insets = new Insets(0, 0, 5, 5);
		gbc_b_tan.gridx = 2;
		gbc_b_tan.gridy = 2;
		frmScientificCalculator.getContentPane().add(b_tan, gbc_b_tan);
	//  *******************************************************************************************************
		
		                       //  **********************  All Clear   **********************
		JButton b_AC = new JButton("AC");
		b_AC.setForeground(Color.WHITE);
		b_AC.setBackground(new Color(255, 127, 80));
		b_AC.setFont(new Font("Tahoma", Font.BOLD, 20));
		b_AC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				lblNewLabel.setText("");
				isDecimal=false;
			}
		});
		GridBagConstraints gbc_b_AC = new GridBagConstraints();
		gbc_b_AC.fill = GridBagConstraints.BOTH;
		gbc_b_AC.insets = new Insets(0, 0, 5, 0);
		gbc_b_AC.gridx = 4;
		gbc_b_AC.gridy = 2;
		frmScientificCalculator.getContentPane().add(b_AC, gbc_b_AC);
	//  *******************************************************************************************************
		
		                         // **********************  Backspace   **********************
		JButton b_bkspc = new JButton("<--");
		b_bkspc.setForeground(Color.WHITE);
		b_bkspc.setBackground(new Color(255, 127, 80));
		b_bkspc.setFont(new Font("Tahoma", Font.BOLD, 20));
		b_bkspc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bkspcString=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bkspcString=str.toString();
					textField.setText(bkspcString);
				}
			}
		});
		GridBagConstraints gbc_b_bkspc = new GridBagConstraints();
		gbc_b_bkspc.fill = GridBagConstraints.BOTH;
		gbc_b_bkspc.insets = new Insets(0, 0, 5, 5);
		gbc_b_bkspc.gridx = 3;
		gbc_b_bkspc.gridy = 2;
		frmScientificCalculator.getContentPane().add(b_bkspc, gbc_b_bkspc);
	//  *******************************************************************************************************
		
		             //  **********************  Square Root   **********************
		JButton b_sqrt = new JButton("sqrt");
		b_sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				//Checking for negative input
				if(first>0)
				{
					double x=Math.sqrt(first);
					textField.setText("");
					textField.setText("" +x);
					isDecimal=false;
				}
				else {
					double x=Math.sqrt((-1)*first);
					textField.setText("");
					textField.setText("i" +x);
					lblNewLabel.setText("Sq.Root of Negative Number");
					isDecimal=false;
				}
				
			}
		});
		b_sqrt.setForeground(Color.BLACK);
		b_sqrt.setBackground(Color.LIGHT_GRAY);
		b_sqrt.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_sqrt = new GridBagConstraints();
		gbc_b_sqrt.fill = GridBagConstraints.BOTH;
		gbc_b_sqrt.insets = new Insets(0, 5, 5, 5);
		gbc_b_sqrt.gridx = 0;
		gbc_b_sqrt.gridy = 3;
		frmScientificCalculator.getContentPane().add(b_sqrt, gbc_b_sqrt);
	//  *******************************************************************************************************
		
		               // **********************  LOGARITHM   **********************
		JButton b_log = new JButton("log");
		b_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double x=Math.log(first);
				textField.setText("");
				textField.setText("" +x);
				isDecimal=false;
			}
		});
		b_log.setForeground(Color.BLACK);
		b_log.setBackground(Color.LIGHT_GRAY);
		b_log.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_log = new GridBagConstraints();
		gbc_b_log.fill = GridBagConstraints.BOTH;
		gbc_b_log.insets = new Insets(0, 0, 5, 5);
		gbc_b_log.gridx = 1;
		gbc_b_log.gridy = 3;
		frmScientificCalculator.getContentPane().add(b_log, gbc_b_log);
	//  *******************************************************************************************************
		
		                 // **********************  REMAINDER   **********************
		JButton b_rem = new JButton("%");
		b_rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				lblNewLabel.setText(first+" % ");
				operation="%";
				isDecimal=false;
			}
		});
		b_rem.setForeground(Color.BLACK);
		b_rem.setBackground(Color.LIGHT_GRAY);
		b_rem.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_rem = new GridBagConstraints();
		gbc_b_rem.fill = GridBagConstraints.BOTH;
		gbc_b_rem.insets = new Insets(0, 0, 5, 5);
		gbc_b_rem.gridx = 2;
		gbc_b_rem.gridy = 3;
		frmScientificCalculator.getContentPane().add(b_rem, gbc_b_rem);
	//  *******************************************************************************************************
		                     //  **********************  DIVISION   **********************
		JButton b_divide = new JButton("/");
		b_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				lblNewLabel.setText(first+" / ");
				operation="/";
				isDecimal=false;
			}
		});
		b_divide.setForeground(Color.BLACK);
		b_divide.setBackground(Color.LIGHT_GRAY);
		b_divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_divide = new GridBagConstraints();
		gbc_b_divide.fill = GridBagConstraints.BOTH;
		gbc_b_divide.insets = new Insets(0, 0, 5, 5);
		gbc_b_divide.gridx = 3;
		gbc_b_divide.gridy = 3;
		frmScientificCalculator.getContentPane().add(b_divide, gbc_b_divide);
	//  *******************************************************************************************************
		
		                   // **********************  MULTIPLICATION   **********************
		JButton b_multiply = new JButton("*");
		b_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				lblNewLabel.setText(first+" * ");
				operation="*";
				isDecimal=false;
			}
		});
		b_multiply.setForeground(Color.WHITE);
		b_multiply.setBackground(new Color(255, 165, 0));
		b_multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_multiply = new GridBagConstraints();
		gbc_b_multiply.fill = GridBagConstraints.BOTH;
		gbc_b_multiply.insets = new Insets(0, 0, 5, 0);
		gbc_b_multiply.gridx = 4;
		gbc_b_multiply.gridy = 3;
		frmScientificCalculator.getContentPane().add(b_multiply, gbc_b_multiply);
	//  *******************************************************************************************************
		
		                       // **********************  POWER   **********************
		JButton b_pow = new JButton("x^n");
		b_pow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				lblNewLabel.setText(first+" ^ ");
				operation="^";
				isDecimal=false;
			}
		});
		b_pow.setForeground(Color.BLACK);
		b_pow.setBackground(Color.LIGHT_GRAY);
		b_pow.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_pow = new GridBagConstraints();
		gbc_b_pow.fill = GridBagConstraints.BOTH;
		gbc_b_pow.insets = new Insets(0, 5, 5, 5);
		gbc_b_pow.gridx = 0;
		gbc_b_pow.gridy = 4;
		frmScientificCalculator.getContentPane().add(b_pow, gbc_b_pow);
	//  *******************************************************************************************************
		
		
		
		                     // **********************  SUBTRACTION  **********************
		JButton b_subtract = new JButton("-");
		b_subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				lblNewLabel.setText(first+" - ");
				operation="-";
				isDecimal=false;
			}
		});
		b_subtract.setForeground(Color.WHITE);
		b_subtract.setBackground(new Color(255, 165, 0));
		b_subtract.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_b_subtract = new GridBagConstraints();
		gbc_b_subtract.fill = GridBagConstraints.BOTH;
		gbc_b_subtract.insets = new Insets(0, 0, 5, 0);
		gbc_b_subtract.gridx = 4;
		gbc_b_subtract.gridy = 4;
		frmScientificCalculator.getContentPane().add(b_subtract, gbc_b_subtract);
	//  *******************************************************************************************************
		
		
		                       //  **********************  SQUARING   **********************
		JButton b_sq = new JButton("x^2");
		b_sq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double x=first*first;
				textField.setText("");
				textField.setText("" +x);
				isDecimal=false;
			}
		});
		b_sq.setForeground(Color.BLACK);
		b_sq.setBackground(Color.LIGHT_GRAY);
		b_sq.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_sq = new GridBagConstraints();
		gbc_b_sq.fill = GridBagConstraints.BOTH;
		gbc_b_sq.insets = new Insets(0, 5, 5, 5);
		gbc_b_sq.gridx = 0;
		gbc_b_sq.gridy = 5;
		frmScientificCalculator.getContentPane().add(b_sq, gbc_b_sq);
	//  *******************************************************************************************************
		
		
		
		                       // **********************  ADDITION   **********************
		JButton b_add = new JButton("+");
		b_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				lblNewLabel.setText(first+" + ");
				operation="+";
				isDecimal=false;
			}
		});
		b_add.setForeground(Color.WHITE);
		b_add.setBackground(new Color(255, 165, 0));
		b_add.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_add = new GridBagConstraints();
		gbc_b_add.fill = GridBagConstraints.BOTH;
		gbc_b_add.insets = new Insets(0, 0, 5, 0);
		gbc_b_add.gridx = 4;
		gbc_b_add.gridy = 5;
		frmScientificCalculator.getContentPane().add(b_add, gbc_b_add);
	//  *******************************************************************************************************
		
	                       // **********************  FACTORIAL   **********************
		JButton b_fact = new JButton("n!");
		b_fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				double fact=1;
				//Ensuring for Non-Negative Inputs
				if(first>0)
				{
					while(first!=0)
					{
						fact=fact*first;
						first--;
					}
					textField.setText("");
					textField.setText("" +fact);
				}
				else {
					textField.setText("ERROR");
					lblNewLabel.setText("Factorial of Negative Number");
				}
				isDecimal=false;
			}
		});
		b_fact.setForeground(Color.BLACK);
		b_fact.setBackground(Color.LIGHT_GRAY);
		b_fact.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_fact = new GridBagConstraints();
		gbc_b_fact.fill = GridBagConstraints.BOTH;
		gbc_b_fact.insets = new Insets(0, 5, 5, 5);
		gbc_b_fact.gridx = 0;
		gbc_b_fact.gridy = 6;
		frmScientificCalculator.getContentPane().add(b_fact, gbc_b_fact);
	//  *******************************************************************************************************
		
		
		
		                      // **********************  EQUALS TO   **********************
		JButton b_eq = new JButton("=");
		b_eq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x=textField.getText().length();
				if(x!=0)
				{
				 	if(operation=="+")                                  //For Addition
				 	{
				 		second=Double.parseDouble(textField.getText());
				 		res=first+second;
				 		answer=String.format("%.2f",res);
				 		textField.setText(answer);
				 		lblNewLabel.setText(null);
				 	}
				 	else if(operation=="-")                             //For Subtraction
				 	{
				 		second=Double.parseDouble(textField.getText());
				 		res=first-second;
				 		answer=String.format("%.2f",res);
				 		textField.setText(answer);
				 		lblNewLabel.setText(null);
				 	}
				 	else if(operation=="*")                              //For Multiplication
				 	{
				 		second=Double.parseDouble(textField.getText());
				 		res=first*second;
				 		answer=String.format("%.2f",res);
				 		textField.setText(answer);
				 		lblNewLabel.setText(null);
				 	}
				 	else if(operation=="/")                              //For Division
				 	{
				 		second=Double.parseDouble(textField.getText());
				 		res=first/second;
				 		answer=String.format("%.2f",res);
				 		textField.setText(answer);
				 		lblNewLabel.setText(null);
				 	}
				 	else if(operation=="%")                              //For Remainder
				 	{
				 		second=Double.parseDouble(textField.getText());
				 		res=first%second;
				 		answer=String.format("%.2f",res);
				 		textField.setText(answer);
				 		lblNewLabel.setText(null);
				 	}
				 	else if(operation=="^")                              //For Power Calculation
				 	{
				 		second=Double.parseDouble(textField.getText());
				 		res=Math.pow(first, second);
				 		answer=String.format("%.2f",res);
				 		textField.setText(answer);
				 		lblNewLabel.setText(null);
				 	}
				}
			}
		});
		b_eq.setForeground(Color.WHITE);
		b_eq.setBackground(new Color(255, 165, 0));
		b_eq.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_b_eq = new GridBagConstraints();
		gbc_b_eq.gridheight = 2;
		gbc_b_eq.fill = GridBagConstraints.BOTH;
		gbc_b_eq.gridx = 4;
		gbc_b_eq.gridy = 6;
		frmScientificCalculator.getContentPane().add(b_eq, gbc_b_eq);
	//  *****************************************************************************************************************************
		
		//        *******************     Changes Sign of Number in textField  ******************
		JButton b_sign = new JButton("+/-");
		b_sign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length()>0) {
					double x=Double.parseDouble(String.valueOf(textField.getText()));
					x*=(-1);
					textField.setText(String.valueOf(x));
				}
			}
		});
		b_sign.setForeground(Color.BLACK);
		b_sign.setBackground(Color.LIGHT_GRAY);
		b_sign.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_b_sign = new GridBagConstraints();
		gbc_b_sign.fill = GridBagConstraints.BOTH;
		gbc_b_sign.insets = new Insets(0, 5, 0, 5);
		gbc_b_sign.gridx = 0;
		gbc_b_sign.gridy = 7;
		frmScientificCalculator.getContentPane().add(b_sign, gbc_b_sign);
	//  *******************************************************************************************************
		
		//              ***********     INITIALLY DISABELING SCIENTIFC OPERATIONS    *****************
		//                                 CAN BE ENABLED TROUGH TOGGLE BUTTON
		{
			b_cos.setEnabled(false);
			b_sin.setEnabled(false);
			b_tan.setEnabled(false);
			b_log.setEnabled(false);
			b_sq.setEnabled(false);
			b_pow.setEnabled(false);
			b_fact.setEnabled(false);
			b_sqrt.setEnabled(false);
		}
		
		
//_________________________________________      NUMERIC NUMBER BUTTONS	   _____________________________________________________	
		
		//                                            Numeric 0
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String string=textField.getText();
				textField.setText(string +"0");
			}
		});
		b0.setForeground(Color.WHITE);
		b0.setBackground(Color.DARK_GRAY);
		b0.setFont(new Font("Tahoma", Font.BOLD, 30));
		GridBagConstraints gbc_b0 = new GridBagConstraints();
		gbc_b0.gridwidth = 2;
		gbc_b0.fill = GridBagConstraints.BOTH;
		gbc_b0.insets = new Insets(0, 0, 0, 5);
		gbc_b0.gridx = 1;
		gbc_b0.gridy = 7;
		frmScientificCalculator.getContentPane().add(b0, gbc_b0);
	//  *******************************************************************************************************
		
		        //                                        Numeric 1
				JButton b1 = new JButton("1");
				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=textField.getText();
						textField.setText(string +"1");
					}
				});
				b1.setForeground(Color.WHITE);
				b1.setBackground(Color.DARK_GRAY);
				b1.setFont(new Font("Tahoma", Font.BOLD, 30));
				GridBagConstraints gbc_b1 = new GridBagConstraints();
				gbc_b1.fill = GridBagConstraints.BOTH;
				gbc_b1.insets = new Insets(0, 0, 5, 5);
				gbc_b1.gridx = 1;
				gbc_b1.gridy = 6;
				frmScientificCalculator.getContentPane().add(b1, gbc_b1);
			//  *******************************************************************************************************
				
				//                                        Numeric 2
				JButton b2 = new JButton("2");
				b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=textField.getText();
						textField.setText(string +"2");
					}
				});
				b2.setForeground(Color.WHITE);
				b2.setBackground(Color.DARK_GRAY);
				b2.setFont(new Font("Tahoma", Font.BOLD, 30));
				GridBagConstraints gbc_b2 = new GridBagConstraints();
				gbc_b2.fill = GridBagConstraints.BOTH;
				gbc_b2.insets = new Insets(0, 0, 5, 5);
				gbc_b2.gridx = 2;
				gbc_b2.gridy = 6;
				frmScientificCalculator.getContentPane().add(b2, gbc_b2);
			//  *******************************************************************************************************
				
				//                                            Numeric 3
				JButton b3 = new JButton("3");
				b3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=textField.getText();
						textField.setText(string +"3");
					}
				});
				b3.setForeground(Color.WHITE);
				b3.setBackground(Color.DARK_GRAY);
				b3.setFont(new Font("Tahoma", Font.BOLD, 30));
				GridBagConstraints gbc_b3 = new GridBagConstraints();
				gbc_b3.fill = GridBagConstraints.BOTH;
				gbc_b3.insets = new Insets(0, 0, 5, 5);
				gbc_b3.gridx = 3;
				gbc_b3.gridy = 6;
				frmScientificCalculator.getContentPane().add(b3, gbc_b3);
			//  *******************************************************************************************************
				
				//                                             Numeric 4
				JButton b4 = new JButton("4");
				b4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=textField.getText();
						textField.setText(string +"4");
					}
				});
				b4.setForeground(Color.WHITE);
				b4.setBackground(Color.DARK_GRAY);
				b4.setFont(new Font("Tahoma", Font.BOLD, 30));
				GridBagConstraints gbc_b4 = new GridBagConstraints();
				gbc_b4.fill = GridBagConstraints.BOTH;
				gbc_b4.insets = new Insets(0, 0, 5, 5);
				gbc_b4.gridx = 1;
				gbc_b4.gridy = 5;
				frmScientificCalculator.getContentPane().add(b4, gbc_b4);
			//  *******************************************************************************************************
				
				//                                             numeric 5
				JButton b5 = new JButton("5");
				b5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=textField.getText();
						textField.setText(string +"5");
					}
				});
				b5.setForeground(Color.WHITE);
				b5.setBackground(Color.DARK_GRAY);
				b5.setFont(new Font("Tahoma", Font.BOLD, 30));
				GridBagConstraints gbc_b5 = new GridBagConstraints();
				gbc_b5.fill = GridBagConstraints.BOTH;
				gbc_b5.insets = new Insets(0, 0, 5, 5);
				gbc_b5.gridx = 2;
				gbc_b5.gridy = 5;
				frmScientificCalculator.getContentPane().add(b5, gbc_b5);
			//  *******************************************************************************************************

				//                                             Numeric 6
				JButton b6 = new JButton("6");
				b6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=textField.getText();
						textField.setText(string +"6");
					}
				});
				b6.setForeground(Color.WHITE);
				b6.setBackground(Color.DARK_GRAY);
				b6.setFont(new Font("Tahoma", Font.BOLD, 30));
				GridBagConstraints gbc_b6 = new GridBagConstraints();
				gbc_b6.fill = GridBagConstraints.BOTH;
				gbc_b6.insets = new Insets(0, 0, 5, 5);
				gbc_b6.gridx = 3;
				gbc_b6.gridy = 5;
				frmScientificCalculator.getContentPane().add(b6, gbc_b6);
			//  *******************************************************************************************************
				
				//                                            Numeric 7
				JButton b7 = new JButton("7");
				b7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=textField.getText();
						textField.setText(string +"7");
					}
				});
				b7.setForeground(Color.WHITE);
				b7.setBackground(Color.DARK_GRAY);
				b7.setFont(new Font("Tahoma", Font.BOLD, 30));
				GridBagConstraints gbc_b7 = new GridBagConstraints();
				gbc_b7.fill = GridBagConstraints.BOTH;
				gbc_b7.insets = new Insets(0, 0, 5, 5);
				gbc_b7.gridx = 1;
				gbc_b7.gridy = 4;
				frmScientificCalculator.getContentPane().add(b7, gbc_b7);
			//  *******************************************************************************************************
				
				//                                          Numeric 8
				JButton b8 = new JButton("8");
				b8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=textField.getText();
						textField.setText(string +"8");
					}
				});
				b8.setForeground(Color.WHITE);
				b8.setBackground(Color.DARK_GRAY);
				b8.setFont(new Font("Tahoma", Font.BOLD, 30));
				GridBagConstraints gbc_b8 = new GridBagConstraints();
				gbc_b8.fill = GridBagConstraints.BOTH;
				gbc_b8.insets = new Insets(0, 0, 5, 5);
				gbc_b8.gridx = 2;
				gbc_b8.gridy = 4;
				frmScientificCalculator.getContentPane().add(b8, gbc_b8);
			//  *******************************************************************************************************
				
				//                                           Numeric 9
				JButton b9 = new JButton("9");
				b9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String string=textField.getText();
						textField.setText(string +"9");
					}
				});
				b9.setForeground(Color.WHITE);
				b9.setBackground(Color.DARK_GRAY);
				b9.setFont(new Font("Tahoma", Font.BOLD, 30));
				GridBagConstraints gbc_b9 = new GridBagConstraints();
				gbc_b9.fill = GridBagConstraints.BOTH;
				gbc_b9.insets = new Insets(0, 0, 5, 5);
				gbc_b9.gridx = 3;
				gbc_b9.gridy = 4;
				frmScientificCalculator.getContentPane().add(b9, gbc_b9);
			//  *******************************************************************************************************
//________________________________________________________________________________________________________________________________________________________________________
		
		                      // **********************  DECIMAL   **********************
		JButton b_dot = new JButton(".");
		b_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ensuring only 1 decimal in expression
				if(!isDecimal||textField.getText().length()==0){
			        textField.setText(textField.getText()+".");
			         isDecimal=true;
			        }
			}
		});
		b_dot.setForeground(Color.WHITE);
		b_dot.setBackground(Color.DARK_GRAY);
		b_dot.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_b_dot = new GridBagConstraints();
		gbc_b_dot.fill = GridBagConstraints.BOTH;
		gbc_b_dot.insets = new Insets(0, 0, 0, 5);
		gbc_b_dot.gridx = 3;
		gbc_b_dot.gridy = 7;
		frmScientificCalculator.getContentPane().add(b_dot, gbc_b_dot);
	//  *******************************************************************************************************
		
		//   ***********    Toggle Button to switch b/w Standard and Scientific Calculator ***********
		JToggleButton togglebtn = new JToggleButton("Adv");
		togglebtn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(!togglebtn.isSelected())    //Disabling Scientific Operations
				{
					b_cos.setEnabled(false);
					b_sin.setEnabled(false);
					b_tan.setEnabled(false);
					b_log.setEnabled(false);
					b_sq.setEnabled(false);
					b_pow.setEnabled(false);
					b_fact.setEnabled(false);
					b_sqrt.setEnabled(false);
					
				
				}	
				else {                         //Enabling Scientific Operations
 	 				b_cos.setEnabled(true);
					b_sin.setEnabled(true);
					b_tan.setEnabled(true);
					b_log.setEnabled(true);
					b_sq.setEnabled(true);
					b_pow.setEnabled(true);
					b_fact.setEnabled(true);
					b_sqrt.setEnabled(true);
				}
			}
		});
		togglebtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_togglebtn = new GridBagConstraints();
		gbc_togglebtn.anchor = GridBagConstraints.WEST;
		gbc_togglebtn.insets = new Insets(0, 5, 5, 5);
		gbc_togglebtn.gridx = 0;
		gbc_togglebtn.gridy = 1;
		frmScientificCalculator.getContentPane().add(togglebtn, gbc_togglebtn);
	//  *******************************************************************************************************
		
		
	//  *****************************_________________________________________END OF PROGRAM________________________________***********************************************
		
	}
}
