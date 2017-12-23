package homework;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JMenuBar;
import java.awt.SystemColor;
import java.awt.Font;

public class Test {

	private JFrame frame;
	
	private JMenuItem commisionInput;
	private JMenuItem baseInput;
	private JMenu inputMenu ;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 578, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 560, 511);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("TestButton");
		btnNewButton.setBackground(new Color(51, 153, 153));
		btnNewButton.setBounds(14, 25, 113, 27);
		panel.add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("¿¬Ìå", Font.PLAIN, 15));
		menuBar.setBackground(SystemColor.activeCaption);
		frame.setJMenuBar(menuBar);
		
		inputMenu= new JMenu("EmployeeInfoInput");
		menuBar.add(inputMenu);
		inputMenu.setForeground(Color.GREEN);
		inputMenu.setBackground(Color.CYAN);
		
	    commisionInput = new JMenuItem("CommisionEmplooyee");
		inputMenu.add(commisionInput);
		
		baseInput = new JMenuItem("BasePlusCommisionEmployee");
		inputMenu.add(baseInput);
		
		JMenuItem searchMenu = new JMenuItem("Search");
		menuBar.add(searchMenu);
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				InputView inputView =new InputView();
				inputView.getFrame().setVisible(true);
			}
		});
		search();	
	}
	
	public void search(){
		commisionInput.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				InputView inputView =new InputView();
				inputView.getFrame().setVisible(true);
			}
		});
		
		
		baseInput.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				InputView inputView =new InputView();
				inputView.getFrame().setVisible(true);
			}
		});
		
		
	}
}
