package GroceryStore_Bakery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ads {

	protected JFrame ads;
	private JTextField txtKeyInNo;
	private JTextField txtKeyInTitle;
	private JTextField txtKeyInDate;
	private JTextField txtKeyInDate_1;
	private JTextField txtKeyInReward;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ads window = new Ads();
					window.ads.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ads() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ads = new JFrame();
		ads.setBounds(100, 100, 1291, 734);
		ads.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ads.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) Color.PINK));
		panel.setBackground(Color.PINK);
		panel.setBounds(14, 10, 1263, 678);
		ads.getContentPane().add(panel);

		JLabel lblAds = new JLabel("ADVERTISEMENT");
		lblAds.setHorizontalAlignment(SwingConstants.CENTER);
		lblAds.setForeground(Color.DARK_GRAY);
		lblAds.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblAds.setBounds(525, 14, 417, 54);
		panel.add(lblAds);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(255, 79, 973, 179);
		panel.add(panel_1);

		JLabel lblNo = new JLabel("No");
		lblNo.setForeground(Color.PINK);
		lblNo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNo.setBounds(10, 22, 56, 24);
		panel_1.add(lblNo);

		JLabel lblTitleAds = new JLabel("Title Ads");
		lblTitleAds.setForeground(Color.PINK);
		lblTitleAds.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTitleAds.setBounds(10, 68, 85, 24);
		panel_1.add(lblTitleAds);

		JLabel lblDateStart = new JLabel("Date Start");
		lblDateStart.setForeground(Color.PINK);
		lblDateStart.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDateStart.setBounds(672, 22, 85, 24);
		panel_1.add(lblDateStart);

		JLabel lblDateEnd = new JLabel("Date End");
		lblDateEnd.setForeground(Color.PINK);
		lblDateEnd.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDateEnd.setBounds(672, 68, 85, 24);
		panel_1.add(lblDateEnd);

		JLabel lblReward = new JLabel("Reward");
		lblReward.setForeground(Color.PINK);
		lblReward.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblReward.setBounds(672, 116, 85, 24);
		panel_1.add(lblReward);

		txtKeyInNo = new JTextField();
		txtKeyInNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInNo.setForeground(Color.BLACK);
		txtKeyInNo.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInNo.setColumns(10);
		txtKeyInNo.setBounds(105, 18, 186, 34);
		panel_1.add(txtKeyInNo);

		txtKeyInTitle = new JTextField();
		txtKeyInTitle.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInTitle.setForeground(Color.BLACK);
		txtKeyInTitle.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInTitle.setColumns(10);
		txtKeyInTitle.setBounds(105, 68, 543, 82);
		panel_1.add(txtKeyInTitle);

		txtKeyInDate = new JTextField();
		txtKeyInDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInDate.setForeground(Color.BLACK);
		txtKeyInDate.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInDate.setColumns(10);
		txtKeyInDate.setBounds(767, 18, 186, 34);
		panel_1.add(txtKeyInDate);

		txtKeyInDate_1 = new JTextField();
		txtKeyInDate_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInDate_1.setForeground(Color.BLACK);
		txtKeyInDate_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInDate_1.setColumns(10);
		txtKeyInDate_1.setBounds(767, 64, 186, 34);
		panel_1.add(txtKeyInDate_1);

		txtKeyInReward = new JTextField();
		txtKeyInReward.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInReward.setForeground(Color.BLACK);
		txtKeyInReward.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInReward.setColumns(10);
		txtKeyInReward.setBounds(767, 109, 186, 37);
		panel_1.add(txtKeyInReward);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.PINK));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(255, 318, 985, 245);
		panel.add(panel_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 965, 223);
		panel_2.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {

			},
			new String[] {
				"NO", "ADVERTISEMENT", "START", "END", "REWARD"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setPreferredWidth(355);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		scrollPane.setViewportView(table);

		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				txtKeyInNo.getText(),
				txtKeyInTitle.getText(),
				txtKeyInDate.getText(),
				txtKeyInDate_1.getText(),
				txtKeyInReward.getText(),
				});

					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Inventory Update confirmed", "Inventory System",
									JOptionPane.OK_OPTION);
						}
					}
					}
				});
		btnAdd.setForeground(Color.DARK_GRAY);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBackground(Color.PINK);
		btnAdd.setBounds(960, 264, 110, 43);
		panel.add(btnAdd);

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKeyInNo.setText("");
				txtKeyInTitle.setText("");
				txtKeyInDate.setText("");
				txtKeyInDate_1.setText("");
				txtKeyInReward.setText("");

				}
			});
		btnReset.setForeground(Color.DARK_GRAY);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnReset.setBackground(Color.PINK);
		btnReset.setBounds(1092, 264, 136, 43);
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
		btnPrint.setBackground(Color.PINK);
		btnPrint.setBounds(704, 606, 136, 43);
		panel.add(btnPrint);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Ads System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Ads System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.DARK_GRAY);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(Color.PINK);
		btnDelete.setBounds(481, 606, 174, 43);
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
				ads.dispose();
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
				ads.dispose();
			}
		});
		lblInventory1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblInventory1_1.setForeground(Color.PINK);
		lblInventory1_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblInventory1_1.setBounds(10, 87, 111, 27);
		panel_4.add(lblInventory1_1);

		JLabel BakeryMenuPage = new JLabel("Bakery");
		BakeryMenuPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BakeryMenu().bd.setVisible(true);
				ads.dispose();
			}
		});
		BakeryMenuPage.setHorizontalAlignment(SwingConstants.LEFT);
		BakeryMenuPage.setForeground(Color.PINK);
		BakeryMenuPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		BakeryMenuPage.setBounds(10, 131, 111, 27);
		panel_4.add(BakeryMenuPage);

		JLabel BakeryMenuPage_1 = new JLabel("Menu");
		BakeryMenuPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BakeryMenu().bd.setVisible(true);
				ads.dispose();
			}
		});
		BakeryMenuPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		BakeryMenuPage_1.setForeground(Color.PINK);
		BakeryMenuPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		BakeryMenuPage_1.setBounds(10, 151, 111, 27);
		panel_4.add(BakeryMenuPage_1);

		JLabel FinancePage = new JLabel("Finance");
		FinancePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Finance().finance.setVisible(true);
				ads.dispose();
			}
		});
		FinancePage.setHorizontalAlignment(SwingConstants.LEFT);
		FinancePage.setForeground(Color.PINK);
		FinancePage.setFont(new Font("STXinwei", Font.BOLD, 18));
		FinancePage.setBounds(10, 189, 111, 27);
		panel_4.add(FinancePage);

		JLabel Ads = new JLabel("Ads ");
		Ads.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Ads().ads.setVisible(true);
				ads.dispose();
			}
		});
		Ads.setHorizontalAlignment(SwingConstants.LEFT);
		Ads.setForeground(Color.PINK);
		Ads.setFont(new Font("STXinwei", Font.BOLD, 18));
		Ads.setBounds(10, 11, 156, 27);
		panel_4.add(Ads);

		JLabel lblHomepage = new JLabel("Home");
		lblHomepage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Cover().cover.setVisible(true);
				ads.dispose();
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
					File file = new File("C:\\Users\\User\\esaimen\\Ads.txt");
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
		btnUpload.setBackground(Color.PINK);
		btnUpload.setBounds(893, 606, 164, 43);
		panel.add(btnUpload);

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ads = new JFrame();
				if (JOptionPane.showConfirmDialog(ads, "Confirm if you want to exit", "Ads System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.DARK_GRAY);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnExit.setBackground(Color.PINK);
		btnExit.setBounds(1119, 606, 121, 43);
		panel.add(btnExit);
	}
}