//Factorial using recurtion
import java.util.*;
class recursion2 {
    static int factof(int n){
        if(n==0){
            return 1;
        }
        return(n*factof(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        factof(n);
        System.out.println("Factorial of "+n+" is : "+factof(n));
    }
}

