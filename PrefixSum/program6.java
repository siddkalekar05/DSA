// Right Max ele 
import java.util.*;
class PreDemo6{
    static void maxEle(int arr[]){
       int n = arr.length;
       int rightarr[] = new int[n];
       rightarr[n-1] = arr[n-1];
       for(int i=n-2;i>=0;i--){
        if(rightarr[i+1]>arr[i]){
            rightarr[i] = rightarr[i+1];
        }else{
            rightarr[i] = arr[i];
        }
       }
        System.out.println();
        for(int i=0;i<rightarr.length;i++){
            System.out.print(rightarr[i]+" ");
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
 
