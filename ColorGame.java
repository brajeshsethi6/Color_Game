import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorGame {

	private JFrame frame;
	JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorGame window = new ColorGame();
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
	public ColorGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Made By Brajesh Game");
		lblNewLabel.setBounds(172, 0, 201, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_3 = new JLabel(" ");
		lblNewLabel_3.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel(" ");
		lblNewLabel_4.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_6 = new JLabel(" ");
		lblNewLabel_6.setBounds(0, 0, 0, 0);
		frame.getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_2 = new JLabel("Player Name");
		lblNewLabel_2.setBounds(60, 60, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(157, 57, 175, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("                      ");
		lblNewLabel_8.setBounds(337, 60, 77, 14);
		frame.getContentPane().add(lblNewLabel_8);

		JLabel lblNewLabel_5 = new JLabel(" ");
		lblNewLabel_5.setBounds(185, 82, 4, 14);
		frame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_9 = new JLabel("                         ");
		lblNewLabel_9.setBounds(34, 105, 88, 14);
		frame.getContentPane().add(lblNewLabel_9);
////////////////////button/////////////////////////////////
		JButton btnNewButton = new JButton("Start Game ");
		btnNewButton.setBounds(195, 101, 109, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ColorGame2page cg = new ColorGame2page();
				cg.getFrame().setVisible(true);// other window
				frame.setVisible(false);// current window
				frame.dispose();

				System.out.println(textField_1.getText());
				//////
				// window.frame.setVisible(false);
				///////////
			}
		});
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_7 = new JLabel("                               ");
		lblNewLabel_7.setBounds(223, 105, 109, 14);
		frame.getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setBounds(479, 189, 4, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}

	public JFrame getFrame() {
		return frame;
	}

}
