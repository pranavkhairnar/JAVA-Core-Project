/*
 * JAVA CORE PROJECT
Description

BANK MANAGEMENT SYSTEM
This Bank Management System is a software to be designed in Java programming language
using all the concepts taught till mow.

Features:

Before the use of this banking system, the user should complete Registration.
A user holding the bank account is supposed to generate a unique user name and 
secured password for logging in to the software.

//Use GUI components like Swings or AWT components
The following facilities provided by the Bank Management software enhance running 
banking system and make it more easy, accessible and effective.

//use Display() method
The bank customers can view their account details such as account id, 
type of account, available balance in the account, interest rate etc.

// Use Deposit Class
The software is made to display deposited cash

//Use Withdrawal Class
Bank Management System is to be designed to give details information on cash withdrawal. 
Customers can see the name & amount withdrawn.

//Use Money_Transfer Class
Money transfer is one of the most desired facilities of bank customers. 
So, this software has to provide money transaction facility with details.

//Use Display_History Class

Note : You have to create your own database using arrays and another class for testing.

Moreover, this project is capable of displaying history of transaction with information 
such as transaction time, amount and type. You also can add any extra features to this project.
 */
package javaCoreProject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.util.Random;
import java.awt.Color;
import java.awt.Color.*;
import java.awt.Font;

public class mainClass {
	public static void main(String args[]) {
		GUI obj = new GUI();
	}
}

//frame-0 (main frame)
class GUI extends JFrame {
	JButton button1, button2, button3;
	JLabel label1;
	Bank obj;

