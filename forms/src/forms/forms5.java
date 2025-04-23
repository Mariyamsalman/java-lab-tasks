package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class forms5 extends JFrame {

	private static final long serialVersionUID = 1L;
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
					forms5 frame = new forms5();
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
	public forms5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 23, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(170, 67, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("enter num1");
		lblNewLabel.setBounds(23, 23, 128, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterNum = new JLabel("enter num2");
		lblEnterNum.setBounds(23, 67, 128, 20);
		contentPane.add(lblEnterNum);
		
		JButton btnNewButton = new JButton("check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a,b;
				a=Integer.parseInt(textField.getText());
				b=Integer.parseInt(textField_1.getText());
				
				if(a>b)
			
				{
					JOptionPane.showMessageDialog(null, "a is greater than b");
					
				}if(a<b) {
					JOptionPane.showMessageDialog(null, "b is greater than a");
				}if(a==b) {
					JOptionPane.showMessageDialog(null, "both are equal");
				}
			}
		});
		btnNewButton.setBounds(177, 112, 89, 23);
		contentPane.add(btnNewButton);
	}

}
