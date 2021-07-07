package GroceryStore_Beverages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminPage extends JFrame {//inheritance

	protected JFrame AdminPage;
	private JTextField txtUserName;
	private JTextField txtPassword;
	protected JLabel lblNewLabel;
	protected JLabel Address1;
	protected JLabel Address2;
	protected JLabel Address3;
	protected JLabel telph;
	protected JLabel lblBeveragesStore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
					window.AdminPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AdminPage = new JFrame();
		AdminPage.getContentPane().setForeground(Color.WHITE);
		AdminPage.getContentPane().setBackground(SystemColor.controlHighlight);
		AdminPage.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(148, 0, 211)));
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(10, 11, 1145, 616);
		AdminPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel BeveragesStoreLabel = new JLabel("Welcome Admin");
		BeveragesStoreLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminPage = new JFrame();  //Action for Exit Button
				if (JOptionPane.showConfirmDialog(AdminPage, "Confirm if you want to exit", "Login", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		BeveragesStoreLabel.setForeground(new Color(148, 0, 211));
		BeveragesStoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		BeveragesStoreLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		BeveragesStoreLabel.setBounds(497, 11, 584, 61);
		panel.add(BeveragesStoreLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(148, 0, 211)));
		panel_1.setBackground(new Color(148, 0, 211));
		panel_1.setBounds(0, 0, 435, 678);
		panel.add(panel_1);
		
		JLabel shoppingCart = new JLabel("");
		shoppingCart.setIcon(new ImageIcon(AdminPage.class.getResource("/GroceryStore_BeveragesImage/cart-icon.png")));
		shoppingCart.setBounds(72, 32, 273, 256);
		panel_1.add(shoppingCart);
		
		Address1 = new JLabel("NO50,Jln LP1,\r\nTaman Limbongan Permai,");
		Address1.setForeground(new Color(255, 204, 255));
		Address1.setFont(new Font("STXinwei", Font.BOLD, 18));
		Address1.setBounds(8, 438, 417, 30);
		panel_1.add(Address1);
		
		Address3 = new JLabel("Melaka");
		Address3.setForeground(new Color(255, 204, 255));
		Address3.setFont(new Font("STXinwei", Font.BOLD, 18));
		Address3.setBounds(70, 467, 68, 30);
		panel_1.add(Address3);
		
		telph = new JLabel("03-2888588");
		telph.setForeground(new Color(255, 204, 255));
		telph.setFont(new Font("STXinwei", Font.BOLD, 18));
		telph.setBounds(8, 508, 120, 30);
		panel_1.add(telph);
		
		lblBeveragesStore = new JLabel("Beverages Store");
		lblBeveragesStore.setHorizontalAlignment(SwingConstants.CENTER);
		lblBeveragesStore.setForeground(new Color(255, 204, 255));
		lblBeveragesStore.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblBeveragesStore.setBounds(24, 275, 384, 61);
		panel_1.add(lblBeveragesStore);
		
		Address2 = new JLabel("75200");
		Address2.setForeground(new Color(255, 204, 255));
		Address2.setFont(new Font("STXinwei", Font.BOLD, 18));
		Address2.setBounds(10, 467, 63, 30);
		panel_1.add(Address2);
		
		JLabel Login = new JLabel("Login");
		Login.setBounds(647, 64, 291, 61);
		panel.add(Login);
		Login.setHorizontalAlignment(SwingConstants.CENTER);
		Login.setForeground(new Color(148, 0, 211));
		Login.setFont(new Font("Times New Roman", Font.BOLD, 29));
		
		txtUserName = new JTextField();
		txtUserName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "Flamingo";
				txtUserName.setText(userName);
			}
		});
			
		txtUserName.setForeground(new Color(169, 169, 169));
		txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserName.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtUserName.setText("**** User Name ****");
		txtUserName.setBounds(703, 409, 417, 38);
		panel.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = "abgh1234";
				txtPassword.setText(password);
			}
		});
		txtPassword.setText("**** Password ****");
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setForeground(new Color(169, 169, 169));
		txtPassword.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtPassword.setColumns(10);
		txtPassword.setBounds(703, 482, 417, 38);
		panel.add(txtPassword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setForeground(new Color(148, 0, 211));
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblUsername.setBounds(445, 409, 291, 38);
		panel.add(lblUsername);
		
		JLabel Password = new JLabel("Password");
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setForeground(new Color(148, 0, 211));
		Password.setFont(new Font("Times New Roman", Font.BOLD, 29));
		Password.setBounds(445, 478, 291, 38);
		panel.add(Password);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(txtUserName.getText().equals("Flamingo") && txtPassword.getText().equals("abgh1234")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");

						new EmployeeManagement().em.setVisible(true);//calling another frame/window
						AdminPage.dispose();
					
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
				}
			}
		});
		LoginButton.setBackground(new Color(148, 0, 211));
		LoginButton.setForeground(new Color(255, 255, 255));
		LoginButton.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		LoginButton.setBounds(703, 557, 147, 45);
		panel.add(LoginButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUserName.setText("");
				txtPassword.setText("");
			}
		});
		btnClear.setBackground(new Color(148, 0, 211));
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		btnClear.setBounds(973, 557, 147, 45);
		panel.add(btnClear);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AdminPage.class.getResource("/GroceryStore_BeveragesImage/Admin.png")));
		lblNewLabel_1.setBounds(670, 118, 256, 280);
		panel.add(lblNewLabel_1);
		AdminPage.setBounds(100, 100, 1179, 672);
		AdminPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
