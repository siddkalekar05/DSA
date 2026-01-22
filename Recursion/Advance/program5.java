//Digit count in number 
import java.util.Scanner;
class recursion3 {
    static int digitof(int n){
        if(n==0){
            return 0;
        }
        return 1+digitof(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n  : ");
        int n = sc.nextInt();
        System.out.println("Digit in "+n+" is "+digitof(n));
    }
    
}

