/*Write a java program to compute factorial of a given number.*/
import java.util.Scanner;

public class Factorial{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int factorial = 1;
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        
        System.out.println("Factorial is " + factorial);
    }
}
