package GroceryStore_FruitsAndVege;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserRegistration extends JFrame {		//User-defined class

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldIC;
	private JRadioButton rdbtnMember;
	private JRadioButton rdbtnNonMember;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistration frame = new UserRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public UserRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1322, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1308, 729);
		contentPane.add(panel);
		
		JLabel lblCustomerRegistration = new JLabel("Customer Registration");
		lblCustomerRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerRegistration.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblCustomerRegistration.setBounds(443, 34, 448, 54);
		panel.add(lblCustomerRegistration);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_1.setBounds(103, 150, 468, 342);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblName.setBounds(26, 50, 114, 32);
		panel_1.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblGender.setBounds(26, 114, 114, 32);
		panel_1.add(lblGender);
		
		JLabel lblIC = new JLabel("I/C No");
		lblIC.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblIC.setBounds(26, 179, 114, 32);
		panel_1.add(lblIC);
		
		JLabel lblMembership = new JLabel("Membership");
		lblMembership.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblMembership.setBounds(26, 255, 146, 32);
		panel_1.add(lblMembership);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldName.setBounds(154, 50, 278, 29);
		panel_1.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldIC = new JTextField();
		textFieldIC.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldIC.setColumns(10);
		textFieldIC.setBounds(154, 179, 278, 29);
		panel_1.add(textFieldIC);
		
		rdbtnMember = new JRadioButton("Member");
		rdbtnMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnMember.isSelected()) {
					rdbtnNonMember.setSelected(false);
				}
			}
		});
		rdbtnMember.setBackground(new Color(255, 165, 0));
		rdbtnMember.setFont(new Font("Rockwell", Font.PLAIN, 20));
		rdbtnMember.setBounds(164, 264, 103, 21);
		panel_1.add(rdbtnMember);
		
		rdbtnNonMember = new JRadioButton("Non-Member");
		rdbtnNonMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNonMember.isSelected()) {
					rdbtnMember.setSelected(false);
				}
			}
		});
		rdbtnNonMember.setFont(new Font("Rockwell", Font.PLAIN, 20));
		rdbtnNonMember.setBackground(new Color(255, 165, 0));
		rdbtnNonMember.setBounds(285, 264, 147, 21);
		panel_1.add(rdbtnNonMember);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Select the gender", "Male", "Female"}));
		comboBoxGender.setFont(new Font("Rockwell", Font.PLAIN, 20));
		comboBoxGender.setBounds(150, 114, 282, 30);
		panel_1.add(comboBoxGender);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(581, 150, 649, 342);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 629, 322);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {		//Action when the table is clicked
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					textFieldName.setText(model.getValueAt(i,0).toString());			//Data in the selected row will be transfered to input when the table is clicked
					comboBoxGender.setSelectedItem(model.getValueAt(i,1).toString());
					textFieldIC.setText(model.getValueAt(i,2).toString());
					if(model.getValueAt(i, 3).toString().equals("Member")) {
						rdbtnMember.setSelected(true);
						rdbtnNonMember.setSelected(false);
					}
					else if(model.getValueAt(i, 3).toString().equals("Non Member")) {
						rdbtnNonMember.setSelected(true);
						rdbtnMember.setSelected(false);
					}
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
				"Name", "Gender", "I/C No", "Membership"
			}
		));
		scrollPane.setViewportView(table);
		
		//Read data from text file
		String filepath = "C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\UserRegistrationData.txt";	//File path of text file
		File file = new File(filepath);	//Create file on java
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				br.readLine().trim();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	//Read the first line(the column name)
			
			DefaultTableModel model = (DefaultTableModel)table.getModel();	
			
			Object[] tableLine = br.lines().toArray();	//Get line from text file
			
			for(int i=0; i< tableLine.length; i++) {		//Go through the text file line by line starting from 2nd line
				String line = tableLine[i].toString().trim();	//Extract data from text file line by line
				String [] dataRow = line.split(" \\|");			//Seperate the data in each line per " |", and store it inside an array
				model.addRow(dataRow);		//Add the data in array into a row of Jtable
			}
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_3.setBackground(new Color(255, 165, 0));
		panel_3.setBounds(103, 524, 1127, 149);
		panel.add(panel_3);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(rdbtnMember.isSelected() == false && rdbtnNonMember.isSelected() == false) {		//Validate whether the radio button is selected or not
					JOptionPane.showMessageDialog(null, "Wrong Input! Please choose whether the Customer is Member or Not!");	//Action if radio button is not selected
				}
				else {
					if(comboBoxGender.getSelectedItem().toString().equals("Select the gender")) {	//Validate whether the gender in combo box is selected or not
						JOptionPane.showMessageDialog(null, "Wrong Input! Please choose a gender!");	//Action if gender is not selected
					}
					else {
						if(textFieldName.getText().isEmpty()) {		//Validate the input of Name text field
							JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the Name text field!");	//Action if input of Name text field is wrong
						}
						else {
							try{	//3.2 Exception Handling
								Integer.parseInt(textFieldIC.getText());	//Validate whether the input in the I/C text field is integer or not
								if (rdbtnMember.isSelected()) {		//Add button action when radio button Member is selected
									model.addRow(new Object[]{
											textFieldName.getText(),
											comboBoxGender.getSelectedItem(),
											textFieldIC.getText(),
											"Member",
									});
								}else if (rdbtnNonMember.isSelected()) {	//Add button action when radio button Non-Member is selected
									model.addRow(new Object[]{
											textFieldName.getText(),
											comboBoxGender.getSelectedItem(),
											textFieldIC.getText(),
											"Non Member",
									});
								}
								if (table.getSelectedRow() == -1) {
									if (table.getRowCount() == 0) {
										JOptionPane.showMessageDialog(null, "Wrong Input! Data Adding Failed!", "Customer Registration System",
												JOptionPane.OK_OPTION);
									}
								}
								textFieldName.setText("");
								comboBoxGender.setSelectedItem("Select the gender");
								textFieldIC.setText("");
								rdbtnMember.setSelected(false);
								rdbtnNonMember.setSelected(false);
							}catch(Exception e1) {
								JOptionPane.showMessageDialog(null, "Wrong Input! Please enter integer only in the I/C text field!"); //Action when integer is not inputted in I/C text field
							}
						}
					}
				}
			}
		});
		btnAdd.setBackground(new Color(255, 255, 0));
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAdd.setBounds(22, 44, 134, 53);
		panel_3.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");		//Action for button Reset
				comboBoxGender.setSelectedItem("Select the gender");
				textFieldIC.setText("");
				rdbtnMember.setSelected(false);
				rdbtnNonMember.setSelected(false);
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReset.setBackground(Color.YELLOW);
		btnReset.setBounds(179, 44, 134, 53);
		panel_3.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//Action for button Delete
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Customer Registration System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Customer Registration System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBackground(Color.YELLOW);
		btnDelete.setBounds(491, 44, 134, 53);
		panel_3.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//Action for button Print
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPrint.setBackground(Color.YELLOW);
		btnPrint.setBounds(808, 44, 134, 53);
		panel_3.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//Action for button Exit
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Registration Management System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					AdminMenu a = new AdminMenu();		//Button Exit connect to Admin Menu
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(969, 44, 134, 53);
		panel_3.add(btnExit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//Action for button Update
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(rdbtnMember.isSelected() == false && rdbtnNonMember.isSelected() == false) {		//Validate whether the radio button are chosen or not
					JOptionPane.showMessageDialog(null, "Wrong Input! Please choose whether the Customer is Member or Not!");	//Action if radio button is not selected
				}
				else {
					if(textFieldName.getText().isEmpty()) {		//Validate the input of text field Name
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the Name text field!");
					}
					else {
						if(comboBoxGender.getSelectedItem().toString().equals("Select the gender")) {		//Validate whether gender is chosen in combo box
							JOptionPane.showMessageDialog(null, "Wrong Input! Please choose a gender!");	//Action if gender is not choosen
						}
						else {
							try {		//3.2 Exception Handling
								Integer.parseInt(textFieldIC.getText());	//Validate whether the input of I/C text field is integer or not
								int i = table.getSelectedRow();
							    if(i>=0) //if single row is selected than update
							    {													//Action of Update button if all validation passed
							    	model.setValueAt(textFieldName.getText(),i,0);
							    	model.setValueAt(comboBoxGender.getSelectedItem(),i,1);
							    	model.setValueAt(textFieldIC.getText(),i,2);
							    	if(rdbtnMember.isSelected()) {
							    		model.setValueAt("Member", i, 3);
							    	}
							    	else if(rdbtnNonMember.isSelected()) {
							    		model.setValueAt("Non Member", i, 3);
							    	}
									JOptionPane.showMessageDialog(null, "Update Successfully");
							    }
							    else 
							    {
							    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
							    }
							}catch(Exception e1) {
								JOptionPane.showMessageDialog(null, "Wrong Input! Please enter integer only in the I/C text field!");	//Action when input of I/C text field is not integer
							}
						}
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpdate.setBackground(Color.YELLOW);
		btnUpdate.setBounds(339, 44, 134, 53);
		panel_3.add(btnUpdate);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	//Action of button Upload
				try {		//3.2 Exception Handling
				File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\UserRegistrationData.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write("Name |" + "Gender |" + "I/C |" + "Membership |\n");
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + " |");
						}
					bw.write("\n");
					}
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
		btnUpload.setBounds(648, 44, 134, 53);
		panel_3.add(btnUpload);
	}
}
