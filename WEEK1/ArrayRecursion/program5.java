//Avg of array
class Array5{
    static int avgele(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        }
        return sum/arr.length;
    } 
    public static void main(String[] args) {
        int arr[] = {2,6,8,9,4,1};
        System.out.println("Average ele : "+avgele(arr));
    }
    
}


