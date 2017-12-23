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
import javax.swing.JRadioButtonMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JMenuBar;

public class Test {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(new Color(51, 153, 153));
		btnNewButton.setBounds(57, 190, 113, 27);
		panel.add(btnNewButton);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("EmployeeInfoInput");
		menuBar.add(mnNewMenu);
		mnNewMenu.setForeground(Color.GREEN);
		mnNewMenu.setBackground(Color.CYAN);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("CommisionEmplooyee");
		
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("BasePlusCommisionEmployee");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mnNewMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				InputView inputView =new InputView();
				inputView.getFrame().setVisible(true);
			}
		});
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Search");
		menuBar.add(mntmNewMenuItem_3);
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				InputView inputView =new InputView();
				inputView.getFrame().setVisible(true);
			}
		});
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