	public GUI() {
		obj = new Bank();

		setBounds(300, 100, 600, 600);
		setTitle("Pranav's Bank");
		setResizable(false);

		button1 = new JButton("Create new Account");
		button1.setBounds(200, 250, 200, 40);
		add(button1);

		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI1();
			}
		});

		button2 = new JButton("Login");
		button2.setBounds(225, 325, 150, 40);
		add(button2);
		label1 = new JLabel("Account already exists?");
		label1.setBounds(225, 355, 200, 40);
		add(label1);

		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GUI2();
			}
		});

		label1 = new JLabel("||------Welcome to Pranav's Bank------||");
		label1.setFont(new Font("Serif", Font.PLAIN, 30));
		label1.setBounds(70, 75, 500, 50);
		add(label1);
		label1 = new JLabel("HOME PAGE");
		label1.setFont(new Font("Serif", Font.BOLD, 20));
		label1.setBounds(240, 160, 300, 40);
		add(label1);

		button3 = new JButton("EXIT");
		button3.setBackground(Color.RED);
		button3.setForeground(Color.WHITE);
		button3.setBounds(250, 500, 100, 35);
		add(button3);

		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		setLayout(null);
		setVisible(true);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// (frame-1) Creating new Account INNER CLASS
	class GUI1 extends JFrame // implements ActionListener
	{
		JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11;
		String username, accountID, password;
		JTextField tf1, tf2, tf3, tf4, tf5;
		JButton button, button3;
		JRadioButton rb1, rb2, rb3;

		public GUI1() {
			Bank.users++;
			obj.accountHolder[Bank.users] = new Account();

			setBounds(300, 100, 600, 600);
			setTitle("Pranav's Bank:: Create New Account ");
			setResizable(false);

			label1 = new JLabel("New Account Creation FORM");
			label1.setFont(new Font("Serif", Font.BOLD, 20));
			label1.setBounds(170, 10, 300, 50);
			add(label1);
			label1 = new JLabel("---------------------------------------------------------------------");
			label1.setBounds(160, 20, 300, 50);
			add(label1);

			label2 = new JLabel("Full Name ");
			label2.setBounds(40, 80, 120, 25);
			add(label2);
			tf1 = new JTextField();
			tf1.setBounds(220, 80, 200, 25);
			add(tf1);

			label6 = new JLabel("Set NetBanking username ");
			label6.setBounds(40, 120, 155, 25);
			add(label6);
			tf2 = new JTextField();
			tf2.setBounds(220, 120, 200, 25);
			add(tf2);

			label6 = new JLabel("Set NetBanking password ");
			label6.setBounds(40, 160, 150, 25);
			add(label6);
			tf3 = new JTextField();
			tf3.setBounds(220, 160, 200, 25);
			add(tf3);

			label3 = new JLabel("Phone number ");
			label3.setBounds(40, 200, 120, 25);
			add(label3);
			tf4 = new JTextField();
			tf4.setBounds(220, 200, 200, 25);
			add(tf4);

			label4 = new JLabel("Account Type ");
			label4.setBounds(40, 240, 120, 25);
			add(label4);
			rb1 = new JRadioButton("Savings");
			rb1.setBounds(220, 240, 100, 25);
			rb2 = new JRadioButton("Current");
			rb2.setBounds(320, 240, 100, 25);
			add(rb1);
			add(rb2);

			label5 = new JLabel("Initial Deposit (min 1000) ");
			label5.setBounds(40, 280, 150, 25);
			add(label5);
			tf5 = new JTextField();
			tf5.setBounds(220, 280, 200, 25);
			add(tf5);

			ButtonGroup b = new ButtonGroup();
			b.add(rb1);
			b.add(rb2);

			label6 = new JLabel("Interest Rate(%) ");
			label6.setBounds(40, 320, 120, 25);
			add(label6);
			label6 = new JLabel("5.44%");
			label6.setBounds(220, 320, 200, 25);
			add(label6);

			button = new JButton("SUBMIT");
			button.setBounds(150, 360, 150, 25);
			add(button);

			label7 = new JLabel("Your response is submitted.");
			label7.setVisible(false);
			label7.setBounds(70, 400, 200, 25);
			add(label7);

			label8 = new JLabel("Account Number: ");
			label8.setVisible(false);
			label8.setBounds(40, 440, 200, 25);
			add(label8);

			Random rnd = new Random();
			int number = rnd.nextInt(99999);
			accountID = String.format("%06d", number);
			obj.accountHolder[Bank.users].accountID = accountID;

			label9 = new JLabel(accountID);
			label9.setVisible(false);
			label9.setBounds(150, 440, 200, 25);
			add(label9);

			label10 = new JLabel("Last Transaction: ");
			label10.setVisible(false);
			label10.setBounds(40, 480, 200, 25);
			add(label10);

			label11 = new JLabel("");
			label11.setVisible(false);
			label11.setBounds(150, 480, 200, 25);
			add(label11);

			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (rb1.isSelected()) {
						obj.accountHolder[Bank.users].accountType = "Savings";
					} else {
						obj.accountHolder[Bank.users].accountType = "Current";
					}
					obj.accountHolder[Bank.users].name = tf1.getText();
					obj.accountHolder[Bank.users].username = tf2.getText();
					obj.accountHolder[Bank.users].password = tf3.getText();
					obj.accountHolder[Bank.users].phoneNo = tf4.getText();
					obj.accountHolder[Bank.users].balance = Double.parseDouble(tf5.getText());

					label7.setVisible(true);
					label8.setVisible(true);
					label9.setVisible(true);

					java.util.Date date = new java.util.Date();
					String str = String.valueOf(date);

					label10.setVisible(true);
					label11.setText(str);
					label11.setVisible(true);

					obj.accountHolder[Bank.users].history.n++;
					int p = obj.accountHolder[Bank.users].history.n;
					obj.accountHolder[Bank.users].history.details[p] = new Transfer();
					obj.accountHolder[Bank.users].history.details[p].accountNumber = accountID;
					obj.accountHolder[Bank.users].history.details[p].amount = obj.accountHolder[Bank.users].balance;
					obj.accountHolder[Bank.users].history.details[p].dateAndTime = str;

				}
			});

			button3 = new JButton(" <-- Back to Home page");
			button3.setBackground(Color.RED);
			button3.setForeground(Color.WHITE);
			button3.setBounds(210, 520, 180, 30);
			add(button3);

			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});

			setLayout(null);
			setVisible(true);
		}
	}

	// (frame-2) login page INNER CLASS
	class GUI2 extends JFrame// extends GUI
	{
		JLabel label1, label2, label3, label4;
		JTextField tf1, tf2;
		JButton button, button3;

		public GUI2() {
			setBounds(300, 100, 600, 600);
			setTitle("Pranav's Bank:: Login Page");
			setResizable(false);

			label1 = new JLabel("ENTER LOGIN CREDENTIALS");
			label1.setFont(new Font("Serif", Font.BOLD, 20));
			label1.setBounds(170, 80, 300, 50);
			add(label1);

			label1 = new JLabel("--------------------------------------------------------------");
			label1.setBounds(170, 100, 300, 50);
			add(label1);

			label2 = new JLabel("Username: ");
			label2.setBounds(40, 200, 80, 25);
			add(label2);

			// account id or username
			tf1 = new JTextField();
			tf1.setBounds(140, 200, 170, 25);
			add(tf1);

			label3 = new JLabel("Password:");
			label3.setBounds(40, 250, 80, 25);
			add(label3);

			// password
			tf2 = new JTextField();
			tf2.setBounds(140, 250, 170, 25);
			add(tf2);

			button = new JButton("Log In");
			button.setBounds(200, 350, 150, 35);
			add(button);

			label4 = new JLabel("-X- Incorrect credentials. -- Enter Correct username and password. -X-");
			label4.setVisible(false);
			label4.setBounds(100, 430, 440, 25);
			add(label4);

			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String username = tf1.getText();
					String password = tf2.getText();
					int userIndex = Bank.login(username, password);
					if (userIndex >= 0) {
						new GUI3(userIndex);
						dispose();
					} else {
						label4.setVisible(true);
					}
				}
			});

			button3 = new JButton(" <-- Back to Home page");
			button3.setBackground(Color.RED);
			button3.setForeground(Color.WHITE);
			button3.setBounds(210, 520, 180, 30);
			add(button3);

			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});

			setLayout(null);
			setVisible(true);
			// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	class GUI3 extends JFrame// extends GUI
	{
		JLabel label1;
		JButton button1, button2, button3, button4, button5, button6, button7;

		public GUI3(int userIndex) {
			setBounds(300, 100, 600, 600);
			setTitle("Account Operations");

			setResizable(false);

			label1 = new JLabel("Account Operations");
			label1.setFont(new Font("Serif", Font.BOLD, 20));
			label1.setBounds(220, 40, 250, 50);
			add(label1);
			label1 = new JLabel("--------------------------------------------");
			label1.setBounds(220, 60, 250, 50);
			add(label1);

			label1 = new JLabel("Hi " + obj.accountHolder[userIndex].name + ",");
			label1.setFont(new Font("Serif", Font.BOLD, 15));
			label1.setBounds(180, 100, 250, 50);
			add(label1);

			button1 = new JButton("Account details");
			button1.setBounds(100, 200, 150, 40);
			add(button1);

			button2 = new JButton("History");
			button2.setBounds(100, 280, 150, 40);
			add(button2);

			button3 = new JButton("Deposit");
			button3.setBounds(350, 200, 150, 40);
			add(button3);

			button4 = new JButton("Withdrawal");
			button4.setBounds(350, 280, 150, 40);
			add(button4);

			button5 = new JButton("Transfer");
			button5.setBounds(225, 360, 150, 40);
			add(button5);

			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new GUI4(userIndex);
				}
			});

			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new GUI7(userIndex);
				}
			});

			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new GUI5(userIndex);
				}
			});

			button4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new GUI6(userIndex);
				}
			});

			button5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new GUI8(userIndex);
				}
			});
			button6 = new JButton("Log Out");
			button6.setBackground(Color.RED);
			button6.setForeground(Color.WHITE);
			button6.setBounds(190, 500, 100, 28);
			add(button6);

			button7 = new JButton(" <- Back to Home page");
			button7.setBackground(Color.RED);
			button7.setForeground(Color.WHITE);
			button7.setBounds(310, 500, 170, 28);
			add(button7);

			button6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			button7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});

			setLayout(null);
			setVisible(true);
			// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	// displaying account details
	class GUI4 extends JFrame {
		JLabel label1, label2, label3, label4, label5, label6;
		JButton button3;

		GUI4(int userIndex) {
			setBounds(300, 100, 600, 600);
			setTitle("Account Details");
			setResizable(false);

			label1 = new JLabel("Account Information:");
			label1.setFont(new Font("Serif", Font.BOLD, 22));
			label1.setBounds(200, 60, 250, 50);
			add(label1);

			label1 = new JLabel("-----------------------------------------------------");
			label1.setBounds(180, 80, 300, 50);
			add(label1);

			String str = obj.accountHolder[userIndex].name;

			label1 = new JLabel("Name: ");
			label1.setBounds(100, 120, 90, 50);
			add(label1);
			label2 = new JLabel(str);
			label2.setBounds(220, 120, 150, 50);
			add(label2);

			str = obj.accountHolder[userIndex].accountID;

			label1 = new JLabel("Account ID: ");
			label1.setBounds(100, 160, 90, 50);
			add(label1);
			label2 = new JLabel(str);
			label2.setBounds(220, 160, 150, 50);
			add(label2);

			str = obj.accountHolder[userIndex].balance + "";

			label1 = new JLabel("Balance: ");
			label1.setBounds(100, 200, 90, 50);
			add(label1);
			label2 = new JLabel(str);
			label2.setBounds(220, 200, 150, 50);
			add(label2);

			str = obj.accountHolder[userIndex].accountType;

			label1 = new JLabel("Account Type: ");
			label1.setBounds(100, 240, 90, 50);
			add(label1);
			label2 = new JLabel(str);
			label2.setBounds(220, 240, 150, 50);
			add(label2);

			str = obj.accountHolder[userIndex].phoneNo;

			label1 = new JLabel("Phone Number: ");
			label1.setBounds(100, 280, 90, 50);
			add(label1);
			label2 = new JLabel(str);
			label2.setBounds(220, 280, 150, 50);
			add(label2);

			str = obj.accountHolder[userIndex].interestRate + "";

			label1 = new JLabel("Interest Rate: ");
			label1.setBounds(100, 320, 90, 50);
			add(label1);
			label2 = new JLabel(str);
			label2.setBounds(220, 320, 150, 50);
			add(label2);

			button3 = new JButton(" <- Back to other operations");
			button3.setBackground(Color.RED);
			button3.setForeground(Color.WHITE);
			button3.setBounds(190, 440, 220, 30);
			add(button3);

			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});

			setLayout(null);
			setVisible(true);
			// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	// deposit money
	class GUI5 extends JFrame {
		JLabel label1, label2, label3, label4, label5, label6, label7;
		JTextField tf1;
		JButton button, button3;

		GUI5(int userIndex) {
			setBounds(300, 100, 600, 600);
			setTitle("Deposit Money");
			setResizable(false);

			label1 = new JLabel("DEPOSIT CASH");
			label1.setFont(new Font("Serif", Font.BOLD, 22));
			label1.setBounds(200, 60, 250, 50);
			add(label1);

			label1 = new JLabel("---------------------------------------------");
			label1.setBounds(180, 80, 300, 50);
			add(label1);

			label1 = new JLabel("Enter Amount ");
			label1.setBounds(100, 150, 100, 25);
			add(label1);
			tf1 = new JTextField();
			tf1.setBounds(200, 150, 120, 40);
			add(tf1);

			button = new JButton("Confirm");
			button.setBounds(150, 220, 100, 25);
			add(button);

			label2 = new JLabel("Account number: ");
			label2.setVisible(false);
			label2.setBounds(100, 300, 150, 25);
			add(label2);

			String accountID = obj.accountHolder[userIndex].accountID;
			label3 = new JLabel(accountID);
			label3.setVisible(false);
			label3.setBounds(250, 300, 200, 25);
			add(label3);

			label4 = new JLabel("Current balance: ");
			label4.setVisible(false);
			label4.setBounds(100, 350, 150, 25);
			add(label4);

			// String balance = obj.accountHolder[userIndex].balance+"";
			label5 = new JLabel("");
			label5.setVisible(false);
			label5.setBounds(250, 350, 200, 25);
			add(label5);

			label6 = new JLabel("Transaction time: ");
			label6.setVisible(false);
			label6.setBounds(100, 400, 150, 25);
			add(label6);

			label7 = new JLabel("");
			label7.setVisible(false);
			label7.setBounds(250, 400, 200, 25);
			add(label7);

			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					obj.accountHolder[userIndex].balance += Double.parseDouble(tf1.getText());

					String balance = obj.accountHolder[userIndex].balance + "";
					label5.setText(balance);

					label2.setVisible(true);
					label3.setVisible(true);
					label4.setVisible(true);
					label5.setVisible(true);

					java.util.Date date = new java.util.Date();
					String str = String.valueOf(date);

					label6.setVisible(true);
					label7.setText(str);
					label7.setVisible(true);

					obj.accountHolder[userIndex].history.n++;
					int p = obj.accountHolder[userIndex].history.n;
					obj.accountHolder[userIndex].history.details[p] = new Transfer();
					obj.accountHolder[userIndex].history.details[p].accountNumber = accountID;
					obj.accountHolder[userIndex].history.details[p].amount = Double.parseDouble(tf1.getText());
					obj.accountHolder[userIndex].history.details[p].dateAndTime = str;

				}
			});
			button3 = new JButton(" <- Back to other operations");
			button3.setBackground(Color.RED);
			button3.setForeground(Color.WHITE);
			button3.setBounds(190, 500, 220, 30);
			add(button3);

			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});

			setLayout(null);
			setVisible(true);
			// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
	}

	// withdrawal
	class GUI6 extends JFrame {
		JLabel label1, label2, label3, label4, label5, label6, label7, label8;
		JTextField tf1;
		JButton button, button3;

		GUI6(int userIndex) {
			setBounds(300, 100, 600, 600);
			setTitle("Withdraw Money");
			setResizable(false);

			label1 = new JLabel("WITHDRAW CASH");
			label1.setFont(new Font("Serif", Font.BOLD, 22));
			label1.setBounds(200, 60, 250, 50);
			add(label1);

			label1 = new JLabel("---------------------------------------------");
			label1.setBounds(180, 80, 300, 50);
			add(label1);

			label1 = new JLabel("Enter Amount ");
			label1.setBounds(100, 150, 100, 25);
			add(label1);
			tf1 = new JTextField();
			tf1.setBounds(200, 150, 120, 40);
			add(tf1);

			button = new JButton("Confirm");
			button.setBounds(150, 220, 100, 25);
			add(button);

			label2 = new JLabel("Account number: ");
			label2.setVisible(false);
			label2.setBounds(100, 300, 150, 25);
			add(label2);

			String accountID = obj.accountHolder[userIndex].accountID;
			label3 = new JLabel(accountID);
			label3.setVisible(false);
			label3.setBounds(250, 300, 200, 25);
			add(label3);

			label4 = new JLabel("Current balance: ");
			label4.setVisible(false);
			label4.setBounds(100, 350, 150, 25);
			add(label4);

			// String balance = obj.accountHolder[userIndex].balance+"";
			label5 = new JLabel("");
			label5.setVisible(false);
			label5.setBounds(250, 350, 200, 25);
			add(label5);

			label6 = new JLabel("Transaction time: ");
			label6.setVisible(false);
			label6.setBounds(100, 400, 150, 25);
			add(label6);

			label7 = new JLabel("");
			label7.setVisible(false);
			label7.setBounds(250, 400, 200, 25);
			add(label7);

			label8 = new JLabel("ERROR - Current balance is Insufficient.");
			label8.setVisible(false);
			label8.setBounds(25, 260, 400, 25);
			add(label8);

			button3 = new JButton(" <- Back to other operations");
			button3.setBackground(Color.RED);
			button3.setForeground(Color.WHITE);
			button3.setBounds(190, 500, 220, 30);
			add(button3);

			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});

			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					if (obj.accountHolder[userIndex].balance < Double.parseDouble(tf1.getText())) {
						label8.setVisible(true);
					} else {
						obj.accountHolder[userIndex].balance -= Double.parseDouble(tf1.getText());

						String balance = obj.accountHolder[userIndex].balance + "";
						label5.setText(balance);

						label2.setVisible(true);
						label3.setVisible(true);
						label4.setVisible(true);
						label5.setVisible(true);

						java.util.Date date = new java.util.Date();
						String str = String.valueOf(date);

						label6.setVisible(true);
						label7.setText(str);
						label7.setVisible(true);

						obj.accountHolder[userIndex].history.n++;
						int p = obj.accountHolder[userIndex].history.n;
						obj.accountHolder[userIndex].history.details[p] = new Transfer();
						obj.accountHolder[userIndex].history.details[p].accountNumber = accountID;
						obj.accountHolder[userIndex].history.details[p].amount = Double
								.parseDouble("-" + tf1.getText());
						obj.accountHolder[userIndex].history.details[p].dateAndTime = str;
					}

				}
			});

			setLayout(null);
			setVisible(true);
			// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
	}

	// history display
	class GUI7 extends JFrame {
		JLabel label1, label2, label3, label4, label5, label6;
		JButton button3;

		GUI7(int userIndex) {
			setBounds(300, 100, 600, 600);
			setTitle("Passbook");
			setResizable(false);

			label1 = new JLabel("PASSBOOK: Last 5 Transactions");
			label1.setFont(new Font("Serif", Font.BOLD, 22));
			label1.setBounds(100, 60, 400, 50);
			add(label1);

			label1 = new JLabel("----------------------------------------------------------------------------------");
			label1.setBounds(90, 80, 420, 50);
			add(label1);

			label2 = new JLabel("| Account No. |");
			label2.setBounds(50, 120, 100, 25);
			add(label2);
			label3 = new JLabel("| Amount |");
			label3.setBounds(150, 120, 100, 25);
			add(label3);
			label4 = new JLabel("| Date & Time |");
			label4.setBounds(250, 120, 200, 25);
			add(label4);

			int x = obj.accountHolder[userIndex].history.n;

			label2 = new JLabel(obj.accountHolder[userIndex].history.details[x].accountNumber);
			label2.setBounds(50, 180, 100, 25);
			add(label2);

			label3 = new JLabel(obj.accountHolder[userIndex].history.details[x].amount + "");
			label3.setBounds(150, 180, 100, 25);
			add(label3);

			label4 = new JLabel(obj.accountHolder[userIndex].history.details[x].dateAndTime);
			label4.setBounds(250, 180, 200, 25);
			add(label4);

			button3 = new JButton(" <- Back to other operations");
			button3.setBackground(Color.RED);
			button3.setForeground(Color.WHITE);
			button3.setBounds(190, 500, 220, 30);
			add(button3);

			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});

			if ((x - 1) >= 0) {
				label2 = new JLabel(obj.accountHolder[userIndex].history.details[x - 1].accountNumber);
				label2.setBounds(50, 220, 100, 25);
				add(label2);

				label3 = new JLabel(obj.accountHolder[userIndex].history.details[x - 1].amount + "");
				label3.setBounds(150, 220, 100, 25);
				add(label3);

				label4 = new JLabel(obj.accountHolder[userIndex].history.details[x - 1].dateAndTime);
				label4.setBounds(250, 220, 200, 25);
				add(label4);

				if ((x - 2) >= 0) {
					label2 = new JLabel(obj.accountHolder[userIndex].history.details[x - 2].accountNumber);
					label2.setBounds(50, 260, 100, 25);
					add(label2);

					label3 = new JLabel(obj.accountHolder[userIndex].history.details[x - 2].amount + "");
					label3.setBounds(150, 260, 100, 25);
					add(label3);

					label4 = new JLabel(obj.accountHolder[userIndex].history.details[x - 2].dateAndTime);
					label4.setBounds(250, 260, 200, 25);
					add(label4);

					if ((x - 3) >= 0) {
						label2 = new JLabel(obj.accountHolder[userIndex].history.details[x - 3].accountNumber);
						label2.setBounds(50, 300, 100, 25);
						add(label2);

						label3 = new JLabel(obj.accountHolder[userIndex].history.details[x - 3].amount + "");
						label3.setBounds(150, 300, 100, 25);
						add(label3);

						label4 = new JLabel(obj.accountHolder[userIndex].history.details[x - 3].dateAndTime);
						label4.setBounds(250, 300, 200, 25);
						add(label4);

						if ((x - 4) >= 0) {
							label2 = new JLabel(obj.accountHolder[userIndex].history.details[x - 4].accountNumber);
							label2.setBounds(50, 340, 100, 25);
							add(label2);

							label3 = new JLabel(obj.accountHolder[userIndex].history.details[x - 4].amount + "");
							label3.setBounds(150, 340, 100, 25);
							add(label3);

							label4 = new JLabel(obj.accountHolder[userIndex].history.details[x - 4].dateAndTime);
							label4.setBounds(250, 340, 200, 25);
							add(label4);
						}
					}

				}

			}

			setLayout(null);
			setVisible(true);
			// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	// transfer money
	class GUI8 extends JFrame {
		JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
		JTextField tf1, tf2;
		JButton button, button3;

		GUI8(int userIndex) {
			setBounds(300, 100, 600, 600);
			setTitle("Transfer Money");
			setResizable(false);

			label1 = new JLabel("TRANSFER");
			label1.setFont(new Font("Serif", Font.BOLD, 22));
			label1.setBounds(250, 60, 400, 50);
			add(label1);

			label1 = new JLabel("------------------------------------------");
			label1.setBounds(240, 80, 420, 50);
			add(label1);

			label1 = new JLabel("Account No.");
			label1.setBounds(100, 150, 100, 25);
			add(label1);
			tf2 = new JTextField();
			tf2.setBounds(200, 150, 150, 25);
			add(tf2);

			label1 = new JLabel("Enter Amount ");
			label1.setBounds(100, 200, 100, 25);
			add(label1);
			tf1 = new JTextField();
			tf1.setBounds(200, 200, 150, 25);
			add(tf1);

			button = new JButton("Confirm");
			button.setBounds(150, 250, 100, 35);
			add(button);

			label2 = new JLabel("Account number: ");
			label2.setVisible(false);
			label2.setBounds(120, 320, 100, 25);
			add(label2);

			String accountID = obj.accountHolder[userIndex].accountID;
			label3 = new JLabel(accountID);
			label3.setVisible(false);
			label3.setBounds(220, 320, 100, 25);
			add(label3);

			label4 = new JLabel("Current balance: ");
			label4.setVisible(false);
			label4.setBounds(120, 360, 100, 25);
			add(label4);

			// String balance = obj.accountHolder[userIndex].balance+"";
			label5 = new JLabel("");
			label5.setVisible(false);
			label5.setBounds(220, 360, 100, 25);
			add(label5);

			label6 = new JLabel("Transaction time: ");
			label6.setVisible(false);
			label6.setBounds(120, 400, 140, 25);
			add(label6);

			label7 = new JLabel("");
			label7.setVisible(false);
			label7.setBounds(220, 400, 200, 25);
			add(label7);

			label8 = new JLabel("ERROR - Current balance is Insufficient.");
			label8.setVisible(false);
			label8.setBounds(100, 320, 300, 25);
			add(label8);

			label9 = new JLabel("ERROR - Account not found.");
			label9.setVisible(false);
			label9.setBounds(100, 320, 300, 25);
			add(label9);

			button3 = new JButton(" <- Back to other operations");
			button3.setBackground(Color.RED);
			button3.setForeground(Color.WHITE);
			button3.setBounds(190, 500, 220, 30);
			add(button3);

			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});

			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (obj.accountHolder[userIndex].balance < Double.parseDouble(tf1.getText())) {
						label8.setVisible(true);
					} else if (Bank.isTransferPossible(tf2.getText(), Double.parseDouble(tf1.getText()),
							obj.accountHolder[userIndex].accountID)) {
						obj.accountHolder[userIndex].balance -= Double.parseDouble(tf1.getText());

						String balance = obj.accountHolder[userIndex].balance + "";
						label5.setText(balance);

						label2.setVisible(true);
						label3.setVisible(true);
						label4.setVisible(true);
						label5.setVisible(true);

						java.util.Date date = new java.util.Date();
						String str = String.valueOf(date);

						label6.setVisible(true);
						label7.setText(str);
						label7.setVisible(true);

						obj.accountHolder[userIndex].history.n++;
						int p = obj.accountHolder[userIndex].history.n;
						obj.accountHolder[userIndex].history.details[p] = new Transfer();
						obj.accountHolder[userIndex].history.details[p].accountNumber = tf2.getText();
						obj.accountHolder[userIndex].history.details[p].amount = Double
								.parseDouble("-" + tf1.getText());
						obj.accountHolder[userIndex].history.details[p].dateAndTime = str;
					} else {
						label9.setVisible(true);
					}

				}
			});

			setLayout(null);
			setVisible(true);
			// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}

	}
}

