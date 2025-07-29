public class remove_vowels {
    public static void main(String[] args) {
        //Remove Vowels from a String
        String s = "hello good morning";
        String result = "";

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                continue;
            }
            result = result + c;
        }
        System.out.println(result);
    }
}
// T: O(n); S:O(n); Aux:O(n)
