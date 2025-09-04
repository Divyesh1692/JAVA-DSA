public class largest_arr_ele {
    public static void main(String[] args) {
        int[] arr ={1,2,8,4,5};
        int max = Integer.MIN_VALUE;
        function(arr,arr.length-1,max);
    }

    public static void function(int[] arr,int n,int max){
       if(n<0){
           System.out.println("max: "+max);
           return;
       }
       max=Math.max(arr[n],max);
        function(arr,n-1,max);

    }
}
