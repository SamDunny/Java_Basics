// by Sam Dunny

public class StringHelperTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the String Helper Tester");

		// testing hasAllUniqueCharacters static method
		String test1 = "facetiously";
		String test2 = "banana";
		System.out.println("\nTesting Has All Unique Characters with \"" + test1 + "\"");
		System.out.println(StringHelper.hasAllUniqueCharacters(test1));
		System.out.println("Testing Has All Unique Characters with \"" + test2 + "\"");
		System.out.println(StringHelper.hasAllUniqueCharacters(test2));
		
		// testing meshStrings static method
		String mesh1 = "harp";
		String mesh2 = "fiddle";
		System.out.println("\nTesting Mesh Strings with \"" + mesh1 + "\" and \"" + mesh2 + "\"");
		System.out.println(StringHelper.meshStrings(mesh1, mesh2));
		
		// testing replaceVowelsWithOodle static method
		String test3 = "burrito";
		System.out.println("\nTesting Replace Vowels with Oodle with \"" + test3 + "\"");
		System.out.println(StringHelper.replaceVowelsWithOodle(test3));
		
		// testing weight static method
		String test4 = "heavy";
		String test5 = "light";
		System.out.println("\nTesting Weight with \"" + test4 + "\"");
		System.out.println(StringHelper.weight(test4));
		System.out.println("Testing Weight with \"" + test5 + "\"");
		System.out.println(StringHelper.weight(test5));
		
		
		
	}

}
