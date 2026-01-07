import java.util.*;

class ArrayDemo7 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int size = Sc.nextInt();

        int arr[] = new int[size];
        int arr1[] = new int[size];

        System.out.println("Enter Array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = Sc.nextInt();
        }

        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                arr1[i] = arr[i];
	    } else{
		    arr1[i]=large;

	    }	
    	}

        System.out.println("Progressive maximum values:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

   }
}

