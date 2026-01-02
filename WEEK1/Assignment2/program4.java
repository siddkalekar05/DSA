import java.util.*;
class Num4{
	public static void main(String[] arge){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=Sc.nextInt();
		int prod = 1;
		int i=1;
		while(i<=num){
			prod*=i;
			i++;
		}
		System.out.println("Factorial of "+num+" is "+prod );
	}
}


