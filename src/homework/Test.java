package homework;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JMenuBar;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.Renderer;
import javax.swing.event.ListDataListener;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Test {

	private JFrame frame;
	private JPanel panel;
	
	private JMenuItem commisionInput;
	private JMenuItem baseInput;
	private JMenu inputMenu ;
	
	private List<Employee> lists;
	private JList<Employee> allInfo ;
	private JMenu mnSearch;
	private JMenuItem averageEarningSearch;
	
	private JLabel label;
	private JLabel label_1;
	private JLabel averageWage;
	private JLabel numberLabel;
	private JLabel lblsearch;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		lists = new ArrayList<>();
		
		initialize();
		action();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 578, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		panel = new JPanel();
		panel.setBounds(0, 0, 560, 511);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("楷体", Font.PLAIN, 15));
		menuBar.setBackground(SystemColor.activeCaption);
		frame.setJMenuBar(menuBar);
		
		inputMenu= new JMenu("EmployeeInfoInput");
		inputMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuBar.add(inputMenu);
		inputMenu.setForeground(Color.BLACK);
		inputMenu.setBackground(Color.LIGHT_GRAY);
		
	    commisionInput = new JMenuItem("CommisionEmplooyee");
		inputMenu.add(commisionInput);
		
		baseInput = new JMenuItem("BasePlusCommisionEmployee");
		inputMenu.add(baseInput);
		
		mnSearch = new JMenu("Search");
		mnSearch.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnSearch.setForeground(Color.BLACK);
		mnSearch.setBackground(new Color(0, 0, 0));
		menuBar.add(mnSearch);
		
		averageEarningSearch = new JMenuItem("AverageEarningSearch");
		mnSearch.add(averageEarningSearch);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 95, 532, 403);
		panel.add(scrollPane);
		
		
		allInfo = new JList<>();
		allInfo.setBackground(new Color(0, 206, 209));
		allInfo.setFont(new Font("楷体", Font.PLAIN, 18));
		scrollPane.setViewportView(allInfo);
		
		label = new JLabel("\u6240\u6709\u96C7\u5DE5\u4FE1\u606F");
		label.setFont(new Font("楷体", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(label);
		
		label_1 = new JLabel("\u6240\u6709\u96C7\u5DE5\u5E73\u5747\u5DE5\u8D44\uFF1A");
		label_1.setFont(new Font("楷体", Font.PLAIN, 20));
		label_1.setBounds(40, 50, 181, 32);
		panel.add(label_1);
		
		averageWage = new JLabel("0");
		averageWage.setBounds(222, 59, 149, 18);
		panel.add(averageWage);
		
		numberLabel = new JLabel("雇工个数：0");
		numberLabel.setFont(new Font("楷体", Font.PLAIN, 20));
		numberLabel.setBounds(118, 19, 149, 18);
		panel.add(numberLabel);
		
		lblsearch = new JLabel("\u9875\u9762\u4FE1\u606F\u70B9\u51FBsearch\u4E0B\u83DC\u5355\u5237\u65B0");
		lblsearch.setFont(new Font("楷体", Font.PLAIN, 15));
		lblsearch.setBounds(314, 0, 246, 18);
		panel.add(lblsearch);
		
	}
	
	public void action(){
		commisionInput.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				InputView inputView =new InputView(lists,2);
				inputView.getFrame().setVisible(true);
			}
		});
		
		
		baseInput.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				InputView inputView =new InputView(lists,1);
				inputView.getFrame().setVisible(true);
			}
		});
		
		
		averageEarningSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				float moeny = 0;
				for(int i=0;i<lists.size();i++){
					moeny+=lists.get(i).earning();
				}
				
				moeny = moeny/lists.size();
				averageWage.setText(String.valueOf(moeny));
				numberLabel.setText("雇工个数："+String.valueOf(lists.size()));
				
				DefaultListModel<Employee> model = new DefaultListModel<>();
				allInfo.setModel(model);
				for(int i=0;i<lists.size();i++){
					model.addElement(lists.get(i));
				}
				allInfo.validate();
			}
		});
		
		
	}
   
}
