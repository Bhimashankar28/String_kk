import java.util.*;
public class f_string_method
{
    public static void main(String[] args) {
        String s="Hey its ashish how are you";
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf('a'));
        System.out.println("      Ashish       ".strip());
        // space remove
        System.out.println(Arrays.toString(s.split(" ")));
    }
}
