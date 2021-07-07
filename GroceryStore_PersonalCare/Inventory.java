package GroceryStore_PersonalCare;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Inventory extends JFrame {

	protected JFrame Inventory;
	private JTable table;
	private JTextField txtKeyInCategory;
	private JTextField txtKeyInBrand;
	private JTextField txtKeyInPrice;
	private JTextField txtKeyInQty;
	private JTextField textField;
	private JTextField txtTotal;
	private String s;
	private double totalInv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory window = new Inventory();
					window.Inventory.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inventory() {

		Inventory = new JFrame();
		Inventory.setBounds(100, 100, 1400, 737);
		Inventory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Inventory.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 128)));
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(10, 11, 1263, 678);
		Inventory.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel InventoryLabel = new JLabel("INVENTORY");
		InventoryLabel.setForeground(new Color(0, 0, 128));
		InventoryLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		InventoryLabel.setBounds(599, 11, 316, 54);
		panel.add(InventoryLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 128)));
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(231, 76, 302, 459);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel GroceryItemsLabel = new JLabel("Grocery Items");
		GroceryItemsLabel.setForeground(new Color(0, 0, 128));
		GroceryItemsLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		GroceryItemsLabel.setBounds(10, 11, 267, 34);
		panel_1.add(GroceryItemsLabel);
		
		JLabel CategoryLabel = new JLabel("Category");
		CategoryLabel.setBounds(10, 60, 85, 24);
		panel_1.add(CategoryLabel);
		CategoryLabel.setForeground(new Color(0, 0, 128));
		CategoryLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setBounds(10, 109, 85, 24);
		panel_1.add(lblBrand);
		lblBrand.setForeground(new Color(0, 0, 128));
		lblBrand.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblSuitableFor = new JLabel("Suitable for");
		lblSuitableFor.setBounds(10, 270, 117, 24);
		panel_1.add(lblSuitableFor);
		lblSuitableFor.setForeground(new Color(0, 0, 128));
		lblSuitableFor.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 162, 85, 24);
		panel_1.add(lblPrice);
		lblPrice.setForeground(new Color(0, 0, 128));
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblQuantity_1 = new JLabel("Quantity");
		lblQuantity_1.setBounds(10, 213, 85, 24);
		panel_1.add(lblQuantity_1);
		lblQuantity_1.setForeground(new Color(0, 0, 128));
		lblQuantity_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtKeyInCategory = new JTextField();
		txtKeyInCategory.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInCategory.setForeground(Color.BLACK);
		txtKeyInCategory.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInCategory.setBounds(105, 56, 186, 34);
		panel_1.add(txtKeyInCategory);
		txtKeyInCategory.setColumns(10);
		
		txtKeyInBrand = new JTextField();
		txtKeyInBrand.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInBrand.setForeground(Color.BLACK);
		txtKeyInBrand.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInBrand.setColumns(10);
		txtKeyInBrand.setBounds(105, 108, 186, 28);
		panel_1.add(txtKeyInBrand);
		
		txtKeyInPrice = new JTextField();
		txtKeyInPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInPrice.setForeground(Color.BLACK);
		txtKeyInPrice.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInPrice.setColumns(10);
		txtKeyInPrice.setBounds(105, 156, 186, 37);
		panel_1.add(txtKeyInPrice);
		
		txtKeyInQty = new JTextField();
		txtKeyInQty.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInQty.setForeground(Color.BLACK);
		txtKeyInQty.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInQty.setColumns(10);
		txtKeyInQty.setBounds(105, 209, 186, 34);
		panel_1.add(txtKeyInQty);
		
		JComboBox Select = new JComboBox();
		Select.setModel(new DefaultComboBoxModel(new String[] {"Select", "Men", "Women", "Anyone"}));
		Select.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Select.setBounds(105, 265, 186, 34);
		panel_1.add(Select);
		
		JLabel lblTotal_1_1 = new JLabel("Total");
		lblTotal_1_1.setForeground(new Color(0, 0, 128));
		lblTotal_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTotal_1_1.setBounds(10, 351, 85, 24);
		panel_1.add(lblTotal_1_1);
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setForeground(Color.BLACK);
		txtTotal.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtTotal.setColumns(10);
		txtTotal.setBounds(105, 347, 186, 34);
		panel_1.add(txtTotal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 128)));
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBounds(543, 76, 697, 461);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 677, 385);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			
			},
			new String[] {
				"Category", "Brand", "Price", "Quantity", "Suitable for", "Total"
			}
		));
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD\r\n");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\muham\\Documents\\Assignment 3 Programming\\Inventory.txt");
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
		btnUpload.setBounds(523, 407, 164, 43);
		panel_2.add(btnUpload);
		
		JButton btnNext_1 = new JButton("NEXT");
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
	//How to read data in table
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
			        // null or not Integer will throw exception
					 String s = String.valueOf(model.getValueAt(i, 5));
				        totalInv += Double.parseDouble(s);
			        
			}
				
	//How to pass value/data from product description (admin page) into customer page
				try {
					Finance finance = new Finance(totalInv); //open customer page using constructor with 5 arguments
					finance.setVisible(true);
					Inventory.dispose();
				} catch (Exception ee) {
					ee.printStackTrace();
				}

				
			}
		});
		btnNext_1.setForeground(Color.BLACK);
		btnNext_1.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnNext_1.setBackground(new Color(0, 0, 128));
		btnNext_1.setBounds(10, 407, 164, 43);
		panel_2.add(btnNext_1);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				txtKeyInCategory.getText(),
				txtKeyInBrand.getText(),
				txtKeyInPrice.getText(),
				txtKeyInQty.getText(),
				Select.getSelectedItem(),
				txtTotal.getText(),
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Inventory Update confirmed", "Inventory System",
									JOptionPane.OK_OPTION);
						}
					}
					}
				});
		btnAdd.setBackground(new Color(0, 0, 128));
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBounds(241, 546, 113, 43);
		panel.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKeyInCategory.setText("");
				txtKeyInBrand.setText("");
				txtKeyInPrice.setText("");
				txtKeyInQty.setText("");
				Select.setSelectedItem("Select Type");
				txtTotal.getText();
				
			}
		});
		btnReset.setForeground(new Color(0, 0, 0));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnReset.setBackground(new Color(0, 0, 128));
		btnReset.setBounds(394, 546, 139, 43);
		panel.add(btnReset);
		
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
		btnPrint.setBounds(1087, 561, 131, 43);
		panel.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Inventory System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Inventory System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(new Color(0, 0, 0));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(new Color(0, 0, 128));
		btnDelete.setBounds(878, 561, 174, 43);
		panel.add(btnDelete);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(0, 0, 128));
		panel_4.setBounds(0, 0, 221, 678);
		panel.add(panel_4);
		
		JLabel EmployeePage = new JLabel("Employee");
		EmployeePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Employee().em.setVisible(true);
				Inventory.dispose();
			}
		});
		EmployeePage.setHorizontalAlignment(SwingConstants.LEFT);
		EmployeePage.setForeground(new Color(255, 255, 255));
		EmployeePage.setFont(new Font("STXinwei", Font.BOLD, 18));
		EmployeePage.setBounds(10, 49, 156, 27);
		panel_4.add(EmployeePage);
		
		JLabel lblInventory1_1 = new JLabel("Inventory");
		lblInventory1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Inventory().Inventory.setVisible(true);
				Inventory.dispose();
			}
		});
		lblInventory1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblInventory1_1.setForeground(new Color(255, 255, 255));
		lblInventory1_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblInventory1_1.setBounds(10, 11, 111, 27);
		panel_4.add(lblInventory1_1);
		
		JLabel GroceryPage = new JLabel("Grocery");
		GroceryPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new GroceryItems().gi.setVisible(true);
				Inventory.dispose();
			}
		});
		GroceryPage.setHorizontalAlignment(SwingConstants.LEFT);
		GroceryPage.setForeground(new Color(255, 255, 255));
		GroceryPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		GroceryPage.setBounds(10, 87, 111, 27);
		panel_4.add(GroceryPage);
		
		JLabel GroceryItemsPage_1 = new JLabel("Items");
		GroceryPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new GroceryItems().gi.setVisible(true);
				Inventory.dispose();
			}
		});
		GroceryItemsPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		GroceryItemsPage_1.setForeground(new Color(255, 255, 255));
		GroceryItemsPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		GroceryItemsPage_1.setBounds(10, 107, 111, 27);
		panel_4.add(GroceryItemsPage_1);
		
		JLabel FinancePage = new JLabel("Finance");
		FinancePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Finance().finance.setVisible(true);
				Inventory.dispose();
			}
		});
		FinancePage.setHorizontalAlignment(SwingConstants.LEFT);
		FinancePage.setForeground(new Color(255, 255, 255));
		FinancePage.setFont(new Font("STXinwei", Font.BOLD, 18));
		FinancePage.setBounds(10, 145, 111, 27);
		panel_4.add(FinancePage);
		
		JLabel Advertisement = new JLabel("Advertisement");
		Advertisement.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Advertisement().advertisement.setVisible(true);
				Inventory.dispose();
			}
		});
		
		Advertisement.setHorizontalAlignment(SwingConstants.LEFT);
		Advertisement.setForeground(new Color(255, 255, 255));
		Advertisement.setFont(new Font("STXinwei", Font.BOLD, 18));
		Advertisement.setBounds(10, 183, 156, 27);
		panel_4.add(Advertisement);
		
		JLabel lbHome = new JLabel("Home");
		lbHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new PersonalCareCover().PersonalCareCover.setVisible(true);
				Inventory.dispose();
			}
		});
		lbHome.setHorizontalAlignment(SwingConstants.LEFT);
		lbHome.setForeground(new Color(255, 255, 255));
		lbHome.setFont(new Font("STXinwei", Font.BOLD, 18));
		lbHome.setBounds(10, 528, 156, 27);
		panel_4.add(lbHome);
		
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventory = new JFrame();
				if (JOptionPane.showConfirmDialog(Inventory, "Confirm if you want to exit", "Inventory System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnExit.setBackground(new Color(0, 0, 128));
		btnExit.setBounds(1162, 630, 91, 37);
		panel.add(btnExit);
	}
}