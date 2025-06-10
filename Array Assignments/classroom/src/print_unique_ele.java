public class print_unique_ele {
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5,6,7,4};

        int n1=a1.length;
        int count;

        for(int i=0; i<n1;i++){
            count=0;

            for(int j=0;j<n1;j++){
                if(a1[i]==a1[j]){
                    count++;
                    if(count>1){
                        break;
                    }
                }
            }
            if(count==1){
                System.out.print(a1[i]+ " ");
            }
        }
    }
}
// time complexity: O(n^2)
// space complexity: O(n)
