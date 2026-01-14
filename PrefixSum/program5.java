// Left Max ele 
import java.util.*;
class PreDemo5{
    static void maxEle(int arr[]){
        int larr[] = new int[arr.length];
        larr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(larr[i-1]>arr[i]){
                larr[i] = larr[i-1];
            }else{
                larr[i]=arr[i];
            }
        }
        System.out.println();
        for(int i=0;i<larr.length;i++){
            System.out.print(larr[i]+" ");
        }
	System.out.println();
           
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{3,4,5,1,2,7,9,8};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        maxEle(arr);

    }
}
 
