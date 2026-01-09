//Sum of ele 
import java.util.*;
class Array4{
    static int sumele(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        }
        return sum;
    } 
    public static void main(String[] args) {
        int arr[] = {2,6,8,9,3,1};
        System.out.println("Sum ele : "+sumele(arr));
    }
    
}


