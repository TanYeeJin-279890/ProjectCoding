package GroceryStore_Bakery;

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

public class BakeryMenu {

	protected JFrame bd;
	private JTextField CATEGORY;
	private JTextField ITEM;
	private JTextField FLAVOUR;
	private JTextField MADEIN;
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
					BakeryMenu window = new BakeryMenu();
					window.bd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BakeryMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		bd = new JFrame();
		bd.setBounds(100, 100, 1303, 737);
		bd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bd.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.PINK));
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 1263, 678);
		bd.getContentPane().add(panel);

		JLabel BakeryMenu = new JLabel("Bakery Menu");
		BakeryMenu.setHorizontalAlignment(SwingConstants.CENTER);
		BakeryMenu.setForeground(Color.DARK_GRAY);
		BakeryMenu.setFont(new Font("Rockwell", Font.BOLD, 40));
		BakeryMenu.setBounds(481, 14, 532, 54);
		panel.add(BakeryMenu);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(241, 80, 302, 459);
		panel.add(panel_1);

		JLabel InfoLabel = new JLabel("Menu Info");
		InfoLabel.setForeground(Color.DARK_GRAY);
		InfoLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		InfoLabel.setBounds(10, 11, 267, 34);
		panel_1.add(InfoLabel);

		JLabel Category = new JLabel("Category");
		Category.setForeground(Color.DARK_GRAY);
		Category.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Category.setBounds(10, 60, 85, 24);
		panel_1.add(Category);

		JLabel lblItemName = new JLabel("ItemName");
		lblItemName.setForeground(Color.DARK_GRAY);
		lblItemName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblItemName.setBounds(10, 109, 85, 24);
		panel_1.add(lblItemName);

		JLabel lblFlavour = new JLabel("Flavour");
		lblFlavour.setForeground(Color.DARK_GRAY);
		lblFlavour.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblFlavour.setBounds(10, 163, 85, 24);
		panel_1.add(lblFlavour);

		JLabel lblMade = new JLabel("Made In");
		lblMade.setForeground(Color.DARK_GRAY);
		lblMade.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblMade.setBounds(10, 221, 85, 24);
		panel_1.add(lblMade);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(Color.DARK_GRAY);
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPrice.setBounds(10, 279, 85, 24);
		panel_1.add(lblPrice);

		JLabel lblQuantity_1 = new JLabel("Quantity");
		lblQuantity_1.setForeground(Color.DARK_GRAY);
		lblQuantity_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblQuantity_1.setBounds(10, 334, 85, 24);
		panel_1.add(lblQuantity_1);

		CATEGORY = new JTextField();
		CATEGORY.setHorizontalAlignment(SwingConstants.CENTER);
		CATEGORY.setForeground(Color.BLACK);
		CATEGORY.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		CATEGORY.setColumns(10);
		CATEGORY.setBounds(105, 56, 186, 34);
		panel_1.add(CATEGORY);

		ITEM = new JTextField();
		ITEM.setHorizontalAlignment(SwingConstants.CENTER);
		ITEM.setForeground(Color.BLACK);
		ITEM.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		ITEM.setColumns(10);
		ITEM.setBounds(105, 108, 186, 28);
		panel_1.add(ITEM);

		FLAVOUR = new JTextField();
		FLAVOUR.setHorizontalAlignment(SwingConstants.CENTER);
		FLAVOUR.setForeground(Color.BLACK);
		FLAVOUR.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		FLAVOUR.setColumns(10);
		FLAVOUR.setBounds(105, 159, 186, 34);
		panel_1.add(FLAVOUR);

		MADEIN = new JTextField();
		MADEIN.setHorizontalAlignment(SwingConstants.CENTER);
		MADEIN.setForeground(Color.BLACK);
		MADEIN.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		MADEIN.setColumns(10);
		MADEIN.setBounds(105, 217, 186, 34);
		panel_1.add(MADEIN);

		PRICE = new JTextField();
		PRICE.setHorizontalAlignment(SwingConstants.CENTER);
		PRICE.setForeground(Color.BLACK);
		PRICE.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		PRICE.setColumns(10);
		PRICE.setBounds(105, 273, 186, 37);
		panel_1.add(PRICE);

		QUANTITY = new JTextField();
		QUANTITY.setHorizontalAlignment(SwingConstants.CENTER);
		QUANTITY.setForeground(Color.BLACK);
		QUANTITY.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		QUANTITY.setColumns(10);
		QUANTITY.setBounds(105, 330, 186, 34);
		panel_1.add(QUANTITY);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.PINK));
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(551, 79, 702, 460);
		panel.add(panel_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 682, 438);
		panel_2.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {

			},
			new String[] {
				 "Category", "ItemName", "Flavour", "Made In", "Price", "Qty"
			}
		));
		scrollPane.setViewportView(table);

		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				CATEGORY.getText(),
				ITEM.getText(),
				FLAVOUR.getText(),
				MADEIN.getText(),
				PRICE.getText(),
				QUANTITY.getText(),

				});

					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Inventory Update confirmed", "Inventory",
									JOptionPane.OK_OPTION);
						}
					}
					}
				});
		btnAdd.setForeground(Color.DARK_GRAY);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(268, 552, 110, 43);
		panel.add(btnAdd);

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CATEGORY.setText("");
				ITEM.setText("");
				FLAVOUR.getText();
				MADEIN.setText("");
				PRICE.setText("");
				QUANTITY.setText("");


			}
		});
		btnReset.setForeground(Color.DARK_GRAY);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnReset.setBackground(Color.WHITE);
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
		btnPrint.setForeground(Color.DARK_GRAY);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnPrint.setBackground(Color.WHITE);
		btnPrint.setBounds(805, 550, 129, 43);
		panel.add(btnPrint);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Bakery Menu", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Bakery Menu", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.DARK_GRAY);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setBounds(621, 550, 174, 43);
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
				bd.dispose();
			}
		});
		WorkersPage.setHorizontalAlignment(SwingConstants.LEFT);
		WorkersPage.setForeground(Color.PINK);
		WorkersPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		WorkersPage.setBounds(10, 69, 156, 27);
		panel_4.add(WorkersPage);

		JLabel lblInventory1_1 = new JLabel("Inventory");
		lblInventory1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Inventory().Inventory.setVisible(true);
				bd.dispose();
			}
		});
		lblInventory1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblInventory1_1.setForeground(Color.PINK);
		lblInventory1_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblInventory1_1.setBounds(10, 107, 111, 27);
		panel_4.add(lblInventory1_1);

		JLabel BakeryMenuPage = new JLabel("Bakery");
		BakeryMenuPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BakeryMenu().bd.setVisible(true);
				bd.dispose();
			}
		});
		BakeryMenuPage.setHorizontalAlignment(SwingConstants.LEFT);
		BakeryMenuPage.setForeground(Color.PINK);
		BakeryMenuPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		BakeryMenuPage.setBounds(10, 11, 111, 27);
		panel_4.add(BakeryMenuPage);

		JLabel BakeryMenuPage_1 = new JLabel("Menu");
		BakeryMenuPage_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BakeryMenu().bd.setVisible(true);
				bd.dispose();
			}
		});
		BakeryMenuPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		BakeryMenuPage_1.setForeground(Color.PINK);
		BakeryMenuPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		BakeryMenuPage_1.setBounds(10, 31, 111, 27);
		panel_4.add(BakeryMenuPage_1);

		JLabel FinancePage = new JLabel("Finance");
		FinancePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Finance().finance.setVisible(true);
				bd.dispose();
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
				bd.dispose();
			}
		});
		Ads.setHorizontalAlignment(SwingConstants.LEFT);
		Ads.setForeground(Color.PINK);
		Ads.setFont(new Font("STXinwei", Font.BOLD, 18));
		Ads.setBounds(10, 183, 156, 27);
		panel_4.add(Ads);

		JLabel lblHomepage = new JLabel("Home");
		lblHomepage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Cover().cover.setVisible(true);
				bd.dispose();
			}
		});
		lblHomepage.setHorizontalAlignment(SwingConstants.LEFT);
		lblHomepage.setForeground(Color.PINK);
		lblHomepage.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblHomepage.setBounds(10, 528, 156, 27);
		panel_4.add(lblHomepage);



		JButton btnUpload = new JButton("UPLOAD\r\n");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\User\\esaimen\\BakeryMenu.txt");
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
		btnUpload.setBounds(958, 550, 164, 43);
		panel.add(btnUpload);

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bd = new JFrame();
				if (JOptionPane.showConfirmDialog(bd, "Confirm if you want to exit", "Bakery Menu",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.DARK_GRAY);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnExit.setBackground(Color.WHITE);
		btnExit.setBounds(1132, 550, 121, 43);
		panel.add(btnExit);


	}

}