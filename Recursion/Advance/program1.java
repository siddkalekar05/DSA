//Normal code 
import java.util.*;                                                                                                     class Reverse{
        static void factor(int x){
                int rev = 0;
                int temp = x;
                int r=0;
                while(temp>0){
                        r = temp%10;
                        rev = (rev*10)+r;
                        temp = temp/10;
                }
                System.out.println(rev);
		if(x==rev){
			System.out.println("Pallindrome");
		}else{
			System.out.println("Not pallindrome");
		}
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int x = sc.nextInt();
        factor(x);
        }
}


