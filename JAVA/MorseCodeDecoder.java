/**
 * Kata : https://www.codewars.com/kata/54b724efac3d5402db00065e
 */
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        StringBuilder result = new StringBuilder();
        String[] word = morseCode.split("   ");//split word
        for(String w : word) {
            //del space
            if(w.length()>0){
                String[] character = w.split(" ");//split char
                for(String c : character) {
                    String decodeMorse = MorseCode.get(c);
                    if(decodeMorse!=null) result.append(decodeMorse);
                }
                result.append(' ');
            }
        }
        return result.deleteCharAt(result.length()-1).toString();

    }
}
