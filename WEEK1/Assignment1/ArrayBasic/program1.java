import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{1,2,3,4};
		
		System.out.println("Enter ele for search : ");
		int n = sc.nextInt();
		for(int i=0;i<=arr.length;i++){
			if(arr[i]==n){
				System.out.println("Ele found at index : "+i);
				break;
		}
	}
   }
}

