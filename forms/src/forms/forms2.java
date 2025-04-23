package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class forms2 extends JFrame {

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
					forms2 frame = new forms2();
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
	public forms2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 47, 96, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(153, 11, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 90, 96, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(153, 191, 96, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*int a,b,c,d;
				a=Integer.parseInt(textField.getText());
				b=Integer.parseInt(textField_1.getText());
				c=Integer.parseInt(textField_2.getText());
				d=(a*b*c)/100;
				textField_3.setText(String.valueOf(d));*/
				
				calculate a=new calculate();
				textField_3.setText(String.valueOf(a.add(Integer.parseInt(textField.getText()),Integer.parseInt(textField_1.getText()),Integer.parseInt(textField_2.getText()))));
			}
			
			
			
	
			
			
		});
		btnNewButton.setBounds(153, 139, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("principal amount");
		lblNewLabel.setBounds(10, 14, 103, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblRateOfIntrest = new JLabel("Rate of intrest");
		lblRateOfIntrest.setBounds(10, 50, 103, 17);
		contentPane.add(lblRateOfIntrest);
		
		JLabel lblTimeInYears = new JLabel("Time in years");
		lblTimeInYears.setBounds(10, 93, 103, 17);
		contentPane.add(lblTimeInYears);
	}
}
