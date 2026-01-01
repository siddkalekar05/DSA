//Smallest ele in array
import java.util.*;
class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arr : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for( int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        for( int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("Smallest ele of arr : "+small);
        
    }
    
}

