package methods;

public class Armstrong {

    // Method to count digits
    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    // Method to calculate power
    public static int power(int base, int exp) {
        int res = 1;
        for (int i = 1; i <= exp; i++) {
            res = res * base;
        }
        return res;
    }

    // Method to check Armstrong
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;

        int digits = count(n);
        

        while (n > 0 && digits > 0) {
            int r = n % 10;
            sum = sum + power(r, digits);
            n = n / 10;
        }
        System.out.println(sum);

        if (sum == temp) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
