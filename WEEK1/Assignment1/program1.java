// Count even and odd ele in java
import java.util.*;
class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arr : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int even_count=0;
        int odd_count = 0;
        System.out.println("Enter the ele of array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            even_count+=0;
            odd_count+=0;
        }else if(arr[i]%2==0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        System.out.println("Even no count : "+even_count+" and odd no count : "+odd_count);

    }
}

