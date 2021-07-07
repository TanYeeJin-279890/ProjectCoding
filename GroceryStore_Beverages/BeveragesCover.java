package GroceryStore_Beverages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import GroceryStoreMainPage.GroceryStoreMainPage;
import GroceryStore_PreparedFood.Admin;

import javax.swing.JProgressBar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BeveragesCover extends JFrame {

	public JFrame BeveragesCover;
	protected JLabel lblNewLabel;
	protected JLabel Address1;
	protected JLabel Address2;
	protected JLabel Address3;
	protected JLabel telph;
	protected JLabel lblshopName;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BeveragesCover window = new BeveragesCover();
					window.BeveragesCover.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BeveragesCover() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BeveragesCover = new JFrame();
		BeveragesCover.setBounds(100, 100, 1162, 677);
		BeveragesCover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BeveragesCover.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(148, 0, 211));
		panel.setBounds(10, 11, 1128, 611);
		BeveragesCover.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblshopName = new JLabel("Beverages Store");
		lblshopName.setHorizontalAlignment(SwingConstants.CENTER);
		lblshopName.setForeground(new Color(255, 204, 255));
		lblshopName.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblshopName.setBounds(398, 11, 323, 111);
		panel.add(lblshopName);
		
		JLabel UserType = new JLabel("Select User Type");
		UserType.setHorizontalAlignment(SwingConstants.CENTER);
		UserType.setForeground(new Color(255, 204, 255));
		UserType.setFont(new Font("Rockwell", Font.BOLD, 40));
		UserType.setBounds(364, 313, 394, 111);
		panel.add(UserType);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BillingSystem().BillingSystem.setVisible(true);
				BeveragesCover.dispose();
			}
		});
		btnCustomer.setBackground(new Color(255, 204, 255));
		btnCustomer.setForeground(new Color(148, 0, 211));
		btnCustomer.setFont(new Font("STXinwei", Font.BOLD, 29));
		btnCustomer.setBounds(284, 467, 193, 60);
		panel.add(btnCustomer);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdminPage().AdminPage.setVisible(true);
				BeveragesCover.dispose();
			}
		});
		btnAdmin.setForeground(new Color(148, 0, 211));
		btnAdmin.setFont(new Font("STXinwei", Font.BOLD, 29));
		btnAdmin.setBackground(new Color(255, 204, 255));
		btnAdmin.setBounds(632, 467, 193, 60);
		panel.add(btnAdmin);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(BeveragesCover.class.getResource("/GroceryStore_BeveragesImage/cart-icon.png")));
		lblNewLabel.setBounds(437, 57, 262, 270);
		panel.add(lblNewLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GroceryStoreMainPage().Mainframe.setVisible(true);
				BeveragesCover.dispose();
			}
		});
		btnBack.setForeground(new Color(148, 0, 211));
		btnBack.setFont(new Font("STXinwei", Font.BOLD, 29));
		btnBack.setBackground(new Color(255, 204, 255));
		btnBack.setBounds(925, 529, 193, 60);
		panel.add(btnBack);
		
		Address1 = new JLabel("NO50,Jln LP1,\r\nTaman Limbongan Permai,");
		Address1.setForeground(new Color(255, 204, 255));
		Address1.setFont(new Font("STXinwei", Font.BOLD, 18));
		Address1.setBounds(0, 11, 417, 30);
		panel.add(Address1);
		
		Address2 = new JLabel("75200");
		Address2.setForeground(new Color(255, 204, 255));
		Address2.setFont(new Font("STXinwei", Font.BOLD, 18));
		Address2.setBounds(2, 40, 63, 30);
		panel.add(Address2);
		
		telph = new JLabel("03-2888588");
		telph.setForeground(new Color(255, 204, 255));
		telph.setFont(new Font("STXinwei", Font.BOLD, 18));
		telph.setBounds(0, 81, 120, 30);
		panel.add(telph);
		
		Address3 = new JLabel("Melaka");
		Address3.setForeground(new Color(255, 204, 255));
		Address3.setFont(new Font("STXinwei", Font.BOLD, 18));
		Address3.setBounds(62, 40, 68, 30);
		panel.add(Address3);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(BeveragesCover.class.getResource("/GroceryStore_BeveragesImage/pngtree-watercolor-light-purple-e-commerce-taobao-banner-background-image_181316.jpg")));
		lblNewLabel_1.setBounds(0, 108, 564, 194);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(BeveragesCover.class.getResource("/GroceryStore_BeveragesImage/pngtree-watercolor-light-purple-e-commerce-taobao-banner-background-image_181316.jpg")));
		lblNewLabel_2.setBounds(284, 108, 843, 194);
		panel.add(lblNewLabel_2);
	}
}
