import javax.swing.JOptionPane;

public class ForLoopGauntlet {
	public static void main(String[] args) {

		for (int a = 0; a < 100; a++) {
			System.out.println(a);
		}
		for (int b = 100; b > 0; b--) {
			System.out.println(b);
		}
		for (int c = 2; c < 102; c = c + 2) {
			System.out.println(c);
		}
		for (int d = 1; d < 100; d = d + 2) {
			System.out.println(d);
		}
		for (int e = 0; e < 501; e++) {
			if (e % 2 == 0) {
				System.out.println(e + " is even");
			} else {
				System.out.println(e + " is odd");
			}
		}
		for (int f = 0; f < 778; f++) {
			if (f % 7 == 0) {
				System.out.println(f);
			}
		}
		for (int g = 0; g < 51; g++) {
			System.out.println("In " + (1969 + g) + ", I was " + g + " years old.");
		}
		for (int h = 0; h < 3; h++) {
			for (int i = 0; i < 3; i++) {
				System.out.println("" + h + i);
			}
		}
		for (int j = 1; j < 10; j += 3) {
			System.out.println(j + " " + (j + 1) + " " + (j + 2));
		}
		for (int k = 0; k < 10; k++) {
			for (int l = 1; l < 11; l++) {
				System.out.print(k * 10 + l + " ");

			}
			System.out.println();
		}
		String m = "*";
		for (int n = 0; n < 6; n++) {
			System.out.println("" + m);
			m = (m + "*");
		}

	}
}
