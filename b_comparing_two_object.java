import java.util.*;
public class b_comparing_two_object {
    public static void main(String args[]) {
        String x="Ashish";
        String y="Ashish";
        System.out.println(x == y);  //true

        // just we compare 2 objects using new method
        String m=new String("Bhim");
        String n=new String("Bhim");
        System.out.println(m == n); // false
        System.out.println(m.equals(n)); //true
        System.out.println(m.charAt(1)); //h
        /*  placeholders
            %c - Character
            %d - Decimal number (base 10)
            %e - Exponential floating-point number
            %f - Floating-point number
            %i - Integer (base 10)
            %o - Octal number (base 8)
            %s - String
            %u - Unsigned decimal (integer) number
            %x - Hexadecimal number (base 16)
            %t - Date/time
            %n - Newline
            */
        System.out.printf("Hello its %s, And i am from %s", "Ashish" , "Udgir");
    }
}
