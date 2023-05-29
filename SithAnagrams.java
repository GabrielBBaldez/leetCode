import java.io.IOException;
import java.util.Arrays;

public class SithAnagrams {
    public static void main(String[] args) throws IOException {
       String word1 ="Kylo Ren";
        String word2 ="KN Lore Y";
        System.out.println(areAnagrams(word1,word2));
    }

    /*Since Kylo Ren discovered that his name was an anagram for Ken Rylo (which was the family's dog), he became obsessed with anagrams.
     As he was not the smartest kid around, he asked for one renowned Sith programmer (you!) to write some code that could check if two words were anagrams.
     Two words are considered anagrams if they consist of the same characters, even if in a different order.
     So "ACT" is an anagram for "CAT" and for "ACT" itself, but not for "TACT".Your method should be case insensitive and must ignore whitespaces ("Kylo Ren" and "KN Lore Y" should be considered anagrams).
    Method signature: boolean areAnagrams(String word1, String word2)*/
    public static boolean  areAnagrams(String word1, String word2) {
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        char[] charArrayWord1 = word1.toCharArray();
        char[] charArrayWord2 = word2.toCharArray();

        Arrays.sort(charArrayWord1);
        Arrays.sort(charArrayWord2);

        return Arrays.equals(charArrayWord1, charArrayWord2);
    }
}
