public class UnaryOperators {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
    }
}

//i++ ==> first will fetch the value and then increment [POST-INCREMENT]
//++i ==> fist will increment and fetch the value [PRE-INCREMENT]
//--i ==> first will decrement and then fetch the value [PRE-DECREMENT]
//i-- ==> first will fetch the value and then decrement the value [POST-DECREMENT]


// pre and post performs differently for increment , decrement while fetching a value 