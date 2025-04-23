package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class forms1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forms1 frame = new forms1();
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
	public forms1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(154, 24, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 75, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(154, 122, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Basic salary");
		lblNewLabel.setBounds(30, 17, 101, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblBonus = new JLabel("Bonus");
		lblBonus.setBounds(40, 68, 101, 34);
		contentPane.add(lblBonus);
		
		JLabel lblDeductions = new JLabel("Deductions");
		lblDeductions.setBounds(30, 115, 101, 34);
		contentPane.add(lblDeductions);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(154, 215, 96, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	int a,b,c,d;
			//	a=Integer.parseInt(textField.getText());
			//	b=Integer.parseInt(textField_1.getText());
			//	c=Integer.parseInt(textField_2.getText());
				//d=(a+b)-c;
			//	textField_3.setText(String.valueOf(d));
				calculate a=new calculate();
				textField_3.setText(String.valueOf(a.add(Integer.parseInt(textField.getText()),Integer.parseInt(textField_1.getText()),Integer.parseInt(textField_2.getText()))));
			}
		});
		btnNewButton.setBounds(150, 171, 89, 23);
		contentPane.add(btnNewButton);
	}
}
