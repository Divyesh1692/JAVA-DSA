public class update_string {
// update string without using .replace()
    public static void main(String[] args) {
        String s = "hello";
        int updateIdx = 2;
        char c = 'a';


        char[] chars = s.toCharArray();

        chars[updateIdx] = c;

        String updated = new String(chars);

        System.out.println(updated);
    }
}
