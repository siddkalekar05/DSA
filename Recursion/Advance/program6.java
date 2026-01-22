//Sum of digits present in number 
import java.util.*;
class recursion4 {
   static int sumofdig(int n){
    if(n==0){
        return 0;
    }
    return (n%10)+sumofdig(n/10);
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    System.out.println("Sum od digits in : "+n+" is "+sumofdig(n));
   }
    
}

