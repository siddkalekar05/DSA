// Array have size n and q no of quiery print sum for all quiery starts from s to e

import java.util.*;

class PreDemo3{
    static void prefixSum(int arr[],int q){
        Scanner sc = new Scanner(System.in);
        int prefixarr[] = new int[arr.length];
        prefixarr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefixarr[i] = prefixarr[i-1]+arr[i];
        }
        for(int i=0;i<prefixarr.length;i++){
            System.out.print(prefixarr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<q;i++){
             int sum =0;
             System.out.println("Enter star and end index b/w 0 to "+(arr.length-1));
                int start = sc.nextInt();
                int end  = sc.nextInt();
           if(start==0){
             sum = prefixarr[end];
           }else{
            sum = prefixarr[end]-prefixarr[start-1];
           }
           System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{2,4,6,8,10};
        System.out.println("Enter no of quiery : ");
        int q = sc.nextInt();
        prefixSum(arr,q);

    }
}
 
