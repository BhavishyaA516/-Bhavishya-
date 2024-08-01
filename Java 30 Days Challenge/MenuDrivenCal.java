import java.util.Scanner;
public class MenuDrivenCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    while (true){
        System.out.println("Menu");
        System.out.println("1.Addition(+)");
        System.out.println("2.SUbstraction(-)");
        System.out.println("3.Multiplication(*)");
        System.out.println("4.Division(/)");
        System.out.println("0.Exit");
        System.out.println("Enter the operation");
        int operation = sc.nextInt();

        if(operation == '0'){
            break;
        }
        System.out.println("Enter the First number");
        Double num1 = sc.nextDouble();
        System.out.println("Enter the Second number");
        Double num2 = sc.nextDouble();
        double result=0;
        switch(operation){
            case '+':
            result=num1+num2;
            break;
            case '-':
            result=num1-num2;
            break;
            case '*':
            result=num1*num2;
            break;
            case '/':
                if(num2!=0){
                    result=num1/num2;
                }
                else{
                    System.out.println("Underdefined");
                    continue;
                }
                break;
                default:
                    System.out.println("Invalid operations!");
                    continue;
                }
                System.out.println("Result:" + result);
                System.out.println(" ");
                sc.close();
                System.out.println("Calculator exited");
            }
        }
}
