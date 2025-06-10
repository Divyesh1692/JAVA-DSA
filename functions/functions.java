public class functions {
    public static void main(String[] args) {
        int[] arr =new int[5];
        int p=0;
        p = insert(arr,p,50);
        p = insert(arr,p,60);
        p = insert(arr,p,70);
        p = insert(arr,p,900);
        p = insert(arr,p,20);
        p = insert(arr,p,50);

        System.out.println("isEmpty: "+ isEmpty(p));
        System.out.println("Size: "+size(p));
        update(arr,p,20,200);
        System.out.println(find(arr,p,20));
        p = delete(arr,p,60);
        print(arr,p);
    }

    public static int size(int p) {
        return p;
        //time: O(1)
    }
    public static boolean isEmpty(int p){
        if(p==0){
            return true;
        }
        return false;
        //time: O(1)

    }
    public static boolean find(int []arr,int p, int value){
        for(int i=0;i<p;i++){
            if(arr[i]==value){
                return true;
            }
        }
        return false;
        //time: O(n)

    }
    public static void update(int[]arr,int p, int oldV, int newV){
        for(int i=0;i<p;i++){
            if(arr[i]==oldV){
                arr[i]=newV;
            }
        }
        //time: O(n)

    }
    public static void print(int[] arr, int p){
        for(int i=0;i<p;i++){
            System.out.print(arr[i]+" ");
        }
        //time: O(n)
    }
    public static int insert(int[] arr,int p, int value){
        if(p==arr.length){
            System.out.println("Array is Full");
            return p;
        }
        arr[p]=value;
        p++;
        return p;
        //time: O(1)
    }
    public static int delete(int[] arr, int p, int value) {
        for (int i = 0; i < p; i++) {
            if (arr[i] == value) {
                for (int j = i; j < p - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                p--;
                break;
            }
        }
        return p;
        //time: O(n2)
    }

}
