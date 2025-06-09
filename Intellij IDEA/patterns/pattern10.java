public class pattern10 {
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++) {
            for(int s=1; s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(j==1) {
                    System.out.print("*");
                }else{
                    System.out.print("_");
                }
            }
            for(int j=1; j<=i-1; j++){
                if(j==i-1) {
                    System.out.print("*");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }
}

