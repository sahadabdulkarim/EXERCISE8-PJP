import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of char to be used");
        int a = sc.nextInt();
        System.out.println("enter the char");
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            String ch = sc.nextLine();
            sb.append(ch);

        }
        str = sb.toString();
        System.out.println("string without ordering    " + str);
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);
        String S = String.valueOf(charArray);
        for (int i = 0; i < S.length(); i++) {
            System.out.print(S.charAt(i) + ",");
        }

    }
}