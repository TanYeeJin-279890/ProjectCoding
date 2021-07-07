package GroceryStore_PreparedFood;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

public class Sales extends JFrame{

	protected JFrame Sales;
	private JTextField txtFrozenPizza;
	private JTextField txtFishFillet;
	private JTextField txtSausage;
	private JTextField txtTotalPrice;
	private JTextField txtGrandTotal;
	private JTextField txtDeliveryCost;
	private JCheckBox chckbxDelivery;

	private JTextField txtDistance;
	private static double totalSales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales window = new Sales();
					window.Sales.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sales() {
		initialize();
	}

	/**
	 * Initialize the contents of the Sales.
	 */
	private void initialize() {
		Sales = new JFrame();
		Sales.setBounds(100, 100, 1141, 719);
		Sales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Sales.getContentPane().setForeground(Color.WHITE);
		Sales.getContentPane().setBackground(SystemColor.controlHighlight);
		Sales.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1122, 678);
		panel.setLayout(null);
		panel.setForeground(new Color(255, 228, 225));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel.setBackground(new Color(255, 228, 225));
		Sales.getContentPane().add(panel);

		JLabel lblSales = new JLabel("Purchase");
		lblSales.setBackground(new Color(51, 255, 255));
		lblSales.setHorizontalAlignment(SwingConstants.CENTER);
		lblSales.setForeground(new Color(102, 51, 255));
		lblSales.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblSales.setBounds(32, 80, 406, 43);
		panel.add(lblSales);

		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(102, 51, 255));
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(629, 120, 376, 534);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_4_1_1.setBackground(new Color(255, 228, 225));
		panel_4_1_1.setBounds(10, 462, 356, 62);
		panel_2.add(panel_4_1_1);

		JTextArea Receipt = new JTextArea();
		Receipt.setBounds(10, 11, 356, 440);
		panel_2.add(Receipt);

		JLabel lblReceipt = new JLabel("Receipt");
		lblReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceipt.setForeground(new Color(102, 51, 255));
		lblReceipt.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblReceipt.setBounds(758, 80, 121, 43);
		panel.add(lblReceipt);

		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(106, 90, 205));
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(32, 120, 406, 353);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantity.setForeground(new Color(102, 51, 255));
		lblQuantity.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblQuantity.setBounds(260, 20, 136, 35);
		panel_3.add(lblQuantity);

		JCheckBox chckbxFrozenPizza = new JCheckBox("Frozen Pizza");
		chckbxFrozenPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxFrozenPizza.isSelected()) {
					txtFrozenPizza.setEnabled(true);
					txtFrozenPizza.setText("");
					txtFrozenPizza.requestFocus();
				} else {
					txtFrozenPizza.setEnabled(false);
					txtFrozenPizza.setText("0");
				}
			}
		});
		chckbxFrozenPizza.setBackground(new Color(255, 228, 225));
		chckbxFrozenPizza.setFont(new Font("Times New Roman", Font.BOLD, 18));
		chckbxFrozenPizza.setBounds(20, 50, 215, 34);
		panel_3.add(chckbxFrozenPizza);

		txtFrozenPizza = new JTextField();
		txtFrozenPizza.setText("0");
		txtFrozenPizza.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrozenPizza.setForeground(Color.BLACK);
		txtFrozenPizza.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtFrozenPizza.setColumns(10);
		txtFrozenPizza.setBounds(260, 50, 136, 34);
		panel_3.add(txtFrozenPizza);

		JCheckBox chckbxFishFillet = new JCheckBox("Fish Fillet");
		chckbxFishFillet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxFishFillet.isSelected()) {
					txtFishFillet.setEnabled(true);
					txtFishFillet.setText("");
					txtFishFillet.requestFocus();
				} else {
					txtFishFillet.setEnabled(false);
					txtFishFillet.setText("0");
				}
			}
		});
		chckbxFishFillet.setBackground(new Color(255, 228, 225));
		chckbxFishFillet.setFont(new Font("Times New Roman", Font.BOLD, 18));
		chckbxFishFillet.setBounds(20, 90, 215, 34);
		panel_3.add(chckbxFishFillet);

		txtFishFillet = new JTextField();
		txtFishFillet.setText("0");
		txtFishFillet.setHorizontalAlignment(SwingConstants.CENTER);
		txtFishFillet.setForeground(Color.BLACK);
		txtFishFillet.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtFishFillet.setColumns(10);
		txtFishFillet.setBounds(260, 90, 136, 34);
		panel_3.add(txtFishFillet);

		JCheckBox chckbxSausage = new JCheckBox("Sausage");
		chckbxSausage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSausage.isSelected()) {
					txtSausage.setEnabled(true);
					txtSausage.setText("");
					txtSausage.requestFocus();
				} else {
					txtSausage.setEnabled(false);
					txtSausage.setText("0");
				}
			}
		});
		chckbxSausage.setBackground(new Color(255, 228, 225));
		chckbxSausage.setFont(new Font("Times New Roman", Font.BOLD, 18));
		chckbxSausage.setBounds(20, 130, 215, 34);
		panel_3.add(chckbxSausage);

		txtSausage = new JTextField();
		txtSausage.setText("0");
		txtSausage.setHorizontalAlignment(SwingConstants.CENTER);
		txtSausage.setForeground(Color.BLACK);
		txtSausage.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtSausage.setColumns(10);
		txtSausage.setBounds(260, 130, 136, 34);
		panel_3.add(txtSausage);

		JLabel lblDelivery = new JLabel("Delivery");
		lblDelivery.setForeground(new Color(102, 51, 255));
		lblDelivery.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblDelivery.setBounds(20, 190, 159, 35);
		panel_3.add(lblDelivery);

		chckbxDelivery = new JCheckBox("Delivery");
		chckbxDelivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxDelivery.isSelected()) {
					txtDistance.setEnabled(true);
					txtDistance.setText("");
					txtDistance.requestFocus();
				} else {
					txtDistance.setEnabled(false);
					txtDistance.setText("0");
				}
			}
		});
		chckbxDelivery.setFont(new Font("Times New Roman", Font.BOLD, 18));
		chckbxDelivery.setBackground(new Color(255, 228, 225));
		chckbxDelivery.setBounds(20, 220, 215, 34);
		panel_3.add(chckbxDelivery);

		JLabel lblDistance = new JLabel("Distance");
		lblDistance.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistance.setForeground(new Color(102, 51, 255));
		lblDistance.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblDistance.setBounds(260, 190, 136, 35);
		panel_3.add(lblDistance);

		txtDistance = new JTextField();
		txtDistance.setText("0");
		txtDistance.setHorizontalAlignment(SwingConstants.CENTER);
		txtDistance.setForeground(Color.BLACK);
		txtDistance.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtDistance.setColumns(10);
		txtDistance.setBounds(260, 220, 136, 34);
		panel_3.add(txtDistance);

		JLabel lblItem = new JLabel("Item");
		lblItem.setForeground(new Color(102, 51, 255));
		lblItem.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblItem.setBounds(20, 20, 159, 35);
		panel_3.add(lblItem);

		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_4_1.setBackground(new Color(255, 228, 225));
		panel_4_1.setBounds(10, 278, 386, 65);
		panel_3.add(panel_4_1);

		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setBounds(225, 10, 120, 45);
		panel_4_1.add(btnTotal);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double totalPrice = Double.parseDouble(txtFrozenPizza.getText()) * 12.0
						+ Double.parseDouble(txtFishFillet.getText()) * 4.0
						+ Double.parseDouble(txtSausage.getText()) * 7.0;
				double deliveryCost = Double.parseDouble(txtDistance.getText()) * 0.8;
				double grandTotal = totalPrice + deliveryCost;
				totalSales = grandTotal;

				txtTotalPrice.setText(String.format("RM %.2f", totalPrice));
				txtDeliveryCost.setText(String.format("RM %.2f", deliveryCost));
				txtGrandTotal.setText(String.format("RM %.2f", grandTotal));
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("dd:MMM:yyyy");
				tDate.format(timer.getTime());
				// =========================================================================
				Receipt.setText("====================-Receipt====================\n" + CompanyBackground.getStoreName()
						+ "\nPhone No.\t: " + CompanyBackground.getPhoneNo() + "\nAddress\t: " + CompanyBackground.getAddress()
						+ "\n=========================================================================\t"
						+ "\nFrozen Pizza\t\t\t: RM12.00 * " + txtFrozenPizza.getText()
						+ "\nFish Fillet\t\t\t: RM4.00 * " + txtFishFillet.getText() + "\nSausage\t\t\t: RM7.00 * "
						+ txtSausage.getText()
						+ "\n=========================================================================\t"
						+ "\nTotal Price\t\t\t: " + String.format("RM%.2f", totalPrice) + "\nDelivery Cost\t\t\t: "
						+ String.format("RM%.2f", deliveryCost) + "\nGrand Total\t\t\t: "
						+ String.format("RM%.2f", grandTotal)
						+ "\n=========================================================================\t" + "\nDate: "
						+ tDate.format(timer.getTime()) + "\t\tTime: " + tTime.format(timer.getTime())
						+ "\n\n\tThank you! Please come again!");
			}
		});
		btnTotal.setForeground(Color.BLACK);
		btnTotal.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnTotal.setBackground(new Color(187, 134, 252));

		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(40, 10, 120, 45);
		panel_4_1.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receipt.setText("");
				Receipt.setEnabled(false);

				txtFrozenPizza.setText("0");
				txtFishFillet.setText("0");
				txtSausage.setText("0");
				txtDistance.setText("0");
				chckbxFrozenPizza.setSelected(false);
				chckbxFishFillet.setSelected(false);
				chckbxSausage.setSelected(false);
				chckbxDelivery.setSelected(false);

				txtTotalPrice.setText("");
				txtGrandTotal.setText("");
				txtDeliveryCost.setText("");
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnReset.setBackground(new Color(187, 134, 252));

		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Receipt.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnPrint.setBackground(new Color(187, 134, 252));
		btnPrint.setBounds(131, 10, 100, 45);
		panel_4_1_1.add(btnPrint);

		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(20, 25, 100, 45);
		panel.add(btnBack);
		btnBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Customer().Customer.setVisible(true);
				Sales.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnBack.setBackground(new Color(187, 134, 252));

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(32, 523, 406, 131);
		panel.add(panel_4);
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_4.setBackground(new Color(255, 228, 225));
		panel_4.setLayout(null);

		JLabel lblTotalPrice = new JLabel("Total Price");
		lblTotalPrice.setForeground(new Color(187, 134, 252));
		lblTotalPrice.setFont(new Font("Roboto", Font.BOLD, 22));
		lblTotalPrice.setBounds(10, 15, 170, 24);
		panel_4.add(lblTotalPrice);

		txtTotalPrice = new JTextField();
		txtTotalPrice.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalPrice.setForeground(Color.BLACK);
		txtTotalPrice.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtTotalPrice.setColumns(10);
		txtTotalPrice.setBounds(190, 11, 186, 34);
		panel_4.add(txtTotalPrice);

		JLabel lblDeliveryCost = new JLabel("Delivery Cost");
		lblDeliveryCost.setForeground(new Color(187, 134, 252));
		lblDeliveryCost.setFont(new Font("Roboto", Font.BOLD, 22));
		lblDeliveryCost.setBounds(10, 54, 170, 24);
		panel_4.add(lblDeliveryCost);

		txtDeliveryCost = new JTextField();
		txtDeliveryCost.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeliveryCost.setForeground(Color.BLACK);
		txtDeliveryCost.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtDeliveryCost.setColumns(10);
		txtDeliveryCost.setBounds(190, 50, 186, 34);
		panel_4.add(txtDeliveryCost);

		JLabel lblGrandTotal = new JLabel("Grand Total");
		lblGrandTotal.setBounds(10, 93, 170, 24);
		panel_4.add(lblGrandTotal);
		lblGrandTotal.setForeground(new Color(187, 134, 252));
		lblGrandTotal.setFont(new Font("Roboto", Font.BOLD, 22));

		txtGrandTotal = new JTextField();
		txtGrandTotal.setBounds(190, 89, 186, 34);
		panel_4.add(txtGrandTotal);
		txtGrandTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtGrandTotal.setForeground(Color.BLACK);
		txtGrandTotal.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtGrandTotal.setColumns(10);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setForeground(new Color(102, 51, 255));
		lblTotal.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblTotal.setBackground(new Color(187, 134, 252));
		lblTotal.setBounds(168, 480, 121, 43);
		panel.add(lblTotal);
		
		JLabel lblSales_1 = new JLabel("Sales");
		lblSales_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSales_1.setForeground(new Color(102, 51, 255));
		lblSales_1.setFont(new Font("Nirmala UI", Font.BOLD, 40));
		lblSales_1.setBackground(new Color(51, 255, 255));
		lblSales_1.setBounds(505, 10, 121, 43);
		panel.add(lblSales_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Sales.class.getResource("/Image/Sales.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(435, 10, 60, 60);
		panel.add(lblNewLabel);
	}

	public static double getTotalSales() { //encapsulation
		return totalSales;
	}
	
}
