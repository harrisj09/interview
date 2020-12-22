package leetcode.string;

// https://www.codewars.com/kata/55c04b4cc56a697bb0000048
public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        int length = str2.length();
        for(int i = 0; i < length; i++) {
            char letter = str2.charAt(i);
            int charIndex = findChar(str1, letter);
            if(charIndex == -1) {
                return false;
            }
            str1 = removeChar(str1, charIndex);
        }
        return true;
    }

    public static int findChar(String str1, char letter) {
        return str1.indexOf(letter);
    }

    public static String removeChar(String str1, int charIndex) {
        String temp = str1.substring(0, charIndex);
        return temp + str1.substring(charIndex + 1);
    }
}
