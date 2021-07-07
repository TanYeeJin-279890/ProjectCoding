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
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Billing extends JFrame {	//User-defined class

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldPrice;
	private JTextField textFieldNumber;
	private JTextField textFieldTotalCharge;
	private JTextField textFieldAmount;
	private JRadioButton rdbtnCash;
	private JRadioButton rdbtnCard;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1325, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1311, 719);
		contentPane.add(panel);
		
		JLabel lblBilling = new JLabel("Billing");
		lblBilling.setHorizontalAlignment(SwingConstants.CENTER);
		lblBilling.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblBilling.setBounds(510, 40, 231, 47);
		panel.add(lblBilling);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.YELLOW));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(72, 140, 399, 279);
		panel.add(panel_1);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblProduct.setBounds(28, 26, 117, 33);
		panel_1.add(lblProduct);
		
		JLabel lblNo = new JLabel("Number");
		lblNo.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblNo.setBounds(28, 162, 117, 33);
		panel_1.add(lblNo);
		
		JComboBox comboBoxProduct = new JComboBox();
		comboBoxProduct.addMouseListener(new MouseAdapter() {	//Action when the combo box is clicked
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldPrice.setText("");		//Reset the value in text field Price when combo box is clicked
			}
		});
		comboBoxProduct.setModel(new DefaultComboBoxModel(new String[] {"Select the product", "Mango", "Watermelon", "Dragon Fruit", "Cabbage", "Tomato", "Corn"}));
		comboBoxProduct.setForeground(Color.BLACK);
		comboBoxProduct.setFont(new Font("Rockwell", Font.PLAIN, 20));
		comboBoxProduct.setBounds(188, 27, 175, 30);
		panel_1.add(comboBoxProduct);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setEditable(false);		//Text field Price is set to uneditable because it is determined by the Price button after user choose the products
		textFieldPrice.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(184, 107, 179, 33);
		panel_1.add(textFieldPrice);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldNumber.setColumns(10);
		textFieldNumber.setBounds(184, 162, 179, 33);
		panel_1.add(textFieldNumber);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.addActionListener(new ActionListener() {		//Action for button Order
			public void actionPerformed(ActionEvent e) {
				double num = 0;
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				try {	//3.2 Exception Handling
					Double.parseDouble(textFieldPrice.getText());		//Validate the input of text field Price and Number
					Integer.parseInt(textFieldNumber.getText());		
					model.addRow(new Object[]{		//Action of button Order if all validation passed
							comboBoxProduct.getSelectedItem(),
							textFieldPrice.getText(),
							textFieldNumber.getText(),
							calculateTotalPrice(Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldNumber.getText())),
					});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Order Update confirmed", "Billing System",
									JOptionPane.OK_OPTION);
						}
					}
					try {		//Validate whether text field Total Charge is null or not
						if(textFieldTotalCharge.getText() != null) {
							num = Double.parseDouble(textFieldTotalCharge.getText());
						}
					}
					catch (NumberFormatException e1) {	//If text field Total Charge is null, convert it to 0
						num = 0;
					}
					double totalCharge = 0;
					totalCharge = calculateTotalCharge(num, Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldNumber.getText()));
					textFieldTotalCharge.setText(Double.toString(totalCharge));
					comboBoxProduct.setSelectedItem("Select the product");
					textFieldPrice.setText("");
					textFieldNumber.setText("");
				}catch(Exception e1) {	//Action when input of text field Price and/or Number is wrong
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter integer only in the Number text field and click the Price button to obtain the price of product!");
				}
			}
		});
		btnOrder.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnOrder.setBackground(Color.YELLOW);
		btnOrder.setBounds(28, 215, 160, 40);
		panel_1.add(btnOrder);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {		//Action for button Reset
			public void actionPerformed(ActionEvent e) {
				comboBoxProduct.setSelectedItem("Select the product");
				textFieldPrice.setText("");
				textFieldNumber.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnReset.setBackground(Color.YELLOW);
		btnReset.setBounds(203, 215, 160, 40);
		panel_1.add(btnReset);
		
		JButton btnPrice = new JButton("Price(RM)");
		btnPrice.addActionListener(new ActionListener() {		//Action of button Price
			public void actionPerformed(ActionEvent e) {
				if(comboBoxProduct.getSelectedItem().toString().equals("Mango")) {		//Value in text Field Price is determined by the product chosen
					textFieldPrice.setText("3.50");
				}
				else if(comboBoxProduct.getSelectedItem().toString().equals("Watermelon")) {
					textFieldPrice.setText("5.50");
				}
				else if(comboBoxProduct.getSelectedItem().toString().equals("Dragon Fruit")) {
					textFieldPrice.setText("4.50");
				}
				else if(comboBoxProduct.getSelectedItem().toString().equals("Cabbage")) {
					textFieldPrice.setText("3.00");
				}
				else if(comboBoxProduct.getSelectedItem().toString().equals("Tomato")) {
					textFieldPrice.setText("2.50");
				}
				else if(comboBoxProduct.getSelectedItem().toString().equals("Corn")) {
					textFieldPrice.setText("4.50");
				}
				else {		//Action when no product is selected
					JOptionPane.showMessageDialog(null,"Please Select a Product",
							"Billing System", JOptionPane.OK_OPTION);
				}
			}
		});
		btnPrice.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPrice.setBounds(28, 108, 134, 33);
		panel_1.add(btnPrice);
		
		JLabel lblMessage1 = new JLabel("*Press the Price button to show the price of product");
		lblMessage1.setForeground(new Color(255, 0, 0));
		lblMessage1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMessage1.setBounds(25, 69, 338, 28);
		panel_1.add(lblMessage1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.YELLOW));
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(525, 140, 725, 279);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 8, 711, 205);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {		//Action when table is clicked
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					comboBoxProduct.setSelectedItem(model.getValueAt(i,0).toString());		//Data in selected row is transfered to input
					textFieldNumber.setText(model.getValueAt(i,2).toString());
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
				"Product", "Price(RM)", "Number", "Total Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {		//Action for button Update
			public void actionPerformed(ActionEvent e) {
				double newTotalPrice = 0;
				double newTotalCharge = 0;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				try {	//3.2 Exception Handling
					Double.parseDouble(textFieldPrice.getText());		//Validate the input of text field Price and Number
					Integer.parseInt(textFieldNumber.getText());
					int i = table.getSelectedRow();			//Action of button Update if all validation passed
				    if(i>=0) //if single row is selected than update
				    {
				    	newTotalCharge = calculateTotalCharge(Double.parseDouble(textFieldTotalCharge.getText()), Double.parseDouble(model.getValueAt(i, 3).toString()), Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldNumber.getText()));
				    	model.setValueAt(comboBoxProduct.getSelectedItem().toString(),i,0);
				    	model.setValueAt(textFieldPrice.getText(),i,1);
				    	model.setValueAt(textFieldNumber.getText(), i, 2);
				    	newTotalPrice = calculateTotalPrice(Double.parseDouble(textFieldPrice.getText()), Integer.parseInt(textFieldNumber.getText()));
				    	model.setValueAt(Double.toString(newTotalPrice), i, 3);
				    	textFieldTotalCharge.setText(Double.toString(newTotalCharge));
						JOptionPane.showMessageDialog(null, "Update Successfully");
				    }
				    else 
				    {
				    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
				    }
				}catch(Exception e1) {		//Action when input of text field Price and Number are wrong
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter integer only in the Number text field!");
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnUpdate.setBackground(Color.YELLOW);
		btnUpdate.setBounds(171, 217, 175, 44);
		panel_2.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {	//Action for button Delete
			public void actionPerformed(ActionEvent e) {
				double newTotalCharge = 0;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Finance Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Finance Management System", JOptionPane.OK_OPTION);
					}
				}else {
					newTotalCharge = calculateTotalCharge(Double.parseDouble(textFieldTotalCharge.getText()), Double.parseDouble(model.getValueAt(table.getSelectedRow(),3).toString()));
					textFieldTotalCharge.setText(Double.toString(newTotalCharge));
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDelete.setBackground(Color.YELLOW);
		btnDelete.setBounds(397, 217, 175, 44);
		panel_2.add(btnDelete);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.YELLOW));
		panel_3.setBackground(new Color(255, 165, 0));
		panel_3.setBounds(72, 429, 759, 95);
		panel.add(panel_3);
		
		JLabel lblTotalCharge = new JLabel("Total Charge(RM)");
		lblTotalCharge.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblTotalCharge.setBounds(52, 26, 180, 33);
		panel_3.add(lblTotalCharge);
		
		textFieldTotalCharge = new JTextField();
		textFieldTotalCharge.setEditable(false);
		textFieldTotalCharge.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldTotalCharge.setColumns(10);
		textFieldTotalCharge.setBounds(297, 26, 195, 33);
		panel_3.add(textFieldTotalCharge);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.YELLOW));
		panel_4.setBackground(new Color(255, 165, 0));
		panel_4.setBounds(72, 534, 759, 160);
		panel.add(panel_4);
		
		JLabel lblPayment = new JLabel("Payment Method");
		lblPayment.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblPayment.setBounds(53, 21, 169, 33);
		panel_4.add(lblPayment);
		
		rdbtnCash = new JRadioButton("Cash");
		rdbtnCash.addActionListener(new ActionListener() {		//Action when radio button Cash is selected
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCash.isSelected()) {		//If radio button cash is selected, text field Amount is set Visible to input the amount
					rdbtnCard.setSelected(false);
					textFieldAmount.setVisible(true);
				}
			}
		});
		rdbtnCash.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnCash.setFont(new Font("Rockwell", Font.PLAIN, 20));
		rdbtnCash.setBackground(new Color(255, 165, 0));
		rdbtnCash.setBounds(250, 22, 139, 30);
		panel_4.add(rdbtnCash);
		
		rdbtnCard = new JRadioButton("Card");
		rdbtnCard.addActionListener(new ActionListener() {		//Action when radio button Card is selected
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCard.isSelected()) {		//If radio button card is selected, text field Amount is set Unvisible because no need to input amount when paid using card
					rdbtnCash.setSelected(false);
					textFieldAmount.setVisible(false);
				}
			}
		});
		rdbtnCard.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnCard.setFont(new Font("Rockwell", Font.PLAIN, 20));
		rdbtnCard.setBackground(new Color(255, 165, 0));
		rdbtnCard.setBounds(391, 22, 139, 30);
		panel_4.add(rdbtnCard);
		
		JLabel lblAmount = new JLabel("Amount(RM)");
		lblAmount.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblAmount.setBounds(53, 74, 169, 33);
		panel_4.add(lblAmount);
		
		textFieldAmount = new JTextField();
		textFieldAmount.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldAmount.setColumns(10);
		textFieldAmount.setBounds(297, 74, 195, 33);
		panel_4.add(textFieldAmount);
		
		JButton btnPay = new JButton("PAY");
		btnPay.addActionListener(new ActionListener() {		//Action for button Pay
			public void actionPerformed(ActionEvent e) {
				boolean payment = false;
				if(rdbtnCard.isSelected()) {		//Action when radio button Card is selected
					JOptionPane.showMessageDialog(null, "Payment Succesful");
					payment = true;
				}
				else if(rdbtnCash.isSelected()) {		//Action when radio button Cash is selected
					try {	//3.2 Exception Handling
						Double.parseDouble(textFieldAmount.getText());		//Validate the input of text field Amount
						if(Double.parseDouble(textFieldAmount.getText()) >= Double.parseDouble(textFieldTotalCharge.getText())) {
							JOptionPane.showMessageDialog(null, "Payment Succesful");
							payment = true;
						}
						else {
							JOptionPane.showMessageDialog(null,"Payment Failed",
									"Billing System", JOptionPane.OK_OPTION);
							payment = false;
						}
					}catch(Exception e1) {	//Action when input of text field Amount is wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter real number only in the Amount text field!");
					}
				}
				if(payment == true) {
					double charge = 0;
						try {	//3.2 Exception Handling //If payment success, data in table is uploaded
						File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\BillingData.txt");
						if(!file.exists()) {
							file.createNewFile();
							}
						FileWriter fw = new FileWriter(file.getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fw);
						
						bw.write("Product|  " + "Price(RM)|  " + "Number|  " + "Total Price(RM)|  \n");
						for (int i=0; i<table.getRowCount(); i++) {
							for (int j=0; j<table.getColumnCount(); j++) {
								bw.write(table.getModel().getValueAt(i, j) + "|  ");
								}
							bw.write("\n");
							}
							bw.write("Total Charge: RM" + textFieldTotalCharge.getText() + "\n");
							if(rdbtnCard.isSelected()) {
								bw.write("Payment Method: Card\n");
								bw.write("Payment Amount: RM" + textFieldTotalCharge.getText() + "\n");
								bw.write("Charge: RM0.00");
							}
							else if(rdbtnCash.isSelected()) {
								bw.write("Payment Method: Cash\n");
								bw.write("Payment Amount: RM" + textFieldAmount.getText() + "\n");
								charge = Double.parseDouble(textFieldAmount.getText()) - Double.parseDouble(textFieldTotalCharge.getText());
								bw.write("Charge: RM" + Double.toString(charge));
							}
							bw.close();
							fw.close();
							JOptionPane.showMessageDialog(null, "Data Exported");
						}
						catch(Exception ex) {
							ex.printStackTrace();
						}
				}
			}
		});
		btnPay.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnPay.setBackground(Color.YELLOW);
		btnPay.setBounds(559, 50, 175, 44);
		panel_4.add(btnPay);
		
		JLabel lblMessage2 = new JLabel("*No need to specify the Amount if paid using Card");
		lblMessage2.setForeground(Color.RED);
		lblMessage2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMessage2.setBounds(53, 110, 338, 28);
		panel_4.add(lblMessage2);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {	//Action for button Exit
			public void actionPerformed(ActionEvent e) {	
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Billing System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Home a = new Home();	//Button exit connect to Home
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(970, 604, 175, 44);
		panel.add(btnExit);
	}
	
	public double calculateTotalPrice(double price, int number) {
		double totalprice;
		totalprice = price * number;
		return totalprice;
	}
	
	public double calculateTotalCharge(double num1, double price, int numproduct) {		//Polymorphism (overloading) method calculateTotalCharge, used for Add button
		double totalCharge;
		totalCharge = num1 + price * numproduct;
		return totalCharge;
	}
	
	public double calculateTotalCharge(double totalcharge, double numtable, double price, int numproduct) {		//Polymorphism (overloading) method calculateTotalCharge, used for Update button
		double totalCharge;
		totalCharge = totalcharge - numtable + price * numproduct;
		return totalCharge;
	}
	
	public double calculateTotalCharge(double totalcharge, double numtable) {	//Polymorphism (overloading) method calculateTotalCharge, used for Delete button
		double totalCharge;
		totalCharge = totalcharge - numtable;
		return totalCharge;
	}
}
