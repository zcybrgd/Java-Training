import java.util.Scanner;
public class App{
    public int factorial(int n){
        if(n>1){
            return n*factorial(n-1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        App app = new App();
        System.out.println("the factorial of : " + n + " is : " +app.factorial(n));
        input.close();
    }
}