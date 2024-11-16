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

    public static void main(String[] args) {
        System.out.println(isPolindrem("manu"));
        System.out.println(isPolindrem("malalam"));
        System.out.println(isSubequence("greeksforgreeks", "grf"));
    }
}