class Calculator{
    public int sub(int num1,int num2){
        return num1 - num2;
        
    }
}

public class Demo{
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.sub(3,5));
    }
}