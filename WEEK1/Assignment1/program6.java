//Second largest ele in array
import java.util.*;
class Array6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size  = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int largest = 0;
        int sec_largest = 0;
        for( int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                sec_largest=largest;
                largest=arr[i];
            }else if(arr[i]>sec_largest && sec_largest!=largest){
                sec_largest=arr[i];
            }
         }
         System.out.println("Second largest ele : "+sec_largest);
    }
}

