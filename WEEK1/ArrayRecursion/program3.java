//Max ele of array
class Array3{
    static int maxele(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    } 
    public static void main(String[] args) {
        int arr[] = {2,6,8,9,3,1};
        System.out.println("Max ele : "+maxele(arr));
    }
    
}


