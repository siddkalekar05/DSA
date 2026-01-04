import java.util.*;
class Num6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		int i=0;
		int sqrt=0;	
		while(i*i<=num){
			sqrt=i;
			i++;
		}
		System.out.println("Square Root(without decimal value) : "+sqrt);
	}
}
