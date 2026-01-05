import java.util.*;
class ArrayDemo3{
	public static void main(String[] args){
		Scanner Sc  = new Scanner(System.in);
		int arr[] = new int[]{1,23,14,56,98};
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			
		}
	        int min = arr[0];
		for(int i=0;i<arr.length;i++){
			 if(arr[i]<min){
			 min = arr[i];
			 }
		} 	 
		System.out.println("Max ele : "+max+" Min ele : "+min);
	}
}
