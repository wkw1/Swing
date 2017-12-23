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
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.AbstractAction;
import javax.swing.Action;

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
		
		JButton btnNewButton_1 = new JButton("≤‚ ‘");
		btnNewButton_1.setBounds(316, 215, 113, 27);
		panel.add(btnNewButton_1);
		
		JMenu mnNewMenu = new JMenu("fdgsgfdsgfd");
		mnNewMenu.setForeground(Color.GREEN);
		mnNewMenu.setBackground(Color.CYAN);
		mnNewMenu.setBounds(28, 398, 223, 24);
		panel.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("testetsttte");
		
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("fdbfdfd");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("New radio item");
		mnNewMenu.add(rdbtnmntmNewRadioItem_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("fdsgfdsfds");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("New check item");
		chckbxmntmNewCheckItem.setBounds(14, 44, 161, 24);
		panel.add(chckbxmntmNewCheckItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("New radio item");
		rdbtnmntmNewRadioItem.setBounds(365, 308, 157, 24);
		panel.add(rdbtnmntmNewRadioItem);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(44, 138, 157, 27);
		panel.add(rdbtnNewRadioButton);
		
		JSlider slider = new JSlider();
		slider.setBounds(57, 286, 200, 26);
		panel.add(slider);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		mnNewMenu_1.setAction(action_1);
		mnNewMenu_1.setBounds(283, 87, 131, 24);
		panel.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		mnNewMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				InputView inputView =new InputView();
				inputView.getFrame().setVisible(true);
			}
		});
		
		
		
		
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
