public class freq_of_char {
    public static void main(String[] args) {
        //Print frequency of all the characters in string
        String s = "hello good morning";
        int[] count = new int[128];

        for(int i=0;i<s.length();i++){
            int ascii = s.charAt(i);
            count[ascii]++;
        }
        for(int i=0;i<128;i++){
            if(count[i]>0){
                System.out.println((char)i+" "+count[i]);
            }
        }
    }
}

// T: O(n); S:O(n); Aux:O(n)
