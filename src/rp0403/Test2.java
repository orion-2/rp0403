package rp0403;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Test2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 frame = new Test2();
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
	public Test2() {
		setTitle("³¬½Ã°¡ÀÚ 1.0v");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setSize(410,670);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 35, 323, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(74, 10, 237, 46);
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 34));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(67, 174, 238, 272);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("¾Æ  ÀÌ  µð");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(23, 25, 57, 15);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(113, 22, 116, 21);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ºñ ¹Ð ¹ø È£");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(23, 53, 70, 15);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(113, 50, 116, 21);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ÀÌ       ¸§");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(23, 81, 57, 15);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(113, 78, 116, 21);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("ÈÞ´ëÆù ¹øÈ£");
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(23, 109, 70, 18);
		panel_1.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(113, 108, 116, 21);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("¹è  ¹ø  È£");
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(24, 145, 57, 15);
		panel_1.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(113, 139, 116, 21);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("¹è  ÀÌ  ¸§");
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(24, 176, 57, 15);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ãâ Á¶ Áö ¿ª");
		lblNewLabel_7.setFont(new Font("±¼¸²", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(24, 208, 69, 15);
		panel_1.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(113, 207, 116, 21);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(113, 174, 116, 21);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(67, 460, 238, 68);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("°¡ÀÔÇÏ±â");
		btnNewButton.setBounds(64, 10, 112, 35);
		panel_2.add(btnNewButton);
	}

}
