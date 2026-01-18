// Print all subArray and there sum
import java.util.*;
class SubDemo7{
    static void sub(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum =0;
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                if(sum>0){
                    System.out.println(" : "+sum);
                }else{
                    System.out.println();
                }
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
 
