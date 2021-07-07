package GroceryStore_FruitsAndVege;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {		//User-defined class

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textFieldUsername;
	private JTextField textFieldEmail;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1306, 754);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 255, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1292, 717);
		contentPane.add(panel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Rockwell", Font.PLAIN, 40));
		lblUsername.setBounds(216, 157, 223, 48);
		panel.add(lblUsername);
		
		JLabel lblemail = new JLabel("Email");
		lblemail.setFont(new Font("Rockwell", Font.PLAIN, 40));
		lblemail.setBounds(216, 276, 223, 48);
		panel.add(lblemail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Rockwell", Font.PLAIN, 40));
		lblPassword.setBounds(216, 407, 199, 48);
		panel.add(lblPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Rockwell", Font.PLAIN, 40));
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(468, 168, 427, 48);
		panel.add(textFieldUsername);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Rockwell", Font.PLAIN, 40));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(468, 276, 427, 48);
		panel.add(textFieldEmail);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setFont(new Font("Rockwell", Font.PLAIN, 40));
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(468, 407, 427, 48);
		panel.add(textFieldPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(textFieldUsername.getText().equals("Admin") && textFieldEmail.getText().equals("Admin123@gmail.com") && textFieldPassword.getText().equals("diy123")) { //Condition and action for success login
						JOptionPane.showMessageDialog(null, "Login Succesful");
						
						//RegistrationSystem RegSys = new RegistrationSystem(); //calling another frame/window
							AdminMenu a = new AdminMenu();
							a.setModalExclusionType(null);
				            a.setVisible(true);
				            dispose(); //login frame will disappear
					}else  //Action for failed login
						JOptionPane.showMessageDialog(null, "Login Failed! Please enter the right user name and pswd");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and pswd");
				}
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnLogin.setBackground(Color.YELLOW);
		btnLogin.setBounds(276, 534, 265, 60);
		panel.add(btnLogin);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblLogin.setBounds(499, 43, 223, 48);
		panel.add(lblLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();  //Action for Exit Button
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Login", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					Home a = new Home();
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnExit.setBackground(Color.YELLOW);
		btnExit.setBounds(604, 534, 265, 60);
		panel.add(btnExit);
	}
}
