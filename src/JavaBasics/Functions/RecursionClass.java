package JavaBasics.Functions;

public class RecursionClass {
    public static void main(String[] args) {
        System.out.println("Starts");
        test_function(10);

        System.out.println("Sum of digits is: " + Sum(999));
    }

    static void test_function(int n){
        if(n==0) return;
        System.out.println(n);
        test_function(n-1);
        if(n==1) {
            System.out.println();
        }
        System.out.println(n);
    }

    static int Sum(int n){
        if(n<=9){
            return n;
        }

        return n%10+Sum(n/10);
    }
}
