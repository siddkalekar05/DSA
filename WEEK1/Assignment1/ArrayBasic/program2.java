import java.util.*;
class ArrayDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{1,2,3,4,5};
		System.out.println("Enter the ele for Search : ");
		int n = sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(n==arr[i]){
				System.out.println("Ele found at index : "+i);
				break;
			}
		}
	}
}

