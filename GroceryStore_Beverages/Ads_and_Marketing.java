package GroceryStore_Beverages;

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

public class Ads_and_Marketing extends JFrame {

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
					Ads_and_Marketing window = new Ads_and_Marketing();
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
	public Ads_and_Marketing() {
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
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(148, 0, 211)));
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(10, 11, 1263, 638);
		ads.getContentPane().add(panel);
		
		JLabel lblAdsAndMarketing = new JLabel("Ads and Marketing");
		lblAdsAndMarketing.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdsAndMarketing.setForeground(new Color(148, 0, 211));
		lblAdsAndMarketing.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblAdsAndMarketing.setBounds(525, 14, 417, 54);
		panel.add(lblAdsAndMarketing);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(255, 79, 973, 179);
		panel.add(panel_1);
		
		JLabel lblNo = new JLabel("No");
		lblNo.setForeground(new Color(148, 0, 211));
		lblNo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNo.setBounds(10, 22, 56, 24);
		panel_1.add(lblNo);
		
		JLabel lblTitleAds = new JLabel("Title Ads");
		lblTitleAds.setForeground(new Color(148, 0, 211));
		lblTitleAds.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTitleAds.setBounds(10, 68, 85, 24);
		panel_1.add(lblTitleAds);
		
		JLabel lblDateStart = new JLabel("Date Start");
		lblDateStart.setForeground(new Color(148, 0, 211));
		lblDateStart.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDateStart.setBounds(672, 22, 85, 24);
		panel_1.add(lblDateStart);
		
		JLabel lblDateEnd = new JLabel("Date End");
		lblDateEnd.setForeground(new Color(148, 0, 211));
		lblDateEnd.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDateEnd.setBounds(672, 68, 85, 24);
		panel_1.add(lblDateEnd);
		
		JLabel lblReward = new JLabel("Reward");
		lblReward.setForeground(new Color(148, 0, 211));
		lblReward.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblReward.setBounds(672, 116, 85, 24);
		panel_1.add(lblReward);
		
		txtKeyInNo = new JTextField();
		txtKeyInNo.setText("Key In No");
		txtKeyInNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInNo.setForeground(Color.BLACK);
		txtKeyInNo.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInNo.setColumns(10);
		txtKeyInNo.setBounds(105, 18, 186, 34);
		panel_1.add(txtKeyInNo);
		
		txtKeyInTitle = new JTextField();
		txtKeyInTitle.setText("Key In Title");
		txtKeyInTitle.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInTitle.setForeground(Color.BLACK);
		txtKeyInTitle.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInTitle.setColumns(10);
		txtKeyInTitle.setBounds(105, 68, 543, 82);
		panel_1.add(txtKeyInTitle);
		
		txtKeyInDate = new JTextField();
		txtKeyInDate.setText("Key In Date Start");
		txtKeyInDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInDate.setForeground(Color.BLACK);
		txtKeyInDate.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInDate.setColumns(10);
		txtKeyInDate.setBounds(767, 18, 186, 34);
		panel_1.add(txtKeyInDate);
		
		txtKeyInDate_1 = new JTextField();
		txtKeyInDate_1.setText("Key In Date End");
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
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_2.setBackground(new Color(255, 204, 255));
		panel_2.setBounds(255, 318, 985, 245);
		panel.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 965, 223);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"NO", "ADVERTISEMENT AND MARKETING", "START", "END", "REWARD"
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
				try {
					Payment i = new AdvertisementandMarketingpromo();//interface
					double reward = i.payment();
					txtKeyInReward.setText(Double.toString(reward));
				}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter valid number.");
				}
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
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBackground(new Color(148, 0, 211));
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
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnReset.setBackground(new Color(148, 0, 211));
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
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnPrint.setBackground(new Color(148, 0, 211));
		btnPrint.setBounds(704, 574, 136, 43);
		panel.add(btnPrint);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Ads and Marketing System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Ads and Marketing System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(new Color(148, 0, 211));
		btnDelete.setBounds(481, 574, 174, 43);
		panel.add(btnDelete);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(148, 0, 211));
		panel_4.setBounds(0, 0, 221, 678);
		panel.add(panel_4);
		
		JLabel AdsAndMarketing = new JLabel("Ads and Marketing");
		AdsAndMarketing.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Ads_and_Marketing().ads.setVisible(true);
				ads.dispose();
			}
		});
		AdsAndMarketing.setHorizontalAlignment(SwingConstants.LEFT);
		AdsAndMarketing.setForeground(new Color(255, 204, 255));
		AdsAndMarketing.setFont(new Font("STXinwei", Font.BOLD, 18));
		AdsAndMarketing.setBounds(10, 11, 156, 27);
		panel_4.add(AdsAndMarketing);
		
		JLabel lblHomepage = new JLabel("HomePage");
		lblHomepage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesCover().BeveragesCover.setVisible(true);
				ads.dispose();
			}
		});
		lblHomepage.setHorizontalAlignment(SwingConstants.LEFT);
		lblHomepage.setForeground(new Color(255, 204, 255));
		lblHomepage.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblHomepage.setBounds(10, 528, 156, 27);
		panel_4.add(lblHomepage);
		
		JLabel BeveragesDescriptionPage = new JLabel("Beverages");
		BeveragesDescriptionPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				ads.dispose();
			}
		});
		BeveragesDescriptionPage.setHorizontalAlignment(SwingConstants.LEFT);
		BeveragesDescriptionPage.setForeground(new Color(255, 204, 255));
		BeveragesDescriptionPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		BeveragesDescriptionPage.setBounds(10, 49, 111, 27);
		panel_4.add(BeveragesDescriptionPage);
		
		JLabel BeveragesDescriptionPage_1 = new JLabel("Description");
		BeveragesDescriptionPage_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				ads.dispose();
			}
		});
		BeveragesDescriptionPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		BeveragesDescriptionPage_1.setForeground(new Color(255, 204, 255));
		BeveragesDescriptionPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		BeveragesDescriptionPage_1.setBounds(10, 69, 111, 27);
		panel_4.add(BeveragesDescriptionPage_1);
		
		JButton btnUpload = new JButton("UPLOAD\r\n");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\Desktop\\Asg3-P2\\Ads and Marketing System.txt");
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
		btnUpload.setBounds(893, 574, 164, 43);
		panel.add(btnUpload);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ads = new JFrame();
				if (JOptionPane.showConfirmDialog(ads, "Confirm if you want to exit", "Ads and Marketing System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnExit.setBackground(new Color(148, 0, 211));
		btnExit.setBounds(1119, 574, 121, 43);
		panel.add(btnExit);
	}
}
