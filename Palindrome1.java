import java.util.Scanner;

class Palindrome1 {
    // Reversing the Entire Number
    public boolean isPalindrome1(int x) {
        int revNumber = 0;
        int original = x;
        while(x > 0){
            int digit = x % 10;
            revNumber = (revNumber * 10) + digit ;
            x = x / 10;
        }

        if(revNumber == original){
            return true;
        }
        else{
            return false;
        }
    }

    // Reversing half of the number
    public boolean isPalindrome2(int x){  
        if( (x < 0) || (x != 0 && x % 10 == 0)){
            return false;
        }
        int revNumber = 0;
        while(x > revNumber){
            revNumber = (revNumber * 10) + (x % 10);
            x /= 10;
        }
        if((x == revNumber) || (x == revNumber/10)){
            return true;
        }
        else{
            return false;
        }
    }
}

class Palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        Palindrome1 p1 = new Palindrome1();

        System.out.println("The Given number is Palindrome ?");
        // boolean ans = p1.isPalindrome1(x);
        boolean ans = p1.isPalindrome2(x);

        System.out.println(ans);
    }           
}   