import java.util.*;
class ArrayDemo4{
	public static void main(String[] args){
		Scanner Sc  = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = Sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array elements : ");
		for(int i=0;i<size;i++){
			arr[i] = Sc.nextInt();
		}
		int large = arr[0];
		for( int i=0;i<arr.length;i++){
			if(arr[i]>=large){
				large=arr[i];
			}
		}
		System.out.println("Largest ele : "+large);
	}
}
