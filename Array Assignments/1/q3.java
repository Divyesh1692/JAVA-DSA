public class q3 {
    public static void main(String[] args){
        int[] arr ={9,2,5,7,3,8,9,0};
        int n = arr.length;
        int[] arr1=new int[n/2];
        int[] arr2 =new int[n-n/2];

        for(int i=0;i<n;i++){
            if(i<n/2){
                arr1[i]=arr[i];
            }else{
                arr2[i-n/2]=arr[i];
            }
        }
        System.out.print(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));
    }
}
// time complexity: O(n)
// space complexity: O(n)
