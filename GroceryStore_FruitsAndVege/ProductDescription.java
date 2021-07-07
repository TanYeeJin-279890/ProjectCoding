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

public class ProductDescription extends JFrame {	//User-definec class

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldWeight;
	private JTextField textFieldPrice;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductDescription frame = new ProductDescription();
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
	public ProductDescription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1326, 766);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1312, 729);
		contentPane.add(panel);
		
		JLabel lblProductDescription = new JLabel("Product Description Management");
		lblProductDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductDescription.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblProductDescription.setBounds(331, 57, 723, 58);
		panel.add(lblProductDescription);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(52, 160, 503, 296);
		panel.add(panel_1);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblProductName.setBounds(30, 58, 130, 36);
		panel_1.add(lblProductName);
		
		JLabel lblWeight = new JLabel("Average Weight(kg)");
		lblWeight.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblWeight.setBounds(30, 138, 204, 24);
		panel_1.add(lblWeight);
		
		JLabel lblPrice = new JLabel("Price(RM)");
		lblPrice.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblPrice.setBounds(30, 218, 167, 24);
		panel_1.add(lblPrice);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldName.setColumns(10);
		textFieldName.setBounds(244, 58, 232, 36);
		panel_1.add(textFieldName);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldWeight.setColumns(10);
		textFieldWeight.setBounds(244, 138, 232, 36);
		panel_1.add(textFieldWeight);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(244, 218, 232, 36);
		panel_1.add(textFieldPrice);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_2.setBackground(new Color(255, 165, 0));
		panel_2.setBounds(52, 547, 1220, 127);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel_3.setBackground(new Color(255, 165, 0));
		panel_3.setBounds(658, 160, 614, 296);
		panel.add(panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 594, 276);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {		//Action when the table is clicked
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
				if(i>=0) {
					textFieldName.setText(model.getValueAt(i,0).toString());		//The data in the selected row will be transfered to the input
					textFieldWeight.setText(model.getValueAt(i,1).toString());
					textFieldPrice.setText(model.getValueAt(i,2).toString());
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
				"Product Name", "Average Weight(kg)", "Price(RM)"
			}
		));
		scrollPane.setViewportView(table);
		
		//Read data from text file
		String filepath = "C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\ProductDescriptionData.txt";	//File path of text file
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
			
			for(int i=0; i< tableLine.length; i++) {	//Go through the text file line by line starting from 2nd line
				String line = tableLine[i].toString().trim();	//Extract data from text file line by line
				String [] dataRow = line.split(" \\|");			//Seperate the data in each line per " |", and store it inside an array
				model.addRow(dataRow);			//Add the data in array into a row of Jtable
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
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//Action for button Add
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(textFieldName.getText().isEmpty()) {		//Validate the input of text field Product Name
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the text field of Product Name!");	//Action if input of text field Product Name is wrong
				}else {
					try {		//3.2 Exception Handling
						Double.parseDouble(textFieldWeight.getText());		//Validate the input of text field Weight and Price
						Double.parseDouble(textFieldPrice.getText());
						model.addRow(new Object[]{					//Action for button Add if all validation passed
								textFieldName.getText(),
								textFieldWeight.getText(),
								textFieldPrice.getText(),
						});
						
						if (table.getSelectedRow() == -1) {
							if (table.getRowCount() == 0) {
								JOptionPane.showMessageDialog(null, "Wrong Input! Data Adding Failed!", "Product Description Management System",
										JOptionPane.OK_OPTION);
							}
						}
						textFieldName.setText("");
						textFieldWeight.setText("");
						textFieldPrice.setText("");
					}catch(Exception e1) {		//Action when input of text field Weight and Price is wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter real number only in the text field of Weight and Price!");
					}
				}
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnAdd.setBackground(Color.YELLOW);
		btnAdd.setBounds(50, 38, 153, 45);
		panel_2.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	//Action for button Reset
				textFieldName.setText("");
				textFieldWeight.setText("");
				textFieldPrice.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnReset.setBackground(Color.YELLOW);
		btnReset.setBounds(213, 38, 153, 45);
		panel_2.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//Action for button Delete
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Product Description Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Product Description Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnDelete.setBackground(Color.YELLOW);
		btnDelete.setBounds(539, 38, 153, 45);
		panel_2.add(btnDelete);
		
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
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnPrint.setBackground(Color.YELLOW);
		btnPrint.setBounds(865, 38, 153, 45);
		panel_2.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	//Action for button Exit
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Product Description Management System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					AdminMenu a = new AdminMenu();		//Exit button connect to Admin Menu
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(1028, 38, 153, 45);
		panel_2.add(btnExit);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//Action for button Update
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(textFieldName.getText().isEmpty()) {		//Validate the input of text field Product Name
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter String only in the text field of Product Name!");	//Action if input in text field Product Name is wrong
				}
				else {
					try {		//3.2 Exception Handling
						Double.parseDouble(textFieldWeight.getText());		//Validate the input of text field Weight and Price
						Double.parseDouble(textFieldPrice.getText());
						int i = table.getSelectedRow();
					    if(i>=0) //if single row is selected than update
					    {														//Action for button Update if all validation passed
					    	model.setValueAt(textFieldName.getText(),i,0);
					    	model.setValueAt(textFieldWeight.getText(),i,1);
					    	model.setValueAt(textFieldPrice.getText(),i,2);
							JOptionPane.showMessageDialog(null, "Update Successfully");
					    }
					    else 
					    {
					    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
					    }
					}catch(Exception e1) {		//Action when input of text field Weight and Price is wrong
						JOptionPane.showMessageDialog(null, "Wrong Input! Please enter real number only in the text field of Weight and Price!");
					}
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnUpdate.setBackground(Color.YELLOW);
		btnUpdate.setBounds(376, 38, 153, 45);
		panel_2.add(btnUpdate);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {		//Action for button Upload
			@Override
			public void actionPerformed(ActionEvent e) {
				try {		//3.2 Exception Handling
				File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\Eclipse Projects\\STIA1123 C Assignment 3\\src\\Output\\ProductDescriptionData.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write("Product Name |"+ "Average Weight(kg) |"+ "Price(RM) |\n");
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
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnUpload.setBackground(Color.YELLOW);
		btnUpload.setBounds(702, 38, 153, 45);
		panel_2.add(btnUpload);
		
		
	}
}
