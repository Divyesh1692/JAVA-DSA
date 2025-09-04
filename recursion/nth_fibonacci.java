public class nth_fibonacci {
    public static void main(String[] args) {
        int a=6;
    int f = function(a);
        System.out.println("nth fib: "+f);
    }

    public static int function(int a){
      if(a==0){

          return 0;
      } if (a == 1) {
            return 1;
        }


        return function(a-1)+function(a-2);
    }
}
