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

public class BilingSystem extends JFrame{

	protected JFrame BillingSystem;
	private JTextField textFirstname;
	private JTextField textSurname;
	private JTextField textEmail;
	private JTextField textMobile;
	private JTextField textDOB;
	private JTextField textHokkaidoCake;
	private JTextField textCheeseBread;
	private JTextField textCookies;
	private JTextField textPizza;
	private JTextField textMuffin;
	private JTextField textdonut;
	private JTextField textTax;
	private JTextField textTotal;
	private JTextField textSubTotal;
	
	private String tax,subtotal,total,discountedTotal;
	private double [] itemcost = new double [20];
	private JTextField textpay;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BilingSystem window = new BilingSystem();
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
	public BilingSystem() {
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
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 1263, 678);
		BillingSystem.getContentPane().add(panel);
		
		JLabel lblBillingSystem = new JLabel("Billing System");
		lblBillingSystem.setBackground(Color.BLACK);
		lblBillingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBillingSystem.setForeground(Color.DARK_GRAY);
		lblBillingSystem.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblBillingSystem.setBounds(371, 23, 532, 54);
		panel.add(lblBillingSystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.DARK_GRAY));
		panel_1.setBackground(Color.PINK);
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
		lblCustomer.setForeground(Color.DARK_GRAY);
		lblCustomer.setFont(new Font("Rockwell", Font.BOLD, 29));
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.DARK_GRAY);
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.DARK_GRAY));
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(877, 91, 376, 576);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.PINK));
		panel_4_1_1.setBackground(Color.DARK_GRAY);
		panel_4_1_1.setBounds(10, 503, 356, 62);
		panel_2.add(panel_4_1_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Cover().cover.setVisible(true);
				BillingSystem.dispose();
			}
		});
		btnExit.setBounds(225, 11, 121, 43);
		panel_4_1_1.add(btnExit);
		btnExit.setForeground(Color.DARK_GRAY);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnExit.setBackground(Color.WHITE);
		
		JTextArea textAreaReceipt = new JTextArea();
		textAreaReceipt.setBounds(10, 11, 356, 481);
		panel_2.add(textAreaReceipt);
		Payment e = new AdvertisementandMarketingpromo();//interface
		textAreaReceipt.append("*****************Welcome to Bakery Indah**************" + 
							"\nGet Cash Voucher RM " + e.payment() + " in purchasement" + 
							"\nmore than RM 500.00");
		
		JLabel lblReceipt = new JLabel("Receipt");
		lblReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceipt.setForeground(Color.DARK_GRAY);
		lblReceipt.setFont(new Font("Rockwell", Font.BOLD, 29));
		lblReceipt.setBounds(937, 26, 255, 54);
		panel.add(lblReceipt);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(64, 64, 64)));
		panel_3.setBackground(Color.PINK);
		panel_3.setBounds(461, 91, 406, 522);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblBeveragesList = new JLabel("Beverages List");
		lblBeveragesList.setForeground(Color.DARK_GRAY);
		lblBeveragesList.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblBeveragesList.setBounds(10, 11, 159, 35);
		panel_3.add(lblBeveragesList);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantity.setForeground(Color.DARK_GRAY);
		lblQuantity.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblQuantity.setBounds(260, 11, 136, 35);
		panel_3.add(lblQuantity);
		
		JCheckBox HokkaidoCake = new JCheckBox("Hokkaido Cake");
		HokkaidoCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(HokkaidoCake.isSelected()) {
					textHokkaidoCake.setEnabled(true);
					textHokkaidoCake.setText("");
					textHokkaidoCake.requestFocus();
				}
				else {
					textHokkaidoCake.setEnabled(false);
					textHokkaidoCake.setText("0");
				}
			}
		});
		HokkaidoCake.setBackground(Color.PINK);
		HokkaidoCake.setFont(new Font("Times New Roman", Font.BOLD, 18));
		HokkaidoCake.setBounds(10, 46, 215, 34);
		panel_3.add(HokkaidoCake);
		
		textHokkaidoCake = new JTextField();
		textHokkaidoCake.setText("0");
		textHokkaidoCake.setHorizontalAlignment(SwingConstants.CENTER);
		textHokkaidoCake.setForeground(Color.BLACK);
		textHokkaidoCake.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textHokkaidoCake.setColumns(10);
		textHokkaidoCake.setBounds(260, 46, 136, 34);
		panel_3.add(textHokkaidoCake);
		
		JCheckBox CheeseBread = new JCheckBox("Cheese Bread");
		CheeseBread.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CheeseBread.isSelected()) {
					textCheeseBread.setEnabled(true);
					textCheeseBread.setText("");
					textCheeseBread.requestFocus();
				}
				else {
					textCheeseBread.setEnabled(false);
					textCheeseBread.setText("0");
				}
			}
		});
		CheeseBread.setBackground(Color.PINK);
		CheeseBread.setFont(new Font("Times New Roman", Font.BOLD, 18));
		CheeseBread.setBounds(10, 87, 215, 34);
		panel_3.add(CheeseBread);
		
		textCheeseBread = new JTextField();
		textCheeseBread.setText("0");
		textCheeseBread.setHorizontalAlignment(SwingConstants.CENTER);
		textCheeseBread.setForeground(Color.BLACK);
		textCheeseBread.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textCheeseBread.setColumns(10);
		textCheeseBread.setBounds(260, 87, 136, 34);
		panel_3.add(textCheeseBread);
		
		JCheckBox Cookies = new JCheckBox("RedVelvet Cookies");
		Cookies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Cookies.isSelected()) {
					textCookies.setEnabled(true);
					textCookies.setText("");
					textCookies.requestFocus();
				}
				else {
					textCookies.setEnabled(false);
					textCookies.setText("0");
				}
			}
		});
		Cookies.setBackground(Color.PINK);
		Cookies.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Cookies.setBounds(10, 128, 215, 34);
		panel_3.add(Cookies);
		
		textCookies = new JTextField();
		textCookies.setText("0");
		textCookies.setHorizontalAlignment(SwingConstants.CENTER);
		textCookies.setForeground(Color.BLACK);
		textCookies.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textCookies.setColumns(10);
		textCookies.setBounds(260, 128, 136, 34);
		panel_3.add(textCookies);
		
		JCheckBox Pizza = new JCheckBox("Hawaian Pizza");
		Pizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pizza.isSelected()) {
					textPizza.setEnabled(true);
					textPizza.setText("");
					textPizza.requestFocus();
				}
				else {
					textPizza.setEnabled(false);
					textPizza.setText("0");
				}
			}
		});
		Pizza.setBackground(Color.PINK);
		Pizza.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Pizza.setBounds(10, 169, 215, 34);
		panel_3.add(Pizza);
		
		textPizza = new JTextField();
		textPizza.setText("0");
		textPizza.setHorizontalAlignment(SwingConstants.CENTER);
		textPizza.setForeground(Color.BLACK);
		textPizza.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPizza.setColumns(10);
		textPizza.setBounds(260, 128, 136, 34);
		panel_3.add(textPizza);
		
		JCheckBox donut = new JCheckBox("Smile Donut");
		donut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(donut.isSelected()) {
					textdonut.setEnabled(true);
					textdonut.setText("");
					textdonut.requestFocus();
				}
				else {
					textdonut.setEnabled(false);
					textdonut.setText("0");
				}
			}
		});
		donut.setBackground(Color.PINK);
		donut.setFont(new Font("Times New Roman", Font.BOLD, 18));
		donut.setBounds(10, 250, 215, 34);
		panel_3.add(donut);
		
		textdonut = new JTextField();
		textdonut.setText("0");
		textdonut.setHorizontalAlignment(SwingConstants.CENTER);
		textdonut.setForeground(Color.BLACK);
		textdonut.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textdonut.setColumns(10);
		textdonut.setBounds(260, 210, 136, 34);
		panel_3.add(textdonut);
		
		JCheckBox Muffin = new JCheckBox("Seoul Muffin");
		Muffin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Muffin.isSelected()) {
					textdonut.setEnabled(true);
					textdonut.setText("");
					textdonut.requestFocus();
				}
				else {
					textdonut.setEnabled(false);
					textdonut.setText("0");
				}
			}
		});
		Muffin.setBackground(Color.PINK);
		Muffin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Muffin.setBounds(10, 209, 215, 34);
		panel_3.add(Muffin);
		
		textMuffin = new JTextField();
		textMuffin.setText("0");
		textMuffin.setHorizontalAlignment(SwingConstants.CENTER);
		textMuffin.setForeground(Color.BLACK);
		textMuffin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textMuffin.setColumns(10);
		textMuffin.setBounds(260, 210, 136, 34);
		panel_3.add(textMuffin);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(Color.DARK_GRAY);
		panel_4.setBackground(Color.PINK);
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
		chckbxCard.setBackground(Color.PINK);
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
		chckbxCash.setBackground(Color.PINK);
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
		chckbxEwallet.setBackground(Color.PINK);
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
		
		textPizza = new JTextField();
		textPizza.setText("0");
		textPizza.setHorizontalAlignment(SwingConstants.CENTER);
		textPizza.setForeground(Color.BLACK);
		textPizza.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textPizza.setColumns(10);
		textPizza.setBounds(260, 169, 136, 34);
		panel_3.add(textPizza);
		
		textdonut = new JTextField();
		textdonut.setText("0");
		textdonut.setHorizontalAlignment(SwingConstants.CENTER);
		textdonut.setForeground(Color.BLACK);
		textdonut.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textdonut.setColumns(10);
		textdonut.setBounds(260, 250, 136, 34);
		panel_3.add(textdonut);
		
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
		btnPrint.setForeground(Color.DARK_GRAY);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnPrint.setBackground(Color.WHITE);
		btnPrint.setBounds(21, 11, 111, 43);
		panel_4_1_1.add(btnPrint);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) Color.DARK_GRAY));
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.PINK);
		panel_4_1.setBounds(108, 433, 343, 180);
		panel.add(panel_4_1);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(10, 126, 131, 43);
		panel_4_1.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaReceipt.setText("");
				textAreaReceipt.setEnabled(false);
				textHokkaidoCake.setEnabled(false);
				textCheeseBread.setEnabled(false);
				textCookies.setEnabled(false);
				textPizza.setEnabled(false);
				textMuffin.setEnabled(false);
				textdonut.setEnabled(false);
				
				textHokkaidoCake.setText("0");
				textCheeseBread.setText("0");
				textCookies.setText("0");
				textPizza.setText("0");
				textMuffin.setText("0");
				textdonut.setText("0");
				
				HokkaidoCake.setSelected(false);
				CheeseBread.setSelected(false);
				Cookies.setSelected(false);
				Pizza.setSelected(false);
				Muffin.setSelected(false);
				donut.setSelected(false);
				
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
		btnReset.setForeground(Color.DARK_GRAY);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnReset.setBackground(Color.WHITE);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemcost[0] = Double.parseDouble(textHokkaidoCake.getText())* 20.00;
				itemcost[1] = Double.parseDouble(textCheeseBread.getText())* 10.00;
				itemcost[2] = Double.parseDouble(textCookies.getText())* 11.00;
				itemcost[3] = Double.parseDouble(textPizza.getText())* 16.00;
				itemcost[4] = Double.parseDouble(textMuffin.getText())* 10.00;
				itemcost[5] = Double.parseDouble(textdonut.getText())* 5.00;
				
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
				  "\nBakery Indah"  +
						  "\n=========================================================================\t" + 
						  "\nCustomer Information" +
						  "\nFirstname:\t\t\t" + textFirstname.getText() + 
						  "\nSurname:\t\t\t" + textSurname.getText() + 
						  "\nEmail:\t\t\t" + textEmail.getText() + 
						  "\nMobile:\t\t\t" + textMobile.getText() + 
						  "\n=========================================================================\t" + 
						  "\nHokkaido Cake:\t\t\t" + textHokkaidoCake.getText() + 
						  "\nCheese Bread:\t\t\t" + textCheeseBread.getText() + 
						  "\nCookies:\t\t\t" + textCookies.getText() + 
						  "\nHawaian Pizza:\t\t\t" + textPizza.getText() + 
						  "\nSmile Donut:\t\t\t" + textdonut.getText() + 
						  "\nSeoul Muffin:\t\t\t" + textMuffin.getText() + 
						  
						  "\n=========================================================================\t" +
						  "\nPaid using:\t\t\t" + textpay.getText() +
						  "\nTax:\t\t\t" + tax +
						  "\nSubTotal:\t\t\t" + subtotal +
						  "\nTotal:\t\t\t" + total +
						  
						  "\nIf purchase more than RM 500.00:\t"+ discountedTotal +
						  "\n=========================================================================\t" + 
						  "\nDate: " + tDate.format(timer.getTime()) + 
						  		   "\t\tTime: " + tTime.format(timer.getTime())+
					"\n\n\tThank you for your Visiting to Bakery Indah."
						  		   );
				  }
		});
		btnTotal.setBounds(232, 126, 101, 43);
		
		panel_4_1.add(btnTotal);
		btnTotal.setForeground(Color.DARK_GRAY);
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnTotal.setBackground(Color.WHITE);
		
	
		}
}
