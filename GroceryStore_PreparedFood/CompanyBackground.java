package GroceryStore_PreparedFood;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class CompanyBackground extends JFrame {

	protected JFrame Company;
	private JTextField txtStoreName;
	private JTextField txtPhoneNo;
	private JTextField txtBusinessHours;
	private JTextArea txtrAddress;
	static String storeName, phoneNo, address, businessHours;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyBackground window = new CompanyBackground();
					window.Company.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CompanyBackground() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Company = new JFrame();
		Company.setBounds(100, 100, 1156, 738);
		Company.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Company.getContentPane().setForeground(Color.WHITE);
		Company.getContentPane().setBackground(SystemColor.controlHighlight);
		Company.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(0, 0, 1142, 678);
		Company.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblGroceryStore = new JLabel("Grocery Store");
		lblGroceryStore.setForeground(new Color(187, 134, 252));
		lblGroceryStore.setFont(new Font("Nirmala UI", Font.BOLD, 40));
		lblGroceryStore.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroceryStore.setBounds(442, 25, 300, 60);
		panel.add(lblGroceryStore);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(40, 106, 1041, 486);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 1041, 117);
		panel_1.add(panel_3);
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setLayout(null);

		JLabel lblCompanyBackground = new JLabel("Company Background");
		lblCompanyBackground.setBounds(333, 24, 365, 50);
		panel_3.add(lblCompanyBackground);
		lblCompanyBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyBackground.setForeground(Color.WHITE);
		lblCompanyBackground.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(CompanyBackground.class.getResource("/Image/pngtree-purple-geometric-flattened-taobao-e-commerce-coupon-background-image_262552.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1041, 117);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblStoreName = new JLabel("Store Name:");
		lblStoreName.setForeground(new Color(187, 134, 252));
		lblStoreName.setFont(new Font("Roboto", Font.BOLD, 22));
		lblStoreName.setBounds(310, 145, 170, 30);
		panel_1.add(lblStoreName);
		
		txtStoreName = new JTextField();
		txtStoreName.setText("Grocery Store");
		txtStoreName.setHorizontalAlignment(SwingConstants.LEFT);
		txtStoreName.setForeground(Color.BLACK);
		txtStoreName.setFont(new Font("Roboto", Font.PLAIN, 18));
		txtStoreName.setColumns(10);
		txtStoreName.setBounds(490, 145, 200, 30);
		panel_1.add(txtStoreName);
		
		JLabel lblPhoneNo = new JLabel("Phone No. :");
		lblPhoneNo.setForeground(new Color(187, 134, 252));
		lblPhoneNo.setFont(new Font("Roboto", Font.BOLD, 22));
		lblPhoneNo.setBounds(310, 220, 170, 30);
		panel_1.add(lblPhoneNo);
		
		txtPhoneNo = new JTextField();
		txtPhoneNo.setText("03-32917028");
		txtPhoneNo.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhoneNo.setForeground(Color.BLACK);
		txtPhoneNo.setFont(new Font("Roboto", Font.PLAIN, 18));
		txtPhoneNo.setColumns(10);
		txtPhoneNo.setBounds(490, 220, 200, 30);
		panel_1.add(txtPhoneNo);
		
		JLabel lblBusinessHours = new JLabel("Business Hours:");
		lblBusinessHours.setForeground(new Color(187, 134, 252));
		lblBusinessHours.setFont(new Font("Roboto", Font.BOLD, 22));
		lblBusinessHours.setBounds(310, 390, 170, 30);
		panel_1.add(lblBusinessHours);
		
		txtBusinessHours = new JTextField();
		txtBusinessHours.setText("10 a.m to 8 p.m.");
		txtBusinessHours.setHorizontalAlignment(SwingConstants.LEFT);
		txtBusinessHours.setForeground(Color.BLACK);
		txtBusinessHours.setFont(new Font("Roboto", Font.PLAIN, 18));
		txtBusinessHours.setColumns(10);
		txtBusinessHours.setBounds(490, 390, 200, 30);
		panel_1.add(txtBusinessHours);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(new Color(187, 134, 252));
		lblAddress.setFont(new Font("Roboto", Font.BOLD, 22));
		lblAddress.setBounds(310, 295, 170, 30);
		panel_1.add(lblAddress);
		
		txtrAddress = new JTextArea();
		txtrAddress.setFont(new Font("Roboto", Font.PLAIN, 18));
		txtrAddress.setText("87, Jalan Meru 12,\r\nTaman Gembira,\r\n41050 Klang, Selangor.");
		txtrAddress.setBounds(490, 295, 200, 70);
		panel_1.add(txtrAddress);

		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(20, 25, 100, 45);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin().Admin.setVisible(true);
				Company.dispose();
			}
		});
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnBack.setBackground(new Color(187, 134, 252));
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(CompanyBackground.class.getResource("/Image/kissclipart-grocery-icon-clipart-grocery-store-computer-icons-e11cd0909e9f5cbe.png")));
		lblNewLabel.setBounds(388, 25, 60, 60);
		panel.add(lblNewLabel);

		JMenuBar menuBar = new JMenuBar();
		Company.setJMenuBar(menuBar);

		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);

		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CompanyBackground().Company.setVisible(true);// calling another frame/window
				Company.dispose();
			}
		});
		mnHome.add(mntmAboutUs);

		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);

		JMenuItem mntmEmployeeManagement = new JMenuItem("Employee Management");
		mntmEmployeeManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Employee().Employee.setVisible(true);// calling another frame/window
				Company.dispose();
			}
		});
		mnEmployee.add(mntmEmployeeManagement);

		JMenu mnFinance = new JMenu("Finance");
		menuBar.add(mnFinance);

		JMenuItem mntmFinanceReport = new JMenuItem("Finance Report");
		mntmFinanceReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Finance().Finance.setVisible(true);// calling another frame/window
				Company.dispose();
			}
		});
		mnFinance.add(mntmFinanceReport);

		JMenu mnInventory = new JMenu("Inventory");
		menuBar.add(mnInventory);

		JMenuItem mntmInventoryManagement = new JMenuItem("Inventory Management");
		mntmInventoryManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Inventory().Inventory.setVisible(true);// calling another frame/window
				Company.dispose();
			}
		});
		mnInventory.add(mntmInventoryManagement);
		
		storeName = txtStoreName.getText();
		phoneNo = txtPhoneNo.getText();
		address = txtrAddress.getText();
		businessHours = txtBusinessHours.getText();
	}
	
	public static String getStoreName() {
		return storeName;
	}
	
	public static String getPhoneNo() {
		return phoneNo;
	}
	
	public static String getAddress() {
		return address;
	}
	
	public static String getBusinessHours() {
		return businessHours;
	}
}
