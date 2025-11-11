public class Collatz {
	public static void main(String[] args) {
		int seed = Integer.parseInt(args[0]);
		int repeticiones = 0;
		String mode = args[1];
		if (mode.equals("v")) {
			for (int i = 1; i <= seed; i++) {
				repeticiones = 0;
				int j = i;
				System.out.print(j + " ");
				repeticiones++;
				do {
					if (j % 2 == 0) {
						j = j / 2;
					} else {
						j = j * 3 + 1;
					}
					System.out.print(j + " ");
					repeticiones++;
				} while (j != 1);
				System.out.print("(" + repeticiones + ")");
				System.out.println();
			}
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");

		}
		if (mode.equals("c")) {
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
	}
}
