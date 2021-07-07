package GroceryStore_Bakery;

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
	private JTextField txtKeyInItemName;
	private JTextField txtKeyInFlavour;
	private JTextField txtKeyInMadeIn;
	private JTextField txtKeyInPrice;
	private JTextField txtKeyInQty;
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
					Workers window = new Workers();
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
	public Inventory() {
		
		Inventory = new JFrame();
		Inventory.setBounds(100, 100, 1400, 737);
		Inventory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Inventory.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.PINK));
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 1263, 678);
		Inventory.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel InventoryLabel = new JLabel("Inventory");
		InventoryLabel.setForeground(Color.DARK_GRAY);
		InventoryLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		InventoryLabel.setBounds(511, 11, 198, 54);
		panel.add(InventoryLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(231, 76, 302, 459);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel InfoLabel = new JLabel("Item Info");
		InfoLabel.setForeground(Color.DARK_GRAY);
		InfoLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		InfoLabel.setBounds(10, 11, 267, 34);
		panel_1.add(InfoLabel);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(10, 65, 85, 24);
		panel_1.add(lblCategory);
		lblCategory.setForeground(Color.DARK_GRAY);
		lblCategory.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblName = new JLabel("ItemName");
		lblName.setBounds(10, 113, 85, 24);
		panel_1.add(lblName);
		lblName.setForeground(Color.DARK_GRAY);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblFlavour = new JLabel("Flavour");
		lblFlavour.setBounds(10, 160, 85, 24);
		panel_1.add(lblFlavour);
		lblFlavour.setForeground(Color.DARK_GRAY);
		lblFlavour.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblVolume = new JLabel("Made In");
		lblVolume.setBounds(10, 210, 85, 24);
		panel_1.add(lblVolume);
		lblVolume.setForeground(Color.DARK_GRAY);
		lblVolume.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 268, 85, 24);
		panel_1.add(lblPrice);
		lblPrice.setForeground(Color.DARK_GRAY);
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblQuantity_1 = new JLabel("Quantity");
		lblQuantity_1.setBounds(10, 328, 85, 24);
		panel_1.add(lblQuantity_1);
		lblQuantity_1.setForeground(Color.DARK_GRAY);
		lblQuantity_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtKeyInFlavour = new JTextField();
		txtKeyInFlavour.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInFlavour.setForeground(Color.BLACK);
		txtKeyInFlavour.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInFlavour.setColumns(10);
		txtKeyInFlavour.setBounds(106, 156, 186, 34);
		panel_1.add(txtKeyInFlavour);
		
		txtKeyInCategory = new JTextField();
		txtKeyInCategory.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInCategory.setForeground(Color.BLACK);
		txtKeyInCategory.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInCategory.setColumns(10);
		txtKeyInCategory.setBounds(106, 64, 186, 28);
		panel_1.add(txtKeyInCategory);
		
		
		
		txtKeyInMadeIn = new JTextField();
		txtKeyInMadeIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInMadeIn.setForeground(Color.BLACK);
		txtKeyInMadeIn.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInMadeIn.setColumns(10);
		txtKeyInMadeIn.setBounds(105, 206, 186, 34);
		panel_1.add(txtKeyInMadeIn);
		
		txtKeyInPrice = new JTextField();
		txtKeyInPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInPrice.setForeground(Color.BLACK);
		txtKeyInPrice.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInPrice.setColumns(10);
		txtKeyInPrice.setBounds(106, 262, 186, 37);
		panel_1.add(txtKeyInPrice);
		
		txtKeyInQty = new JTextField();
		txtKeyInQty.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInQty.setForeground(Color.BLACK);
		txtKeyInQty.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInQty.setColumns(10);
		txtKeyInQty.setBounds(106, 324, 186, 34);
		panel_1.add(txtKeyInQty);
		
		txtKeyInItemName = new JTextField();
		txtKeyInItemName.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInItemName.setForeground(Color.BLACK);
		txtKeyInItemName.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInItemName.setColumns(10);
		txtKeyInItemName.setBounds(105, 112, 186, 28);
		panel_1.add(txtKeyInItemName);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setForeground(Color.DARK_GRAY);
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTotal.setBounds(10, 382, 85, 24);
		panel_1.add(lblTotal);
		
		txtTotal = new JTextField();
		txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotal.setForeground(Color.BLACK);
		txtTotal.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtTotal.setColumns(10);
		txtTotal.setBounds(106, 378, 186, 34);
		panel_1.add(txtTotal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel_2.setBackground(Color.PINK);
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
				"Category", "Item Name", "Flavour", "Made In", "Price", "Quantity", "Total"
			}
		));
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD\r\n");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\esaimen\\Inventory.txt");
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
		btnUpload.setForeground(Color.DARK_GRAY);
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnUpload.setBackground(Color.WHITE);
		btnUpload.setBounds(523, 407, 164, 43);
		panel_2.add(btnUpload);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	//How to read data in table
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				for (int i = 0 ; i < model.getRowCount() ; i++) { //use i - read only the current update of row/data
			        // null or not Integer will throw exception
					 String s = String.valueOf(model.getValueAt(i, 6));
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
		btnNext.setForeground(Color.DARK_GRAY);
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnNext.setBackground(Color.WHITE);
		btnNext.setBounds(10, 407, 164, 43);
		panel_2.add(btnNext);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				txtKeyInCategory.getText(),
				txtKeyInItemName.getText(),
				txtKeyInFlavour.getText(),
				txtKeyInMadeIn.getText(),
				txtKeyInPrice.getText(),
				txtKeyInQty.getText(),
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
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setForeground(Color.DARK_GRAY);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBounds(231, 546, 113, 43);
		panel.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKeyInCategory.setText("");
				txtKeyInItemName.setText("");
				txtKeyInFlavour.setText("");
				txtKeyInMadeIn.setText("");
				txtKeyInPrice.setText("");
				txtKeyInQty.setText("");
				
				
			}
		});
		btnReset.setForeground(Color.DARK_GRAY);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnReset.setBackground(Color.WHITE);
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
		btnPrint.setForeground(Color.DARK_GRAY);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnPrint.setBackground(Color.WHITE);
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
		btnDelete.setForeground(Color.DARK_GRAY);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(858, 561, 174, 43);
		panel.add(btnDelete);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(0, 0, 221, 678);
		panel.add(panel_4);
		
		JLabel WorkersPage = new JLabel("Workers");
		WorkersPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Workers().em.setVisible(true);
				Inventory.dispose();
			}
		});
		WorkersPage.setHorizontalAlignment(SwingConstants.LEFT);
		WorkersPage.setForeground(Color.PINK);
		WorkersPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		WorkersPage.setBounds(10, 49, 156, 27);
		panel_4.add(WorkersPage);
		
		JLabel lblInventory1_1 = new JLabel("Inventory");
		lblInventory1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Inventory().Inventory.setVisible(true);
				Inventory.dispose();
			}
		});
		lblInventory1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblInventory1_1.setForeground(Color.PINK);
		lblInventory1_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblInventory1_1.setBounds(10, 11, 111, 27);
		panel_4.add(lblInventory1_1);
		
		JLabel BakeryMenuPage = new JLabel("Bakery");
		BakeryMenuPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BakeryMenu().bd.setVisible(true);
				Inventory.dispose();
			}
		});
		BakeryMenuPage.setHorizontalAlignment(SwingConstants.LEFT);
		BakeryMenuPage.setForeground(Color.PINK);
		BakeryMenuPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		BakeryMenuPage.setBounds(10, 87, 111, 27);
		panel_4.add(BakeryMenuPage);
		
		JLabel BakeryMenuPage_1 = new JLabel("Menu");
		BakeryMenuPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BakeryMenu().bd.setVisible(true);
				Inventory.dispose();
			}
		});
		BakeryMenuPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		BakeryMenuPage_1.setForeground(Color.PINK);
		BakeryMenuPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		BakeryMenuPage_1.setBounds(10, 107, 111, 27);
		panel_4.add(BakeryMenuPage_1);
		
		JLabel FinancePage = new JLabel("Financial");
		FinancePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Finance().finance.setVisible(true);
				Inventory.dispose();
			}
		});
		FinancePage.setHorizontalAlignment(SwingConstants.LEFT);
		FinancePage.setForeground(Color.PINK);
		FinancePage.setFont(new Font("STXinwei", Font.BOLD, 18));
		FinancePage.setBounds(10, 145, 111, 27);
		panel_4.add(FinancePage);
		
		JLabel Ads = new JLabel("Ads ");
		Ads.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Ads().ads.setVisible(true);
				Inventory.dispose();
			}
		});
		
		Ads.setHorizontalAlignment(SwingConstants.LEFT);
		Ads.setForeground(Color.PINK);
		Ads.setFont(new Font("STXinwei", Font.BOLD, 18));
		Ads.setBounds(10, 183, 156, 27);
		panel_4.add(Ads);
		
		JLabel lbHome = new JLabel("Home");
		lbHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Cover().cover.setVisible(true);
				Inventory.dispose();
			}
		});
		lbHome.setHorizontalAlignment(SwingConstants.LEFT);
		lbHome.setForeground(Color.PINK);
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
		btnExit.setForeground(Color.DARK_GRAY);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(1162, 631, 91, 37);
		panel.add(btnExit);
	}
}