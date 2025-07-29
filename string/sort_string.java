import java.util.Arrays;

public class sort_string {
    public static void main(String[] args) {
        String s = "hello";

        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        String sorted = new String(chars);
        System.out.println(sorted);
    }
}
