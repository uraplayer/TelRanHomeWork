package telran.util;

public class BitOperations {
	private static final int MAX_BIT_NUMBER = 63;
	private static final long ONE = 1L;

	/**
	 * 
	 * @param number
	 * @param nBit
	 *            - sequential number of bit
	 * @return bit value(0,1); -1 in the case of wrong bit's number
	 */

	public static boolean isBitSet(long number, int nBit) {
		if (nBit < 0 || nBit > MAX_BIT_NUMBER)

			return false;
		return (number & (ONE << nBit)) != 0;
	}

	/**
	 * 
	 * @param number
	 * @param nBit
	 *            - sequential number of bit
	 * @return new number value with 1 in the bit of nBit number; 0 in the case of
	 *         wrong bit's number
	 */
	public static long setBit(long number, int nBit) {

		if (nBit < 0 || nBit > MAX_BIT_NUMBER)

			return 0;
		return number | (ONE << nBit);

	}

	/**
	 * 
	 * @param number
	 * @param nBit-
	 *            sequential number of bit
	 * @return new number value with 0 in the bit of nBit number; -1 in the case of
	 *         wrong bit's number
	 */

	public static long resetBit(long number, int nBit) {

		if (nBit < 0 || nBit > MAX_BIT_NUMBER)
			return -1;

		return number & ~(ONE << nBit);

	}

	/**
	 * 
	 * @param number
	 * @param nBit-
	 *            sequential number of bit
	 * @return new number value with toggled given bit; -1 in the case of wrong
	 *         bit's number (без проверки на 1 и 0)
	 */

	public static long toggleBit(long number, int nBit) {

		if (nBit < 0 || nBit > MAX_BIT_NUMBER)

			return -1;

		return number ^ (ONE << nBit);

	}

	// set bit value - уставновка в 1
	// reset bit value - установка в 0
	// update bit value -

	/**
	 * 
	 * @param number
	 * @return без циклов и умножений number *10 with only one operator + and
	 *         without*
	 */

	public static long fastMultiply10(long number) {

		return (number << 3) + (number << 1);

	}

	/**
	 * 
	 * @param number
	 * @return без циклов и умножений number /10 with only one operator - and
	 *         without/
	 */

	public static int fastDivision10(int number) {

		return (number * 205) >> 11;// wrong code for demonstration
	}

	// проверяет что в чиле есть 2 бита сумма номеров мы получаем
	public static boolean isNBitsSum(long number, int sum) {
		
		return false;
	}

}
