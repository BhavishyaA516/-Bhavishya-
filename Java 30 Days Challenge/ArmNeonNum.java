import java.util.Scanner;

public class ArmNeonNum {

    public static void main(String[] args) {
        int n, res1, res2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        Methods m = new Methods();
        res1 = m.armstrongNumber(n);
        res2 = m.neonNumber(n);
        if (res1 == 1 && res2 == 1) {
            System.out.println("Both Armstrong and Neon");
        } else if (res1 == 0 && res2 == 0) {
            System.out.println("Neither Armstrong nor Neon");
        } else if (res1 == 1 && res2 == 0) {
            System.out.println("It is Armstrong but not Neon");
        } else {
            System.out.println("It is Neon but not Armstrong");
        }
    }

    static class Methods {
        public int armstrongNumber(int n) {
            int temp, rem, sum = 0;
            temp = n;
            while (n != 0) {
                rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            if (temp == sum) return 1;
            return 0;
        }

        public int neonNumber(int n) {
            int rem, sqt, sum = 0;
            sqt = n * n;
            while (sqt != 0) {
                rem = sqt % 10;
                sum = sum + rem;
                sqt = sqt / 10;
            }
            if (sum == n) return 1;
            return 0;
        }
    }
}

