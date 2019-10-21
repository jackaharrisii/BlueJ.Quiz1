
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String result = baseValue + valueToBeAdded;
        return result;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String result = new StringBuffer(valueToBeReversed).reverse().toString();
        return result;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int i = word.length() / 2;
        char result = word.charAt(i);
        return result;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        //come back to this one
        //nevermind, got it to work - probably not the prettiest solution though
        //revisit to clean up if I have time leftover
        String foo = Character.toString(charToRemove);
        String result = value.replaceAll(foo, "");
        return result;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        //start at the end of the string and move backwards until I find a space
        //move forwards one
        //return the remainder of the string
        String result = sentence.substring(sentence.lastIndexOf(" ")+1);
        return result;
        //this works for all test cases, but it wouldn't work for a single word
        //if time, revisit for test cases not used
    }
}
