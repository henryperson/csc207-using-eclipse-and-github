
public class ISBNChecker {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Example 1
        System.out.println(isISBN("0205080057"));
        // Example 2
        System.out.println(isISBN("0136091812"));
        // Example 3
        System.out.println(isISBN("123456789X"));
        // Example 4
        System.out.println(isISBN("0070651191"));
    }
    
    public static boolean isISBN(String isbn) {
        int sum = 0; // Default sum for calculating ISBN sum.
        // For loop used to iterate over ISBN and calculate sum.
        for (int i = 0; i < isbn.length() - 1; i++) {
            sum += Character.getNumericValue(isbn.charAt(i))*(i+1);
        }
        int remainder = sum % 11;
        char lastDigit = isbn.charAt(9);
        if (remainder == 10) {// If remainder is 10, check if last digit is X.
            // This is for the ISBN system.
            return (lastDigit == 'X');
        } else {// Otherwise, we want the remainder to equal the last digit.
            return (Character.getNumericValue(lastDigit)
                    == remainder);
        }	
    }

}
