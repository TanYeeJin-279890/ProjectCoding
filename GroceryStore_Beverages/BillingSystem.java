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
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class BillingSystem extends JFrame{

	protected JFrame BillingSystem;
	private JTextField textFirstname;
	private JTextField textSurname;
	private JTextField textEmail;
	private JTextField textMobile;
	private JTextField textDOB;
	private JTextField textLiptonTea;
	private JTextField textNescafe;
	private JTextField textCoke;
	private JTextField textOrange;
	private JTextField textMilk;
	private JTextField textMineralWater;
	private JTextField textTax;
	private JTextField textTotal;
	private JTextField textSubTotal;
	
	private String tax,subtotal,total,discountedTotal;
	private double [] itemcost = new double [20];
	private JTextField textpay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingSystem window = new BillingSystem();
					window.BillingSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BillingSystem() {
		initialize();
		
	}

	private void initialize() {
		BillingSystem = new JFrame();
		BillingSystem.setBounds(100, 100, 1203, 737);
		BillingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BillingSystem.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 255)));
		panel.setBackground(new Color(147, 112, 219));
		panel.setBounds(10, 0, 1168, 665);
		BillingSystem.getContentPane().add(panel);
		
		JLabel lblBillingSystem = new JLabel("Billing System");
		lblBillingSystem.setBackground(new Color(255, 204, 255));
		lblBillingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBillingSystem.setForeground(new Color(255, 204, 255));
		lblBillingSystem.setFont(new Font("Rockwell", Font.BOLD, 30));
		lblBillingSystem.setBounds(401, 11, 359, 38);
		panel.add(lblBillingSystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 204, 255)));
		panel_1.setBackground(new Color(147, 112, 219));
		panel_1.setBounds(10, 63, 343, 332);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setBounds(10, 54, 138, 24);
		panel_1.add(lblFirstname);
		lblFirstname.setForeground(new Color(0, 0, 0));
		lblFirstname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(10, 99, 138, 24);
		panel_1.add(lblSurname);
		lblSurname.setForeground(new Color(0, 0, 0));
		lblSurname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		textFirstname = new JTextField();
		textFirstname.setHorizontalAlignment(SwingConstants.CENTER);
		textFirstname.setForeground(new Color(0, 0, 0));
		textFirstname.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textFirstname.setColumns(10);
		textFirstname.setBounds(147, 50, 186, 34);
		panel_1.add(textFirstname);
		
		textSurname = new JTextField();
		textSurname.setHorizontalAlignment(SwingConstants.CENTER);
		textSurname.setForeground(Color.BLACK);
		textSurname.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textSurname.setColumns(10);
		textSurname.setBounds(147, 99, 186, 34);
		panel_1.add(textSurname);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(0, 0, 0));
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblGender.setBounds(10, 148, 138, 24);
		panel_1.add(lblGender);
		
		JLabel lblEmailAddress = new JLabel("E-mail Address");
		lblEmailAddress.setForeground(new Color(0, 0, 0));
		lblEmailAddress.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEmailAddress.setBounds(10, 197, 138, 24);
		panel_1.add(lblEmailAddress);
		
		textEmail = new JTextField();
		textEmail.setHorizontalAlignment(SwingConstants.CENTER);
		textEmail.setForeground(Color.BLACK);
		textEmail.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textEmail.setColumns(10);
		textEmail.setBounds(147, 193, 186, 34);
		panel_1.add(textEmail);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setForeground(new Color(0, 0, 0));
		lblMobile.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMobile.setBounds(10, 242, 138, 24);
		panel_1.add(lblMobile);
		
		textMobile = new JTextField();
		textMobile.setHorizontalAlignment(SwingConstants.CENTER);
		textMobile.setForeground(Color.BLACK);
		textMobile.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textMobile.setColumns(10);
		textMobile.setBounds(147, 238, 186, 34);
		panel_1.add(textMobile);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setForeground(new Color(0, 0, 0));
		lblDateOfBirth.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDateOfBirth.setBounds(10, 291, 138, 24);
		panel_1.add(lblDateOfBirth);
		
		textDOB = new JTextField();
		textDOB.setHorizontalAlignment(SwingConstants.CENTER);
		textDOB.setForeground(Color.BLACK);
		textDOB.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textDOB.setColumns(10);
		textDOB.setBounds(147, 287, 186, 34);
		panel_1.add(textDOB);
		
		JComboBox Gender = new JComboBox();
		Gender.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Gender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Female", "Male"}));
		Gender.setBounds(147, 148, 186, 29);
		panel_1.add(Gender);
		
		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setBounds(92, 0, 159, 54);
		panel_1.add(lblCustomer);
		lblCustomer.setForeground(new Color(255, 204, 255));
		lblCustomer.setFont(new Font("Rockwell", Font.BOLD, 29));
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(148, 0, 211));
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 204, 255)));
		panel_2.setBackground(new Color(147, 112, 219));
		panel_2.setBounds(779, 63, 376, 576);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 204, 255)));
		panel_4_1_1.setBackground(new Color(147, 112, 219));
		panel_4_1_1.setBounds(10, 503, 356, 62);
		panel_2.add(panel_4_1_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesCover().BeveragesCover.setVisible(true);
				BillingSystem.dispose();
			}
		});
		btnExit.setBounds(256, 11, 90, 40);
		panel_4_1_1.add(btnExit);
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnExit.setBackground(new Color(148, 0, 211));
		
		JTextArea textAreaReceipt = new JTextArea();
		textAreaReceipt.setBounds(10, 11, 356, 481);
		panel_2.add(textAreaReceipt);
		Payment e = new AdvertisementandMarketingpromo();//interface
		textAreaReceipt.append("\n*****************HOT PROMOTION**************" + 
							"\nGet Cash Voucher RM " + e.payment() + " in purchasement" + 
							"\nmore than RM 500.00");
		
		JLabel lblReceipt = new JLabel("Receipt");
		lblReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceipt.setForeground(new Color(255, 204, 255));
		lblReceipt.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblReceipt.setBounds(841, 24, 255, 38);
		panel.add(lblReceipt);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel_3.setBackground(new Color(255, 204, 255));
		panel_3.setBounds(363, 63, 406, 522);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblBeveragesList = new JLabel("Beverages List");
		lblBeveragesList.setForeground(new Color(148, 0, 211));
		lblBeveragesList.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblBeveragesList.setBounds(10, 11, 159, 35);
		panel_3.add(lblBeveragesList);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantity.setForeground(new Color(148, 0, 211));
		lblQuantity.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblQuantity.setBounds(260, 11, 136, 35);
		panel_3.add(lblQuantity);
		
		JCheckBox LiptonTea = new JCheckBox("LiptonTea");
		LiptonTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(LiptonTea.isSelected()) {
					textLiptonTea.setEnabled(true);
					textLiptonTea.setText("");
					textLiptonTea.requestFocus();
				}
				else {
					textLiptonTea.setEnabled(false);
					textLiptonTea.setText("0");
				}
			}
		});
		LiptonTea.setBackground(new Color(255, 204, 255));
		LiptonTea.setFont(new Font("Times New Roman", Font.BOLD, 18));
		LiptonTea.setBounds(10, 46, 215, 34);
		panel_3.add(LiptonTea);
		
		textLiptonTea = new JTextField();
		textLiptonTea.setText("0");
		textLiptonTea.setHorizontalAlignment(SwingConstants.CENTER);
		textLiptonTea.setForeground(Color.BLACK);
		textLiptonTea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textLiptonTea.setColumns(10);
		textLiptonTea.setBounds(260, 46, 136, 34);
		panel_3.add(textLiptonTea);
		
		JCheckBox Nescafe = new JCheckBox("Nescafe");
		Nescafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Nescafe.isSelected()) {
					textNescafe.setEnabled(true);
					textNescafe.setText("");
					textNescafe.requestFocus();
				}
				else {
					textNescafe.setEnabled(false);
					textNescafe.setText("0");
				}
			}
		});
		Nescafe.setBackground(new Color(255, 204, 255));
		Nescafe.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Nescafe.setBounds(10, 87, 215, 34);
		panel_3.add(Nescafe);
		
		textNescafe = new JTextField();
		textNescafe.setText("0");
		textNescafe.setHorizontalAlignment(SwingConstants.CENTER);
		textNescafe.setForeground(Color.BLACK);
		textNescafe.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textNescafe.setColumns(10);
		textNescafe.setBounds(260, 87, 136, 34);
		panel_3.add(textNescafe);
		
		JCheckBox Coke = new JCheckBox("Coke");
		Coke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Coke.isSelected()) {
					textCoke.setEnabled(true);
					textCoke.setText("");
					textCoke.requestFocus();
				}
				else {
					textCoke.setEnabled(false);
					textCoke.setText("0");
				}
			}
		});
		Coke.setBackground(new Color(255, 204, 255));
		Coke.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Coke.setBounds(10, 128, 215, 34);
		panel_3.add(Coke);
		
		textCoke = new JTextField();
		textCoke.setText("0");
		textCoke.setHorizontalAlignment(SwingConstants.CENTER);
		textCoke.setForeground(Color.BLACK);
		textCoke.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textCoke.setColumns(10);
		textCoke.setBounds(260, 128, 136, 34);
		panel_3.add(textCoke);
		
		JCheckBox TropicanaOrangeJuice = new JCheckBox("Tropicana Orange Juice");
		TropicanaOrangeJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TropicanaOrangeJuice.isSelected()) {
					textOrange.setEnabled(true);
					textOrange.setText("");
					textOrange.requestFocus();
				}
				else {
					textOrange.setEnabled(false);
					textOrange.setText("0");
				}
			}
		});
		TropicanaOrangeJuice.setBackground(new Color(255, 204, 255));
		TropicanaOrangeJuice.setFont(new Font("Times New Roman", Font.BOLD, 18));
		TropicanaOrangeJuice.setBounds(10, 169, 215, 34);
		panel_3.add(TropicanaOrangeJuice);
		
		textOrange = new JTextField();
		textOrange.setText("0");
		textOrange.setHorizontalAlignment(SwingConstants.CENTER);
		textOrange.setForeground(Color.BLACK);
		textOrange.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textOrange.setColumns(10);
		textOrange.setBounds(260, 169, 136, 34);
		panel_3.add(textOrange);
		
		JCheckBox MineralWater = new JCheckBox("Mineral Water");
		MineralWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(MineralWater.isSelected()) {
					textMineralWater.setEnabled(true);
					textMineralWater.setText("");
					textMineralWater.requestFocus();
				}
				else {
					textMineralWater.setEnabled(false);
					textMineralWater.setText("0");
				}
			}
		});
		MineralWater.setBackground(new Color(255, 204, 255));
		MineralWater.setFont(new Font("Times New Roman", Font.BOLD, 18));
		MineralWater.setBounds(10, 250, 215, 34);
		panel_3.add(MineralWater);
		
		textMilk = new JTextField();
		textMilk.setText("0");
		textMilk.setHorizontalAlignment(SwingConstants.CENTER);
		textMilk.setForeground(Color.BLACK);
		textMilk.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textMilk.setColumns(10);
		textMilk.setBounds(260, 210, 136, 34);
		panel_3.add(textMilk);
		
		JCheckBox HLMilk = new JCheckBox("HL Milk");
		HLMilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HLMilk.isSelected()) {
					textMilk.setEnabled(true);
					textMilk.setText("");
					textMilk.requestFocus();
				}
				else {
					textMilk.setEnabled(false);
					textMilk.setText("0");
				}
			}
		});
		HLMilk.setBackground(new Color(255, 204, 255));
		HLMilk.setFont(new Font("Times New Roman", Font.BOLD, 18));
		HLMilk.setBounds(10, 209, 215, 34);
		panel_3.add(HLMilk);
		
		textMineralWater = new JTextField();
		textMineralWater.setText("0");
		textMineralWater.setHorizontalAlignment(SwingConstants.CENTER);
		textMineralWater.setForeground(Color.BLACK);
		textMineralWater.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textMineralWater.setColumns(10);
		textMineralWater.setBounds(260, 251, 136, 34);
		panel_3.add(textMineralWater);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(147, 112, 219));
		panel_4.setBounds(10, 380, 386, 131);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setForeground(new Color(0, 0, 0));
		lblTax.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTax.setBounds(10, 15, 127, 24);
		panel_4.add(lblTax);
		
		textTax = new JTextField();
		textTax.setHorizontalAlignment(SwingConstants.CENTER);
		textTax.setForeground(Color.BLACK);
		textTax.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textTax.setColumns(10);
		textTax.setBounds(147, 11, 186, 34);
		panel_4.add(textTax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setForeground(new Color(0, 0, 0));
		lblSubtotal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSubtotal.setBounds(10, 54, 127, 24);
		panel_4.add(lblSubtotal);
		
		textSubTotal = new JTextField();
		textSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textSubTotal.setForeground(Color.BLACK);
		textSubTotal.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textSubTotal.setColumns(10);
		textSubTotal.setBounds(147, 50, 186, 34);
		panel_4.add(textSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(10, 93, 96, 24);
		panel_4.add(lblTotal);
		lblTotal.setForeground(new Color(0, 0, 0));
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		textTotal = new JTextField();
		textTotal.setBounds(147, 89, 186, 34);
		panel_4.add(textTotal);
		textTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textTotal.setForeground(Color.BLACK);
		textTotal.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textTotal.setColumns(10);
		
		JCheckBox chckbxCard = new JCheckBox("Card");
		chckbxCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCard.isSelected()) {
					textpay.setEnabled(true);
					textpay.setText("Card");
				}
				else {
					textpay.setEnabled(false);
				}
			}
		});
		chckbxCard.setFont(new Font("Times New Roman", Font.BOLD, 18));
		chckbxCard.setBackground(new Color(255, 204, 255));
		chckbxCard.setBounds(10, 339, 88, 34);
		panel_3.add(chckbxCard);
		
		JCheckBox chckbxCash = new JCheckBox("Cash");
		chckbxCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCash.isSelected()) {
					textpay.setEnabled(true);
					textpay.setText("Cash");
				}
				else {
					textpay.setEnabled(false);
				}
			}
		});
		chckbxCash.setFont(new Font("Times New Roman", Font.BOLD, 18));
		chckbxCash.setBackground(new Color(255, 204, 255));
		chckbxCash.setBounds(100, 339, 69, 34);
		panel_3.add(chckbxCash);
		
		JCheckBox chckbxEwallet = new JCheckBox("E-Wallet");
		chckbxEwallet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxEwallet.isSelected()) {
					textpay.setEnabled(true);
					textpay.setText("E-Wallet");
				}
				else {
					textpay.setEnabled(false);
				}
			}
		});
		chckbxEwallet.setFont(new Font("Times New Roman", Font.BOLD, 18));
		chckbxEwallet.setBackground(new Color(255, 204, 255));
		chckbxEwallet.setBounds(195, 339, 123, 34);
		panel_3.add(chckbxEwallet);
		
		JLabel lblPaidUsing = new JLabel("Paid Using");
		lblPaidUsing.setForeground(Color.BLACK);
		lblPaidUsing.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPaidUsing.setBounds(10, 308, 138, 24);
		panel_3.add(lblPaidUsing);
		
		textpay = new JTextField();
		textpay.setHorizontalAlignment(SwingConstants.CENTER);
		textpay.setForeground(Color.BLACK);
		textpay.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		textpay.setColumns(10);
		textpay.setBounds(118, 306, 123, 24);
		panel_3.add(textpay);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					textAreaReceipt.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnPrint.setBackground(new Color(148, 0, 211));
		btnPrint.setBounds(21, 11, 90, 40);
		panel_4_1_1.add(btnPrint);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 204, 255)));
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(147, 112, 219));
		panel_4_1.setBounds(10, 405, 343, 180);
		panel.add(panel_4_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(10, 26, 101, 43);
		panel_4_1.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaReceipt.setText("");
				textAreaReceipt.setEnabled(false);
				textLiptonTea.setEnabled(false);
				textNescafe.setEnabled(false);
				textCoke.setEnabled(false);
				textOrange.setEnabled(false);
				textMilk.setEnabled(false);
				textMineralWater.setEnabled(false);
				
				textLiptonTea.setText("0");
				textNescafe.setText("0");
				textCoke.setText("0");
				textOrange.setText("0");
				textMilk.setText("0");
				textMineralWater.setText("0");
				
				LiptonTea.setSelected(false);
				Nescafe.setSelected(false);
				Coke.setSelected(false);
				TropicanaOrangeJuice.setSelected(false);
				HLMilk.setSelected(false);
				MineralWater.setSelected(false);
				
				textFirstname.setText("");
				textSurname.setText("");
				textEmail.setText("");
				textMobile.setText("");
				textDOB.setText("");
				textAreaReceipt.setText("");
				Gender.setSelectedItem("Select Gender");
				
				textTax.setText("");
				textTotal.setText("");
				textSubTotal.setText("");
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnReset.setBackground(new Color(148, 0, 211));
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemcost[0] = Double.parseDouble(textLiptonTea.getText())* 3.00;
				itemcost[1] = Double.parseDouble(textNescafe.getText())* 2.50;
				itemcost[2] = Double.parseDouble(textCoke.getText())* 1.00;
				itemcost[3] = Double.parseDouble(textOrange.getText())* 6.00;
				itemcost[4] = Double.parseDouble(textMilk.getText())* 10.00;
				itemcost[5] = Double.parseDouble(textMineralWater.getText())* 0.80;
				
				itemcost[6] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4] + itemcost[5];
				
				tax = String.format("RM %.2f", itemcost[6]/100);
				subtotal = String.format("RM %.2f", itemcost[6]);
				total = String.format("RM %.2f", itemcost[6] + (itemcost[6]/100));
				Payment e1 = new AdvertisementandMarketingpromo();//interface
				discountedTotal = String.format("RM %.2f", (itemcost[6]-e1.payment()) + (itemcost[6]/100));
				
				textTax.setText(tax);
				textSubTotal.setText(subtotal);
				textTotal.setText(total);
				
				//=========================================================================
				textAreaReceipt.setEnabled(true);
				  //=========================================================================
				  
				  //=========================================================================
				  Calendar timer = Calendar.getInstance();
				  timer.getTime();
				  SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				  tTime.format(timer.getTime());
				  SimpleDateFormat tDate = new SimpleDateFormat("dd:MMM:yyyy");
				  tDate.format(timer.getTime());
				  //=========================================================================
				  textAreaReceipt.append("\n=============== Customer Billing System ===============" +
						  "\n" + 
						  "\nCustomer Information" +
						  "\nFirstname:\t\t\t" + textFirstname.getText() + 
						  "\nSurname:\t\t\t" + textSurname.getText() + 
						  "\nEmail:\t\t\t\t" + textEmail.getText() + 
						  "\nMobile:\t\t\t\t" + textMobile.getText() + 
						  "\n=========================================================================\t" + 
						  "\nLipton Tea:\t\t\t" + textLiptonTea.getText() + 
						  "\nNescafe:\t\t\t" + textNescafe.getText() + 
						  "\nCoke:\t\t\t\t" + textCoke.getText() + 
						  "\nTropicana Orange Juice:\t\t" + textOrange.getText() + 
						  "\nHL Milk:\t\t\t" + textMilk.getText() + 
						  "\nMineral Water:\t\t\t" + textMineralWater.getText() + 
						  
						  "\n=========================================================================\t" +
						  "\nPaid using:\t\t\t\t" + textpay.getText() +
						  "\nTax:\t\t\t\t\t" + tax +
						  "\nSubTotal:\t\t\t\t" + subtotal +
						  "\nTotal:\t\t\t\t\t" + total +
						  
						  "\nIf purchase more than RM 500.00:\t"+ discountedTotal +
						  "\n=========================================================================\t" + 
						  "\nDate: " + tDate.format(timer.getTime()) + 
						  		   "\t\tTime: " + tTime.format(timer.getTime())+
					"\n\n\tThank you for your Visiting to Beverages Shop."
						  		   );
				  }
		});
		btnTotal.setBounds(232, 26, 101, 43);
		
		panel_4_1.add(btnTotal);
		btnTotal.setForeground(Color.WHITE);
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnTotal.setBackground(new Color(148, 0, 211));
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\Desktop\\Asg3-P2\\BillingSystem.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
					textAreaReceipt.write(fw);
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
		btnUpload.setBounds(175, 126, 158, 43);
		panel_4_1.add(btnUpload);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setBackground(new Color(220, 220, 220));
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 20));
		BillingSystem.setJMenuBar(menuBar);
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setBackground(new Color(176, 224, 230));
		mnHome.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnHome.setForeground(new Color(0, 0, 0));
		menuBar.add(mnHome);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CompanyBackground().frame.setVisible(true);// calling another frame
			}
		});
		mntmAboutUs.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAboutUs.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnHome.add(mntmAboutUs);
		
		}
}
