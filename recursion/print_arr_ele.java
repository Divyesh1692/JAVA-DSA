public class print_arr_ele {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        function(arr,arr.length-1);
    }

    public static void function(int[] arr,int n){
       if(n<0){
           return;
       }
        function(arr,n-1);
        System.out.println(arr[n]);
    }
}
