// Java_String_CheatSheet.java
// Author: Divyesh
// Description: Full demonstration of Java String methods with examples

import java.util.Arrays;

public class String_methods {
    public static void main(String[] args) {
        // 1. length()
        String s = "hello";
        System.out.println("Length: " + s.length());

        // 2. charAt()
        System.out.println("Char at 1: " + s.charAt(1));

        // 3. split()
        String csv = "a,b,c";
        String[] parts = csv.split(",");
        System.out.println("Split: " + Arrays.toString(parts));

        // 4. toCharArray()
        char[] chars = s.toCharArray();
        System.out.println("To char array: " + Arrays.toString(chars));

        // 5. trim()
        String spaced = "  Java  ";
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // 6. intern()
        String str1 = new String("hi");
        String str2 = str1.intern();
        System.out.println("Interned: " + str2);

        // 7. concat()
        System.out.println("Concat: " + "Hello".concat(" World"));

        // 8. substring()
        System.out.println("Substring(1): " + s.substring(1));
        System.out.println("Substring(1, 3): " + s.substring(1, 3));

        // 9. isEmpty()
        System.out.println("Empty check: " + "".isEmpty());

        // 10. isBlank() (Java 11+)
        System.out.println("Blank check: " + "  ".isBlank());

        // 11. replaceAll()
        String data = "abc123";
        System.out.println("Replaced: " + data.replaceAll("\\d", "s"));

        // 12. startsWith()
        System.out.println("Starts with 'he': " + s.startsWith("he"));

        // 13. endsWith()
        System.out.println("Ends with 'lo': " + s.endsWith("lo"));

        // 14. toUpperCase / toLowerCase
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Lower: " + "JAVA".toLowerCase());

        // 15. contains()
        System.out.println("Contains 'ell': " + s.contains("ell"));

        // 16. equals()
        System.out.println("Equals 'Hello': " + s.equals("Hello"));

        // 17. indexOf()
        System.out.println("Index of 'l': " + s.indexOf('l'));
    }
}

/*
    ------------------- MEMORY EXPLANATION -------------------

    1. Heap Memory:
       - All Java objects are stored in heap memory.
       - Strings created with 'new String("...")' go to heap.
       - Example: String s = new String("Hello");

    2. String Pool (Part of heap memory):
       - Special area for String literals ("...")
       - Java reuses string literals from the pool to save memory.
       - Example: String s1 = "Java"; // stored in pool
         String s2 = "Java"; // reuses s1's reference
       - Use .intern() to move heap strings to pool.

    Tip: Always use string literals when possible for better performance and memory usage.
*/
