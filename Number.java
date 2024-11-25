public class Number {
    public static boolean factorNumber(int num, int i) {
        if (i % num == 0) {
            return true;
        }
        return false;
    }

    public static void nThFactor(int n, int num) {
        for (int i = 1; i <= n; i++) {
            if (factorNumber(num, i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void nPrimeNumber(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static int reverseNumber(int n) {
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        return ans;
    }

    static int numberDigits(int n) {
        int digits = 0;
        while (n != 0) {
            digits++;
            n = n / 10;
        }
        return digits;
    }

    static boolean isAmstrongNumber(int n) {
        int digits = numberDigits(n);
        int temp = n;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans += (int) Math.pow(rem, digits);
            n = n / 10;
        }
        System.out.println(ans);
        if (temp == ans) {
            return true;
        }
        return false;
    }

    static void numberAmstrongNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (isAmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        numberAmstrongNumber(1000);
    }
}
