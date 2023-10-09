import java.util.*;
public class c_operators_in_java
{
    public static void main(String args[])
    {
        System.out.println("a" + "b"); // ab
        System.out.println("a" + 1);  //a1
        /*
        This is same as after a few steps: "a" + "1"
        integer will be converted to integer that will call toString()
         */
        System.out.println("Ashish" + new ArrayList<>());  // ashish[]
        System.out.println("Ashish" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
