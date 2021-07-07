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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Employee extends JFrame {

	protected JFrame Employee;
	private JTextField txtEmployeeID;
	private JTextField txtPhoneNo;
	private JTextField txtEmployeeName;
	private JTextField txtSalary;
	private static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee window = new Employee();
					window.Employee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Employee = new JFrame();
		Employee.setBounds(100, 100, 1156, 738);
		Employee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Employee.getContentPane().setForeground(Color.WHITE);
		Employee.getContentPane().setBackground(SystemColor.controlHighlight);
		Employee.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		Employee.setJMenuBar(menuBar);

		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);

		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CompanyBackground().Company.setVisible(true);// calling another frame/window
				Employee.dispose();
			}
		});
		mnHome.add(mntmAboutUs);

		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);

		JMenuItem mntmEmployeeManagement = new JMenuItem("Employee Management");
		mntmEmployeeManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Employee().Employee.setVisible(true);// calling another frame/window
				Employee.dispose();
			}
		});
		mnEmployee.add(mntmEmployeeManagement);

		JMenu mnFinance = new JMenu("Finance");
		menuBar.add(mnFinance);

		JMenuItem mntmFinanceReport = new JMenuItem("Finance Report");
		mntmFinanceReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Finance().Finance.setVisible(true);// calling another frame/window
				Employee.dispose();
			}
		});
		mnFinance.add(mntmFinanceReport);

		JMenu mnInventory = new JMenu("Inventory");
		menuBar.add(mnInventory);

		JMenuItem mntmInventoryManagement = new JMenuItem("Inventory Management");
		mntmInventoryManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Inventory().Inventory.setVisible(true);// calling another frame/window
				Employee.dispose();
			}
		});
		mnInventory.add(mntmInventoryManagement);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(0, 0, 1142, 678);
		Employee.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(20, 25, 100, 45);
		panel.add(btnBack);
		btnBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Admin().Admin.setVisible(true);
				Employee.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnBack.setBackground(new Color(187, 134, 252));

		JLabel lblEmployeeManagement = new JLabel("Employee Management");
		lblEmployeeManagement.setVerticalAlignment(SwingConstants.TOP);
		lblEmployeeManagement.setForeground(new Color(187, 134, 252));
		lblEmployeeManagement.setFont(new Font("Nirmala UI", Font.BOLD, 40));
		lblEmployeeManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeManagement.setBounds(389, 25, 480, 60);
		panel.add(lblEmployeeManagement);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(40, 106, 385, 424);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblEmployeeInfo = new JLabel("Employee Info");
		lblEmployeeInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeInfo.setForeground(new Color(187, 134, 252));
		lblEmployeeInfo.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblEmployeeInfo.setBounds(10, 10, 365, 50);
		panel_1.add(lblEmployeeInfo);

		JLabel lblEmployeeID = new JLabel("Employee ID");
		lblEmployeeID.setBounds(15, 70, 150, 29);
		panel_1.add(lblEmployeeID);
		lblEmployeeID.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmployeeID.setForeground(new Color(187, 134, 252));
		lblEmployeeID.setFont(new Font("Roboto", Font.BOLD, 20));

		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmployeeName.setForeground(new Color(187, 134, 252));
		lblEmployeeName.setFont(new Font("Roboto", Font.BOLD, 20));
		lblEmployeeName.setBounds(15, 140, 150, 29);
		panel_1.add(lblEmployeeName);

		JLabel lblPhoneNo = new JLabel("Phone No.");
		lblPhoneNo.setBounds(15, 210, 150, 29);
		panel_1.add(lblPhoneNo);
		lblPhoneNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNo.setForeground(new Color(187, 134, 252));
		lblPhoneNo.setFont(new Font("Roboto", Font.BOLD, 20));

		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(15, 350, 66, 29);
		panel_1.add(lblSalary);
		lblSalary.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalary.setForeground(new Color(187, 134, 252));
		lblSalary.setFont(new Font("Roboto", Font.BOLD, 20));

		txtEmployeeID = new JTextField();
		txtEmployeeID.setForeground(Color.BLACK);
		txtEmployeeID.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmployeeID.setFont(new Font("Roboto", Font.PLAIN, 18));
		txtEmployeeID.setColumns(10);
		txtEmployeeID.setBounds(175, 70, 200, 29);
		panel_1.add(txtEmployeeID);

		txtEmployeeName = new JTextField();
		txtEmployeeName.setForeground(Color.BLACK);
		txtEmployeeName.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmployeeName.setFont(new Font("Roboto", Font.PLAIN, 20));
		txtEmployeeName.setColumns(10);
		txtEmployeeName.setBounds(175, 140, 200, 29);
		panel_1.add(txtEmployeeName);

		txtPhoneNo = new JTextField();
		txtPhoneNo.setForeground(Color.BLACK);
		txtPhoneNo.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhoneNo.setFont(new Font("Roboto", Font.PLAIN, 20));
		txtPhoneNo.setColumns(10);
		txtPhoneNo.setBounds(175, 210, 200, 29);
		panel_1.add(txtPhoneNo);

		txtSalary = new JTextField();
		txtSalary.setHorizontalAlignment(SwingConstants.LEFT);
		txtSalary.setForeground(Color.BLACK);
		txtSalary.setFont(new Font("Roboto", Font.PLAIN, 20));
		txtSalary.setColumns(10);
		txtSalary.setBounds(175, 350, 200, 29);
		txtSalary.setEditable(false);
		panel_1.add(txtSalary);

		JLabel lblPosition = new JLabel("Position");
		lblPosition.setHorizontalAlignment(SwingConstants.LEFT);
		lblPosition.setForeground(new Color(187, 134, 252));
		lblPosition.setFont(new Font("Roboto", Font.BOLD, 20));
		lblPosition.setBounds(15, 280, 76, 29);
		panel_1.add(lblPosition);

		JComboBox<String> PositioncomboBox = new JComboBox<String>();
		PositioncomboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PositioncomboBox.getSelectedIndex() == 1) {
					txtSalary.setText("5000.00");
				} else if (PositioncomboBox.getSelectedIndex() == 2) {
					txtSalary.setText("4000.00");
				} else if (PositioncomboBox.getSelectedIndex() == 3) {
					txtSalary.setText("3000.00");
				} else if (PositioncomboBox.getSelectedIndex() == 4) {
					txtSalary.setText("2000.00");
				} else {
					txtSalary.setText("");
				}
			}
		});
		PositioncomboBox.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Select Position:", "Store Manager", "Stocker", "Stock Clerk", "Cashier" }));
		PositioncomboBox.setFont(new Font("Roboto", Font.PLAIN, 20));
		PositioncomboBox.setBounds(175, 280, 200, 27);
		panel_1.add(PositioncomboBox);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(435, 106, 679, 424);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 659, 334);
		panel_2.add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "NAME", "PHONE NO.", "POSITION", "SALARY(RM)" }));
		scrollPane.setViewportView(table);

		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\eclipse-workspace\\Assignment-3\\src\\Employee.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);

					for (int i = 0; i < table.getRowCount(); i++) {
						for (int j = 0; j < table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
						bw.write("\n\t\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setForeground(Color.BLACK);
		btnUpload.setFont(new Font("Roboto", Font.PLAIN, 24));
		btnUpload.setBackground(new Color(187, 134, 252));
		btnUpload.setBounds(117, 362, 130, 45);
		panel_2.add(btnUpload);

		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int i = table.getSelectedRow();
				if (i >= 0) // if single row is selected than update
				{
					model.setValueAt(txtEmployeeID.getText(), i, 0);
					model.setValueAt(txtEmployeeName.getText(), i, 1);
					model.setValueAt(txtPhoneNo.getText(), i, 2);
					model.setValueAt(PositioncomboBox.getSelectedItem(), i, 3);
					model.setValueAt(txtSalary.getText(), i, 4);
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First!");
				}
			}
		});
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setFont(new Font("Roboto", Font.PLAIN, 24));
		btnUpdate.setBackground(new Color(187, 134, 252));
		btnUpdate.setBounds(422, 362, 130, 45);
		panel_2.add(btnUpdate);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(40, 540, 1068, 107);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { txtEmployeeID.getText(), txtEmployeeName.getText(), txtPhoneNo.getText(),
						PositioncomboBox.getSelectedItem(), txtSalary.getText(), });

				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Employee Update confirmed", "Employee Management System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnAdd.setBackground(new Color(187, 134, 252));
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Roboto", Font.PLAIN, 24));
		btnAdd.setBounds(46, 31, 120, 45);
		panel_3.add(btnAdd);

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEmployeeID.setText("");
				txtEmployeeName.setText("");
				txtPhoneNo.setText("");
				PositioncomboBox.setSelectedItem("Select Position:");
				txtSalary.setText("");
			}
		});
		btnReset.setBounds(251, 31, 120, 45);
		panel_3.add(btnReset);
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Roboto", Font.PLAIN, 24));
		btnReset.setBackground(new Color(187, 134, 252));

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "Employee Management",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Employee Management",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Roboto", Font.PLAIN, 24));
		btnDelete.setBackground(new Color(187, 134, 252));
		btnDelete.setBounds(463, 31, 120, 45);
		panel_3.add(btnDelete);

		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});

		btnPrint.setForeground(Color.BLACK);
		btnPrint.setFont(new Font("Roboto", Font.PLAIN, 24));
		btnPrint.setBackground(new Color(187, 134, 252));
		btnPrint.setBounds(885, 31, 120, 45);
		panel_3.add(btnPrint);

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee = new JFrame();
				if (JOptionPane.showConfirmDialog(Employee, "Confirm if you want to exit", "Employee Management",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);

				}
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Roboto", Font.PLAIN, 24));
		btnExit.setBackground(new Color(187, 134, 252));
		btnExit.setBounds(671, 31, 120, 45);
		panel_3.add(btnExit);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Employee.class.getResource("/Image/3002655.png")));
		lblNewLabel.setBounds(330, 25, 60, 60);
		panel.add(lblNewLabel);
	}

	public static JTable getTable() {
		return table;
	}
}
