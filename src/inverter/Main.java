package inverter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(new BinaryReversor().reverseBinaryRepresentation(sc.nextInt()));
		sc.close();
	}
}
