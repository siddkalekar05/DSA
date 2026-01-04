import java.util.*;
class Num7{
	static void sumd(int x){
		int num = x;
		int sum = 0;
		while(num>0){
			int digit =num%10;
			if(digit%2==0){
				sum+=digit;
			}
			num = num/10;
		}
		System.out.println("Sum of even digits : "+sum);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the number : ");
		int x = sc.nextInt();
		sumd(x);
	}
}

