 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int output = number;
          for (int i = number - 1; i>0; i--){
              output = output * i;
            }
          return output;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          //initialize output to a blank string
          String output = "";
          //begin with the first letter
          output += phrase.toUpperCase().charAt(0);
          //iterate through the phrase, adding a capital letter of any character following a space
          for (int i = 1; i <= phrase.length() - 1; i++){
              if (phrase.charAt(i-1) == ' '){
                  output += phrase.toUpperCase().charAt(i);
                }
            }
          return output;
          //this won't work with hyphenated phrases if the user wants both letters in the acronym
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          //tried nested for loops first, then tried a switch
          String output = "";
          for (char c: word.toCharArray()) {
              output += Character.toString((char) (((c - 'a' + 3) % 26) + 'a'));
            }
          return output;
      }
}
