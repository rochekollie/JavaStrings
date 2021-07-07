//*****************************************
//   Name: Robert Kollie
//   CTP 150 – 400
//   Lab 5 - 2/2 - StringOperations - Service Class
//*****************************************

/**
 * The StringOperations class is a class with static methods to manipulate strings
 */
public class StringOperations {

	/**
	 * WordCount accepts a String object as an argument and return the number of words contained in the string object.
	 *
	 * @param string the string to count.
	 * @return The number of words in the string.
	 */
	public static int wordCount(String string) {

		String[] array = string.split("\\s");

		int countWords = 0;
		int countSpace = 0;

		// count words in the string
		for (int i = 0; i < array.length; i++) {
			if (!(array[i].equals(" "))) {
				countWords++;
			}
		}

		// FIXME - Make sure only actual number of words are return
		// NOTE - Count the whitespace and separate them from the words
		// char[] space = string.toCharArray();

		// // count whitespace in the string
		// for (var i = 0; i < space.length; i++) {
		// 	if (Character.isWhitespace(space[i])) {
		// 		countSpace++;
		// 	}
		// }

		return countWords;
	}

	/**
	 * mostFrequent accepts a reference to a String object as an argument and return the character that occurs the most frequently in the object.
	 *
	 * @param string the string to search.
	 * @return the frequent character.
	 */
	public static char mostFrequent(String string) {

		char[] array = string.toCharArray();
		int index = 0;
		char suspect;
		char target = ' ';

		for (int i = 0; i < array.length; i++) {
			for (int j = (i + 1); j <= array.length; j++) {
				target = array[j];
				if (array[j] == array[i]) {
					target = array[(j + 1)];
					index = array[j];

				} else {

				}
				suspect = array[j];
			}
		}

		return target;
	}

	/**
	 * replaceSubstring accepts three references to String objects as arguments. Let’s call them string1, string2, and string3. It searches in string1 for all occurrences of string2. If it finds an occurrence of string2, it replaces it with string3. The method returns a reference to a String object. For example, suppose the three arguments have the following values:
	 *
	 * @param string1 the string object to search.
	 * @param string2 the string object to search for in string1.
	 * @param string3 the string object to insert in string1.
	 * @return A reference to a a StringBuilder object.
	 */
	public static String replaceSubstring(String string1, String string2, String string3) {

		String[] newString = string1.split("\\s");

		//Create a StringBuilder object
		StringBuilder string4 = new StringBuilder(string1);
		// Search string1 for occurences of string2
		for (int i = 0; i < newString.length; i++) {
			if (newString[i].equalsIgnoreCase(string2)) {
				string4.replace(i, string3.length() - 1, string3);
			}
		}

		return string4.toString();
	}

	/**
	 * capSentence accepts a reference to a String object as an argument, and return a reference to a String object with the first character of each sentence capitalized. For instance, if the argument is “hello! my name is Joe. what is your name? nice to meet you!” The method should return the string “Hello! My name is Joe. What is your name? Nice to meet you!” Please notice that a space between two sentences should be kept in the returned string.
	 *
	 * @param string the string object to capitalize.
	 * @return A capitalized string reference object.
	 */
	public static String capSentence(String string) {

		//Create a StringBuilder object
		StringBuilder cap = new StringBuilder(string);

		//Replace first character to uppercase
		String firstChar = String.valueOf(cap.charAt(0));
		cap.replace(0, 1, firstChar.toUpperCase());

		for (int i = 0; i < cap.length(); i++) {
			if (!Character.isLetterOrDigit(cap.charAt(i))) {
				cap.replace((i + 2), (i + 2), String.valueOf(cap.charAt(i)).toUpperCase());
			}
		}
		return cap.toString();
	}

	/**
	 * reverseWords accept a reference to a String object as an argument. It reads words from the argument and returns a reference to a String object with the words (not character) in reverse order on the argument.  For example, if the argument is: “Here comes the sun”, the returned string would be: “sun the comes Here”
	 *
	 * @param string the string object to reverse.
	 * @return A reversed string reference object.
	 */
	public static String reverseWords(String string) {

		//Create a StringBuilder object
		// StringBuilder words = new StringBuilder(string);

		// String[] myWords = words.

		// //Reverse the string
		// for (int i = string.length(); i > 0; i--) {
		// 	if
		// 	words.reverse();
		// }
		// return words.toString();

		return " ";
	}

	/**
	 * TtoPigLatin accepts a reference to a String object as an argument. It reads words from the argument as input and coverts each word to “Pig Latin”, and returns a reference to a String object which represents a converted Pig Latin. In one version of Pig Latin, you convert a word by removing the first letter, placing that letter at the end of the word, and then appending “ay” to the word. Here is an example:
	 *
	 * English: I slept most of the night
	 * Pig Latin: Iay leptsay ostmay foay hetay ightnay

	 *
	 * @param string the string object to manipulate.
	 * @return A manipulated string reference object.
	 */
	public static String toPigLatin(String string, String app) {

		//Create a StringBuilder object
		StringBuilder cap = new StringBuilder(string);

		//Replace first character to uppercase
		String firstChar = String.valueOf(cap.charAt(0));
		cap.replace(0, 1, firstChar.toUpperCase());

		for (int i = 0; i < cap.length(); i++) {
			if (!Character.isLetterOrDigit(cap.charAt(i))) {
				cap.replace((i + 2), (i + 2), String.valueOf(cap.charAt(i)).toUpperCase());
			}
		}
		return cap.toString();
	}

}
