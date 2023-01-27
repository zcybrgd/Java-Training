import java.util.Scanner;
public class App{
    public static int factorial(int n){
        if(n>1){
            n=n*factorial(n-1);
        }
        return n;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int result = factorial(n);
        System.out.println("the factorial of : " + n + " is : " +result);
        input.close();
    }
}