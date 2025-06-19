import java.util.Arrays;

public class crud_in_sorted_array {
    public static void main(String[] args){
     int[] arr = {1,5,7,9,10,15};
        insert(arr,8);
        System.out.println(Arrays.toString(arr));
        update(arr,8,6);
        System.out.println(Arrays.toString(arr));
        delete(arr,6);
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,5));
    }
    public static void insert(int [] arr,int k){
        int i=arr.length-1-1;
        while(i>=0 && k<arr[i]){
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1] = k;
    }

    public static void update(int[] arr, int oldV, int newV) {
        int l=0;
        int r= arr.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]==oldV){
                for (int i = mid; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                int j = arr.length-2;
                while(j>=0 && newV<arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=newV;
            }else if(arr[mid]<oldV){
                l++;
            }else{
                r--;
            }
        }
    }

    public static void delete (int [] arr, int k) {
        int l=0;
        int r= arr.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]==k){
                for (int i = mid; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length-1] = 0;
            }else if(arr[mid]<k){
                l++;
            }else{
                r--;
            }
        }
    }

    public static boolean search (int [] arr, int k) {
        int l=0;
        int r= arr.length-1;
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]<k){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
}
// time complexity: O(n)
// space complexity: O(n)
