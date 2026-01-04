import java.util.*;
class Num10{
	static void fibo(int x){
		int num = x;
		int f1=0;
		int f2=1;
		 	for(int i=2;i<=num;i++){
			
				int f3 = f1*f2;
				f1=f2;
				f2=f3;
				return f3;
			}	
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		fibo(x);
	}
}

