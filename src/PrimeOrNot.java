import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Give me a number");
		int y = Integer.parseInt(x);
		boolean isPrime = true;
		for (int z = 2; z < y; z++) {
			if (y % z == 0) {
				JOptionPane.showMessageDialog(null, "Your number is not prime");
				isPrime = false;
				break;
			} 
		}
		if (isPrime) {
			JOptionPane.showMessageDialog(null, "Your number is prime");
		} else {
		}
	}
}
