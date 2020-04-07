package rp0403;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class Test3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test3 frame = new Test3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test3() {
		
		String colName[] = {};
		
		setTitle("³¬½Ã°¡ÀÚ 1.0v");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(18, 40, 147, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 21));
		lblNewLabel.setBounds(0, 15, 123, 32);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("CheckBox.background"));
		panel_1.setBounds(12, 131, 370, 273);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("¿¹ ¾à Á¤ º¸");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(12, 10, 110, 28);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 48, 370, 225);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 61, 42, 21);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 61, 57, 21);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(61, 119, 191, 21);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 61, 80, 21);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(222, 61, 42, 21);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(281, 61, 69, 21);
		panel_2.add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("¿¹¾à¹øÈ£");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(6, 39, 57, 15);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("¹è ÀÌ ¸§");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(65, 39, 57, 15);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("³¯  Â¥");
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(146, 39, 57, 15);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ÀÎ  ¿ø");
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(224, 39, 57, 15);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("°¡  °Ý");
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(299, 39, 57, 15);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ãâ Ç× Áö");
		lblNewLabel_7.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(61, 93, 57, 21);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("¼±  ÁÖ");
		lblNewLabel_8.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(63, 150, 57, 15);
		panel_2.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(63, 175, 82, 21);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("¿¬ ¶ô Ã³");
		lblNewLabel_9.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(163, 150, 113, 15);
		panel_2.add(lblNewLabel_9);
		
		textField_7 = new JTextField();
		textField_7.setBounds(160, 175, 116, 21);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		setSize(410,670);
		setVisible(true);
	}
}
