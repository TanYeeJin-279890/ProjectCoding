package GroceryStore_PreparedFood;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class Finance extends JFrame {

	protected JFrame Finance;
	private JTextField txtSales;
	private JTextField txtInsurance;
	private JTextField txtRent;
	private JTextField txtInventoryCost;
	private JTextField txtAdCost;
	private JTextArea Report;
	private JTextField txtSalaryExpenses;
	private JTable t;
	static double Salary = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance window = new Finance();
					window.Finance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Finance() {
		initialize();
	}

	/**
	 * Initialize the contents of the Finance.
	 */
	private void initialize() {
		Finance = new JFrame();
		Finance.setBounds(100, 100, 1156, 738);
		Finance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Finance.getContentPane().setForeground(Color.WHITE);
		Finance.getContentPane().setBackground(SystemColor.controlHighlight);
		Finance.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		Finance.setJMenuBar(menuBar);

		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);

		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mntmAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CompanyBackground().Company.setVisible(true);// calling another frame/window
				Finance.dispose();
			}
		});
		mnHome.add(mntmAboutUs);

		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);

		JMenuItem mntmEmployeeManagement = new JMenuItem("Employee Management");
		mntmEmployeeManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Employee().Employee.setVisible(true);// calling another frame/window
				Finance.dispose();
			}
		});
		mnEmployee.add(mntmEmployeeManagement);

		JMenu mnFinance = new JMenu("Finance");
		menuBar.add(mnFinance);

		JMenuItem mntmFinanceReport = new JMenuItem("Finance Report");
		mntmFinanceReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Finance().Finance.setVisible(true);// calling another frame/window
				Finance.dispose();
			}
		});
		mnFinance.add(mntmFinanceReport);

		JMenu mnInventory = new JMenu("Inventory");
		menuBar.add(mnInventory);

		JMenuItem mntmInventoryManagement = new JMenuItem("Inventory Management");
		mntmInventoryManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Inventory().Inventory.setVisible(true);// calling another frame/window
				Finance.dispose();
			}
		});
		mnInventory.add(mntmInventoryManagement);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel.setBackground(new Color(255, 228, 225));
		panel.setBounds(0, 0, 1142, 678);
		Finance.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(20, 25, 100, 45);
		panel.add(btnBack);
		btnBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Admin().Admin.setVisible(true);
				Finance.dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnBack.setBackground(new Color(187, 134, 252));

		JLabel lblFinanceReport = new JLabel("Finance Report");
		lblFinanceReport.setVerticalAlignment(SwingConstants.TOP);
		lblFinanceReport.setForeground(new Color(187, 134, 252));
		lblFinanceReport.setFont(new Font("Nirmala UI", Font.BOLD, 40));
		lblFinanceReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinanceReport.setBounds(458, 25, 300, 60);
		panel.add(lblFinanceReport);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_1.setBackground(new Color(187, 134, 252));
		panel_1.setBounds(40, 280, 460, 310);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setHorizontalAlignment(SwingConstants.LEFT);
		lblInsurance.setForeground(Color.BLACK);
		lblInsurance.setFont(new Font("Roboto", Font.BOLD, 22));
		lblInsurance.setBounds(20, 80, 211, 30);
		panel_1.add(lblInsurance);

		JLabel lblRent = new JLabel("Rent");
		lblRent.setHorizontalAlignment(SwingConstants.LEFT);
		lblRent.setForeground(Color.BLACK);
		lblRent.setFont(new Font("Roboto", Font.BOLD, 22));
		lblRent.setBounds(20, 140, 211, 30);
		panel_1.add(lblRent);

		JLabel lblInventory = new JLabel("Inventory Cost");
		lblInventory.setBounds(20, 20, 211, 30);
		panel_1.add(lblInventory);
		lblInventory.setHorizontalAlignment(SwingConstants.LEFT);
		lblInventory.setForeground(Color.BLACK);
		lblInventory.setFont(new Font("Roboto", Font.BOLD, 22));

		JLabel lblAdCost = new JLabel("Advertisement Cost");
		lblAdCost.setBounds(20, 200, 211, 30);
		panel_1.add(lblAdCost);
		lblAdCost.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdCost.setForeground(Color.BLACK);
		lblAdCost.setFont(new Font("Roboto", Font.BOLD, 22));

		txtInsurance = new JTextField();
		txtInsurance.setText("0");
		txtInsurance.setForeground(Color.BLACK);
		txtInsurance.setFont(new Font("Roboto", Font.PLAIN, 22));
		txtInsurance.setColumns(10);
		txtInsurance.setBounds(255, 80, 185, 30);
		panel_1.add(txtInsurance);

		txtRent = new JTextField();
		txtRent.setText("0");
		txtRent.setForeground(Color.BLACK);
		txtRent.setFont(new Font("Roboto", Font.PLAIN, 22));
		txtRent.setColumns(10);
		txtRent.setBounds(255, 140, 185, 30);
		panel_1.add(txtRent);

		txtInventoryCost = new JTextField();
		txtInventoryCost.setText("0");
		txtInventoryCost.setForeground(Color.BLACK);
		txtInventoryCost.setFont(new Font("Roboto", Font.PLAIN, 22));
		txtInventoryCost.setColumns(10);
		txtInventoryCost.setBounds(255, 20, 185, 30);
		panel_1.add(txtInventoryCost);

		txtAdCost = new JTextField();
		txtAdCost.setText("0");
		txtAdCost.setForeground(Color.BLACK);
		txtAdCost.setFont(new Font("Roboto", Font.PLAIN, 22));
		txtAdCost.setColumns(10);
		txtAdCost.setBounds(255, 200, 185, 30);
		panel_1.add(txtAdCost);

		JLabel lblSalaryExpenses = new JLabel("Salary Expenses");
		lblSalaryExpenses.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalaryExpenses.setForeground(Color.BLACK);
		lblSalaryExpenses.setFont(new Font("Roboto", Font.BOLD, 22));
		lblSalaryExpenses.setBounds(20, 260, 211, 30);
		panel_1.add(lblSalaryExpenses);

		t = Employee.getTable();
		if (t != null) {
			for (int i = 0; i < t.getRowCount(); i++) {
				Salary += Double.valueOf(t.getValueAt(i, 4).toString());
			}
		}

		txtSalaryExpenses = new JTextField();
		txtSalaryExpenses.setForeground(Color.BLACK);
		txtSalaryExpenses.setFont(new Font("Roboto", Font.PLAIN, 22));
		txtSalaryExpenses.setColumns(10);
		txtSalaryExpenses.setBounds(255, 260, 185, 30);
		txtSalaryExpenses.setText(String.valueOf(Salary));
		panel_1.add(txtSalaryExpenses);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_2.setBackground(new Color(255, 228, 225));
		panel_2.setBounds(523, 120, 609, 470);
		panel.add(panel_2);
		panel_2.setLayout(null);

		Report = new JTextArea();
		Report.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		Report.setBounds(10, 10, 591, 450);
		panel_2.add(Report);

		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(70, 600, 155, 45);
		panel.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInsurance.setText("");
				txtRent.setText("");
				txtInventoryCost.setText("");
				txtAdCost.setText("");
				Report.setText("");
			}
		});
		btnReset.setForeground(Color.BLACK);
		btnReset.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnReset.setBackground(new Color(187, 134, 252));

		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.setBounds(275, 600, 155, 45);
		panel.add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double totalExpenses = Double.parseDouble(txtInsurance.getText())
						+ Double.parseDouble(txtRent.getText()) + Double.parseDouble(txtInventoryCost.getText())
						+ Double.parseDouble(txtAdCost.getText());

				double netIncome = Double.parseDouble(txtSales.getText()) - totalExpenses;

				Report.setText("================================================="
						+ "\n\t          Financial Report for Grocery Store"
						+ "\n=================================================" + "\nIncome" + "\n\tSales\t\t: RM"
						+ txtSales.getText() + "\n(+)Total Income\t\t\t: RM" + txtSales.getText() + "\nExpenses"
						+ "\n\tInsurance\t\t: RM" + txtInsurance.getText() + "\n\tRent\t\t: RM" + txtRent.getText()
						+ "\n\tInventory Cost\t\t: RM" + txtInventoryCost.getText() + "\n\tAdvertisement Cost\t: RM"
						+ txtAdCost.getText() + "\n\tSalary Expenses\t\t: RM" + txtSalaryExpenses.getText()
						+ "\n(-)Total Expenses\t\t\t: RM" + totalExpenses
						+ "\n=================================================" + "\nNet Income\t\t\t: "
						+ String.format("RM%.2f", netIncome) + "\n=================================================");
			}
		});
		btnCalculate.setForeground(Color.BLACK);
		btnCalculate.setFont(new Font("Roboto", Font.PLAIN, 22));
		btnCalculate.setBackground(new Color(187, 134, 252));

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(187, 134, 252)));
		panel_1_1.setBackground(new Color(187, 134, 252));
		panel_1_1.setBounds(40, 160, 463, 70);
		panel.add(panel_1_1);

		JLabel lblSales = new JLabel("Sales");
		lblSales.setBounds(20, 20, 158, 30);
		panel_1_1.add(lblSales);
		lblSales.setHorizontalAlignment(SwingConstants.LEFT);
		lblSales.setForeground(Color.BLACK);
		lblSales.setFont(new Font("Roboto", Font.BOLD, 22));

		txtSales = new JTextField();
		txtSales.setText(String.valueOf(Sales.getTotalSales()));
		txtSales.setBounds(254, 20, 185, 30);
		panel_1_1.add(txtSales);
		txtSales.setForeground(Color.BLACK);
		txtSales.setFont(new Font("Roboto", Font.PLAIN, 22));
		txtSales.setColumns(10);

		JLabel lblTotalExpense = new JLabel("Total Expenses");
		lblTotalExpense.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalExpense.setForeground(new Color(187, 134, 252));
		lblTotalExpense.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblTotalExpense.setBounds(50, 230, 300, 50);
		panel.add(lblTotalExpense);

		JLabel lblTotalIncome = new JLabel("Total Income");
		lblTotalIncome.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalIncome.setForeground(new Color(187, 134, 252));
		lblTotalIncome.setFont(new Font("Nirmala UI", Font.BOLD, 30));
		lblTotalIncome.setBounds(50, 110, 300, 50);
		panel.add(lblTotalIncome);

		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon(Finance.class.getResource("/Image/2260823.png")));
		lblIcon.setHorizontalAlignment(SwingConstants.LEFT);
		lblIcon.setBounds(390, 25, 60, 60);
		panel.add(lblIcon);
	}
}
