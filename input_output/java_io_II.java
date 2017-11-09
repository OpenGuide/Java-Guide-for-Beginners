import java.util.Scanner;
//import this package for input

public class java_io_II
{
    public static void main(String[] args) {
        //for input
        Scanner Sc = new Scanner(System.in);
        
        // variable "input_x" takes the input for data type x
        
        // for integer inputs
        int input_i = Sc.nextInt();
        System.out.println("Input = " + input_i);
        
        // for Long_Integer inputs
        long input_l = Sc.nextLong();
        System.out.println("Input = " + input_l);
        
        // for float inputs
        float input_f = Sc.nextFloat();
        System.out.println("Input = " + input_f);
        
        // for double_float inputs
        double input_d = Sc.nextDouble();
        System.out.println("Input = " + input_d);
        
        // for String inputs WORD by WORD
        String input_St = Sc.next();
        System.out.println("Input = " + input_St);
        
        // for String inputs Entire Line
        input_St = Sc.nextLine();
        System.out.println("Input = " + input_St);
    }
}
