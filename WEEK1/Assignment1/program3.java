// avf of all ele present in array
import java.util.*;
class Array3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arr : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int even_count=0;
        int odd_count = 0;
        int zero_count=0;
        System.out.println("Enter the ele of array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            zero_count+=1;
        }else if(arr[i]%2==0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        System.out.println("Even no count : "+even_count+" odd no count : "+odd_count+" zero count : "+zero_count);

    }
}

