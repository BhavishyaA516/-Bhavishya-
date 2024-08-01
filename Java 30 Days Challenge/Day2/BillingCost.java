
import java.util.Scanner;

public class BillingCost{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the cost of Pencil:");
        float Pencil=scanner.nextFloat();
        System.out.println("Enter the cost of Pen:");
        float Pen=scanner.nextFloat();
        System.out.println("Enter the cost of Eraser:");
        float Eraser=scanner.nextFloat();

        float totalCost= Pencil+Pen+Eraser;
        float gst= totalCost*0.18f;
        float totalCostwithgst= totalCost+gst;

        System.out.println("Total Cost:" + totalCost);
        System.out.println("GST(18%):"+gst);
        System.out.println("Total Cost with GST:"+ totalCostwithgst);

    scanner.close();
    }
}

