import java.util.*;
class ArrayDemo6{
        public static void main(String[] args){
                Scanner Sc  = new Scanner(System.in);
                System.out.println("Enter Array size : ");
                int size = Sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter Array elements : ");
                for(int i=0;i<size;i++){
                        arr[i] = Sc.nextInt();
                }
                for( int i=0;i<arr.length;i++){
                        if(arr[i]==0){
                                arr[i] =5;                      }
                }
                for( int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

        }
}
