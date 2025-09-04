public class count_digit {
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
       n=n/10;
       c++;
       function(n,c);

    }
}
