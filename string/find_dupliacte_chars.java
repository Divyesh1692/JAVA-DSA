public class find_dupliacte_chars {
    public static void main(String[] args) {
        //Find duplicate characters in string
        String s = "hello good morning";
        int[] count = new int[128];

        for(int i=0;i<s.length();i++){
            int ascii = s.charAt(i);
            count[ascii]++;
        }
        for(int i=0;i<128;i++){
            if(count[i]>1){
                System.out.println((char)i+" "+count[i]);
            }
        }
    }
}
