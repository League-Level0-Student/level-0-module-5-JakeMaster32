
public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		String sequence = a + "," + b;
		for (int x = 0; x < 12; x++) {
			int c = a + b;
			a = b;
			b = c;

			sequence = sequence + "," + c;
		}
		System.out.println(sequence);
	}
}