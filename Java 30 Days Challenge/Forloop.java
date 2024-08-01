public class Forloop {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<10;i++){
            System.out.println(" DAY " +  i);
            for(j=0;j<=9;j++){
                System.out.println("  "  + (j+8)+" _ " + (j+9));
            }
        }
    }
}
