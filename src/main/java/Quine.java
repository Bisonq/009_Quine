public class Quine
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 10;
        String[] l = {
                "public class Quine",
                "{",
                "  public static void main(String[] args)",
                "  {",
                "    int x = 10;",
                "    int y = 10;",
                "    String[] l = {",
                "    ",
                "    };",
                "    for(int i = 0; i < l.length; i++)",
                "        System.out.println(l[i]);",
                "  }",
                "}",
        };
        for(int i = 0; i < l.length; i++)
            System.out.println(l[i]);
    }
}