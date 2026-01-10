//Product of array ele 
class Array6{
    static int prodele(int arr[]){
        int prod = 1;
        for(int i=0;i<arr.length;i++){
        prod*=arr[i];
        }
        return prod;
    } 
    public static void main(String[] args) {
        int arr[] = {2,6,8,9,4,1};
        System.out.println("Product of  ele : "+prodele(arr));
    }
    
}


