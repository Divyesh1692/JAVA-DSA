public class print_duplicate_ele {
    public static void main(String[] args){
        int[] a1 = {1,3,2,3,4,5,3,6,7,4};
        int n1=a1.length;
        boolean[] visited = new boolean[n1];
        int count;

        for(int i=0; i<n1;i++){
            if (visited[i]) continue;
            count=0;

            for(int j=0;j<n1;j++){
                if(a1[i]==a1[j]){
                    count++;
                    if(count>1){
                        visited[j] = true;
                    }
                }
            }
            if (count > 1) {
                System.out.print(a1[i] + " ");
                visited[i] = true;
            }

        }
    }
}
// time complexity: O(n^2)
// space complexity: O(n)
