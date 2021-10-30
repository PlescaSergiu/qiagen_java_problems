package problems;

/*An anagram is a word or a phrase that can be created by rearranging the letters of another given
word or phrase. We ignore white spaces and letter case. The all letters of "Desperation" can be
rearranged to the phrase &quot "A Rope Ends It".*/

import java.util.Arrays;

public class Anagrams {

    public boolean checkIfWordsAreAnagrams(String str1, String str2) {

        char[] str1ToChar = str1.replaceAll("\\s+","").toLowerCase().toCharArray();
        char[] str2ToChar = str2.replaceAll("\\s+","").toLowerCase().toCharArray();

        Arrays.sort(str1ToChar);
        Arrays.sort(str2ToChar);

        return Arrays.equals(str1ToChar, str2ToChar);
    }
}

