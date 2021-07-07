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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Marketing extends JFrame {		//User-defined class

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldMethod;
	private JTextField textFieldCost;
	private JTextField textFieldTotalCost;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Marketing frame = new Marketing();
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
	public Marketing(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1319, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1305, 722);
		contentPane.add(panel);
		
		JLabel lblMarketing = new JLabel("Marketing Details");
		lblMarketing.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarketing.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblMarketing.setBounds(477, 31, 384, 57);
		panel.add(lblMarketing);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(78, 98, 506, 306);
		panel.add(panel_1);
		
		JLabel lblMarketingMethod = new JLabel("Marketing Method");
		lblMarketingMethod.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblMarketingMethod.setBounds(43, 53, 192, 52);
		panel_1.add(lblMarketingMethod);
		
		JLabel lblCost = new JLabel("Cost(RM)");
		lblCost.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblCost.setBounds(43, 176, 192, 52);
		panel_1.add(lblCost);
		
		textFieldMethod = new JTextField();
		textFieldMethod.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldMethod.setColumns(10);
		textFieldMethod.setBounds(245, 53, 209, 52);
		panel_1.add(textFieldMethod);
		
		textFieldCost = new JTextField();
		textFieldCost.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldCost.setColumns(10);
		textFieldCost.setBounds(245, 176, 209, 52);
		panel_1.add(textFieldCost);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(39, 540, 1240, 119);
		panel.add(panel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_4.setBackground(new Color(255, 165, 0));
		panel_4.setBounds(281, 430, 616, 85);
		panel.add(panel_4);
		
		JLabel lblTotalCost = new JLabel("Total Marketing Cost(RM)");
		lblTotalCost.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblTotalCost.setBounds(45, 26, 245, 37);
		panel_4.add(lblTotalCost);
		
		textFieldTotalCost = new JTextField();
		textFieldTotalCost.setEditable(false);
		textFieldTotalCost.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldTotalCost.setColumns(10);
		textFieldTotalCost.setBounds(327, 26, 245, 37);
		panel_4.add(textFieldTotalCost);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_3.setBackground(new Color(255, 165, 0));
		panel_3.setBounds(634, 98, 593, 306);
		panel.add(panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 572, 286);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {		//Action when the table is clicked
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					textFieldMethod.setText(model.getValueAt(i,0).toString());		//Data in the selected row will be transfered to the input
					textFieldCost.setText(model.getValueAt(i,1).toString());
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
				"Marketing Method", "Cost(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		//Read data from text file
		String filepath = "C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\MarketingData.txt";		//File path of text file
		File file = new File(filepath);		//Create file on java
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				br.readLine().trim();	//Read the first line(the column name)
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			
			Object[] tableLine = br.lines().toArray();		//Get line from text file
			
			for(int i=0; i< tableLine.length-1; i++) {		//Go through the text file line by line starting from 2nd line other than the last line(because the last line is used to store total marketing cost)
				String line = tableLine[i].toString().trim();	//Extract data from text file line by line
				String [] dataRow = line.split(" \\|");			//Seperate the data in each line per " |", and store it inside an array
				model.addRow(dataRow);		//Add the data in array into a row of Jtable
			}
			double totalcost = 0;
			for(int i=0; i<table.getRowCount(); i++) {
				totalcost += Double.parseDouble(model.getValueAt(i, 1).toString());
			}
			textFieldTotalCost.setText(Double.toString(totalcost));
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
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//Action for button Add
				double num = 0;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(textFieldMethod.getText().isEmpty()){		//Validate the input of text field Marketing Method
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the Marketing Method text field!");	//Action if input of text field Marketing Method is wrong
				}
				else {
					try {		//3.2 Exception Handling
						Double.parseDouble(textFieldCost.getText());	//Validate the input of text field Cost
						model.addRow(new Object[]{						//Action for button Add if all validation passed
								textFieldMethod.getText(),
								textFieldCost.getText(),
						});
						
						if (table.getSelectedRow() == -1) {
							if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Wrong Input! Data Adding Failed!", "Marketing Management System",
										JOptionPane.OK_OPTION);
							}
						}
						try {		//Validate whether text field Total Cost is null or not
							if(textFieldTotalCost.getText() != null) {
								num = Double.parseDouble(textFieldTotalCost.getText());
							}
						}
						catch (NumberFormatException e1) {		//If text field Total Cost is null, convert it to 0
							num = 0;
						}
						double totalcost = 0;
						totalcost = calculateTotalCost(num, Double.parseDouble(textFieldCost.getText()));
						textFieldTotalCost.setText(Double.toString(totalcost));
						textFieldMethod.setText("");
						textFieldCost.setText("");
					}catch(Exception e1) {			//Action when the input of text field Cost is wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter real number only in the Cost text field!");
					}
				}
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAdd.setBackground(Color.YELLOW);
		btnAdd.setBounds(21, 38, 107, 40);
		panel_2.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {		//Action for button Reset
			public void actionPerformed(ActionEvent e) {
				textFieldMethod.setText("");
				textFieldCost.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReset.setBackground(Color.YELLOW);
		btnReset.setBounds(157, 38, 107, 40);
		panel_2.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {		//Action for button Delete
			public void actionPerformed(ActionEvent e) {
				double num = 0;
				double totalcost;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Marketing Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Marketing Management System", JOptionPane.OK_OPTION);
					}
				}else {
					num = Double.parseDouble(model.getValueAt(table.getSelectedRow(),1).toString());
					totalcost = Double.parseDouble(textFieldTotalCost.getText()) - num;
					textFieldTotalCost.setText(Double.toString(totalcost));
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBackground(Color.YELLOW);
		btnDelete.setBounds(428, 38, 115, 40);
		panel_2.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {		//Action for button Print
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
		btnPrint.setBounds(708, 38, 107, 40);
		panel_2.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {		//Action for button Exit
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Marketing Management System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					AdminMenu a = new AdminMenu();		//Button Exit connect to Admin Menu
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(839, 38, 107, 40);
		panel_2.add(btnExit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {		//Action for button Update
			public void actionPerformed(ActionEvent e) {
				double newTotalCost = 0;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(textFieldMethod.getText().isEmpty()) {		//Validate the input of text field Marketing Method
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the Marketing Method text field!");	//Action if input of text field MArketing Method is wrong
				}else {
					try {		//3.2 Exception Handling
						Double.parseDouble(textFieldCost.getText());		//Validate the input of text field Cost
						int i = table.getSelectedRow();						//Action for button Update if all validation passed
					    if(i>=0) //if single row is selected than update
					    {
					    	newTotalCost = calculateTotalCost(Double.parseDouble(textFieldTotalCost.getText()), Double.parseDouble(model.getValueAt(i, 1).toString()), Double.parseDouble(textFieldCost.getText()));
					    	model.setValueAt(textFieldMethod.getText(),i,0);
					    	model.setValueAt(textFieldCost.getText(),i,1);
					    	textFieldTotalCost.setText(Double.toString(newTotalCost));
							JOptionPane.showMessageDialog(null, "Update Successfully");
					    }
					    else 
					    {
					    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
					    }
					}catch(Exception e1) {		//Action when the input of text field Cost is wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter real number only in the Cost text field!");
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpdate.setBackground(Color.YELLOW);
		btnUpdate.setBounds(291, 38, 115, 40);
		panel_2.add(btnUpdate);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {		//Action for button Upload
			@Override
			public void actionPerformed(ActionEvent e) {
				try {	//3.2 Exception Handling
				File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\MarketingData.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write("Marketing Method |" + "Cost(RM) |\n");
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + " |");
						}
					bw.write("\n");
					}
					bw.write("Total Marketing Cost: RM" + textFieldTotalCost.getText());
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
		btnUpload.setBounds(563, 38, 120, 40);
		panel_2.add(btnUpload);
		
		JButton btnEmployee = new JButton("Employee Management");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Double.parseDouble(textFieldTotalCost.getText());
					double totalMarketingCost = Double.parseDouble(textFieldTotalCost.getText());
					Employee a = new Employee(totalMarketingCost);
					a.setVisible(true);
					dispose();
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Sorry! Please input the Marketing Method and Cost first before you can go to Employee Management!");
				}
			}
		});
		btnEmployee.setBounds(972, 38, 243, 40);
		panel_2.add(btnEmployee);
		btnEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnEmployee.setBackground(Color.YELLOW);
		
	}
	
	
	
	public double calculateTotalCost(double num, double cost) {		//Polymorphism (overloading) method calculateTotalCost, used for Add button
		double totalCost;
		totalCost = num + cost;
		return totalCost;
	}
	
	public double calculateTotalCost(double totalcost, double numtable, double cost) {	//Polymorphism (overloading) method calculateTotalCost, used for Update button
		double totalCost;
		totalCost = totalcost - numtable + cost;
		return totalCost;
	}
}
