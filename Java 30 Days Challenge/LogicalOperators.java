public class LogicalOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        // AND operator //
        System.out.println(a>b && a<=b);
        System.out.println(a>b && a>=b);
        System.out.println(a<b && a!=b);
        System.out.println(a>=b && a<=b);
        System.out.println(a==b && a>b);
        
        // OR operator //
        System.out.println(a>b || a<=b);
        System.out.println(a>b || a>=b);
        System.out.println(a<b || a!=b);
        System.out.println(a>=b || a<=b);
        System.out.println(a==b || a>b);
        
        // NOT operator //
        System.out.println(! (a>b));
        System.out.println(!(a<=b));
        System.out.println(!(a>b)&&(a<b));
    }
    
}
