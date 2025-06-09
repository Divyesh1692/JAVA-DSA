public class pattern6 {
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int s=1; s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=1; j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

