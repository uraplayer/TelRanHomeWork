import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Нахождение значения введенного бита числа от 0 до 127.
// на примере с числом 100 и 5 битом работает

public class BitValueTest {

	public static void main(String[] args) throws IOException {

		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите целое число от 0 до 127");
		byte number = (byte) Integer.parseInt(br.readLine());

		System.out.println("Введите номер бита от 0 до 7");
		int bitNumber = Integer.parseInt(br.readLine());
		br.close();
		int mask = (int) Math.pow(2, bitNumber);

		System.out.println("Значение выбраного бита " + ((mask & number) == 0 ? 0 : 1));
		
		
	
	}
}
