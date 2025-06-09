public class pattern8 {
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++) {

            for(int s=1;s<=n;s++){
                if(s==i){
                        System.out.print("*");
                }else{
                        System.out.print(" ");
                }
            }

            for (int s = 2; s <= n; s++) {
                if(i+s==n+1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}

