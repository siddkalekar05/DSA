//Search ele in array
import java.util.*;
class Array1 {
    static int searchele(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,6,8,9,3};
        System.out.println("Enter the ele for Search : ");
        int n = sc.nextInt();
        int index = searchele(arr, n);
        if(index!=-1){
            System.out.println("Ele Found");
        }else{
            System.out.println("Ele not found");
        }
    }
    
}

