package GroceryStore_Beverages;

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
import javax.swing.JTextArea;

public class BeveragesDescription {

	protected JFrame bd;
	private JTextField PRICE;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BeveragesDescription window = new BeveragesDescription();
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
	public BeveragesDescription() {
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
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(148, 0, 211)));
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(10, 11, 1263, 678);
		bd.getContentPane().add(panel);
		
		JLabel lblBeveragesDescription = new JLabel("Beverages Description");
		lblBeveragesDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblBeveragesDescription.setForeground(new Color(148, 0, 211));
		lblBeveragesDescription.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblBeveragesDescription.setBounds(481, 14, 532, 54);
		panel.add(lblBeveragesDescription);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(241, 80, 302, 377);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel InfoLabel = new JLabel("Beverages Info");
		InfoLabel.setBounds(10, 11, 267, 34);
		InfoLabel.setForeground(new Color(148, 0, 211));
		InfoLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_1.add(InfoLabel);
		
		JLabel lblBevname = new JLabel("BevName");
		lblBevname.setBounds(10, 56, 85, 24);
		lblBevname.setForeground(new Color(148, 0, 211));
		lblBevname.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblBevname);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 150, 85, 24);
		lblPrice.setForeground(new Color(148, 0, 211));
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblPrice);
		
		PRICE = new JTextField();
		PRICE.setBounds(105, 144, 186, 37);
		PRICE.setText("Key In Price");
		PRICE.setHorizontalAlignment(SwingConstants.CENTER);
		PRICE.setForeground(Color.BLACK);
		PRICE.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		PRICE.setColumns(10);
		panel_1.add(PRICE);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 198, 104, 24);
		lblDescription.setForeground(new Color(148, 0, 211));
		lblDescription.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel_1.add(lblDescription);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 233, 257, 122);
		panel_1.add(scrollPane_1);
		
		JTextArea txtrKeyInDescription = new JTextArea();
		txtrKeyInDescription.setToolTipText("");
		txtrKeyInDescription.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtrKeyInDescription.setText("Key In Description");
		scrollPane_1.setViewportView(txtrKeyInDescription);
		
		JComboBox BevName = new JComboBox();
		BevName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		BevName.setModel(new DefaultComboBoxModel(new String[] {"Select Beverages", "LiptonTea", "Nescafe", "Coke", "Tropicana", "HL", "Mineral Water"}));
		BevName.setBounds(105, 53, 186, 34);
		panel_1.add(BevName);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_2.setBackground(new Color(255, 204, 255));
		panel_2.setBounds(551, 79, 702, 460);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 682, 438);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"BevName", "Price", "Description"},
			},
			new String[] {
				"BevName", "Price", "Description"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(69);
		table.getColumnModel().getColumn(2).setPreferredWidth(204);
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				BevName.getSelectedItem(),
				PRICE.getText(),
				txtrKeyInDescription.getText(),
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Inventory Update confirmed", "Inventory",
									JOptionPane.OK_OPTION);
						}
					}
					}
				});
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBackground(new Color(148, 0, 211));
		btnAdd.setBounds(285, 468, 110, 43);
		panel.add(btnAdd);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BevName.setSelectedItem("Select Beverages");
				PRICE.setText("");
				txtrKeyInDescription.setText("");
				
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnReset.setBackground(new Color(148, 0, 211));
		btnReset.setBounds(405, 468, 138, 43);
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
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnPrint.setBackground(new Color(148, 0, 211));
		btnPrint.setBounds(805, 550, 129, 43);
		panel.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Beverages Description", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Beverages Description", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(new Color(148, 0, 211));
		btnDelete.setBounds(621, 550, 174, 43);
		panel.add(btnDelete);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(148, 0, 211));
		panel_4.setBounds(0, 0, 221, 678);
		panel.add(panel_4);
		
		JLabel BeveragesDescriptionPage = new JLabel("Beverages");
		BeveragesDescriptionPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				bd.dispose();
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
				bd.dispose();
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
				bd.dispose();
			}
		});
		AdsAndMarketing.setHorizontalAlignment(SwingConstants.LEFT);
		AdsAndMarketing.setForeground(new Color(255, 204, 255));
		AdsAndMarketing.setFont(new Font("STXinwei", Font.BOLD, 18));
		AdsAndMarketing.setBounds(10, 69, 156, 27);
		panel_4.add(AdsAndMarketing);
		
		JLabel lblHomepage = new JLabel("HomePage");
		lblHomepage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesCover().BeveragesCover.setVisible(true);
				bd.dispose();
			}
		});
		lblHomepage.setHorizontalAlignment(SwingConstants.LEFT);
		lblHomepage.setForeground(new Color(255, 204, 255));
		lblHomepage.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblHomepage.setBounds(10, 528, 156, 27);
		panel_4.add(lblHomepage);
		
		
		
		JButton btnUpload = new JButton("UPLOAD\r\n");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\Desktop\\Asg3-P2\\Beverages Description System.txt");
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
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnUpload.setBackground(new Color(148, 0, 211));
		btnUpload.setBounds(958, 550, 164, 43);
		panel.add(btnUpload);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bd = new JFrame();
				if (JOptionPane.showConfirmDialog(bd, "Confirm if you want to exit", "Beverages Description", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnExit.setBackground(new Color(148, 0, 211));
		btnExit.setBounds(1132, 550, 121, 43);
		panel.add(btnExit);
		
		
	}
}
