public class class_object
{
     //class declaration
     public int square(int x)
     {
          return x*2; 
     }
     public double square_rt (int x)
     {
          return Math.sqrt (x);
     }
     public static void main(String[] args)
     {
          // using the command line arguements as input
          int x = Integer.parseInt (args[0]);
          
          Class object = new Class(); // declaring an object for class Class
          
          int y = object.square (x); // calling a method of class Class
          double z = object.square_rt (x); // calling a method of class Class
          
          System.out.println("Input number = " + x);
          System.out.println("Square of number = " + y);
          System.out.println("Square root of number = " + z);
    }
    
}
