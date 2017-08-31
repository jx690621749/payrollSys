//package gui;
//
//import java.awt.EventQueue;
//import javax.swing.UIManager;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import javax.swing.JTextField;
//import javax.swing.JPasswordField;
//import javax.swing.JLabel;
//import java.awt.Color;
//import java.awt.Container;
//import java.awt.Font;
//import javax.swing.JLayeredPane;
//
//public class login extends JFrame{
//
//	private JFrame frame;
//	private JTextField textField;
//	private JPasswordField passwordField;
//	
//	
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					login window = new login();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public login() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		try {
//			/*
//			 * 想要修改皮肤的话，只需要更改，下面这个函数的参数，具体改成什么样，
//			 * 可以打开，Referenced Libraries -> 点击substance.jar -> 
//			 * 找到org.jvnet.substance.skin这个包  -> 将下面的SubstanceDustCoffeeLookAndFeel 
//			 * 替换成 刚刚打开的包下的任意一个“Substance....LookAndFeel”即可
//			 */
////			UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel());
//			
//			//UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel());
//			JFrame.setDefaultLookAndFeelDecorated(true); 
//			//JDialog.setDefaultLookAndFeelDecorated(true);
//			//例如按照上面的步骤，可以看见一个叫，"SubstanceOfficeBlue2007LookAndFeel.class"，想要替换成这个皮肤，就可以向下面这样写
//			//UIManager
//			//.setLookAndFeel(new org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel());
//			// 运行一下，皮肤就可以换了
//			// 想要详细了解的同学，可以去百度这个第三方包：substance.jar
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
////		try {  
////            //设置外观  
////            UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());  
////            JFrame.setDefaultLookAndFeelDecorated(true);  
////            //设置主题   
////            SubstanceLookAndFeel.setCurrentTheme(new SubstanceEbonyTheme());  
////            //设置按钮外观  
////            SubstanceLookAndFeel.setCurrentButtonShaper(new ClassicButtonShaper());  
////            //设置水印  
////            SubstanceLookAndFeel.setCurrentWatermark(new SubstanceBinaryWatermark());  
////            //设置边框  
////            SubstanceLookAndFeel.setCurrentBorderPainter(new StandardBorderPainter());  
////            //设置渐变渲染  
////            SubstanceLookAndFeel.setCurrentGradientPainter(new StandardGradientPainter());  
////            //设置标题  
////            SubstanceLookAndFeel.setCurrentTitlePainter(new FlatTitlePainter());  
////        } catch (Exception e) {  
////            System.out.println(e.getMessage());  
////        };
//		
//		
//		//设置背景图片放置在标签中
//        //this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));  
//        //将背景标签添加到jframe的LayeredPane面板里。  
//        //imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());  
//        // 设置背景标签的位置  
//        //Container contain = this.getContentPane();  
//        // ((JPanel) contain).setOpaque(false);   
//        // 将内容面板设为透明。将LayeredPane面板中的背景显示出来。 
//        
//		
//		frame = new JFrame();
//		frame.getContentPane().setFont(new Font("Blackadder ITC", Font.PLAIN, 24));
//		frame.setBounds(100, 100, 714, 604);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		
//		/*ImageIcon img = new ImageIcon(this.getClass().getResource("/images/bg1.jpg"));  
//		JLabel imgLabel = new JLabel(img); 
//		imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());
//		frame.getContentPane().add(imgLabel);*/
//		//this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));  
//		//Container contain = this.getContentPane();  
//       // ((JPanel) contain).setOpaque(false);   
//        // 将内容面板设为透明。将LayeredPane面板中的背景显示出来。 
//		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(230, 94, 2, 2);
//		frame.getContentPane().add(scrollPane);
//		
//		JButton login = new JButton("Log in");
//		login.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				
//				
//			}
//		});
//		login.setBounds(137, 367, 153, 37);
//		frame.getContentPane().add(login);
//		
//		textField = new JTextField();
//		textField.setBounds(260, 189, 158, 47);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
//		
//		passwordField = new JPasswordField();
//		passwordField.setBounds(260, 269, 158, 47);
//		frame.getContentPane().add(passwordField);
//		
//		JButton btnSignIn = new JButton("sign in");
//		btnSignIn.setBounds(379, 367, 153, 37);
//		frame.getContentPane().add(btnSignIn);
//		
//		JLabel lblPayrollStatistics = new JLabel("payroll statistics");
//		lblPayrollStatistics.setFont(new Font("Calibri Light", Font.BOLD, 40));
//		lblPayrollStatistics.setLabelFor(frame);
//		lblPayrollStatistics.setForeground(Color.BLACK);
//		lblPayrollStatistics.setBounds(164, 73, 340, 69);
//		frame.getContentPane().add(lblPayrollStatistics);
//		
//		
//		/*JLabel loginBg = new JLabel(new ImageIcon(this.getClass().getResource("/images/login.png")));
//		loginBg.setBounds(0,0, 686, 525);
//		frame.getContentPane().add(loginBg);*/
//		
//	}
//}
