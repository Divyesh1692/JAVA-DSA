public class check_array_sorted {
    public static void main(String[] args) {
        int [] arr ={1,2,5,4,5};
        System.out.println(function(arr,0));

    }

    public static boolean function(int[] arr,int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return function(arr,i+1);
    }
}
