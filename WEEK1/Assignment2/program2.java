import java.util.*;
class Num2{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value of num : ");
		int num = Sc.nextInt();
		int temp=num;
		int r;
		int rev=0;
		while(num>0){
			r = num%10;
			rev = rev*10+r;
			num/=10;
		}
		System.out.println("Reverse of "+temp+" is : "+rev);
		if(temp==rev){
			System.out.println(" It is pellindrome ");
		}else{
			System.out.println( " It is not a pellindrome ");
		}
	}
}

