public class Maxitem_example {
    public static void main(String[] args) {
        int[] arr= {1,7,9,47};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }
    // imagine that aar is not empty
    static int max(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int max=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    // max value in range
    static int maxRange(int[] arr, int start, int end){
        int max=start;
        for(int i =start;i<end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
