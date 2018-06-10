import telran.util.BitOperations;

public class SportLottoAppl {

	private static long history = 0;

	public static void main(String[] args) {

		int i = 7;

		while (i > 0) {
		int number = getRandomNumber(1, 49);
			if (isNumberNotEncountered(number)) {
				System.out.print(number + " ");
				history = BitOperations.setBit(history, number);
				i--;

			}

		}

	}

	private static boolean isNumberNotEncountered(int number) {

		return !BitOperations.isBitSet(history, number);
	}

	private static int getRandomNumber(int min, int max) {

		double res = Math.random();
		return (int) (res * (max - min + 1) + min);
	}

}
