// Equillibruim ele 
import java.util.*;
class SubDemo3{
    static void sub(int arr[]){
       for(int i=0;i<arr.length;i++){
        int leftSum =0;
        int rightSum =0;
        for(int j=0;j<i;j++){
            leftSum+=arr[i];
        }
        for(int j=i+1;j<arr.length;j++){
            rightSum+=arr[i];
        }
    
     if(leftSum==rightSum){
            System.out.println("Equllibrium index : "+i);
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int []{1,2,5,5,-2};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sub(arr);
    }
}
 
