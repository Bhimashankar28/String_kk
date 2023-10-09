public class e_String_Builder
{
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++)
        {
            char ch = (char) ('A' + i);

            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.reverse();  // ZYXWVUTSRQPONMLKJIHGFEDCBA
        System.out.println(builder);
        builder.deleteCharAt(2);
        System.out.println(builder); // ZYWVUTSRQPONMLKJIHGFEDCBA
    }
}
