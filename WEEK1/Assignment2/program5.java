import java.util.*;
class Num5{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = Sc.nextInt();
		int count=0;
		int temp=num;
		if(temp==0){
			count+=1;
		}else{
			while(temp!=0){
				temp=temp/10;
				count++;
			}
		}
			
		
		System.out.println("Given number is "+count+" digit number ");
	}
}
