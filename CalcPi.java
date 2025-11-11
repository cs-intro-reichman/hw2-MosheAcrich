// Computes an approximation of PI.// acordarme que el primer numero es indice 0, entocnes el segundo numero es impar no par.
public class CalcPi {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		double sum = 0;
		for (int i = 0; i < number; i++) {
			if (i % 2 == 0) {
				sum = sum + (1.0 / (2.0 * i + 1.0));
			} else {
				sum = sum - (1.0 / (2.0 * i + 1.0));
			}
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + 4* sum);
	}
	// Replace this comment with your code
}
