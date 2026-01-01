// Average of ele present in array
import java.util.*;
class Array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr : ");
        int size  = sc.nextInt();
        int arr[] = new int[size];
        int sum=0;
        double avg = 0;
        for( int i=0;i<size;i++){
                System.out.println("Enter "+i+" Element of arr : ");
		arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        } 
        avg=sum/size;
        System.out.println("Average of arr ele ( complete no ): "+avg);
    }
    
}

