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
//			 * ��Ҫ�޸�Ƥ���Ļ���ֻ��Ҫ���ģ�������������Ĳ���������ĳ�ʲô����
//			 * ���Դ򿪣�Referenced Libraries -> ���substance.jar -> 
//			 * �ҵ�org.jvnet.substance.skin�����  -> �������SubstanceDustCoffeeLookAndFeel 
//			 * �滻�� �ոմ򿪵İ��µ�����һ����Substance....LookAndFeel������
//			 */
////			UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel());
//			
//			//UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel());
//			JFrame.setDefaultLookAndFeelDecorated(true); 
//			//JDialog.setDefaultLookAndFeelDecorated(true);
//			//���簴������Ĳ��裬���Կ���һ���У�"SubstanceOfficeBlue2007LookAndFeel.class"����Ҫ�滻�����Ƥ�����Ϳ�������������д
//			//UIManager
//			//.setLookAndFeel(new org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel());
//			// ����һ�£�Ƥ���Ϳ��Ի���
//			// ��Ҫ��ϸ�˽��ͬѧ������ȥ�ٶ��������������substance.jar
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
////		try {  
////            //�������  
////            UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());  
////            JFrame.setDefaultLookAndFeelDecorated(true);  
////            //��������   
////            SubstanceLookAndFeel.setCurrentTheme(new SubstanceEbonyTheme());  
////            //���ð�ť���  
////            SubstanceLookAndFeel.setCurrentButtonShaper(new ClassicButtonShaper());  
////            //����ˮӡ  
////            SubstanceLookAndFeel.setCurrentWatermark(new SubstanceBinaryWatermark());  
////            //���ñ߿�  
////            SubstanceLookAndFeel.setCurrentBorderPainter(new StandardBorderPainter());  
////            //���ý�����Ⱦ  
////            SubstanceLookAndFeel.setCurrentGradientPainter(new StandardGradientPainter());  
////            //���ñ���  
////            SubstanceLookAndFeel.setCurrentTitlePainter(new FlatTitlePainter());  
////        } catch (Exception e) {  
////            System.out.println(e.getMessage());  
////        };
//		
//		
//		//���ñ���ͼƬ�����ڱ�ǩ��
//        //this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));  
//        //��������ǩ��ӵ�jframe��LayeredPane����  
//        //imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());  
//        // ���ñ�����ǩ��λ��  
//        //Container contain = this.getContentPane();  
//        // ((JPanel) contain).setOpaque(false);   
//        // �����������Ϊ͸������LayeredPane����еı�����ʾ������ 
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
//        // �����������Ϊ͸������LayeredPane����еı�����ʾ������ 
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
