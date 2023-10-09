import java.util.*;
public class g_palindrom
{
    public static void main(String[] args)
    {

        String s="abcdCBA";
        System.out.println(ispalindrom(s));
    }
    public static boolean ispalindrom(String s)
    {
        for (int i = 0; i <s.length() /2 ; i++)
        {
            char start=s.charAt(i);
            char end=s.charAt(s.length()-1 -i);
            if(start != end)
            {
                return false;
            }
        }
        return true;
    }
}
