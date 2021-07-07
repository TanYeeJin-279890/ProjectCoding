package GroceryStore_Beverages;

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
	private JTextField txtKeyInId;
	private JTextField txtKeyInName;
	private JTextField txtKeyInFlavour;
	private JTextField txtKeyInVol;
	private JTextField txtKeyInPrice;
	private JTextField txtKeyInQty;
	private JTextField Total;
	private double totalInv,Salary;
	private String output;
	private JTextField textFieldTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory Inventory = new Inventory();
					Inventory.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inventory() {}//constructor without argument
	
	
	public Inventory(double total) {//constructor without argument
		this.Salary = total;
		
		setBounds(100, 100, 1297, 679);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(148, 0, 211)));
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(10, 11, 1263, 622);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel InventoryLabel = new JLabel("Inventory");
		InventoryLabel.setForeground(new Color(148, 0, 211));
		InventoryLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		InventoryLabel.setBounds(511, 11, 198, 54);
		panel.add(InventoryLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(231, 72, 302, 492);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel InfoLabel = new JLabel("Beverages Info");
		InfoLabel.setForeground(new Color(148, 0, 211));
		InfoLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		InfoLabel.setBounds(10, 11, 267, 34);
		panel_1.add(InfoLabel);
		
		JLabel IDLabel = new JLabel("BevID");
		IDLabel.setBounds(10, 60, 56, 24);
		panel_1.add(IDLabel);
		IDLabel.setForeground(new Color(148, 0, 211));
		IDLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblBevname = new JLabel("BevName");
		lblBevname.setBounds(10, 109, 85, 24);
		panel_1.add(lblBevname);
		lblBevname.setForeground(new Color(148, 0, 211));
		lblBevname.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(10, 162, 85, 24);
		panel_1.add(lblType);
		lblType.setForeground(new Color(148, 0, 211));
		lblType.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblFlavour = new JLabel("Flavour");
		lblFlavour.setBounds(10, 221, 85, 24);
		panel_1.add(lblFlavour);
		lblFlavour.setForeground(new Color(148, 0, 211));
		lblFlavour.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setBounds(10, 279, 85, 24);
		panel_1.add(lblVolume);
		lblVolume.setForeground(new Color(148, 0, 211));
		lblVolume.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 345, 85, 24);
		panel_1.add(lblPrice);
		lblPrice.setForeground(new Color(148, 0, 211));
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel lblQuantity_1 = new JLabel("Quantity");
		lblQuantity_1.setBounds(10, 404, 85, 24);
		panel_1.add(lblQuantity_1);
		lblQuantity_1.setForeground(new Color(148, 0, 211));
		lblQuantity_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		txtKeyInId = new JTextField();
		txtKeyInId.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInId.setForeground(Color.BLACK);
		txtKeyInId.setText("Key In ID");
		txtKeyInId.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInId.setBounds(105, 56, 186, 34);
		panel_1.add(txtKeyInId);
		txtKeyInId.setColumns(10);
		
		txtKeyInName = new JTextField();
		txtKeyInName.setText("Key In Name");
		txtKeyInName.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInName.setForeground(Color.BLACK);
		txtKeyInName.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInName.setColumns(10);
		txtKeyInName.setBounds(105, 108, 186, 28);
		panel_1.add(txtKeyInName);
		
		txtKeyInFlavour = new JTextField();
		txtKeyInFlavour.setText("Key In Flavour");
		txtKeyInFlavour.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInFlavour.setForeground(Color.BLACK);
		txtKeyInFlavour.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInFlavour.setColumns(10);
		txtKeyInFlavour.setBounds(106, 217, 186, 34);
		panel_1.add(txtKeyInFlavour);
		
		txtKeyInVol = new JTextField();
		txtKeyInVol.setText("Key In Vol");
		txtKeyInVol.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInVol.setForeground(Color.BLACK);
		txtKeyInVol.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInVol.setColumns(10);
		txtKeyInVol.setBounds(105, 275, 186, 34);
		panel_1.add(txtKeyInVol);
		
		txtKeyInPrice = new JTextField();
		txtKeyInPrice.setText("Key In Price");
		txtKeyInPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInPrice.setForeground(Color.BLACK);
		txtKeyInPrice.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInPrice.setColumns(10);
		txtKeyInPrice.setBounds(105, 339, 186, 37);
		panel_1.add(txtKeyInPrice);
		
		txtKeyInQty = new JTextField();
		txtKeyInQty.setText("Key In Qty");
		txtKeyInQty.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInQty.setForeground(Color.BLACK);
		txtKeyInQty.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInQty.setColumns(10);
		txtKeyInQty.setBounds(105, 400, 186, 34);
		panel_1.add(txtKeyInQty);
		
		JComboBox Type = new JComboBox();
		Type.setModel(new DefaultComboBoxModel(new String[] {"Select Type", "Stimulating", "Refreshing", "Nourshing"}));
		Type.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Type.setBounds(106, 157, 186, 34);
		panel_1.add(Type);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setForeground(new Color(148, 0, 211));
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTotal.setBounds(10, 451, 85, 24);
		panel_1.add(lblTotal);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldTotal.setForeground(Color.BLACK);
		textFieldTotal.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(105, 447, 186, 34);
		panel_1.add(textFieldTotal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_2.setBackground(new Color(255, 204, 255));
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBounds(543, 76, 697, 419);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 677, 316);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"BevID", "BevName", "Type", "Flavour", "Volume", "Price", "Quantity", "TotalPrice"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(42);
		table.getColumnModel().getColumn(1).setPreferredWidth(140);
		table.getColumnModel().getColumn(2).setPreferredWidth(95);
		table.getColumnModel().getColumn(4).setPreferredWidth(60);
		table.getColumnModel().getColumn(5).setPreferredWidth(53);
		table.getColumnModel().getColumn(6).setPreferredWidth(53);
		table.getColumnModel().getColumn(7).setPreferredWidth(62);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		
		JButton btnUpload = new JButton("UPLOAD\r\n");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\Desktop\\Asg3-P2\\Inventory System.txt");
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
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnUpload.setBackground(new Color(148, 0, 211));
		btnUpload.setBounds(104, 365, 164, 43);
		panel_2.add(btnUpload);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(326, 365, 174, 43);
		panel_2.add(btnDelete);
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
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnDelete.setBackground(new Color(148, 0, 211));
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBounds(556, 365, 131, 43);
		panel_2.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnPrint.setBackground(new Color(148, 0, 211));
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1,n2,price;
				try {
					n1 = Double.parseDouble(txtKeyInPrice.getText());
					n2 = Double.parseDouble(txtKeyInQty.getText());
					price = n1*n2;
					textFieldTotal.setText(Double.toString(price));
				}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter valid number.");
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				txtKeyInId.getText(),
				txtKeyInName.getText(),
				Type.getSelectedItem(),
				txtKeyInFlavour.getText(),
				txtKeyInVol.getText(),
				txtKeyInPrice.getText(),
				txtKeyInQty.getText(),
				textFieldTotal.getText(),
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Inventory Update confirmed", "Inventory System",
									JOptionPane.OK_OPTION);
						}
					}
			}
		});
		btnAdd.setBackground(new Color(148, 0, 211));
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnAdd.setBounds(231, 575, 113, 37);
		panel.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKeyInId.setText("");
				txtKeyInName.setText("");
				txtKeyInVol.setText("");
				txtKeyInFlavour.setText("");
				txtKeyInPrice.setText("");
				txtKeyInQty.setText("");
				Type.setSelectedItem("Select Type");
				textFieldTotal.setText("");
				
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnReset.setBackground(new Color(148, 0, 211));
		btnReset.setBounds(394, 575, 139, 37);
		panel.add(btnReset);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(148, 0, 211));
		panel_4.setBounds(0, 0, 221, 622);
		panel.add(panel_4);
		
		JLabel BeveragesDescriptionPage = new JLabel("Beverages");
		BeveragesDescriptionPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				Inventory.dispose();
			}
		});
		BeveragesDescriptionPage.setHorizontalAlignment(SwingConstants.LEFT);
		BeveragesDescriptionPage.setForeground(new Color(255, 204, 255));
		BeveragesDescriptionPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		BeveragesDescriptionPage.setBounds(10, 11, 111, 27);
		panel_4.add(BeveragesDescriptionPage);
		
		JLabel BeveragesDescriptionPage_1 = new JLabel("Description");
		BeveragesDescriptionPage_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				Inventory.dispose();
			}
		});
		BeveragesDescriptionPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		BeveragesDescriptionPage_1.setForeground(new Color(255, 204, 255));
		BeveragesDescriptionPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		BeveragesDescriptionPage_1.setBounds(10, 31, 111, 27);
		panel_4.add(BeveragesDescriptionPage_1);
		
		JLabel AdsAndMarketing = new JLabel("Ads and Marketing");
		AdsAndMarketing.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Ads_and_Marketing().ads.setVisible(true);
				Inventory.dispose();
			}
		});
		
		AdsAndMarketing.setHorizontalAlignment(SwingConstants.LEFT);
		AdsAndMarketing.setForeground(new Color(255, 204, 255));
		AdsAndMarketing.setFont(new Font("STXinwei", Font.BOLD, 18));
		AdsAndMarketing.setBounds(10, 125, 156, 27);
		panel_4.add(AdsAndMarketing);
		
		JLabel lbHomePage = new JLabel("HomePage");
		lbHomePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesCover().BeveragesCover.setVisible(true);
				Inventory.dispose();
			}
		});
		lbHomePage.setHorizontalAlignment(SwingConstants.LEFT);
		lbHomePage.setForeground(new Color(255, 204, 255));
		lbHomePage.setFont(new Font("STXinwei", Font.BOLD, 18));
		lbHomePage.setBounds(10, 528, 156, 27);
		panel_4.add(lbHomePage);
		
		JLabel lblCompanyBackground = new JLabel("Company Background");
		lblCompanyBackground.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new CompanyBackground().frame.setVisible(true);
				Inventory.dispose();
			}
		});
		lblCompanyBackground.setHorizontalAlignment(SwingConstants.LEFT);
		lblCompanyBackground.setForeground(new Color(255, 204, 255));
		lblCompanyBackground.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblCompanyBackground.setBounds(10, 566, 201, 27);
		panel_4.add(lblCompanyBackground);
		
		
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
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnExit.setBackground(new Color(148, 0, 211));
		btnExit.setBounds(1127, 572, 113, 37);
		panel.add(btnExit);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(1127, 524, 113, 37);
		panel.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				// iterate over all columns
				for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 7));
			        totalInv += Double.parseDouble(s);
			    }
				
				int dialogButton = JOptionPane.showConfirmDialog (null, "Please make sure that all the records have been done.","InventorySystem",JOptionPane.YES_NO_OPTION);

				if(dialogButton == JOptionPane.YES_OPTION) {
					try {
						Finance finance = new Finance(totalInv,total); //open customer page using constructor with 5 arguments
						finance.setVisible(true);
						Inventory.dispose();
					} catch (Exception ee) {
						ee.printStackTrace();
					}
				}
				else {remove(dialogButton);}
				
			}
		});
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNext.setBackground(new Color(148, 0, 211));
		
		 
	}
}
