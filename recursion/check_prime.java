public class check_prime {
    public static void main(String[] args) {
        int a=6;

        System.out.println(function(a,2));
    }

    public static boolean function(int a,int d){
       if(a<=1){ return false;
       } if(d>Math.sqrt(a)){
           return true;
       } if(a%d==0){
           return false;
       }

      return function(a,d+1);
    }
}
