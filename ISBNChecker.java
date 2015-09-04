
public class ISBNChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isISBN("0205080057"));
		System.out.println(isISBN("0136091812"));
		System.out.println(isISBN("123456789X"));
		System.out.println(isISBN("0070651191"));

	}
	public static boolean isISBN(String isbn) {
		int sum = 0;
		for (int i = 0; i < isbn.length() - 1; i++) {
			sum += Character.getNumericValue(isbn.charAt(i)) * (i+1);
		}
		int remainder = sum % 11;
		char lastDigit = isbn.charAt(9);
		if (remainder == 10) {
			return (lastDigit == 'X');
		} else {
			return (Character.getNumericValue(lastDigit) == remainder);
		}	
	}

}
