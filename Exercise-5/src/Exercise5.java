
public class Exercise5 {

	public static void main(String[] args) {

		int N;
		int i;
		int j;

		do {
			System.out.print("Donner le nombre de lignes N : ");
			N = Clavier.lireInt();
		} while (N < 0);

		for (i = 1; i < N; i++) {
			for (j = 1; j <= N-i; j = j + 1) {
				System.out.print("v");
			}
			for (j = 1; j <= 2 * i - 1; j = j + 1) {
				System.out.print(" * ");
			}

			System.out.print("\n");
		}
	}
}
