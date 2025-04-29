package assignmentforms;
import java.util.Scanner;
import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class assignment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					assignment frame = new assignment();
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
	public assignment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File a=new File("newfile");
				try {
					if(a.createNewFile()) {
JOptionPane.showMessageDialog(null, "file created");
}
					else {
						JOptionPane.showMessageDialog(null, "file not created");
					}
				} catch (HeadlessException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		}});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.setBounds(149, 24, 111, 35);
		contentPane.add(btnNewButton);
		
		JButton btnWrite = new JButton("write");
		btnWrite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter b=new FileWriter("newfile");
					b.write("hello world its me!");
					b.close();
					JOptionPane.showMessageDialog(null, "succesfully written");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnWrite.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnWrite.setBounds(149, 70, 111, 35);
		contentPane.add(btnWrite);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
				    FileWriter b = new FileWriter("newfile", true); // 'true' enables append mode
				    b.write("hello world its me!,second time\n"); // Add a newline if needed
				    b.close();
				    JOptionPane.showMessageDialog(null, "Successfully written");
				} catch (IOException e1) {
				    e1.printStackTrace();
				}

			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(149, 122, 111, 35);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File a=new File("newfile");
				try {
					if(a.delete()) {
JOptionPane.showMessageDialog(null, "file deleated");
}
					else {
						JOptionPane.showMessageDialog(null, "file not deleated");
					}
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
			
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setBounds(149, 217, 111, 35);
		contentPane.add(btnDelete);
		
		JButton btnRead = new JButton("read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File c=new File("newfile");
				try {
					Scanner d=new Scanner(c);
					while(d.hasNextLine()) {
						String data;
						data=d.nextLine();
						System.out.println(data);
						
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnRead.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRead.setBounds(149, 168, 111, 35);
		contentPane.add(btnRead);
	}
}
