public class d_a_to_z
{
    public static void main(String[] args)
    {
        String s="";
        for (int i = 0; i < 26; i++)
        {
            char ch=(char)('A'+i);
            //line by line
            System.out.println(ch);

            s=s + ch;
            // on line
        }
        System.out.println(s);
    }
}
