//Count digit
import java.util.*;


class RecusionDemo2 {
    static int digit(int n){
        if(n==0){
            return 0;
        }
        return 1+digit(n/10) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        System.out.println(digit(n));
    }
    
}

