import java.util.*;
class Num1{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = Sc.nextInt();
		int temp =num;
		int r;
		int rev=0;
		while(num>0){
			r = num%10;
			rev = rev*10+r;
			num/=10;
		}
		System.out.println(rev);
	}
}
