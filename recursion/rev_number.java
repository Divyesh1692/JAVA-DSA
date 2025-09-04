public class rev_number {
    public static void main(String[] args) {
        int a=12;
        int b=3;
        System.out.println(function(a,b));
    }

    public static int function(int a,int b){
       if(b==0){

           return 0;
       }

      return a+ function(a,b-1);

    }
}
