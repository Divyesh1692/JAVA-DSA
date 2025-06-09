public class common_ele_two_array {
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5,6,7};
        int[] a2 = {8,9,10,5,5,7};

        int n1=a1.length, n2=a2.length,count=0;

        for(int i=0; i<n1;i++){
            count=0;

            for(int j=0;j<n2;j++){
                if(a1[i]==a2[j]){
                    count++;
                }
            }
            if(count>0){
                System.out.print(a1[i]+ " ");
            }
        }
    }
}
// time complexity: O(n^2)
// space complexity: O(1)
