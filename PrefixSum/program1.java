// calculate the runs score in each over 
class PreDemo1{
    static void prefix(int arr[]){
        for(int i=0;i<arr.length;i++){
            int run =0;
	    if(i==0){
		    System.out.println("Run score in over : "+(i+1)+" "+run);
	    }else{
           	 run = arr[i]-arr[i-1];
            	System.out.println("Runs score in over : "+(i+1)+" "+run);
	    }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,10,18,22,29,35,40};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        prefix(arr);
    }
    
}

