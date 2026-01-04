import java.util.*;
class Num9{
	static void perfect(int x){
		int i=1;
		int sum = 0;
		int num=x;
		while(i<num){
			if(num%i==0){
				sum+=i;
			}
			i++;
		} 
		if(num==sum){
			System.out.println(num+" is a perfect number ");
		}else{
			System.out.println(num+" is a Abundant number ");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		perfect(x);
	}
}
