/**
 * KATA : https://www.codewars.com/kata/56747fd5cb988479af000028
 */
public class GetTheMiddleCharacter {

    public static String getMiddle(String word) {

        float middle =(word.length())/2f; //center of word
        return word.substring((int)Math.ceil(middle-1), (int)Math.floor(middle+1));
    }
}
