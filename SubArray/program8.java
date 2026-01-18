// Print all subArray sum start from index start
import java.util.*;
class SubDemo8{
    static void sub(int arr[],int start){
       int sum =0;
       for(int j=start;j<arr.length;j++){
            sum+=arr[j];
        }
        System.out.println(sum);
    
}
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = new int []{1,2,3,4};
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter starting index b/w 0 to "+arr.length+" ");
        int start = sc.nextInt();
        sub(arr,start);
  }
}
    
