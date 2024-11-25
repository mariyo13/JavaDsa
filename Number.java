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

    public static void main(String[] args) {
        nPrimeNumber(100);
    }
}
