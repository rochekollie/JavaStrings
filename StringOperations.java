import java.lang.ref.Cleaner;

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

		// count words in the string
		for (int i = 0; i < array.length; i++) {
			if (!(array[i].equals(" "))) {
				countWords++;
			}
		}
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
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((String.valueOf(array[i]).equalsIgnoreCase(String.valueOf(array[j])))) {
					index = j;
				}
			}
		}
		return array[index];
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

		// Store string1 in an array
		String[] newString = string1.split("\\s");

		// Search array for occurrence of string2 and replace with string3
		for (int i = 0; i < newString.length; i++) {
			if (newString[i].equalsIgnoreCase(string2)) {
				newString[i] = string3;
			}
		}

		// Create a StringBuilder object
		StringBuilder string4 = new StringBuilder();

		// Append array elements to string4
		for (String s : newString) {
			string4.append(s + " ");
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

		///Create a StringBuilder object
		StringBuilder sentence = new StringBuilder(string);

		//Replace first character to uppercase
		String firstChar = String.valueOf(sentence.charAt(0));
		sentence.replace(0, 1, firstChar.toUpperCase());

		for (int i = 0; i < sentence.length() - 1; i++) {
			if (!(Character.isLetter(sentence.charAt(i))) && (!Character.isLetter(sentence.charAt(i + 1)))) {
				sentence.replace((i + 2), (i + 3), String.valueOf(sentence.charAt(i + 2)).toUpperCase());
			}
		}

		return sentence.toString();
	}

	/**
	 * reverseWords accept a reference to a String object as an argument. It reads words from the argument and returns a reference to a String object with the words (not character) in reverse order on the argument.  For example, if the argument is: “Here comes the sun”, the returned string would be: “sun the comes Here”
	 *
	 * @param string the string object to reverse.
	 * @return A reversed string reference object.
	 */
	public static String reverseWords(String string) {

		// Store string1 in an array
		String[] newString = string.split("\\s");

		// Create a StringBuilder object
		StringBuilder outputString = new StringBuilder();

		for (int i = newString.length - 1; i > -1; i--) {
			if (i > 0) {
				outputString.append(newString[i] + " ");
			} else {
				outputString.append(newString[i]);
			}
		}

		return outputString.toString();
	}

	/**
	 * toPigLatin accepts a reference to a String object as an argument. It reads words from the argument as input and coverts each word to “Pig Latin”, and returns a reference to a String object which represents a converted Pig Latin. In one version of Pig Latin, you convert a word by removing the first letter, placing that letter at the end of the word, and then appending “ay” to the word. Here is an example:
	 *
	 * English: I slept most of the night
	 * Pig Latin: Iay leptsay ostmay foay hetay ightnay

	 *
	 * @param string the string object to manipulate.
	 * @param app the string object to append.
	 * @return A manipulated string reference object.
	 */
	public static String toPigLatin(String string, String app) {

		///Create a StringBuilder object
		StringBuilder latin = new StringBuilder(string);

		//Rearrange the string to pig latin
		for (int i = 0; i < latin.length() - 1; i++) {
			if (Character.isWhitespace(latin.charAt(i + 1)) && Character.isLetter(latin.charAt(0))) {
				// save character to delete
				char delChar = latin.charAt(i);

				// delete character
				latin.deleteCharAt(i + 2);

				// insert deleted character + app at the end of each word
				// for (int j = i; j < latin.length() - i; j++) {
				// 	if (Character.isWhitespace(latin.charAt(j))) {
				// 		latin.insert(j + 2, delChar + app);
				// 	}
				// }
			}
		}

		return latin.toString();
	}

}
