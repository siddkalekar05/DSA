//Min ele in array
class Array2 {
    static int minele(int arr[]){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    } 
    public static void main(String[] args) {
        int arr[] = {2,6,8,9,3,1};
        System.out.println("Min ele : "+searchele(arr));
    }
    
}

