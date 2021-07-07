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
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class BillingSystem extends JFrame{

	protected JFrame BillingSystem;
	private JTextField textFirstname;
	private JTextField textSurname;
	private JTextField textEmail;
	private JTextField textMobile;
	private JTextField textDOB;
	private JTextField textSunsilk;
	private JTextField textLifebuoy;
	private JTextField textGarnierMen;
	private JTextField textNiveaMen;
	private JTextField textHairOil;
	private JTextField textLipstick;
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
		BillingSystem.setBounds(100, 100, 1297, 792);
		BillingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BillingSystem.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 128)));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(10, 11, 1263, 678);
		BillingSystem.getContentPane().add(panel);
		
		JLabel lblBillingSystem = new JLabel("Billing System");
		lblBillingSystem.setBackground(new Color(0, 0, 128));
		lblBillingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBillingSystem.setForeground(new Color(0, 0, 128));
		lblBillingSystem.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblBillingSystem.setBounds(371, 23, 532, 54);
		panel.add(lblBillingSystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(108, 91, 343, 332);
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
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(new Color(0, 0, 0));
		lblPhoneNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPhoneNumber.setBounds(10, 242, 138, 24);
		panel_1.add(lblPhoneNumber);
		
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
		lblCustomer.setForeground(new Color(0, 0, 0));
		lblCustomer.setFont(new Font("Rockwell", Font.BOLD, 29));
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(148, 0, 211));
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 128)));
		panel_2.setBackground(new Color(230, 230, 250));
		panel_2.setBounds(877, 91, 376, 576);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel_4_1_1.setBackground(new Color(230, 230, 250));
		panel_4_1_1.setBounds(10, 503, 356, 62);
		panel_2.add(panel_4_1_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new PersonalCareCover().PersonalCareCover.setVisible(true);
				BillingSystem.dispose();
			}
		});
		btnExit.setBounds(225, 11, 121, 43);
		panel_4_1_1.add(btnExit);
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnExit.setBackground(new Color(0, 0, 128));
		
		JTextArea textAreaReceipt = new JTextArea();
		textAreaReceipt.setBounds(10, 11, 356, 481);
		panel_2.add(textAreaReceipt);
		Payment e = new AdvertisementandMarketingpromo();//interface
		textAreaReceipt.append("*****************SALES PROMOTION**************" + 
							"\nGet Cash Voucher RM " + e.payment() + " in purchasement" + 
							"\nmore than RM 250.00");
		
		JLabel lblReceipt = new JLabel("Receipt");
		lblReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceipt.setForeground(new Color(0, 0, 128));
		lblReceipt.setFont(new Font("Rockwell", Font.BOLD, 29));
		lblReceipt.setBounds(952, 26, 255, 54);
		panel.add(lblReceipt);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel_3.setBackground(new Color(230, 230, 250));
		panel_3.setBounds(461, 91, 406, 522);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblItemsList = new JLabel("Items List");
		lblItemsList.setForeground(new Color(0, 0, 0));
		lblItemsList.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblItemsList.setBounds(10, 11, 159, 35);
		panel_3.add(lblItemsList);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantity.setForeground(new Color(0, 0, 0));
		lblQuantity.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblQuantity.setBounds(260, 11, 136, 35);
		panel_3.add(lblQuantity);
		
		JCheckBox Sunsilk = new JCheckBox("Sunsilk");
		Sunsilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Sunsilk.isSelected()) {
					textSunsilk.setEnabled(true);
					textSunsilk.setText("");
					textSunsilk.requestFocus();
				}
				else {
					textSunsilk.setEnabled(false);
					textSunsilk.setText("0");
				}
			}
		});
		Sunsilk.setBackground(new Color(230, 230, 250));
		Sunsilk.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Sunsilk.setBounds(10, 46, 215, 34);
		panel_3.add(Sunsilk);
		
		textSunsilk = new JTextField();
		textSunsilk.setText("0");
		textSunsilk.setHorizontalAlignment(SwingConstants.CENTER);
		textSunsilk.setForeground(Color.BLACK);
		textSunsilk.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textSunsilk.setColumns(10);
		textSunsilk.setBounds(260, 46, 136, 34);
		panel_3.add(textSunsilk);
		
		JCheckBox Lifebuoy = new JCheckBox("Lifebuoy");
		Lifebuoy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Lifebuoy.isSelected()) {
					textLifebuoy.setEnabled(true);
					textLifebuoy.setText("");
					textLifebuoy.requestFocus();
				}
				else {
					textLifebuoy.setEnabled(false);
					textLifebuoy.setText("0");
				}
			}
		});
		Lifebuoy.setBackground(new Color(230, 230, 250));
		Lifebuoy.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Lifebuoy.setBounds(10, 87, 215, 34);
		panel_3.add(Lifebuoy);
		
		textLifebuoy = new JTextField();
		textLifebuoy.setText("0");
		textLifebuoy.setHorizontalAlignment(SwingConstants.CENTER);
		textLifebuoy.setForeground(Color.BLACK);
		textLifebuoy.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textLifebuoy.setColumns(10);
		textLifebuoy.setBounds(260, 87, 136, 34);
		panel_3.add(textLifebuoy);
		
		JCheckBox GarnierMen = new JCheckBox("Garnier Men");
		GarnierMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(GarnierMen.isSelected()) {
					textGarnierMen.setEnabled(true);
					textGarnierMen.setText("");
					textGarnierMen.requestFocus();
				}
				else {
					textGarnierMen.setEnabled(false);
					textGarnierMen.setText("0");
				}
			}
		});
		GarnierMen.setBackground(new Color(230, 230, 250));
		GarnierMen.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GarnierMen.setBounds(10, 128, 215, 34);
		panel_3.add(GarnierMen);
		
		textGarnierMen = new JTextField();
		textGarnierMen.setText("0");
		textGarnierMen.setHorizontalAlignment(SwingConstants.CENTER);
		textGarnierMen.setForeground(Color.BLACK);
		textGarnierMen.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textGarnierMen.setColumns(10);
		textGarnierMen.setBounds(260, 128, 136, 34);
		panel_3.add(textGarnierMen);
		
		JCheckBox NiveaMen = new JCheckBox("Nivea Men");
		NiveaMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(NiveaMen.isSelected()) {
					textNiveaMen.setEnabled(true);
					textNiveaMen.setText("");
					textNiveaMen.requestFocus();
				}
				else {
					textNiveaMen.setEnabled(false);
					textNiveaMen.setText("0");
				}
			}
		});
		NiveaMen.setBackground(new Color(230, 230, 250));
		NiveaMen.setFont(new Font("Times New Roman", Font.BOLD, 18));
		NiveaMen.setBounds(10, 169, 215, 34);
		panel_3.add(NiveaMen);
		
		textNiveaMen = new JTextField();
		textNiveaMen.setText("0");
		textNiveaMen.setHorizontalAlignment(SwingConstants.CENTER);
		textNiveaMen.setForeground(Color.BLACK);
		textNiveaMen.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textNiveaMen.setColumns(10);
		textNiveaMen.setBounds(260, 169, 136, 34);
		panel_3.add(textNiveaMen);
		
		JCheckBox Lipstick = new JCheckBox("Lipstick");
		Lipstick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Lipstick.isSelected()) {
					textLipstick.setEnabled(true);
					textLipstick.setText("");
					textLipstick.requestFocus();
				}
				else {
					textLipstick.setEnabled(false);
					textLipstick.setText("0");
				}
			}
		});
		Lipstick.setBackground(new Color(230, 230, 250));
		Lipstick.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Lipstick.setBounds(10, 250, 215, 34);
		panel_3.add(Lipstick);
		
		textHairOil = new JTextField();
		textHairOil.setText("0");
		textHairOil.setHorizontalAlignment(SwingConstants.CENTER);
		textHairOil.setForeground(Color.BLACK);
		textHairOil.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textHairOil.setColumns(10);
		textHairOil.setBounds(260, 210, 136, 34);
		panel_3.add(textHairOil);
		
		JCheckBox HairOil = new JCheckBox("Hair Oil");
		HairOil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HairOil.isSelected()) {
					textHairOil.setEnabled(true);
					textHairOil.setText("");
					textHairOil.requestFocus();
				}
				else {
					textHairOil.setEnabled(false);
					textHairOil.setText("0");
				}
			}
		});
		HairOil.setBackground(new Color(230, 230, 250));
		HairOil.setFont(new Font("Times New Roman", Font.BOLD, 18));
		HairOil.setBounds(10, 209, 215, 34);
		panel_3.add(HairOil);
		
		textLipstick = new JTextField();
		textLipstick.setText("0");
		textLipstick.setHorizontalAlignment(SwingConstants.CENTER);
		textLipstick.setForeground(Color.BLACK);
		textLipstick.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textLipstick.setColumns(10);
		textLipstick.setBounds(260, 251, 136, 34);
		panel_3.add(textLipstick);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(new Color(230, 230, 250));
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
		chckbxCard.setBackground(new Color(230, 230, 250));
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
		chckbxCash.setBackground(new Color(230, 230, 250));
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
		chckbxEwallet.setBackground(new Color(230, 230, 250));
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
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					textAreaReceipt.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(new Color(0, 0, 0));
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnPrint.setBackground(new Color(0, 0, 128));
		btnPrint.setBounds(21, 11, 111, 43);
		panel_4_1_1.add(btnPrint);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 128)));
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(230, 230, 250));
		panel_4_1.setBounds(108, 433, 343, 180);
		panel.add(panel_4_1);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(10, 126, 131, 43);
		panel_4_1.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaReceipt.setText("");
				textAreaReceipt.setEnabled(false);
				textSunsilk.setEnabled(false);
				textLifebuoy.setEnabled(false);
				textGarnierMen.setEnabled(false);
				textNiveaMen.setEnabled(false);
				textHairOil.setEnabled(false);
				textLipstick.setEnabled(false);
				
				textSunsilk.setText("0");
				textLifebuoy.setText("0");
				textGarnierMen.setText("0");
				textNiveaMen.setText("0");
				textHairOil.setText("0");
				textLipstick.setText("0");
				
				Sunsilk.setSelected(false);
				Lifebuoy.setSelected(false);
				GarnierMen.setSelected(false);
				NiveaMen.setSelected(false);
				HairOil.setSelected(false);
				Lipstick.setSelected(false);
				
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
		btnReset.setForeground(new Color(0, 0, 0));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnReset.setBackground(new Color(0, 0, 128));
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemcost[0] = Double.parseDouble(textSunsilk.getText())* 9.90;
				itemcost[1] = Double.parseDouble(textLifebuoy.getText())* 14.99;
				itemcost[2] = Double.parseDouble(textGarnierMen.getText())* 12.99;
				itemcost[3] = Double.parseDouble(textNiveaMen.getText())* 6.70;
				itemcost[4] = Double.parseDouble(textHairOil.getText())* 8.90;
				itemcost[5] = Double.parseDouble(textLipstick.getText())* 35.00;
				
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
				  "\nWatsun"  +
						  "\n=========================================================================\t" + 
						  "\nCustomer Information" +
						  "\nFirstname:\t\t\t" + textFirstname.getText() + 
						  "\nSurname:\t\t\t" + textSurname.getText() + 
						  "\nEmail:\t\t\t" + textEmail.getText() + 
						  "\nMobile:\t\t\t" + textMobile.getText() + 
						  "\n=========================================================================\t" + 
						  "\nSunsilk:\t\t\t" + textSunsilk.getText() + 
						  "\nLifebouy:\t\t\t" + textLifebuoy.getText() + 
						  "\nGarnier Men:\t\t\t" + textGarnierMen.getText() + 
						  "\nNivea Men:\t\t\t" + textNiveaMen.getText() + 
						  "\nHair Oil:\t\t\t" + textHairOil.getText() + 
						  "\nLipstick:\t\t\t" + textLipstick.getText() + 
						  
						  "\n=========================================================================\t" +
						  "\nPaid using:\t\t\t" + textpay.getText() +
						  "\nTax:\t\t\t" + tax +
						  "\nSubTotal:\t\t\t" + subtotal +
						  "\nTotal:\t\t\t" + total +
						  
						  "\nIf purchase more than RM 500.00:\t"+ discountedTotal +
						  "\n=========================================================================\t" + 
						  "\nDate: " + tDate.format(timer.getTime()) + 
						  		   "\t\tTime: " + tTime.format(timer.getTime())+
					"\n\n\tThank you for your Visiting to Watsun."
						  		   );
				  }
		});
		btnTotal.setBounds(232, 126, 101, 43);
		
		panel_4_1.add(btnTotal);
		btnTotal.setForeground(new Color(0, 0, 0));
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnTotal.setBackground(new Color(0, 0, 128));
		
		//JLabel lblCheckGroceryItems = new JLabel("Check Grocery Items");
		//lblCheckGroceryItems.setForeground(new Color(255, 204, 255));
		//lblCheckGroceryItems.setFont(new Font("Rockwell", Font.BOLD, 20));
		//lblCheckGroceryItems.setBounds(10, 11, 311, 37);
		//panel_4_1.add(lblCheckGroceryItems);
		
		//JLabel lblPromotion = new JLabel("Promotion");
		//lblPromotion.addMouseListener(new MouseAdapter() {
			//@Override
		//	public void mouseClicked(MouseEvent e) {
				
		//	}
		//});
		//lblPromotion.setForeground(new Color(255, 204, 255));
		//lblPromotion.setFont(new Font("Rockwell", Font.BOLD, 20));
		//lblPromotion.setBounds(10, 59, 311, 37);
		//panel_4_1.add(lblPromotion);
		}
}
