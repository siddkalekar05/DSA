//Sum of all even no from 1 to n 
import java.util.*;


class RecusionDemo1 {
    static int sum(int n){
        int sum = 0;
        if(n==1){
            return 1;
        }
        return n+sum(--n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    
}

