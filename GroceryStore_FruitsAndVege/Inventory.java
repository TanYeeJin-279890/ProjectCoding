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

public class Inventory extends JFrame {		//User-defined class

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldProduct;
	private JTextField textFieldPrice;
	private JTextField textFieldNumber;
	private JTextField textFieldTotalInventory;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1317, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1303, 718);
		contentPane.add(panel);
		
		JLabel lblInventory = new JLabel("Inventory Management");
		lblInventory.setHorizontalAlignment(SwingConstants.CENTER);
		lblInventory.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblInventory.setBounds(394, 46, 465, 46);
		panel.add(lblInventory);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(67, 130, 440, 275);
		panel.add(panel_1);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblProductName.setBounds(28, 64, 153, 28);
		panel_1.add(lblProductName);
		
		JLabel lblPrice = new JLabel("Price(RM)");
		lblPrice.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblPrice.setBounds(28, 132, 153, 28);
		panel_1.add(lblPrice);
		
		JLabel lblNo = new JLabel("Number");
		lblNo.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblNo.setBounds(28, 203, 153, 28);
		panel_1.add(lblNo);
		
		textFieldProduct = new JTextField();
		textFieldProduct.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldProduct.setColumns(10);
		textFieldProduct.setBounds(211, 64, 179, 28);
		panel_1.add(textFieldProduct);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(211, 132, 179, 28);
		panel_1.add(textFieldPrice);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldNumber.setColumns(10);
		textFieldNumber.setBounds(211, 203, 179, 28);
		panel_1.add(textFieldNumber);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_3.setBackground(new Color(255, 165, 0));
		panel_3.setBounds(336, 427, 541, 82);
		panel.add(panel_3);
		
		JLabel lblTotalInventory = new JLabel("Total Inventory(RM)");
		lblTotalInventory.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblTotalInventory.setBounds(38, 25, 190, 33);
		panel_3.add(lblTotalInventory);
		
		textFieldTotalInventory = new JTextField();
		textFieldTotalInventory.setEditable(false);
		textFieldTotalInventory.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldTotalInventory.setColumns(10);
		textFieldTotalInventory.setBounds(250, 25, 236, 33);
		panel_3.add(textFieldTotalInventory);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(559, 130, 666, 275);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 646, 255);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {		//Action when table is clicked
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();		
				int i = table.getSelectedRow();
				if(i>=0) {
					textFieldProduct.setText(model.getValueAt(i,0).toString());		//Data in selected row is transfered to input
					textFieldPrice.setText(model.getValueAt(i,1).toString());
					textFieldNumber.setText(model.getValueAt(i, 2).toString());
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
				"Product Name", "Price(RM)", "Number", "Total Value(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		//Read data from text file
		String filepath = "C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\InventoryData.txt";		//File path of text file
		File file = new File(filepath);		//Create file on java
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				br.readLine().trim();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	//Read the first line(the column name)
			
			DefaultTableModel model = (DefaultTableModel)table.getModel();	
			
			Object[] tableLine = br.lines().toArray();		//Get line from text file
			
			for(int i=0; i< tableLine.length-1; i++) {		//Go through the text file line by line starting from 2nd line other than the last line(because the last line is used to store total inventory)
				String line = tableLine[i].toString().trim();	//Extract data from text file line by line
				String [] dataRow = line.split(" \\|");			//Seperate the data in each line per " |", and store it inside an array
				model.addRow(dataRow);		//Add the data in array into a row of Jtable
			}
			double totalinventory = 0;
			for(int i=0; i<table.getRowCount(); i++) {
				totalinventory += Double.parseDouble(model.getValueAt(i, 3).toString());
			}
			textFieldTotalInventory.setText(Double.toString(totalinventory));
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
		panel_4.setBounds(67, 545, 1158, 143);
		panel.add(panel_4);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	//Action for button Add
				double num = 0;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(textFieldProduct.getText().isEmpty()) {		//Validate the input of text field Product
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the Product text field!");	//Action if input of text field Product is wrong
				}
				else {
					try {		//3.2 Exception Handling
						Double.parseDouble(textFieldPrice.getText());	//Validate the input of text field Price and Number
						Integer.parseInt(textFieldNumber.getText());
						model.addRow(new Object[]{				//Action for button Add when all validation passed
								textFieldProduct.getText(),
								textFieldPrice.getText(),
								textFieldNumber.getText(),
								calculateTotalValue(Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldNumber.getText())),
						});
						
						if (table.getSelectedRow() == -1) {
							if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Inventory Update confirmed", "Inventory Management System",
										JOptionPane.OK_OPTION);
							}
						}
						try {		//Validate whether text field Total Inventory is null or not
							if(textFieldTotalInventory.getText() != null) {
								num = Double.parseDouble(textFieldTotalInventory.getText());
							}
						}
						catch (NumberFormatException e1) {		//If text field Total Inventory is null, convert it to 0
							num = 0;
						}
						double totalInventory = 0;
						totalInventory = calculateTotalInventory(num, Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldNumber.getText()));
						textFieldTotalInventory.setText(Double.toString(totalInventory));
						textFieldProduct.setText("");
						textFieldPrice.setText("");
						textFieldNumber.setText("");
					}catch(Exception e1) {	//Action when the input of text field Price and Number is wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter real number only in the Price text field and integer only in the Number text field!");
					}
				}
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAdd.setBackground(Color.YELLOW);
		btnAdd.setBounds(44, 46, 134, 46);
		panel_4.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {		//Action for button Reset
			public void actionPerformed(ActionEvent e) {
				textFieldProduct.setText("");
				textFieldPrice.setText("");
				textFieldNumber.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReset.setBackground(Color.YELLOW);
		btnReset.setBounds(202, 46, 134, 46);
		panel_4.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {		//Action for button Delete
			public void actionPerformed(ActionEvent e) {
				double num = 0;
				double totalInventory;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Inventory Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Inventory Management System", JOptionPane.OK_OPTION);
					}
				}else {
					num = Double.parseDouble(model.getValueAt(table.getSelectedRow(),3).toString());
					totalInventory = calculateTotalInventory(Double.parseDouble(textFieldTotalInventory.getText()), num);
					textFieldTotalInventory.setText(Double.toString(totalInventory));
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBackground(Color.YELLOW);
		btnDelete.setBounds(517, 46, 134, 46);
		panel_4.add(btnDelete);
		
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
		btnPrint.setBounds(830, 46, 134, 46);
		panel_4.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {		//Action for button Exit
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Inventory Management System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					AdminMenu a = new AdminMenu();		//Button Exit connect to Admin Menu
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(987, 46, 134, 46);
		panel_4.add(btnExit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {		//Action for button Update
			public void actionPerformed(ActionEvent e) {
				double newTotalValue = 0;
				double newTotalInventory = 0;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(textFieldProduct.getText().isEmpty()) {		//Validate the input of text field Product
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the Product text field!");	//Action if input of text field Product is wrong
				}
				else {
					try {		//3.2 Exception Handling
						Double.parseDouble(textFieldPrice.getText());		//Validate the input of text field Price and Number
						Integer.parseInt(textFieldNumber.getText());
						int i = table.getSelectedRow();			//Action for button Update if all validation passed
					    if(i>=0) //if single row is selected than update
					    {
					    	newTotalInventory = calculateTotalInventory(Double.parseDouble(textFieldTotalInventory.getText()), Double.parseDouble(model.getValueAt(i, 3).toString()), Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldNumber.getText()));
					    	model.setValueAt(textFieldProduct.getText(),i,0);
					    	model.setValueAt(textFieldPrice.getText(),i,1);
					    	model.setValueAt(textFieldNumber.getText(), i, 2);
					    	newTotalValue = calculateTotalValue(Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldNumber.getText()));
					    	model.setValueAt(Double.toString(newTotalValue), i, 3);
					    	textFieldTotalInventory.setText(Double.toString(newTotalInventory));
							JOptionPane.showMessageDialog(null, "Update Successfully");
					    }
					    else 
					    {
					    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
					    }
					}catch(Exception e1) {		//Action when input of text field Price and Number are wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter real number only in the Price text field and integer only in the Number text field!");
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpdate.setBackground(Color.YELLOW);
		btnUpdate.setBounds(362, 46, 134, 46);
		panel_4.add(btnUpdate);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {		//Action for button Upload
			@Override
			public void actionPerformed(ActionEvent e) {
				try {		//3.2 Exception Handling
				File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\InventoryData.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write("Product |" + "Price(RM) |" + "Number |" + "Total Value(RM) |\n");
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + " |");
						}
					bw.write("\n");
					}
					bw.write("Total Inventory: RM" + textFieldTotalInventory.getText());
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
		btnUpload.setBounds(673, 46, 134, 46);
		panel_4.add(btnUpload);
	}
	
	public double calculateTotalValue(double price, int numproduct) {
		double totalValue;
		totalValue = price * numproduct;
		return totalValue;
	}
	
	public double calculateTotalInventory(double num, double price, int numproduct) {	//Polymorphism (overloading) method calculateTotalInventory, used for Add button
		double totalInventory;
		totalInventory = num + price * numproduct;
		return totalInventory;
	}
	
	public double calculateTotalInventory(double totalinventory, double numtable) {		//Polymorphism (overloading) method calculateTotalInventory, used for Delete button
		double totalInventory;
		totalInventory = totalinventory - numtable;
		return totalInventory;
	}
	
	public double calculateTotalInventory(double totalinventory, double numtable, double price, int numproduct) {		//Polymorphism (overloading) method calculateTotalInventory, used for Update button
		double totalInventory;
		totalInventory = totalinventory - numtable + price * numproduct;
		return totalInventory;
	}

}
