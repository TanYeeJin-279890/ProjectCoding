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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class GroceryItems {

	protected JFrame gi;
	private JTextField CATEGORY;
	private JTextField BRAND;
	private JTextField PRICE;
	private JTextField QUANTITY;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroceryItems window = new GroceryItems();
					window.gi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GroceryItems() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gi = new JFrame();
		gi.setBounds(100, 100, 1303, 737);
		gi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gi.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 128)));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(10, 11, 1263, 678);
		gi.getContentPane().add(panel);
		
		JLabel lblGroceryItems = new JLabel("GROCERY ITEMS");
		lblGroceryItems.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroceryItems.setForeground(new Color(0, 0, 128));
		lblGroceryItems.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblGroceryItems.setBounds(481, 14, 532, 54);
		panel.add(lblGroceryItems);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 128)));
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(241, 80, 302, 459);
		panel.add(panel_1);
		
		JLabel ItemsInfoLabel = new JLabel("Items Info");
		ItemsInfoLabel.setForeground(new Color(0, 0, 128));
		ItemsInfoLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		ItemsInfoLabel.setBounds(10, 11, 267, 34);
		panel_1.add(ItemsInfoLabel);
		
		JLabel CategoryLabel = new JLabel("Category");
		CategoryLabel.setForeground(new Color(0, 0, 128));
		CategoryLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		CategoryLabel.setBounds(10, 60, 85, 24);
		panel_1.add(CategoryLabel);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setForeground(new Color(0, 0, 128));
		lblBrand.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBrand.setBounds(10, 109, 85, 24);
		panel_1.add(lblBrand);
		
		JLabel lblSuitableFor = new JLabel("Suitable for");
		lblSuitableFor.setForeground(new Color(0, 0, 128));
		lblSuitableFor.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblSuitableFor.setBounds(10, 277, 108, 24);
		panel_1.add(lblSuitableFor);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(new Color(0, 0, 128));
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPrice.setBounds(10, 160, 85, 24);
		panel_1.add(lblPrice);
		
		JLabel lblQuantity_1 = new JLabel("Quantity");
		lblQuantity_1.setForeground(new Color(0, 0, 128));
		lblQuantity_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblQuantity_1.setBounds(10, 217, 85, 24);
		panel_1.add(lblQuantity_1);
		
		CATEGORY = new JTextField();
		CATEGORY.setHorizontalAlignment(SwingConstants.CENTER);
		CATEGORY.setForeground(Color.BLACK);
		CATEGORY.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		CATEGORY.setColumns(10);
		CATEGORY.setBounds(105, 56, 186, 34);
		panel_1.add(CATEGORY);
		
		BRAND = new JTextField();
		BRAND.setHorizontalAlignment(SwingConstants.CENTER);
		BRAND.setForeground(Color.BLACK);
		BRAND.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		BRAND.setColumns(10);
		BRAND.setBounds(105, 108, 186, 28);
		panel_1.add(BRAND);
		
		PRICE = new JTextField();
		PRICE.setHorizontalAlignment(SwingConstants.CENTER);
		PRICE.setForeground(Color.BLACK);
		PRICE.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		PRICE.setColumns(10);
		PRICE.setBounds(105, 154, 186, 37);
		panel_1.add(PRICE);
		
		QUANTITY = new JTextField();
		QUANTITY.setHorizontalAlignment(SwingConstants.CENTER);
		QUANTITY.setForeground(Color.BLACK);
		QUANTITY.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		QUANTITY.setColumns(10);
		QUANTITY.setBounds(105, 213, 186, 34);
		panel_1.add(QUANTITY);
		
		JComboBox Select = new JComboBox();
		Select.setModel(new DefaultComboBoxModel(new String[] {"Select", "Men", "Women", "Anyone"}));
		Select.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Select.setBounds(105, 272, 186, 34);
		panel_1.add(Select);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 128)));
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(551, 79, 702, 460);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 682, 438);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"CATEGORY", "BRAND", "PRICE", "QUANTITY", "SUITABLE FOR"},
			},
			new String[] {
				"Category", "Brand", "Price", "Quantity", "Suitable for"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				CATEGORY.getText(),
				BRAND.getText(),
				PRICE.getText(),
				QUANTITY.getText(),
				Select.getSelectedItem(),
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Inventory Update confirmed", "Inventory",
									JOptionPane.OK_OPTION);
						}
					}
					}
				});
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBackground(new Color(0, 0, 128));
		btnAdd.setBounds(268, 552, 110, 43);
		panel.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CATEGORY.setText("");
				BRAND.setText("");
				PRICE.setText("");
				QUANTITY.setText("");
				Select.setSelectedItem("Select");
				
			}
		});
		btnReset.setForeground(new Color(0, 0, 0));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnReset.setBackground(new Color(0, 0, 128));
		btnReset.setBounds(388, 552, 138, 43);
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
		btnPrint.setBounds(805, 550, 129, 43);
		panel.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Grocery Items", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Grocery Items", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(new Color(0, 0, 0));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(new Color(0, 0, 128));
		btnDelete.setBounds(621, 550, 174, 43);
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
				gi.dispose();
			}
		});
		EmployeePage.setHorizontalAlignment(SwingConstants.LEFT);
		EmployeePage.setForeground(new Color(255, 255, 255));
		EmployeePage.setFont(new Font("STXinwei", Font.BOLD, 18));
		EmployeePage.setBounds(10, 69, 156, 27);
		panel_4.add(EmployeePage);
		
		JLabel lblInventory1_1 = new JLabel("Inventory");
		lblInventory1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Inventory().Inventory.setVisible(true);
				gi.dispose();
			}
		});
		lblInventory1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblInventory1_1.setForeground(new Color(255, 255, 255));
		lblInventory1_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblInventory1_1.setBounds(10, 107, 111, 27);
		panel_4.add(lblInventory1_1);
		
		JLabel GroceryPage = new JLabel("Grocery");
		GroceryPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new GroceryItems().gi.setVisible(true);
				gi.dispose();
			}
		});
		GroceryPage.setHorizontalAlignment(SwingConstants.LEFT);
		GroceryPage.setForeground(new Color(255, 255, 255));
		GroceryPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		GroceryPage.setBounds(10, 11, 111, 27);
		panel_4.add(GroceryPage);
		
		JLabel GroceryItemsPage_1 = new JLabel("Items");
		GroceryItemsPage_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new GroceryItems().gi.setVisible(true);
				gi.dispose();
			}
		});
		GroceryItemsPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		GroceryItemsPage_1.setForeground(new Color(255, 255, 255));
		GroceryItemsPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		GroceryItemsPage_1.setBounds(10, 31, 111, 27);
		panel_4.add(GroceryItemsPage_1);
		
		JLabel FinancePage = new JLabel("Finance");
		FinancePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Finance().finance.setVisible(true);
				gi.dispose();
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
				gi.dispose();
			}
		});
		Advertisement.setHorizontalAlignment(SwingConstants.LEFT);
		Advertisement.setForeground(new Color(255, 255, 255));
		Advertisement.setFont(new Font("STXinwei", Font.BOLD, 18));
		Advertisement.setBounds(10, 183, 156, 27);
		panel_4.add(Advertisement);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new PersonalCareCover().PersonalCareCover.setVisible(true);
				gi.dispose();
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
					File file = new File("C:\\Users\\muham\\Documents\\Assignment 3 Programming\\GroceryItems.txt");
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
		btnUpload.setBounds(958, 550, 164, 43);
		panel.add(btnUpload);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gi = new JFrame();
				if (JOptionPane.showConfirmDialog(gi, "Confirm if you want to exit", "Grocery Items", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnExit.setBackground(new Color(0, 0, 128));
		btnExit.setBounds(1132, 550, 121, 43);
		panel.add(btnExit);
		
		
	}

}
