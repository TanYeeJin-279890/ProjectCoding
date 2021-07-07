package GroceryStore_PersonalCare;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Finance extends JFrame {

	protected JFrame finance;
	private JTextField txtKeyInTotal;
	private JTextField txtKeyInTotalCostInventory;
	private JTextField txtKeyInYear;
	private JTable table;
	private JTextField textFieldprofit;
	private JTextField textFieldnetincome_1;
	private double InventoryExp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance finance = new Finance();
					finance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Finance() {}

	public Finance(double totalInv) {
		this.InventoryExp = totalInv;

		setBounds(100, 100, 1305, 737);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 128)));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(10, 11, 1263, 678);
		getContentPane().add(panel);
		
		JLabel lblFinance = new JLabel("FINANCE");
		lblFinance.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinance.setForeground(new Color(0, 0, 128));
		lblFinance.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblFinance.setBounds(525, 14, 417, 54);
		panel.add(lblFinance);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 128)));
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(255, 79, 973, 214);
		panel.add(panel_1);
		
		JLabel lblTotalSales = new JLabel("Total Sales");
		lblTotalSales.setForeground(new Color(0, 0, 0));
		lblTotalSales.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTotalSales.setBounds(10, 87, 104, 24);
		panel_1.add(lblTotalSales);
		
		JLabel lblTotalCostInventory = new JLabel("Total Cost Inventory ");
		lblTotalCostInventory.setForeground(new Color(0, 0, 0));
		lblTotalCostInventory.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTotalCostInventory.setBounds(10, 126, 168, 24);
		panel_1.add(lblTotalCostInventory);
		
		txtKeyInTotal = new JTextField();
		txtKeyInTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInTotal.setForeground(Color.BLACK);
		txtKeyInTotal.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInTotal.setColumns(10);
		txtKeyInTotal.setBounds(116, 83, 186, 34);
		panel_1.add(txtKeyInTotal);
		
		txtKeyInTotalCostInventory = new JTextField();
		txtKeyInTotalCostInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment i = new Inventoryexp();//interface
				double inventory = i.payment();
				txtKeyInTotalCostInventory.setText(Double.toString(inventory));
			}
		});
		txtKeyInTotalCostInventory.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInTotalCostInventory.setForeground(Color.BLACK);
		txtKeyInTotalCostInventory.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInTotalCostInventory.setColumns(10);
		txtKeyInTotalCostInventory.setBounds(188, 122, 339, 34);
		panel_1.add(txtKeyInTotalCostInventory);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setForeground(new Color(0, 0, 0));
		lblYear.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblYear.setBounds(10, 11, 58, 24);
		panel_1.add(lblYear);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setForeground(new Color(0, 0, 0));
		lblMonth.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblMonth.setBounds(10, 46, 58, 24);
		panel_1.add(lblMonth);
		
		JComboBox Month = new JComboBox();
		Month.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Month.setModel(new DefaultComboBoxModel(new String[] {"Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		Month.setBounds(78, 46, 196, 25);
		panel_1.add(Month);
		
		txtKeyInYear = new JTextField();
		txtKeyInYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInYear.setForeground(Color.BLACK);
		txtKeyInYear.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInYear.setColumns(10);
		txtKeyInYear.setBounds(79, 8, 146, 31);
		panel_1.add(txtKeyInYear);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double profit = 0.0,netincome = 0.0;
				double TotInv = InventoryExp;

				profit = Double.parseDouble(txtKeyInTotal.getText())-TotInv;
				textFieldprofit.setText(Double.toString(profit));
				txtKeyInTotalCostInventory.setText(Double.toString(TotInv));


				Payment g = new Financeexp();//interface
				double expenses = g.payment();
				netincome = profit-expenses;
				textFieldnetincome_1.setText(Double.toString(netincome));

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
						txtKeyInYear.getText(),
						Month.getSelectedItem(),
						txtKeyInTotal.getText(),
						txtKeyInTotalCostInventory.getText(),
						textFieldprofit.getText(),
						textFieldnetincome_1.getText(),
						
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Finance Update confirmed", "Finance System",
									JOptionPane.OK_OPTION);
						}
					}
					}
				});
		btnAdd.setBounds(660, 160, 110, 43);
		panel_1.add(btnAdd);
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBackground(new Color(0, 0, 128));
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKeyInYear.setText("");
				txtKeyInTotal.setText("");
				txtKeyInTotalCostInventory.setText("");
				textFieldprofit.setText("");
				textFieldnetincome_1.setText("");
				Month.setSelectedItem("Select Month");
				
			}
		});
		btnReset.setBounds(811, 160, 141, 43);
		panel_1.add(btnReset);
		btnReset.setForeground(new Color(0, 0, 0));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnReset.setBackground(new Color(0, 0, 128));
		
		JLabel lblProfit = new JLabel("Profit");
		lblProfit.setForeground(new Color(0, 0, 0));
		lblProfit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblProfit.setBounds(595, 18, 104, 24);
		panel_1.add(lblProfit);
		
		JLabel lblNetincome = new JLabel("Netincome");
		lblNetincome.setForeground(new Color(0, 0, 0));
		lblNetincome.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNetincome.setBounds(595, 74, 104, 24);
		panel_1.add(lblNetincome);
		
		textFieldprofit = new JTextField();
		textFieldprofit.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldprofit.setForeground(Color.BLACK);
		textFieldprofit.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFieldprofit.setColumns(10);
		textFieldprofit.setBounds(707, 15, 186, 34);
		panel_1.add(textFieldprofit);
		
		textFieldnetincome_1 = new JTextField();
		textFieldnetincome_1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldnetincome_1.setForeground(Color.BLACK);
		textFieldnetincome_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFieldnetincome_1.setColumns(10);
		textFieldnetincome_1.setBounds(709, 70, 186, 34);
		panel_1.add(textFieldnetincome_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 128)));
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(255, 326, 985, 248);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 965, 226);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"Year", "Month", "Total Sales", "Total Inventory Cost", "Profit", "Net Income"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(119);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		
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
		btnPrint.setBounds(704, 606, 134, 43);
		panel.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Finance System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Finance System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(new Color(0, 0, 0));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(new Color(0, 0, 128));
		btnDelete.setBounds(481, 606, 174, 43);
		panel.add(btnDelete);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(0, 0, 128));
		panel_4.setBounds(0, 0, 221, 678);
		panel.add(panel_4);
		
		JLabel Employee = new JLabel("Employee");
		Employee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Employee().em.setVisible(true);
				finance.dispose();
			}
		});
		Employee.setHorizontalAlignment(SwingConstants.LEFT);
		Employee.setForeground(new Color(255, 255, 255));
		Employee.setFont(new Font("STXinwei", Font.BOLD, 18));
		Employee.setBounds(10, 87, 156, 27);
		panel_4.add(Employee);
		
		JLabel lblInventory1_1 = new JLabel("Inventory");
		lblInventory1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Inventory().Inventory.setVisible(true);
				finance.dispose();
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
				finance.dispose();
			}
		});
		GroceryItemsPage.setHorizontalAlignment(SwingConstants.LEFT);
		GroceryItemsPage.setForeground(new Color(255, 255, 255));
		GroceryItemsPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		GroceryItemsPage.setBounds(10, 131, 111, 27);
		panel_4.add(GroceryItemsPage);
		
		JLabel GroceryItemsPage_1 = new JLabel("Items");
		GroceryItemsPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new GroceryItems().gi.setVisible(true);
				finance.dispose();
			}
		});
		GroceryItemsPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		GroceryItemsPage_1.setForeground(new Color(255, 255, 255));
		GroceryItemsPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		GroceryItemsPage_1.setBounds(10, 151, 111, 27);
		panel_4.add(GroceryItemsPage_1);
		
		JLabel FinancePage = new JLabel("Finance");
		FinancePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Finance().finance.setVisible(true);
				finance.dispose();
			}
		});
		
		FinancePage.setHorizontalAlignment(SwingConstants.LEFT);
		FinancePage.setForeground(new Color(255, 255, 255));
		FinancePage.setFont(new Font("STXinwei", Font.BOLD, 18));
		FinancePage.setBounds(10, 11, 111, 27);
		panel_4.add(FinancePage);
		
		JLabel Advertisement = new JLabel("Advertisement");
		Advertisement.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Advertisement().advertisement.setVisible(true);
				finance.dispose();
			}
		});
		
		Advertisement.setHorizontalAlignment(SwingConstants.LEFT);
		Advertisement.setForeground(new Color(255, 255, 255));
		Advertisement.setFont(new Font("STXinwei", Font.BOLD, 18));
		Advertisement.setBounds(10, 189, 156, 27);
		panel_4.add(Advertisement);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new PersonalCareCover().PersonalCareCover.setVisible(true);
				finance.dispose();
			}
		});
		lblHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblHome.setBounds(10, 528, 156, 27);
		panel_4.add(lblHome);
		
		JButton btnUpload = new JButton("UPLOAD\r\n");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\muham\\Documents\\Assignment 3 Programming\\Finance.txt");
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
		btnUpload.setBounds(893, 606, 164, 43);
		panel.add(btnUpload);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				finance = new JFrame();
				if (JOptionPane.showConfirmDialog(finance, "Confirm if you want to exit", "Finance System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnExit.setBackground(new Color(0, 0, 128));
		btnExit.setBounds(1119, 606, 121, 43);
		panel.add(btnExit);
	}
}

