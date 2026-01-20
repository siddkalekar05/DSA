//Recursion code
import java.util.*;
class pal{
        static int reverse(int n, int rev){
                if(n==0){
                        return rev;
                }
                return reverse(n/10, rev*10+(n%10));
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter n : ");
                int n = sc.nextInt();
                int rev = reverse(n, 0);
                if(rev==n){
                        System.out.println("Pallindrome");
                }else{
                        System.out.println("Not pallindrome");
                }
        }
}

