package rp0403;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Font;

public class TestWB extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWB frame = new TestWB();
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
	public TestWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setSize(410,670);
		setVisible(true);
		
		
		JLabel lblImage = new JLabel();
		lblImage.setBounds(5, 143, 371, 255);
		setTitle("임시제목 1.0v");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
		contentPane.add(lblImage, BorderLayout.CENTER);
			
		lblImage.setIcon(new ImageIcon("d.jpg"));
		contentPane.add(lblImage);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(5, 107, 10, 291);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(373, 107, 10, 291);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(6, 446, 377, 31);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(" 아 이 디     ");
		lblNewLabel_1.setBounds(94, 8, 68, 15);
		panel_4.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(161, 5, 116, 21);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(5, 487, 377, 37);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호   ");
		lblNewLabel_2.setBounds(95, 8, 65, 15);
		panel_5.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 5, 116, 21);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(6, 534, 377, 33);
		contentPane.add(panel_6);
		
		JButton btnNewButton = new JButton("회원가입");
		panel_6.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("로 그 인");
		panel_6.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 35, 323, 59);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 34));
		panel.add(lblNewLabel);
		
		
		
		
	}
}
