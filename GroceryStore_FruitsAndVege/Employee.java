package GroceryStore_FruitsAndVege;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Employee extends JFrame {		//User-defined class

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldSalary;
	private JTextField textFieldTotalNormal;
	private JTextField textFieldTotalExecutive;
	private JTextField textFieldTotalSalary;
	private JRadioButton rdbtnNormal;
	private JRadioButton rdbtnExecutive;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Employee() {
	}
	
	public Employee(double totalCost) {			//Constructor with 1 argument
		double totalMarketingCost = totalCost;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1304, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1290, 728);
		contentPane.add(panel);
		
		JLabel lblEmployee = new JLabel("Employee Management");
		lblEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployee.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblEmployee.setBounds(382, 34, 484, 48);
		panel.add(lblEmployee);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(92, 122, 411, 260);
		panel.add(panel_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblName.setBounds(21, 78, 112, 29);
		panel_1.add(lblName);
		
		JLabel lblSalary = new JLabel("Salary(RM)");
		lblSalary.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblSalary.setBounds(21, 159, 112, 29);
		panel_1.add(lblSalary);
		
		rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNormal.isSelected()) {
					rdbtnExecutive.setSelected(false);
				}
			}
		});
		rdbtnNormal.setFont(new Font("Rockwell", Font.PLAIN, 20));
		rdbtnNormal.setBackground(new Color(255, 165, 0));
		rdbtnNormal.setBounds(52, 26, 128, 29);
		panel_1.add(rdbtnNormal);
		
		rdbtnExecutive = new JRadioButton("Executive");
		rdbtnExecutive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnExecutive.isSelected()) {
					rdbtnNormal.setSelected(false);
				}
			}
		});
		rdbtnExecutive.setFont(new Font("Rockwell", Font.PLAIN, 20));
		rdbtnExecutive.setBackground(new Color(255, 165, 0));
		rdbtnExecutive.setBounds(218, 26, 128, 29);
		panel_1.add(rdbtnExecutive);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldName.setColumns(10);
		textFieldName.setBounds(152, 78, 216, 29);
		panel_1.add(textFieldName);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(152, 159, 216, 29);
		panel_1.add(textFieldSalary);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_3.setBackground(new Color(255, 165, 0));
		panel_3.setBounds(257, 392, 802, 202);
		panel.add(panel_3);
		
		JLabel lblTotalNormal = new JLabel("Total Normal Employee Salary(RM)");
		lblTotalNormal.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblTotalNormal.setBounds(38, 28, 328, 32);
		panel_3.add(lblTotalNormal);
		
		JLabel lblTotalExecutive = new JLabel("Total Executive Employee Salary(RM)");
		lblTotalExecutive.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblTotalExecutive.setBounds(38, 89, 353, 32);
		panel_3.add(lblTotalExecutive);
		
		textFieldTotalNormal = new JTextField();
		textFieldTotalNormal.setEditable(false);
		textFieldTotalNormal.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldTotalNormal.setColumns(10);
		textFieldTotalNormal.setBounds(428, 28, 299, 32);
		panel_3.add(textFieldTotalNormal);
		
		textFieldTotalExecutive = new JTextField();
		textFieldTotalExecutive.setEditable(false);
		textFieldTotalExecutive.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldTotalExecutive.setColumns(10);
		textFieldTotalExecutive.setBounds(428, 89, 299, 32);
		panel_3.add(textFieldTotalExecutive);
		
		JLabel lblTotalEmployeeSalaryrm = new JLabel("Total Employee Salary(RM)");
		lblTotalEmployeeSalaryrm.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblTotalEmployeeSalaryrm.setBounds(38, 146, 353, 32);
		panel_3.add(lblTotalEmployeeSalaryrm);
		
		textFieldTotalSalary = new JTextField();
		textFieldTotalSalary.setEditable(false);
		textFieldTotalSalary.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldTotalSalary.setColumns(10);
		textFieldTotalSalary.setBounds(428, 146, 299, 32);
		panel_3.add(textFieldTotalSalary);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(550, 122, 645, 260);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 625, 240);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {		//Action when the table is clicked
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					textFieldName.setText(model.getValueAt(i,0).toString());	//Data in the selected row is transfered to input
					if(model.getValueAt(i, 1).toString().equals("Normal")) {
						rdbtnNormal.setSelected(true);
						rdbtnExecutive.setSelected(false);
					}
					else if(model.getValueAt(i, 1).toString().equals("Executive")) {
						rdbtnExecutive.setSelected(true);
						rdbtnNormal.setSelected(false);
					}
					textFieldSalary.setText(model.getValueAt(i,2).toString());
					JOptionPane.showMessageDialog(null, "Update Successfully");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please select a row first!");
				}
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Position", "Salary(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		//Read data from text file
		String filepath = "C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\EmployeeData.txt";	//File path of text file
		File file = new File(filepath);		//Create file on java
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				br.readLine().trim();		//Read the first line(the column name)
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			
			Object[] tableLine = br.lines().toArray();		//Get line from text file
			
			for(int i=0; i< tableLine.length-3; i++) {		//Go through the text file line by line starting from 2nd line other than the last 3 line(because the last 3 line is used to store total normal, total executive, and total salary)
				String line = tableLine[i].toString().trim();	//Extract data from text file line by line
				String [] dataRow = line.split(" \\|");			//Seperate the data in each line per " |", and store it inside an array
				model.addRow(dataRow);		//Add the data in array into a row of Jtable
			}
			double totalnormal = 0;
			double totalexecutive = 0;
			double totalsalary = 0;
			for(int i=0; i<table.getRowCount(); i++) {
				if(model.getValueAt(i, 1).toString().equalsIgnoreCase("Normal")) {
					totalnormal += Double.parseDouble(model.getValueAt(i, 2).toString());
					totalsalary += Double.parseDouble(model.getValueAt(i, 2).toString());
				}
				else if(model.getValueAt(i, 1).toString().equalsIgnoreCase("Executive")) {
					totalexecutive += Double.parseDouble(model.getValueAt(i, 2).toString());
					totalsalary += Double.parseDouble(model.getValueAt(i, 2).toString());
				}
			}
			textFieldTotalNormal.setText(Double.toString(totalnormal));
			textFieldTotalExecutive.setText(Double.toString(totalexecutive));
			textFieldTotalSalary.setText(Double.toString(totalsalary));
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_4.setBackground(new Color(255, 165, 0));
		panel_4.setBounds(32, 604, 1237, 111);
		panel.add(panel_4);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double totalNormal = 0;
				double totalExecutive = 0;
				double totalSalary = 0;
				double num1 = 0;
				double num2 = 0;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(rdbtnNormal.isSelected() == false && rdbtnExecutive.isSelected() == false) {			//Validate whether the radio button is selected or not
					JOptionPane.showMessageDialog(null, "Wrong Input! Please choose whether the Employee is Normal or Executive!");		//Action if radio button is not selected
				}
				else {
					if(textFieldName.getText().isEmpty()) {		//Validate the input of text field Name
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the Name text field!");	//Action if input of text field Name is wrong
					}
					else {
						try {	//3.2 Exception Handling
							Double.parseDouble(textFieldSalary.getText());		//Validate the input of text field Salary
							if(rdbtnNormal.isSelected()) {					//Action for button Add when all validation passed
								model.addRow(new Object[]{
										textFieldName.getText(),
										"Normal",
										textFieldSalary.getText(),
								});
							} else if(rdbtnExecutive.isSelected()) {
								model.addRow(new Object[]{
										textFieldName.getText(),
										"Executive",
										textFieldSalary.getText(),
								});
							}
							if (table.getSelectedRow() == -1) {
								if (table.getRowCount() == 0) {
									JOptionPane.showMessageDialog(null, "Wrong Input! Data Adding Failed!", "Employee Management System",
											JOptionPane.OK_OPTION);
								}
							}
							if(rdbtnNormal.isSelected()) {
								try {	//Validate whether text field Total Normal is null or not
									if(textFieldTotalNormal.getText() != null) {
										num1 = Double.parseDouble(textFieldTotalNormal.getText());
									}
								}
								catch (NumberFormatException e1) {	//If text field Total Normal is null, convert it to 0
									num1 = 0;
								}
								totalNormal = calculateTotalSalary(num1, Double.parseDouble(textFieldSalary.getText()));
								textFieldTotalNormal.setText(Double.toString(totalNormal));
							}
							else if(rdbtnExecutive.isSelected()) {
								try {		//Validate whether text field Total Executive is null or not
									if(textFieldTotalExecutive.getText() != null) {
										num2 = Double.parseDouble(textFieldTotalExecutive.getText());
									}
								}
								catch (NumberFormatException e1) {	//If text field Total Executive is null, convert it to 0
									num2 = 0;
								}
								totalExecutive = calculateTotalSalary(num2, Double.parseDouble(textFieldSalary.getText()));
								textFieldTotalExecutive.setText(Double.toString(totalExecutive));
							}
							try {		//Validate whether text field Total Normal is null or not
								if(textFieldTotalNormal.getText() != null) {
									num1 = Double.parseDouble(textFieldTotalNormal.getText());
								}
							}
							catch (NumberFormatException e1) {		//If text field Total Normal is null, convert it to 0
								num1 = 0;
							}
							try {		//Validate whether text field Total Executive is null or not
								if(textFieldTotalExecutive.getText() != null) {
									num2 = Double.parseDouble(textFieldTotalExecutive.getText());
								}
							}
							catch (NumberFormatException e1) {		//If text field Total Executive is null, convert it to 0
								num2 = 0;
							}
							totalSalary = calculateTotalSalary(num1, num2);
							textFieldTotalSalary.setText(Double.toString(totalSalary));
							rdbtnNormal.setSelected(false);
							rdbtnExecutive.setSelected(false);
							textFieldName.setText("");
							textFieldSalary.setText("");
						}catch(Exception e1) {		//Action when the input of text field Salary is wrong
							JOptionPane.showMessageDialog(null, "Wrong Input! Please enter real number only in the Salary text field!");
						}
					}
				}
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAdd.setBackground(Color.YELLOW);
		btnAdd.setBounds(26, 26, 129, 47);
		panel_4.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {		//Action for the button Reset
			public void actionPerformed(ActionEvent e) {
				rdbtnNormal.setSelected(false);
				rdbtnExecutive.setSelected(false);
				textFieldName.setText("");
				textFieldSalary.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReset.setBackground(Color.YELLOW);
		btnReset.setBounds(178, 26, 129, 47);
		panel_4.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {		//Action for the button Delete
			public void actionPerformed(ActionEvent e) {
				double num = 0;
				double totalNormal = 0;
				double totalExecutive = 0;
				double totalSalary = 0;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}else {
					if(model.getValueAt(table.getSelectedRow(),1).toString().equals("Normal")) {		//Action when the data of selected row is normal employee
						num = Double.parseDouble(model.getValueAt(table.getSelectedRow(),2).toString());
						totalNormal = Double.parseDouble(textFieldTotalNormal.getText()) - num;
						totalSalary = Double.parseDouble(textFieldTotalSalary.getText()) - num;
						textFieldTotalNormal.setText(Double.toString(totalNormal));
						textFieldTotalSalary.setText(Double.toString(totalSalary));
					}
					else if(model.getValueAt(table.getSelectedRow(),1).toString().equals("Executive")) {	//Action when the data of selected row is executive employee
						num = Double.parseDouble(model.getValueAt(table.getSelectedRow(),2).toString());
						totalExecutive = Double.parseDouble(textFieldTotalExecutive.getText()) - num;
						totalSalary = Double.parseDouble(textFieldTotalSalary.getText()) - num;
						textFieldTotalExecutive.setText(Double.toString(totalExecutive));
						textFieldTotalSalary.setText(Double.toString(totalSalary));
					}
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBackground(Color.YELLOW);
		btnDelete.setBounds(484, 26, 129, 47);
		panel_4.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {		//Action for the button print
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPrint.setBackground(Color.YELLOW);
		btnPrint.setBounds(789, 26, 129, 47);
		panel_4.add(btnPrint);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {		//Action for button Exit
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to go back to Marketing Details", "Employee Management System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Marketing a = new Marketing();		//Button Exit connect to Admin Menu
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBackground(Color.YELLOW);
		btnBack.setBounds(938, 26, 129, 47);
		panel_4.add(btnBack);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {		//Action for button Update
			public void actionPerformed(ActionEvent e) {
				double num1 = 0;
				double num2 = 0;
				double newTotalNormal = 0;
				double newTotalExecutive = 0;
				double newTotalSalary = 0;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(rdbtnNormal.isSelected() == false && rdbtnExecutive.isSelected() == false) {		//Validate whether the radio button is selected or not
					JOptionPane.showMessageDialog(null, "Wrong Input! Please choose whether the Employee is Normal or Executive!");		//Action if radio button is not selected
				}
				else {
					if(textFieldName.getText().isEmpty()) {		//Validate the input of text field Name
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the Name text field!");	//Action if input of text field Name is wrong
					}
					else {
						try {		//3.2 Exception Handling
							Double.parseDouble(textFieldSalary.getText());		//Validate the input of text field Salary
							int i = table.getSelectedRow();		//Action for button Update if all validation passed
						    if(i>=0) //if single row is selected than update
						    {
						    	model.setValueAt(textFieldName.getText(),i,0);
						    	if(rdbtnNormal.isSelected() && model.getValueAt(i, 1).toString().equals("Normal")) {	//Action when employee before and after update is Normal
						    		newTotalNormal = calculateTotalSalary(Double.parseDouble(textFieldTotalNormal.getText()), Double.parseDouble(model.getValueAt(i, 2).toString()), Double.parseDouble(textFieldSalary.getText()));
						    		newTotalSalary = calculateTotalSalary(Double.parseDouble(textFieldTotalSalary.getText()), Double.parseDouble(model.getValueAt(i, 2).toString()), Double.parseDouble(textFieldSalary.getText()));
						    		textFieldTotalNormal.setText(Double.toString(newTotalNormal));
						    		textFieldTotalSalary.setText(Double.toString(newTotalSalary));
						    	}
						    	else if(rdbtnExecutive.isSelected() && model.getValueAt(i, 1).toString().equals("Executive")) {		//Action when employee before and after update is Executive
						    		newTotalExecutive = calculateTotalSalary(Double.parseDouble(textFieldTotalExecutive.getText()), Double.parseDouble(model.getValueAt(i, 2).toString()), Double.parseDouble(textFieldSalary.getText()));
						    		newTotalSalary = calculateTotalSalary(Double.parseDouble(textFieldTotalSalary.getText()), Double.parseDouble(model.getValueAt(i, 2).toString()), Double.parseDouble(textFieldSalary.getText()));
						    		textFieldTotalExecutive.setText(Double.toString(newTotalExecutive));
						    		textFieldTotalSalary.setText(Double.toString(newTotalSalary));
						    	}
						    	else if(rdbtnNormal.isSelected() && model.getValueAt(i, 1).toString().equals("Executive")) {		//Action when employee before update is Executive and after update is Normal
						    		try {		//Validate whether text field Total Normal is null or not
						    			if(textFieldTotalNormal.getText()!=null) {
						    				num1 = Double.parseDouble(textFieldTotalNormal.getText());
						    			}
						    		}catch(NumberFormatException e2){ //If text field Total Normal is null, convert it to 0
						    			num1 = 0;
						    		}
						    		try {		//Validate whether text field Total Executive is null or not
						    			if(textFieldTotalExecutive.getText()!=null) {
						    				num2 = Double.parseDouble(textFieldTotalExecutive.getText());
						    			}
						    		}catch(NumberFormatException e2){	//If text field Total Executive is null, convert it to 0
						    			num2 = 0;
						    		}
						    		model.setValueAt("Normal", i, 1);
						    		newTotalExecutive = num2 - Double.parseDouble(model.getValueAt(i,2).toString());
						    		newTotalNormal = num1 + Double.parseDouble(textFieldSalary.getText());
						    		newTotalSalary = calculateTotalSalary(Double.parseDouble(textFieldTotalSalary.getText()), Double.parseDouble(model.getValueAt(i, 2).toString()), Double.parseDouble(textFieldSalary.getText()));
						    		textFieldTotalNormal.setText(Double.toString(newTotalNormal));
						    		textFieldTotalExecutive.setText(Double.toString(newTotalExecutive));
						    		textFieldTotalSalary.setText(Double.toString(newTotalSalary));
						    	}
						    	else if(rdbtnExecutive.isSelected() && model.getValueAt(i, 1).toString().equals("Normal")) {	//Action when employee before update is Normal and after update is Executive
						    		try {		//Validate whether text field Total Normal is null or not
						    			if(textFieldTotalNormal.getText()!=null) {
						    				num1 = Double.parseDouble(textFieldTotalNormal.getText());
						    			}
						    		}catch(NumberFormatException e2){		//If text field Total Normal is null, convert it to 0
						    			num1 = 0;
						    		}
						    		try {		//Validate whether text field Total Executive is null or not
						    			if(textFieldTotalExecutive.getText()!=null) {
						    				num2 = Double.parseDouble(textFieldTotalExecutive.getText());
						    			}
						    		}catch(NumberFormatException e2){		//If text field Total Executive is null, convert it to 0
						    			num2 = 0;
						    		}
						    		model.setValueAt("Executive", i, 1);
						    		newTotalExecutive = num2 + Double.parseDouble(textFieldSalary.getText());
						    		newTotalNormal = num1 - Double.parseDouble(model.getValueAt(i, 2).toString());
						    		newTotalSalary = calculateTotalSalary(Double.parseDouble(textFieldTotalSalary.getText()), Double.parseDouble(model.getValueAt(i, 2).toString()), Double.parseDouble(textFieldSalary.getText()));
						    		textFieldTotalNormal.setText(Double.toString(newTotalNormal));
						    		textFieldTotalExecutive.setText(Double.toString(newTotalExecutive));
						    		textFieldTotalSalary.setText(Double.toString(newTotalSalary));
						    	}
						    	model.setValueAt(textFieldSalary.getText(),i,2);
								JOptionPane.showMessageDialog(null, "Update Successfully");
						    }
						    else 
						    {
						    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
						    }
						}catch(Exception e1) {		//Action when the input of text field Salary is wrong
							JOptionPane.showMessageDialog(null, "Wrong Input! Please enter real number only in the Salary text field!");
						}
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpdate.setBackground(Color.YELLOW);
		btnUpdate.setBounds(333, 26, 129, 47);
		panel_4.add(btnUpdate);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {	//Action for button Upload
			@Override
			public void actionPerformed(ActionEvent e) {
				try {	//3.2 Exception Handling
				File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\EmployeeData.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write("Name |" + "Position |" + "Salary(RM) |\n");
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + " |");
						}
					bw.write("\n");
					}
					bw.write("Total Salary for Normal Employee: RM" + textFieldTotalNormal.getText() + "\n");
					bw.write("Total Salary for Executive Employee: RM" + textFieldTotalExecutive.getText() + "\n");
					bw.write("Total Salary for Employee: RM" + textFieldTotalSalary.getText() + "\n");
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpload.setBackground(Color.YELLOW);
		btnUpload.setBounds(638, 26, 129, 47);
		panel_4.add(btnUpload);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double totalSalary = Double.parseDouble(textFieldTotalSalary.getText());
					Finance a = new Finance(totalMarketingCost, totalSalary);
					a.setVisible(true);
					dispose();
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Sorry! Please input the Employee Salary first before you can go to Finance!");
				}	
			}
		});
		btnFinance.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnFinance.setBackground(Color.YELLOW);
		btnFinance.setBounds(1084, 26, 129, 47);
		panel_4.add(btnFinance);
	}
	
	public double calculateTotalSalary(double num1, double num2) {	//Polymorphism (overloading) method calculateTotalSalary, used for Add button
		double totalSalary;
		totalSalary = num1 + num2;
		return totalSalary;
	}
	
	public double calculateTotalSalary(double total, double numtable, double salary) {	//Polymorphism (overloading) method calculateTotalSalary, used for Update button
		double totalSalary;
		totalSalary = total - numtable + salary;
		return totalSalary;
	}
}
