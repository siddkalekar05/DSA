// Print sub array
import java.util.*;
class SubDemo4{
    static void sub(int arr[],int start,int end){
      for(int i=start;i<end;i++){
        System.out.print(arr[i]+" ");
        
      }
      System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int []{1,2,5,1,5,5,-2,1,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter start index btw 0 to "+arr.length +" ");
        int start = sc.nextInt();
        System.out.println("Enter end index btw 0 and "+arr.length+" ");
        int end = sc.nextInt();
        sub(arr,start,end);
    }
}
 
