package inverter;
public class BinaryReversor {
	/***
	 * It reverses the binary representation of an integer. i.e: 13 becomes 11
	 * 
	 * @param i
	 *            The integer to be reversed
	 * @return The integer value of reversed bit sequence
	 */
	public Integer reverseBinaryRepresentation(Integer i) {
		return Integer.parseInt(new StringBuilder(Integer.toBinaryString(i)).reverse().toString(), 2);
	}
}
