public class Pattern {
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            ;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        int k = 1;
        int alpha = (int) 'a';
        alpha -= 1;
        for (int i = 1; i <= n; i++) {
            ;
            for (int j = 1; j <= i; j++) {
                int temp = (alpha + k);
                System.out.print((char) temp + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= n + 1 - i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("_" + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }

    }

    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("_" + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }

    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("_" + " ");
            }
            for (int j = 5; j >= n - i + 1; j--) {
                System.out.print(j + " ");
            }
            // for (int j = ; j ; j) {
            // System.out.print(j + " ");
            // }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern10(5);
    }
}