//history Structure
class Transfer {
	double amount; // amount transfered to other account
	String dateAndTime; // display time details
	String accountNumber; // other person's account number
}

//Passbook contains all the transaction details
class Passbook {
	Transfer[] details;
	int n; // no. of transactions

	public Passbook() {
		details = new Transfer[20]; // max capacity of 100 transactions
		n = -1; // (counter)
	}
}

class Account {
	String name; // name of the person
	String accountType; // types of account
	double balance; // current balance
	double interestRate; // ROI (%)
	Passbook history;
	String phoneNo;

	String accountID; // auto generated account id
	String username; // auto generated username to login
	String password; // auto generated password

	Account() {
		interestRate = 5.44;
		history = new Passbook();
	}
}

class Bank {
	public static Account[] accountHolder;
	public static int users = -1;

	public Bank() {
		accountHolder = new Account[20]; // 100 users can enter data/login
	}

	public static int login(String id, String pass) {
		// compare with all account ids
		// if account id matches then chech if password is correct or not
		for (int i = 0; i <= users; i++) {
			if (id.equals(accountHolder[i].username)) {
				if (pass.equals(accountHolder[i].password)) {
					return i;
				}
				break;
			}
		}
		return -1;
	}

	// Parameters: account number of friend, amount, self account number
	public static boolean isTransferPossible(String acc, double am, String aID) {
		for (int i = 0; i <= users; i++) {
			if (acc.equals(accountHolder[i].accountID)) {
				accountHolder[i].history.n++;
				int x = accountHolder[i].history.n;

				java.util.Date date = new java.util.Date();
				String str = String.valueOf(date);

				// entry in passbook
				accountHolder[i].history.details[x] = new Transfer();
				accountHolder[i].history.details[x].accountNumber = aID;
				accountHolder[i].history.details[x].amount = am;
				accountHolder[i].history.details[x].dateAndTime = str;

				accountHolder[i].balance += am;

				return true;
			}
		}
		return false;
	}
}
