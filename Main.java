import java.awt.EventQueue;
//import java.awt.event.WindowEvent;
import java.util.Random;

//import java.util.*;
public class Main {
	final static String[] colors = { "Green", "Red", "Blue", "Yellow", "Pink", "Orange", "Magenta", "Cyan", "Gray" };
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// private Object WindowEvent;
			public void run() {
				try {
					ColorGame window = new ColorGame();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		// System.out.println(randomColor());
		System.out.println(randomOption(randomColor()));
		//////////////--New--////////////
		for (int i = 0; i < 3; i++) {
			random_num();

		}
		double[] op = new double[3];
		op = random_op();
		// only for test ---
		for (int i = 0; i < 3; i++) {
			System.out.println((int) op[i]);
			// --------
		}	
	}

//////////////////////////////////////////////////////////////////////
	public static String randomColor() {
		// TODO Auto-generated method stub
		// String[] colors = { "Green", "Red", "Blue", "Yellow", "Pink", "Orange", "Magenta", "Cyan", "Gray" };
		Random r = new Random();
		int n = r.nextInt(colors.length - 1);
		String randStr = colors[n];
//		System.out.println(randStr);
		return randStr;
	}

	public static String[] randomOption(String correctAnswer) {
		// TODO Auto-generated method stub
		String option1 = randomColor();
		String option2 = randomColor();

		while (option1.equals(option2) || correctAnswer.equals(option1) || correctAnswer.equals(option2)) {
			option1 = randomColor();
			option2 = randomColor();

		}
		String[] option = { option1, option2, correctAnswer };
		return option;
	}
	///////////////////// New ///////////////////

	public static double random_num() {
		Random r = new Random();
		int upperBound = 2;
		int lowerBound = 0;
		int range = (upperBound - lowerBound) + 1;
		int random = (int) (Math.random() * range) + lowerBound;
		// System.out.print(random + ", ");
		return random;

	}

//filter the number for Unique value
	public static double[] random_op() {
		double op1 = random_num();
		double op2 = random_num();
		double op3 = random_num();

		while (op1 == op2 || op1 == op3 || op2 == op3) {
			op1 = random_num();
			op2 = random_num();
			op3 = random_num();
		}
		double[] op = { op1, op2, op3 };
		return op;
	}
//	public static String master() {
//		randomColor();
//		random_num();
//		random_op();
//		//randomOption( String );
//		return null;
//	}

	
	
}
