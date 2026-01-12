// Array Tranverse From start to end index
import java.util.*;

class PreDemo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{12,15,46,78,98,32};
        System.out.println("Enter star and end index b/w 0 to "+arr.length);
        int start = sc.nextInt();
        int end  = sc.nextInt();
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
	System.out.println();
    }

}
