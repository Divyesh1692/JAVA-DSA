public class sum_of_digit {
    public static void main(String[] args) {
        int n=123456;
        int c=0;
       function(n,c);
    }

    public static void function(int n,int c){
       if(n==0){
           System.out.println(c);
           return;
       }
       int k = n%10;
       n=n/10;
       c=c+k;
       function(n,c);

    }
}
