public class pattern5 {
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int s=1; s<=i-1;s++){
                System.out.print("  ");
            }
            for(int j=0; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int s=2;s<=n-i;s++){
                System.out.print("  ");
            }
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

