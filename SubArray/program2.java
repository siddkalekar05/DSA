// PairCount (Optimize) 
import java.util.*;
class SubDemo2{
    static void sub(char arr[]){
       int acount =0;
       int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]=='a'){
            acount++;
        }else if(arr[i]=='g'){
            count+=acount;
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
 
