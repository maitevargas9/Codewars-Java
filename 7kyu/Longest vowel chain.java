/*
Description

The vowel substrings in the word codewarriors are o,e,a,io. The longest of these has a length of 2. Given a 
lowercase string that has alphabetic characters only (both vowels and consonants) and no spaces, return the 
length of the longest vowel substring. Vowels are any of aeiou.

Good luck!
*/

class Solution {

  public static int solve(String s) {
    String[] vowelGroups = s.split("[^aeiouAEIOU]+");
    int maxLength = 0;

    for (String group : vowelGroups) {
      maxLength = Math.max(maxLength, group.length());
    }

    return maxLength;
  }
}
