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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Admin extends JFrame{

	protected JFrame Admin;
	private JTextField UsernameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					window.Admin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Admin = new JFrame();
		Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Admin.getContentPane().setForeground(Color.WHITE);
		Admin.getContentPane().setBackground(SystemColor.controlHighlight);
		Admin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(221, 160, 221)));
		panel.setBackground(new Color(253, 245, 230));
		panel.setBounds(10, 10, 1142, 678);
		Admin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(20, 25, 100, 45);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login_PreparedFood().PreparedFood_Cover.setVisible(true);
				Admin.dispose();
			}
		});
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnBack.setBackground(new Color(187, 134, 252));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(238, 130, 238));
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(221, 160, 221)));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(0, 0, 1145, 180);
		panel.add(panel_1);
		
		JLabel lblGroceryStore = new JLabel("Grocery Store");
		lblGroceryStore.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroceryStore.setForeground(Color.WHITE);
		lblGroceryStore.setFont(new Font("Nirmala UI", Font.BOLD, 40));
		lblGroceryStore.setBounds(364, 66, 384, 61);
		panel_1.add(lblGroceryStore);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Admin.class.getResource("/Image/pngtree-purple-geometric-flattened-taobao-e-commerce-coupon-background-image_262552.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1145, 180);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(262, 201, 615, 425);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setForeground(new Color(187, 134, 252));
		lblAdminLogin.setFont(new Font("Nirmala UI", Font.BOLD, 40));
		lblAdminLogin.setBounds(127, 28, 361, 61);
		panel_2.add(lblAdminLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setForeground(new Color(187, 134, 252));
		lblUsername.setFont(new Font("Roboto", Font.BOLD, 25));
		lblUsername.setBounds(90, 115, 291, 38);
		panel_2.add(lblUsername);
		
		UsernameTextField = new JTextField();
		UsernameTextField.setForeground(new Color(169, 169, 169));
		UsernameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		UsernameTextField.setColumns(10);
		UsernameTextField.setBounds(90, 161, 417, 38);
		panel_2.add(UsernameTextField);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setForeground(new Color(187, 134, 252));
		lblPassword.setFont(new Font("Roboto", Font.BOLD, 25));
		lblPassword.setBounds(90, 222, 291, 38);
		panel_2.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(169, 169, 169));
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		passwordField.setBounds(90, 259, 417, 38);
		panel_2.add(passwordField);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
					
					if(UsernameTextField.getText().equals("admin") && passwordField.getText().equals("admin")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");

						new CompanyBackground().Company.setVisible(true);//calling another frame/window
						Admin.dispose();
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right user name and password", "Admin Login", JOptionPane.ERROR_MESSAGE);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and password", "Admin Login", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Roboto", Font.PLAIN, 24));
		btnLogin.setBackground(new Color(187, 134, 252));
		btnLogin.setBounds(90, 342, 417, 43);
		panel_2.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Admin.class.getResource("/Image/username.png")));
		lblNewLabel.setBounds(40, 161, 40, 40);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Admin.class.getResource("/Image/password.png")));
		lblNewLabel_1.setBounds(40, 259, 40, 40);
		panel_2.add(lblNewLabel_1);
		
		Admin.setBounds(100, 100, 1179, 747);
		Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
