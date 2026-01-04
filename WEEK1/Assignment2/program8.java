import java.util.*;
class Num8{
	static void square(int x){
		int num = x;
		while(num>0){
			if(num%2==0){
				int even=num;
				System.out.println("Even digit : "+even);
				break;
			}else{
				int odd=num*num;
				System.out.println("Odd digit (square) : "+odd);
				break;
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		square(x);
	}
}

