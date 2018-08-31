package clientServerMsg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class client {

	private JFrame frame;
	private JTextField txtUnnamed;
	private JTextField txtLocalhost;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					client window = new client();
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
	public client() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 859, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		
		JButton btnShowOnline = new JButton("show online");
		
		JButton btnClear = new JButton("Clear");
		
		txtUnnamed = new JTextField();
		txtUnnamed.setText("unnamed");
		txtUnnamed.setColumns(10);
		
		txtLocalhost = new JTextField();
		txtLocalhost.setText("localhost");
		txtLocalhost.setColumns(10);
		
		JLabel lblName = new JLabel("name");
		
		JLabel lblAddress = new JLabel("address");
		
		JTextPane textPane = new JTextPane();
		
		textField = new JTextField();
		textField.setText("0");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		
		JCheckBox checkBox = new JCheckBox("");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnConnect)
							.addGap(56)
							.addComponent(lblName)
							.addGap(38)
							.addComponent(txtUnnamed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
							.addComponent(lblAddress)
							.addGap(41)
							.addComponent(txtLocalhost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(73)
							.addComponent(btnShowOnline)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnClear)
							.addGap(27))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(95)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 526, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnSend))
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 787, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(checkBox)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(checkBox)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnConnect)
							.addComponent(btnShowOnline)
							.addComponent(txtUnnamed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtLocalhost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblName)
							.addComponent(lblAddress)
							.addComponent(btnClear)))
					.addGap(36)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSend))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
