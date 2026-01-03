import java.util.*;
class ArrayDemo5{
        public static void main(String[] args){
                Scanner Sc  = new Scanner(System.in);
                System.out.println("Enter Array size : ");
                int size = Sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter Array elements : ");
                for(int i=0;i<size;i++){
                        arr[i] = Sc.nextInt();
                }
                int prod = 1;
                for( int i=0;i<arr.length;i++){
                        prod = arr[i]*prod;
                }
                System.out.println("product ele : "+prod);
        }
}
