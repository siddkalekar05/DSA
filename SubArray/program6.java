// Print all subArray
import java.util.*;
class SubDemo6{
      static void sub(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print("["+arr[k]+"]"+" ");
                }
                System.out.println();
            }
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int []{1,2,3,4};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sub(arr);
    }
}
 
