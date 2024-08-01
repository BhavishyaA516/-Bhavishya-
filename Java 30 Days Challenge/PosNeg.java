import java.util.Scanner;
public class PosNeg {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        if(n>0){
            System.out.println("Positive number");
        }
        else if (n==0){
            System.out.println("Neither positive nor negative");
        }
        else {
            System.out.println("Negative number");
        }
        sc.close();

    }
    
}
