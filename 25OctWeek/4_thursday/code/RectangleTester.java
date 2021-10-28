public class RectangleTester
{
    public static void main(String[] args)
    {

         Rectangle r1 = new Rectangle(10, 2);
         System.out.println(r1);

         Rectangle r2 = new Rectangle(10, 2);
         System.out.println(r2);



         System.out.println(r1 == r2);

         Rectangle r3 = r2;
         System.out.print(r2 == r3);


         /*
         String str1 = "I love java.";
         String str2 = new String("I love java.");
         System.out.println(str1 == str2);
         System.out.print(str1.equals(str2));
         */
    }
}
