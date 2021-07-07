package GroceryStore_PersonalCare;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee {

	protected JFrame em;
	private JTextField txtKeyInCardNo;
	private JTextField txtKeyInName;
	private JTextField txtKeyInPhoneNumber;
	private JTextField txtKeyInAge;
	private JTextField txtKeyInSalary;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee window = new Employee();
					window.em.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		em = new JFrame();
		em.setBounds(100, 100, 1294, 737);
		em.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		em.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 128)));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(10, 11, 1260, 678);
		em.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel EmployeeLabel = new JLabel("EMPLOYEE");
		EmployeeLabel.setForeground(new Color(0, 0, 128));
		EmployeeLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		EmployeeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		EmployeeLabel.setBounds(453, 26, 516, 50);
		panel.add(EmployeeLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 128)));
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(176, 108, 385, 424);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Employee_Label_1 = new JLabel("Employee Enrollment");
		Employee_Label_1.setHorizontalAlignment(SwingConstants.CENTER);
		Employee_Label_1.setForeground(new Color(0, 0, 128));
		Employee_Label_1.setFont(new Font("Rockwell", Font.BOLD, 30));
		Employee_Label_1.setBounds(10, 11, 365, 50);
		panel_1.add(Employee_Label_1);
		
		JLabel CardNoLabel_1_1 = new JLabel("Card No.");
		CardNoLabel_1_1.setBounds(10, 72, 100, 34);
		panel_1.add(CardNoLabel_1_1);
		CardNoLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		CardNoLabel_1_1.setForeground(new Color(0, 0, 128));
		CardNoLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel NameLabel_1_1 = new JLabel("Name");
		NameLabel_1_1.setBounds(10, 117, 100, 21);
		panel_1.add(NameLabel_1_1);
		NameLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		NameLabel_1_1.setForeground(new Color(0, 0, 128));
		NameLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel PhoneNumberLabel_1_3 = new JLabel("Phone Number");
		PhoneNumberLabel_1_3.setBounds(10, 162, 124, 21);
		panel_1.add(PhoneNumberLabel_1_3);
		PhoneNumberLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		PhoneNumberLabel_1_3.setForeground(new Color(0, 0, 128));
		PhoneNumberLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel PositionLabel_1_1_1 = new JLabel("Position");
		PositionLabel_1_1_1.setBounds(10, 330, 76, 37);
		panel_1.add(PositionLabel_1_1_1);
		PositionLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		PositionLabel_1_1_1.setForeground(new Color(0, 0, 128));
		PositionLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel SalaryLabel_1_2 = new JLabel("Salary");
		SalaryLabel_1_2.setBounds(10, 243, 66, 39);
		panel_1.add(SalaryLabel_1_2);
		SalaryLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		SalaryLabel_1_2.setForeground(new Color(0, 0, 128));
		SalaryLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel AgeLabel_1_3_1 = new JLabel("Age");
		AgeLabel_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		AgeLabel_1_3_1.setForeground(new Color(0, 0, 128));
		AgeLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AgeLabel_1_3_1.setBounds(10, 206, 52, 21);
		panel_1.add(AgeLabel_1_3_1);
		
		JLabel GenderLabel_1_3_2 = new JLabel("Gender");
		GenderLabel_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		GenderLabel_1_3_2.setForeground(new Color(0, 0, 128));
		GenderLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GenderLabel_1_3_2.setBounds(10, 288, 76, 29);
		panel_1.add(GenderLabel_1_3_2);
		
		txtKeyInCardNo = new JTextField();
		txtKeyInCardNo.setForeground(Color.BLACK);
		txtKeyInCardNo.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInCardNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInCardNo.setBounds(144, 72, 231, 29);
		panel_1.add(txtKeyInCardNo);
		txtKeyInCardNo.setColumns(10);
		
		txtKeyInName = new JTextField();
		txtKeyInName.setForeground(Color.BLACK);
		txtKeyInName.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInName.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInName.setColumns(10);
		txtKeyInName.setBounds(144, 113, 231, 29);
		panel_1.add(txtKeyInName);
		
		txtKeyInPhoneNumber = new JTextField();
		txtKeyInPhoneNumber.setForeground(Color.BLACK);
		txtKeyInPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInPhoneNumber.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInPhoneNumber.setColumns(10);
		txtKeyInPhoneNumber.setBounds(144, 158, 231, 29);
		panel_1.add(txtKeyInPhoneNumber);
		
		txtKeyInAge = new JTextField();
		txtKeyInAge.setForeground(Color.BLACK);
		txtKeyInAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInAge.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInAge.setColumns(10);
		txtKeyInAge.setBounds(144, 198, 231, 29);
		panel_1.add(txtKeyInAge);
		
		JComboBox GendercomboBox = new JComboBox();
		GendercomboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GendercomboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Female", "Male"}));
		GendercomboBox.setBounds(144, 289, 231, 27);
		panel_1.add(GendercomboBox);
		
		JComboBox PositioncomboBox_1 = new JComboBox();
		PositioncomboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Position", "Admin", "Sales Assistant", "Cashier", "Supervisor"}));
		PositioncomboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PositioncomboBox_1.setBounds(144, 335, 231, 27);
		panel_1.add(PositioncomboBox_1);
		
		txtKeyInSalary = new JTextField();
		txtKeyInSalary.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInSalary.setForeground(Color.BLACK);
		txtKeyInSalary.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInSalary.setColumns(10);
		txtKeyInSalary.setBounds(144, 243, 231, 29);
		panel_1.add(txtKeyInSalary);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 128)));
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(571, 108, 679, 424);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\muham\\Documents\\Assignment 3 Programming\\Employee.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n\t\n");
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
		btnUpload.setForeground(new Color(0, 0, 0));
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnUpload.setBackground(new Color(0, 0, 128));
		btnUpload.setBounds(504, 361, 165, 52);
		panel_2.add(btnUpload);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 659, 334);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"CARD NO", "NAME", "PHONE NUMBER", "AGE", "SALARY", "GENDER", "POSITION"},
			},
			new String[] {
				"Card No.", "Name", "Phone Number", "Age", "Salary", "Gender", "Position"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(230, 230, 250)));
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(179, 560, 1068, 107);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						
				txtKeyInCardNo.getText(),
				txtKeyInName.getText(),
				txtKeyInPhoneNumber.getText(),
				txtKeyInAge.getText(),
				txtKeyInSalary.getText(),
				GendercomboBox.getSelectedItem(),
				PositioncomboBox_1.getSelectedItem(),
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Employee Update confirmed", "Employee System",
									JOptionPane.OK_OPTION);
						}
					}
					}
				});
		btnAdd.setBackground(new Color(0, 0, 128));
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBounds(272, 31, 165, 52);
		panel_3.add(btnAdd);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(new Color(0, 0, 0));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(new Color(0, 0, 128));
		btnDelete.setBounds(476, 31, 165, 52);
		panel_3.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		
		btnPrint.setForeground(new Color(0, 0, 0));
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnPrint.setBackground(new Color(0, 0, 128));
		btnPrint.setBounds(888, 31, 165, 52);
		panel_3.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				em = new JFrame();
				if (JOptionPane.showConfirmDialog(em, "Confirm if you want to exit", "Add Drop System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
					
				}
			}
		});
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnExit.setBackground(new Color(0, 0, 128));
		btnExit.setBounds(679, 31, 165, 52);
		panel_3.add(btnExit);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 128));
		panel_4.setBounds(0, 0, 172, 678);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel EmployeePage = new JLabel("Employee");
		EmployeePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Employee().em.setVisible(true);
				em.dispose();
			}
		});
		EmployeePage.setHorizontalAlignment(SwingConstants.LEFT);
		EmployeePage.setForeground(new Color(255, 255, 255));
		EmployeePage.setFont(new Font("STXinwei", Font.BOLD, 18));
		EmployeePage.setBounds(10, 11, 156, 27);
		panel_4.add(EmployeePage);
		
		JLabel lblInventory1_1 = new JLabel("Inventory");
		lblInventory1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Inventory().Inventory.setVisible(true);
				em.dispose();
			}
		});
		lblInventory1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblInventory1_1.setForeground(new Color(255, 255, 255));
		lblInventory1_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblInventory1_1.setBounds(10, 49, 111, 27);
		panel_4.add(lblInventory1_1);
		
		JLabel GroceryItemsPage = new JLabel("Grocery");
		GroceryItemsPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new GroceryItems().gi.setVisible(true);
				em.dispose();
			}
		});
		GroceryItemsPage.setHorizontalAlignment(SwingConstants.LEFT);
		GroceryItemsPage.setForeground(new Color(255, 255, 255));
		GroceryItemsPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		GroceryItemsPage.setBounds(10, 93, 111, 27);
		panel_4.add(GroceryItemsPage);
		
		JLabel GroceryItemsPage_1 = new JLabel("Items");
		GroceryItemsPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new GroceryItems().gi.setVisible(true);
				em.dispose();
			}
		});
		GroceryItemsPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		GroceryItemsPage_1.setForeground(new Color(255, 255, 255));
		GroceryItemsPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		GroceryItemsPage_1.setBounds(10, 113, 111, 27);
		panel_4.add(GroceryItemsPage_1);
		
		JLabel FinancePage = new JLabel("Finance");
		FinancePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Finance().finance.setVisible(true);
				em.dispose();
			}
		});
		FinancePage.setHorizontalAlignment(SwingConstants.LEFT);
		FinancePage.setForeground(new Color(255, 255, 255));
		FinancePage.setFont(new Font("STXinwei", Font.BOLD, 18));
		FinancePage.setBounds(10, 151, 111, 27);
		panel_4.add(FinancePage);
		
		JLabel Advertisement = new JLabel("Advertisement");
		Advertisement.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Advertisement ().advertisement.setVisible(true);
				em.dispose();
			}
		});
		
		Advertisement.setHorizontalAlignment(SwingConstants.LEFT);
		Advertisement.setForeground(new Color(255, 255, 255));
		Advertisement.setFont(new Font("STXinwei", Font.BOLD, 18));
		Advertisement.setBounds(10, 189, 156, 27);
		panel_4.add(Advertisement);
		
		JLabel Home = new JLabel("Home");
		Home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new PersonalCareCover().PersonalCareCover.setVisible(true);
				em.dispose();
			}
		});
		Home.setHorizontalAlignment(SwingConstants.LEFT);
		Home.setForeground(new Color(255, 255, 255));
		Home.setFont(new Font("STXinwei", Font.BOLD, 18));
		Home.setBounds(10, 528, 156, 27);
		panel_4.add(Home);
	}
}

