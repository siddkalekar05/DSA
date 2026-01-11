//+Ve,-Ve,0
class Array8{
    static void classify1ele(int arr[]){
        int poscount = 0;
        int negcount = 0;
        int zerocount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zerocount++;
            }else if(arr[i]>0){
                poscount++;
            }else{
            negcount++;
         }
    }
        System.out.println("Even ele count : "+poscount);
        System.out.println("Odd ele count : "+negcount);
        System.out.println("Zero ele count : "+zerocount);
    } 
    public static void main(String[] args) {
        int arr[] = {2,-6,8,-9,0,-4,1};
        classify1ele(arr);
    } 
}


