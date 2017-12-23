package homework;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTextArea;
import java.awt.Color;

public class InputView {

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	private JFrame frame;
	private JTextField firstNameIn;
	private JTextField ssnIn;
	private JTextField lastNameIn;
	private JTextField grossSalesIn;
	private JTextField commissionRateIn;
	private JTextField baseSalaryIn;
	private JButton addBtn;
	private JLabel errorLabel ;
	
	private int which;//标记录入那哪种职工1表示base 2表示commision
	private List<Employee> list;

	/**
	 * Create the application.
	 */
	public InputView(List<Employee> list,int which) {
		this.which = which;
		this.list =list;
		initialize();
		action();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 435, 540);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 417, 493);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		firstNameIn = new JTextField();
		firstNameIn.setHorizontalAlignment(SwingConstants.CENTER);
		firstNameIn.setBounds(168, 137, 146, 24);
		panel.add(firstNameIn);
		
		JLabel lblNewLabel = new JLabel("\u540D");
		lblNewLabel.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel.setBounds(83, 133, 45, 32);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("\u793E\u4F1A\u4FDD\u9669\u53F7");
		label.setFont(new Font("楷体", Font.PLAIN, 18));
		label.setBounds(42, 170, 100, 30);
		panel.add(label);
		
		ssnIn = new JTextField();
		ssnIn.setToolTipText("\u4E0D\u8D85\u8FC79\u4F4D\u6570\u5B57\u6216\u5B57\u6BCD");
		ssnIn.setHorizontalAlignment(SwingConstants.CENTER);
		ssnIn.setBounds(168, 173, 146, 24);
		panel.add(ssnIn);
		ssnIn.setColumns(10);
		ssnIn.setDocument(new LimitNumberLenght("[0-9A-Za-z]{0,9}"));
		
		JLabel label_1 = new JLabel("\u59D3");
		label_1.setFont(new Font("楷体", Font.PLAIN, 18));
		label_1.setBounds(83, 96, 51, 32);
		panel.add(label_1);
		
		lastNameIn = new JTextField();
		lastNameIn.setHorizontalAlignment(SwingConstants.CENTER);
		lastNameIn.setColumns(10);
		lastNameIn.setBounds(168, 100, 146, 24);
		panel.add(lastNameIn);
		
		JLabel label_2 = new JLabel("\u9500\u552E\u989D");
		label_2.setFont(new Font("楷体", Font.PLAIN, 18));
		label_2.setBounds(62, 213, 72, 18);
		panel.add(label_2);
		
		grossSalesIn = new JTextField();
		grossSalesIn.setToolTipText("\u4E0D\u8D85\u8FC7100000.00");
		grossSalesIn.setHorizontalAlignment(SwingConstants.CENTER);
		grossSalesIn.setBounds(168, 210, 146, 24);
		panel.add(grossSalesIn);
		grossSalesIn.setColumns(10);
		grossSalesIn.setDocument(new LimitNumberLenght("\\d{0,5}"));
		
		JLabel lblNewLabel_1 = new JLabel("\u63D0\u6210\u6BD4\u4F8B");
		lblNewLabel_1.setFont(new Font("楷体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(62, 252, 72, 18);
		panel.add(lblNewLabel_1);
		
		commissionRateIn = new JTextField();
		commissionRateIn.setHorizontalAlignment(SwingConstants.CENTER);
		commissionRateIn.setToolTipText("\u8BF7\u8F93\u51650.ab\u5F62\u5F0F");
		commissionRateIn.setBounds(168, 249, 146, 24);
		panel.add(commissionRateIn);
		commissionRateIn.setColumns(10);
		commissionRateIn.setDocument(new LimitNumberLenght("^0(\\.\\d{0,2})?"));
		
		
		JLabel typeLabel = new JLabel("\u4FE1\u606F\u5F55\u5165");
		typeLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		typeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		typeLabel.setBounds(62, 31, 301, 24);
		panel.add(typeLabel);
		
		addBtn = new JButton("\u786E\u5B9A");
		addBtn.setFont(new Font("楷体", Font.PLAIN, 20));
		addBtn.setBackground(SystemColor.activeCaption);
		addBtn.setBounds(152, 355, 113, 43);
		panel.add(addBtn);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setFont(new Font("楷体", Font.PLAIN, 16));
		textArea.setForeground(new Color(255, 0, 0));
		textArea.setBackground(SystemColor.inactiveCaption);
		textArea.setText("\u6240\u6709\u4FE1\u606F\u8BF7\u6309\u7167\u63D0\u793A\u8F93\u5165(\u59D3\u540D\u6CA1\u6709)\uFF0C\u9F20\u6807\u653E\u7F6E\u8F93\u5165\u6846\u51E0\u79D2\u51FA\u73B0\u63D0\u793A\u4FE1\u606F\uFF01\uFF01");
		textArea.setBounds(14, 450, 389, 43);
		panel.add(textArea);
		
		 errorLabel = new JLabel(" ");
		errorLabel.setForeground(new Color(255, 0, 0));
		errorLabel.setFont(new Font("楷体", Font.PLAIN, 15));
		errorLabel.setBounds(83, 419, 231, 18);
		panel.add(errorLabel);
		
		if(which==1){
			JLabel label_3 = new JLabel("\u57FA\u672C\u5DE5\u8D44");
			label_3.setFont(new Font("楷体", Font.PLAIN, 18));
			label_3.setBounds(62, 289, 72, 18);
			panel.add(label_3);
			
			baseSalaryIn = new JTextField();
			baseSalaryIn.setHorizontalAlignment(SwingConstants.CENTER);
			baseSalaryIn.setToolTipText("\u6700\u591A\u4E24\u4F4D\u5C0F\u6570");
			baseSalaryIn.setColumns(10);
			baseSalaryIn.setBounds(168, 286, 146, 24);
			panel.add(baseSalaryIn);
			baseSalaryIn.setDocument(new LimitNumberLenght("\\d{0,8}(\\.\\d{0,2})?"));
			
			typeLabel.setText("BasePlusCommisionEmployee 录入");
		}else if(which==2){
			typeLabel.setText("CommisionEmployee 录入");
		}
	}
	
	private void action(){
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String firstName = firstNameIn.getText();
				String lastName = lastNameIn.getText();
				String ssn = ssnIn.getText();
				
				if(firstName.equals("")||lastName.equals("")||ssn.equals("")){
					JOptionPane.showConfirmDialog(null, "请输入完整信息",
							"提示信息", JOptionPane.PLAIN_MESSAGE);
					return;
				}
					
				if(grossSalesIn.getText().equals("")||commissionRateIn.getText().equals("")){
					JOptionPane.showConfirmDialog(null, "请输入完整信息",
							"提示信息", JOptionPane.PLAIN_MESSAGE);
					return;
				}
				
				int grossSales = Integer.valueOf(grossSalesIn.getText());
			    float commissionRate = Float.valueOf(commissionRateIn.getText());
				
			    float baseSalary=0;
			    if(which==1){
			    	if(baseSalaryIn.getText().equals("")){
			    		JOptionPane.showConfirmDialog(null, "请输入完整信息",
								"提示信息", JOptionPane.PLAIN_MESSAGE);
						return;
			    	}
			    	baseSalary =Float.valueOf(baseSalaryIn.getText());
			    }
			    for(int i=0;i<list.size();i++ ){
			    	if(list.get(i).getSocialSecurityNumber().equals(ssn)){
			    		JOptionPane.showConfirmDialog(null, "此社会保险号已存在，请重新输入",
								"提示信息", JOptionPane.PLAIN_MESSAGE);
						return;
			    	}
			    }
		
			    
			    //basePlusCommision
			    if(which==1){
			    	BasePlusCommisionEmployee employee= 
			    			new BasePlusCommisionEmployee(firstName, lastName, ssn);
			    	employee.setBaseSalary(baseSalary);
			    	employee.setGrossSales(grossSales);
			    	employee.setCommissionRate(commissionRate);
			    	list.add(employee);
			    }else{//commission
			    	CommissionEmployee employee= 
			    			new CommissionEmployee(firstName, lastName, ssn);
			    	employee.setGrossSales(grossSales);
			    	employee.setCommissionRate(commissionRate);
			    	list.add(employee);
			    }
			    frame.dispose();
			}
		});
	}
}
