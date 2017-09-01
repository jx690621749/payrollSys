package gui;

import java.awt.EventQueue;
import javax.swing.UIManager;

//import org.jvnet.substance.SubstanceLookAndFeel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try {
			/*
			 * 想要修改皮肤的话，只需要更改，下面这个函数的参数，具体改成什么样，
			 * 可以打开，Referenced Libraries -> 点击substance.jar -> 
			 * 找到org.jvnet.substance.skin这个包  -> 将下面的SubstanceDustCoffeeLookAndFeel 
			 * 替换成 刚刚打开的包下的任意一个“Substance....LookAndFeel”即可
			 */
//			UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel());
			//UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel());
			//UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel());
			JFrame.setDefaultLookAndFeelDecorated(true);
			JDialog.setDefaultLookAndFeelDecorated(true);
			//例如按照上面的步骤，可以看见一个叫，"SubstanceOfficeBlue2007LookAndFeel.class"，想要替换成这个皮肤，就可以向下面这样写
			// 运行一下，皮肤就可以换了
			// 想要详细了解的同学，可以去百度这个第三方包：substance.jar
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JButton button = new JButton("\u5458\u5DE5\u4FE1\u606F\u7BA1\u7406");
		button.setBounds(136, 51, 173, 41);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u5DE5\u8D44\u9879\u76EE\u7BA1\u7406");
		button_1.setBounds(136, 113, 173, 41);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u56FA\u5B9A\u5DE5\u8D44\u7BA1\u7406");
		button_2.setBounds(136, 177, 173, 41);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\u62A5\u8868\u7BA1\u7406");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_3.setBounds(136, 305, 173, 41);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("\u5BFC\u5165\u9879\u76EE\u7BA1\u7406");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_4.setBounds(136, 241, 173, 41);
		frame.getContentPane().add(button_4);
	}
}
