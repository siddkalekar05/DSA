//Count of Even,Odd,0
class Array7{
    static void classifyele(int arr[]){
        int evencount = 0;
        int oddcount = 0;
        int zerocount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zerocount++;
            }else if(arr[i]%2==0){
                evencount++;
            }else{
                oddcount++;
         }
    }
        System.out.println("Even ele count : "+evencount);
        System.out.println("Odd ele count : "+oddcount);
        System.out.println("Zero ele count : "+zerocount);
    } 
    public static void main(String[] args) {
        int arr[] = {2,6,8,9,0,4,1};
        classifyele(arr);
    } 
}
