//Sum of n natural number using recursion
import java.util.*;
class recursion1 {
    static int sumof(int n){
        if(n==0){
            return 0;
        }
        return(n+sumof(n-1));
    }
    static void sumof1(int n){
        int sum = 0;
        sum = n*(n+1)/2;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        sumof1(n);
        System.out.println(sumof(n));
    }
    
}

