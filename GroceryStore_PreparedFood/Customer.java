package GroceryStore_PreparedFood;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Customer extends JFrame{

	protected JFrame Customer;
	private JTextField txtName;
	private JTextField txtPhoneNo;
	private JTextField txtAge;
	private JTextField txtAddress;
	private JButton btnBack;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer window = new Customer();
					window.Customer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Customer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Customer = new JFrame();
		Customer.setBounds(100, 100, 1156, 715);
		Customer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Customer.getContentPane().setForeground(Color.WHITE);
		Customer.getContentPane().setBackground(SystemColor.controlHighlight);
		Customer.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(0, 0, 1142, 678);
		Customer.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblCustomerRegistration = new JLabel("Customer Registration");
		lblCustomerRegistration.setForeground(new Color(187, 134, 252));
		lblCustomerRegistration.setFont(new Font("Nirmala UI", Font.BOLD, 40));
		lblCustomerRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerRegistration.setBounds(338, 25, 516, 60);
		panel.add(lblCustomerRegistration);

		btnBack = new JButton("BACK");
		btnBack.setBounds(20, 25, 100, 43);
		panel.add(btnBack);
		btnBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Login_PreparedFood().PreparedFood_Cover.setVisible(true);
				Customer.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnBack.setBackground(new Color(187, 134, 252));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_1.setBackground(new Color(187, 134, 252));
		panel_1.setBounds(40, 145, 385, 410);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(20, 20, 365, 21);
		panel_1.add(lblName);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setFont(new Font("Roboto", Font.BOLD, 20));

		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.LEFT);
		lblAge.setForeground(new Color(0, 0, 0));
		lblAge.setFont(new Font("Roboto", Font.BOLD, 20));
		lblAge.setBounds(20, 100, 365, 21);
		panel_1.add(lblAge);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setForeground(new Color(0, 0, 0));
		lblGender.setFont(new Font("Roboto", Font.BOLD, 20));
		lblGender.setBounds(20, 180, 365, 29);
		panel_1.add(lblGender);

		JLabel lblPhoneNo = new JLabel("Phone No.");
		lblPhoneNo.setBounds(20, 260, 365, 21);
		panel_1.add(lblPhoneNo);
		lblPhoneNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNo.setForeground(new Color(0, 0, 0));
		lblPhoneNo.setFont(new Font("Roboto", Font.BOLD, 20));

		JLabel lblSalary = new JLabel("Address");
		lblSalary.setBounds(20, 330, 365, 21);
		panel_1.add(lblSalary);
		lblSalary.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalary.setForeground(new Color(0, 0, 0));
		lblSalary.setFont(new Font("Roboto", Font.BOLD, 20));

		txtName = new JTextField();
		txtName.setForeground(Color.BLACK);
		txtName.setHorizontalAlignment(SwingConstants.LEFT);
		txtName.setFont(new Font("Roboto", Font.PLAIN, 20));
		txtName.setColumns(10);
		txtName.setBounds(20, 50, 345, 29);
		panel_1.add(txtName);

		txtAge = new JTextField();
		txtAge.setForeground(Color.BLACK);
		txtAge.setHorizontalAlignment(SwingConstants.LEFT);
		txtAge.setFont(new Font("Roboto", Font.PLAIN, 20));
		txtAge.setColumns(10);
		txtAge.setBounds(20, 130, 345, 29);
		panel_1.add(txtAge);

		JComboBox GendercomboBox = new JComboBox();
		GendercomboBox.setFont(new Font("Roboto", Font.PLAIN, 20));
		GendercomboBox.setModel(new DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));
		GendercomboBox.setBounds(20, 210, 345, 27);
		panel_1.add(GendercomboBox);

		txtPhoneNo = new JTextField();
		txtPhoneNo.setForeground(Color.BLACK);
		txtPhoneNo.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhoneNo.setFont(new Font("Roboto", Font.PLAIN, 20));
		txtPhoneNo.setColumns(10);
		txtPhoneNo.setBounds(20, 290, 345, 29);
		panel_1.add(txtPhoneNo);

		txtAddress = new JTextField();
		txtAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddress.setForeground(Color.BLACK);
		txtAddress.setFont(new Font("Roboto", Font.PLAIN, 20));
		txtAddress.setColumns(10);
		txtAddress.setBounds(20, 360, 345, 30);
		panel_1.add(txtAddress);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(455, 370, 659, 285);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 659, 265);
		panel_2.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Roboto", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Product Name", "Price(RM)" }));
		scrollPane.setViewportView(table);

		JTable t = Inventory.getTable();
		String productName;
		String price;

		DefaultTableModel model = (DefaultTableModel) table.getModel();

		if (t != null) {
			for (int i = 0; i < t.getRowCount(); i++) {
				productName = String.valueOf(t.getValueAt(i, 0));
				price = String.valueOf(t.getValueAt(i, 1));

				model.addRow(new Object[] { productName, price, });

			}
		}

		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setForeground(new Color(187, 134, 252));
		lblWelcome.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblWelcome.setBounds(455, 105, 640, 40);
		panel.add(lblWelcome);

		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setForeground(new Color(187, 134, 252));
		lblMenu.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblMenu.setBounds(455, 330, 659, 40);
		panel.add(lblMenu);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_4.setBackground(new Color(187, 134, 252));
		panel_4.setBounds(455, 145, 659, 186);
		panel.add(panel_4);
		panel_4.setLayout(null);

		JTextArea txtrWelcomeTo = new JTextArea();
		txtrWelcomeTo.setForeground(new Color(0, 0, 0));
		txtrWelcomeTo.setText(
				"Welcome to " + CompanyBackground.getStoreName() + "! \r\nThe newest grocery store in Klang!\r\nThe cheapest price you can find in town!\r\nYou can find everything you'll ever need here!\r\nContact us at "
						+ CompanyBackground.getPhoneNo() + " now!\r\nOpens at " + CompanyBackground.getBusinessHours()
						+ " everyday!");
		txtrWelcomeTo.setFont(new Font("Roboto", Font.BOLD, 22));
		txtrWelcomeTo.setBackground(new Color(187, 134, 252));
		txtrWelcomeTo.setBounds(10, 10, 660, 166);
		panel_4.add(txtrWelcomeTo);

		JLabel lblCustomerInfo = new JLabel("Customer Info");
		lblCustomerInfo.setBounds(40, 105, 385, 40);
		panel.add(lblCustomerInfo);
		lblCustomerInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerInfo.setForeground(new Color(187, 134, 252));
		lblCustomerInfo.setFont(new Font("Nirmala UI", Font.BOLD, 30));

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(40, 570, 385, 85);
		panel.add(panel_3);

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAge.setText("");
				txtPhoneNo.setText("");
				GendercomboBox.setSelectedItem("Select Gender:");
				txtAddress.setText("");
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnReset.setBackground(new Color(187, 134, 252));
		btnReset.setBounds(25, 20, 140, 45);
		panel_3.add(btnReset);

		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Sales().Sales.setVisible(true);
				Customer.dispose();
				try {
					File file = new File("C:\\Users\\user\\git\\Assignment-3\\Assignment-3\\src\\txtOutput\\Customer.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);

					bw.write(txtName.getText() + "  ");
					bw.write(txtAge.getText() + "  ");
					bw.write(GendercomboBox.getSelectedItem() + "  ");
					bw.write(txtPhoneNo.getText() + "  ");
					bw.write(txtAddress.getText() + "  ");
						
					bw.write("\n\t\n");
					
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Customer Data Exported");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnRegister.setForeground(Color.BLACK);
		btnRegister.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnRegister.setBackground(new Color(187, 134, 252));
		btnRegister.setBounds(200, 20, 140, 45);
		panel_3.add(btnRegister);

		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon(Customer.class.getResource("/Image/grocery-store-2540521-2125065.png")));
		lblNewLabel_2.setBounds(309, 25, 60, 60);
		panel.add(lblNewLabel_2);
	}
	
}
