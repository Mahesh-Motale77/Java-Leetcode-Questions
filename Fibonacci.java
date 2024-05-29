import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to print fibonacci series: ");
        int n = sc.nextInt();

        int x = 0;
        int y = 1;
        int sum = 0;
        for(int i=0; i<n; i++){
            System.out.println(x);
            sum = x + y;
            x = y;
            y = sum;
        }   
    }
}
