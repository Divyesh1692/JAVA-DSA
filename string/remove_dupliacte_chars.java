public class remove_dupliacte_chars {
    public static void main(String[] args) {
        //remove duplicate characters in string
        String s = "hello good morning";
        int[] count = new int[128];
        String s1="";

        for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           if(count[c]==0){
               s1+=c;
               count[c]++;
           }

        }
        System.out.println(s1);
    }
}
