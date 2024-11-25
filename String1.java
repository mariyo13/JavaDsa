
import java.util.Stack;

public class String1 {
    // to check wheather given String is polindrem are not
    public static boolean isPolindrem(String str) {
        if (str == null) {
            return false;
        }
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // to subsequence are not
    public static boolean isSubequence(String string, String subString) {
        if (string == null) {
            return false;
        }
        int i = 0, j = 0;

        while (i < string.length() && j < subString.length()) {
            if (string.charAt(i) == subString.charAt(j)) {
                j++;
            }
            i++;
        }
        System.out.println(i + subString.length());
        return subString.length() == j;
    }

    // is anagram
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] num = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            num[s1.charAt(i)]++;
            num[s2.charAt(i)]--;
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                return false;
            }
        }
        return true;

    }

    // not a best solution
    public static String revseString(String str) {
        String ans = " ";
        Stack<String> s = new Stack();
        String temp = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                s.add(temp);
                temp = " ";
            }
        }
        while (!s.isEmpty()) {
            ans += s.pop();
            ans += " ";
        }
        return ans;
    }

    // overloaded reverse String methods
    public static String revseString(String str, int start, int end) {
        char[] ch = str.toCharArray();
        int i = start;
        int j = end;
        while (i < j) {
            swap(ch, i, j);
            i++;
            j--;
        }
        return new String(ch);
    }

    public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

    }

    public static void main(String[] args) {
        System.out.println(revseString("yamuna", 0, 5));
    }
}