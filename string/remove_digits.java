public class remove_digits {
    public static void main(String[] args) {
        //Remove Vowels from a String
        String s = "hello1234";
        String result = "";

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c<='9'&& c>='0'){
                continue;
            }
            result = result + c;
        }
        System.out.println(result);
    }
}
// T: O(n); S:O(n); Aux:O(n)

