// Max ele upto e 
import java.util.*;
class PreDemo4{
    static void maxEle(int arr[],int index){
        if(index>arr.length-1){
            System.out.println("Invalid Index");
            return;
        }else{
            int max = arr[0];
            for(int i=0;i<=index;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println("Max ele upto "+index+ " is "+max);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{3,4,5,1,2,7,9,8};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter end index : ");
        int index = sc.nextInt();
        maxEle(arr,index);

    }
}
 
