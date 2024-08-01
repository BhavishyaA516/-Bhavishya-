import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int n,res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive number:");
        n=sc.nextInt();
        Factorial f = new Factorial();
        res=f.fact(n);
        System.out.println("Factorial of " +n+ " is " +res);
    }
    int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }
}
