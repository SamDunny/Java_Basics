// by Sam Dunny

/* Instance Methods vs. Static Methods:
 * 	Instance methods: in order to use these, you must first have a created object of the class
 *	Static methods: these methods can be used without an instance 
 */

public class StringHelper {
	
	// hasAllUniqueCharacters static method
	public static boolean hasAllUniqueCharacters(String inp) {
		// compare input at indices
		for (int i = 0; i < inp.length()-1; i++) {
			for (int j = i+1; j < inp.length(); j++) {
				if (inp.charAt(i) == inp.charAt(j)) {
					return false;
				}
			}
		}
		// return true otherwise
		return true;
	}
	
	// meshStrings static method
	public static String meshStrings(String inp1, String inp2) {
		// calculate total output string length
		int comb_len = inp1.length() + inp2.length();
		
		// declare and define new char array (will turn into string later)
		// strings are immutable (can't be changed)
		char[] char_output = new char[comb_len];
		
		// mesh strings
		int ind = 0;
		for (int i = 0; i < comb_len; i++) {
			if (i < inp1.length()) {
				char_output[ind] = inp1.charAt(i);
				ind++;
			}
			if (i < inp2.length()) {
				char_output[ind] = inp2.charAt(i);
				ind++;
			}
		}

		// convert char[] to String
		String str_output = new String(char_output);
		return str_output;
	}

	// replaceVowelsWithOodle static method
	public static String replaceVowelsWithOodle(String inp) {
		String output = "";
		for (int i = 0; i < inp.length(); i++) {
			if (inp.charAt(i) == 'a' ||
					inp.charAt(i) == 'A' ||
					inp.charAt(i) == 'e' ||
					inp.charAt(i) == 'E' ||
					inp.charAt(i) == 'i' ||
					inp.charAt(i) == 'I' ||
					inp.charAt(i) == 'o' ||
					inp.charAt(i) == 'O' ||
					inp.charAt(i) == 'u' ||
					inp.charAt(i) == 'U') {
				output += "oodle";
			}
			else
				output += inp.charAt(i);
		}
		return output;
	}
	
	// weight static method
	public static double weight(String inp) {
		double ret_value = 0.0;
		for (int i = 0; i < inp.length(); i++) {
			if (inp.charAt(i) == 'a' ||
					inp.charAt(i) == 'A' ||
					inp.charAt(i) == 'e' ||
					inp.charAt(i) == 'E' ||
					inp.charAt(i) == 'i' ||
					inp.charAt(i) == 'I' ||
					inp.charAt(i) == 'o' ||
					inp.charAt(i) == 'O' ||
					inp.charAt(i) == 'u' ||
					inp.charAt(i) == 'U') {
				ret_value += 2.5;
			}
			else
				ret_value += 3.4;
		}
		return ret_value;
	}
}
