import java.util.Scanner;
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        if(N>=2 && N<=20){
            for(int i=1;i<=10;i++){
                    System.out.println(N+ " * " +i+ " = " +N*i);
            }
        sc.close();
        }
    }
}
