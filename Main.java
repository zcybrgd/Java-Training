import java.util.Scanner;
class JavaTraining{
    public static int factorial(int n){
        if(n>0){
            n*=factorial(n);
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