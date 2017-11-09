public class Loops
{
       public static void number(int x)
       {
              //using while loop
              while (x < 10) {
                     ++x;
                     System.out.println(x);
              }
       }
       public static void even(int z)
       {
              do {
                     System.out.println (z);
                     z += 2;
              } while (z <= 10);
       }
       public static void table(int y)
       {
              //using for loop
              int i;
              for (i = 1; i <= 10; ++i) {
                     System.out.println(i*y);
              }
       }
       public static void main(String[] args)
       {
              System.out.println("Number from 1 to 10");
              number(0);
              System.out.println("Even Numbers between 0 to 10");
              even(0);
              System.out.println("Table of 8");
              table(8);
       }
}
