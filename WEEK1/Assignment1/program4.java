//largest ele in array
import java.util.*;
class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arr : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for( int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int large = arr[0];
        for( int i=0;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        System.out.println("Largest ele of arr : "+large);
        
    }
    
}

