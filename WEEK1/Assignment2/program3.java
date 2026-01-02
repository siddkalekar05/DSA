import java.util.*;
class Num3{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value of num : ");
		int num = Sc.nextInt();
		int i=1;
		int count =0;
		while(i<=num){
			if(num%i==0){
				count++;
			}
			i++;
		} 
		if(count==2){
			System.out.println(num+" is prime Number ");
		}else{
			System.out.println(num+" is composite Number");
		}
	}
}
