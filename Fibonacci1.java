import java.util.Scanner;

public class Fibonacci1 {
    public int Fibonacci1(int n){
        if(n <= 1){
            return n;
        }

        return Fibonacci1(n-1) + Fibonacci1(n-2);
    }
}

class Fibonacci
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        Fibonacci1 obj = new Fibonacci1();
        int ans = obj.Fibonacci1(n);

        System.out.println("ans is : "+ans);

    }
}
