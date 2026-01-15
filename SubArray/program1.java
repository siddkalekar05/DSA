// PairCount (blueforth) 
import java.util.*;
class SubDemo1{
    static void sub(char arr[]){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]=='g'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = new char[]{'a','b','e','g','a','g'};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sub(arr);
    }
}
 
