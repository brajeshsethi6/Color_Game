import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorGame2page {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	/**
	 * 
	 */
	public ColorGame2page() {
		initialize();
	}

	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		ColorGame pName = new ColorGame();
		String Pname = pName.textField_1.getText();

		JLabel lblNewLabel = new JLabel(Pname + "'s Game");
		lblNewLabel.setBounds(205, 0, 122, 14);
		frame.getContentPane().add(lblNewLabel);
		//////////////////////////////////////////////////////////
		Main Color_obj = new Main();
		String Rand_Color_name = Main.randomColor();
		String[] colourOptions = Main.randomOption(Rand_Color_name);

		System.out.println("line 54 output :" + Rand_Color_name);

		Main Option_obj = new Main();
		double Rand_Option[] = Option_obj.random_op();
//		double[] Random_Option = Main.random_op(Rand_Option);

		JPanel panel = new JPanel();

		if (Rand_Color_name.equals("Red")) {
			panel.setBackground(Color.RED);
		} else if (Rand_Color_name.equals("Green")) {
			panel.setBackground(Color.GREEN);
		} else if (Rand_Color_name.equals("Blue")) {
			panel.setBackground(Color.BLUE);
		} else if (Rand_Color_name.equals("Yellow")) {
			panel.setBackground(Color.YELLOW);
		} else if (Rand_Color_name.equals("Pink")) {
			panel.setBackground(Color.PINK);
		} else if (Rand_Color_name.equals("Orange")) {
			panel.setBackground(Color.ORANGE);
		} else if (Rand_Color_name.equals("Cyan")) {
			panel.setBackground(Color.CYAN);
		} else if (Rand_Color_name.equals("Gray")) {
			panel.setBackground(Color.GRAY);
		} else {
			panel.setBackground(Color.MAGENTA);
		}
/////////////////////////////////////////////////////////////////////
		panel.setBounds(90, 50, 261, 79);
		// panel.setBackground(Color.RED);
		frame.getContentPane().add(panel);

////////////////////////////////Button////////////////////////////////////////
// 1st button
		JButton btnNewButton = new JButton(colourOptions[(int) Rand_Option[2]]);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(colourOptions[(int) Rand_Option[2]]);
				/////
				if (Rand_Color_name.equals(colourOptions[(int) Rand_Option[2]])) {
					System.out.println("Correct");
				}else {
					System.out.println("Wrong");
				}
				////
			}
		});
		btnNewButton.setBackground(getColor(colourOptions[(int) Rand_Option[0]]));
		btnNewButton.setBounds(37, 163, 103, 23);
		frame.getContentPane().add(btnNewButton);
//2nd button
		JButton btnNewButton_1 = new JButton(colourOptions[(int) Rand_Option[1]]);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(colourOptions[(int) Rand_Option[1]]);
				/////
				if (Rand_Color_name.equals(colourOptions[(int) Rand_Option[1]])) {
					System.out.println("Correct");
				}else {
					System.out.println("Wrong");
				}
				////
			}
		});
		btnNewButton_1.setBackground(getColor(colourOptions[(int) Rand_Option[2]]));
		btnNewButton_1.setBounds(165, 163, 103, 23);
		frame.getContentPane().add(btnNewButton_1);
//3rd button
		JButton btnNewButton_2 = new JButton(colourOptions[(int) Rand_Option[0]]);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(colourOptions[(int) Rand_Option[0]]);
				/////
				if (Rand_Color_name.equals(colourOptions[(int) Rand_Option[0]])) {
					System.out.println("Correct");
				}else {
					System.out.println("Wrong");
				}
				////
			}
		});
		btnNewButton_2.setBackground(getColor(colourOptions[(int) Rand_Option[1]]));
		btnNewButton_2.setBounds(294, 163, 103, 23);
		frame.getContentPane().add(btnNewButton_2);
//////////////////////////////////////////////////////////////////////////

		JLabel lblNewLabel_1 = new JLabel("          ");
		lblNewLabel_1.setBounds(499, 251, 35, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Score");
		lblNewLabel_2.setBounds(337, 11, 48, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Top Palyer");
		lblNewLabel_3.setBounds(175, 221, 237, 14);
		frame.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton_3 = new JButton("New Game");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ColorGame cg = new ColorGame();
				cg.getFrame().setVisible(true);// other window
				frame.setVisible(false);// current window
				frame.dispose();
			}

		});
		btnNewButton_3.setBounds(10, 7, 96, 23);
		frame.getContentPane().add(btnNewButton_3);
	}

	public Color getColor(String c) {
		Color color = null;
		switch (c) {
		case "Red":
			color = Color.RED;
			break;
		case "Green":
			color = Color.GREEN;
			break;
		case "Blue":
			color = Color.BLUE;
			break;
		case "Yellow":
			color = Color.YELLOW;
			break;
		case "Pink":
			color = Color.PINK;
			break;
		case "Orange":
			color = Color.ORANGE;
			break;
		case "Magenta":
			color = Color.MAGENTA;
			break;
		case "Cyan":
			color = Color.CYAN;
			break;
		case "Gray":
			color = Color.GRAY;
			break;
		}
		return color;
	}
}
//String[] colors = { "Green", "Red", "Blue", "Yellow", "Pink", "Orange",
// "Magenta", "Cyan", "Gray" };